import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class Main {

    static ArrayList<Integer> BNums = new ArrayList<>();
    static ArrayList<Integer> INums = new ArrayList<>();
    static ArrayList<Integer> NNums = new ArrayList<>();
    static ArrayList<Integer> GNums = new ArrayList<>();
    static ArrayList<Integer> ONums = new ArrayList<>();

    private static void clearTerminal() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addUniqueNumber(ArrayList<Integer> list, int number) {
        if (!list.contains(number)) {
            list.add(number);
        }
    }

    private static void addNumToList(char letter, int num) {
        switch (letter) {
            case 'B':
                addUniqueNumber(BNums, num);
                break;
            case 'I':
                addUniqueNumber(INums, num);
                break;
            case 'N':
                addUniqueNumber(NNums, num);
                break;
            case 'G':
                addUniqueNumber(GNums, num);
                break;
            case 'O':
                addUniqueNumber(ONums, num);
                break;
        }
    }

    private static void printDrawNumbers() {
        printList("B", BNums);
        printList("I", INums);
        printList("N", NNums);
        printList("G", GNums);
        printList("O", ONums);
    }

    private static void printList(String label, List<Integer> nums) {
        System.out.print(label + ": {");
        for (int num : nums) {
            System.out.print(num + ", ");
        }
        System.out.println("}");
    }

    private static Map<Character, Integer> draw() {
        char[] bingo = { 'B', 'I', 'N', 'G', 'O' };
        Map<Character, Integer> result = new HashMap<>();

        char letter = bingo[ThreadLocalRandom.current().nextInt(bingo.length)];
        int value;

        switch (letter) {
            case 'B':
                value = ThreadLocalRandom.current().nextInt(1, 16);
                break;
            case 'I':
                value = ThreadLocalRandom.current().nextInt(16, 31);
                break;
            case 'N':
                value = ThreadLocalRandom.current().nextInt(31, 46);
                break;
            case 'G':
                value = ThreadLocalRandom.current().nextInt(46, 61);
                break;
            case 'O':
                value = ThreadLocalRandom.current().nextInt(61, 76);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + letter);
        }

        result.put(letter, value);
        return result;
    }

    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> result;
        char drawLetter;
        int drawNumber;
        int rounds = 35;
        int repeat;

        System.out.print("How Many Bingo Cards Do You Want?: ");
        int cardsNum = inputInt.nextInt();

        // class instantiation
        // multiple cards
        Bingo[] cards = new Bingo[cardsNum];
        for (int i = 0; i < cardsNum; ++i) {
            cards[i] = new Bingo();
            cards[i].fill_cards();
            cards[i].initGUI(i + 1);
            cards[i].setVisibility(true);
        }

        while (true) {
            for (int i = 0; i < rounds; ++i) {
                try {
                    Thread.sleep(2);
                    clearTerminal();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restore the interrupted status
                }
                result = draw();
                drawLetter = result.keySet().iterator().next();
                drawNumber = result.get(drawLetter);

                for (int j = 0; j < cardsNum; j++) {
                    addNumToList(drawLetter, drawNumber);
                    cards[j].update_card(drawLetter, drawNumber);

                    if (cards[j].checkStatus()) {
                        System.out.println("Card " + (j + 1) + " Wins!");
                        printDrawNumbers();
                        System.out.print("Press Enter to continue...");

                        // Wait for the user to press Enter
                        scanner.nextLine();

                        // Close the Scanner to release resources
                        scanner.close();
                        inputInt.close();

                        // Terminate the program
                        System.exit(0);
                    }
                }
                printDrawNumbers();
            }

            System.out.print("All Cards Lose!\nContinue Game (1: Yes, Other: No): ");
            repeat = inputInt.nextInt();
            if (repeat == 1) {
                for (int i = 0; i < cardsNum; ++i) {
                    cards[i].setVisibility(false);

                    cards[i] = new Bingo();
                    cards[i].fill_cards();

                    cards[i].initGUI(i + 1);
                    cards[i].setVisibility(true);

                    BNums.clear();
                    INums.clear();
                    NNums.clear();
                    GNums.clear();
                    ONums.clear();
                }
                continue;
            } else {
                scanner.close();
                inputInt.close();

                // Terminate the program
                System.exit(0);
            }
        }
    }
}
