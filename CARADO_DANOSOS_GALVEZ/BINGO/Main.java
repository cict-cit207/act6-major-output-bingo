import java.util.concurrent.ThreadLocalRandom;
import java.util.*;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import BINGO_CLASS.*;

public class Main {

    // Array lists to store the drawn numbers
    static ArrayList<Integer> BNums = new ArrayList<>();
    static ArrayList<Integer> INums = new ArrayList<>();
    static ArrayList<Integer> NNums = new ArrayList<>();
    static ArrayList<Integer> GNums = new ArrayList<>();
    static ArrayList<Integer> ONums = new ArrayList<>();

    // Method to clear the terminal screen
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

    private static boolean inList(ArrayList<Integer> setNums, int target) {
        for (int num : setNums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    private static void displayWinnerCard(Bingo cardWinner, int cardNum) {
        // creating new card
        JFrame jFrame = new JFrame("Card Winner Number: " + cardNum);
        Dimension dimension = new Dimension(350, 500);
        GridLayout gridLayout = new GridLayout(0, 5);

        jFrame.setSize(dimension);
        jFrame.setLayout(gridLayout);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        int[][] bingoCards = cardWinner.getAllSetNums();
        int[] BSetNums = bingoCards[0];
        int[] ISetNums = bingoCards[1];
        int[] NSetNums = bingoCards[2];
        int[] GSetNums = bingoCards[3];
        int[] OSetNums = bingoCards[4];

        JButton TitleB = new JButton("B");
        jFrame.getContentPane().add(TitleB);

        JButton TitleI = new JButton("I");
        jFrame.getContentPane().add(TitleI);

        JButton TitleN = new JButton("N");
        jFrame.getContentPane().add(TitleN);

        JButton TitleG = new JButton("G");
        jFrame.getContentPane().add(TitleG);

        JButton TitleO = new JButton("O");
        jFrame.getContentPane().add(TitleO);

        for (int i = 0; i < 5; i++) {
            JButton BButton = new JButton(String.valueOf(BSetNums[i]));
            if (inList(BNums, BSetNums[i])) {
                BButton.setBackground(Color.ORANGE);
            } else {
                BButton.setBackground(Color.WHITE);
            }
            jFrame.getContentPane().add(BButton);

            JButton IButton = new JButton(String.valueOf(ISetNums[i]));
            if (inList(INums, ISetNums[i])) {
                IButton.setBackground(Color.ORANGE);
            } else {
                IButton.setBackground(Color.WHITE);
            }
            jFrame.getContentPane().add(IButton);

            // Free Button in the middle of the Card
            JButton NButton; // Declare NButton outside the if-else block

            if (i == 2) {
                NButton = new JButton("FREE");
                NButton.setBackground(Color.ORANGE);
            } else {
                NButton = new JButton(String.valueOf(NSetNums[i]));
                if (inList(NNums, NSetNums[i])) {
                    NButton.setBackground(Color.ORANGE);
                } else {
                    NButton.setBackground(Color.WHITE);
                }
            }
            jFrame.getContentPane().add(NButton);

            JButton GButton = new JButton(String.valueOf(GSetNums[i]));
            if (inList(GNums, GSetNums[i])) {
                GButton.setBackground(Color.ORANGE);
            } else {
                GButton.setBackground(Color.WHITE);
            }
            jFrame.getContentPane().add(GButton);

            JButton OButton = new JButton(String.valueOf(OSetNums[i]));

            if (inList(ONums, OSetNums[i])) {
                OButton.setBackground(Color.ORANGE);
            } else {
                OButton.setBackground(Color.WHITE);
            }
            jFrame.getContentPane().add(OButton);
        }
        jFrame.setVisible(true);
    }

    // Helper Method to add a unique number to the list
    private static void addUniqueNumber(ArrayList<Integer> list, int number) {
        // making sure that the drawn number isnt already in the list
        if (!list.contains(number)) {
            list.add(number);
        }
    }

    // Method to add a number to the respective list based on the letter
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

    // Method to print the drawn numbers for each letter
    private static void printDrawNumbers() {
        printList('B', BNums);
        printList('I', INums);
        printList('N', NNums);
        printList('G', GNums);
        printList('O', ONums);
    }

    // Helper Method to print a list
    private static void printList(char label, List<Integer> nums) {
        System.out.print(label + ": {");
        for (int num : nums) {
            System.out.print(num + ", ");
        }
        System.out.println("}");
    }

    // Method to draw a random number from a random letter
    private static Map<Character, Integer> draw() {
        char[] bingo = { 'B', 'I', 'N', 'G', 'O' };
        Map<Character, Integer> result = new HashMap<>();

        // choosing a random letter
        char letter = bingo[ThreadLocalRandom.current().nextInt(bingo.length)];
        int value;

        // drawing a number from a specific letter with specific range of numbers
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

        // returns a pair, the letter and the drawn number
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
        int WAIT_TIME = 1; // CHANGE ME TO 0 FOR INSTANT RESULTS
        int repeat;
        int cardsNum;

        // input number of cards
        System.out.print("Number Of BINGO Cards to Play (5 cards max): ");
        cardsNum = inputInt.nextInt();

        if (cardsNum > 5) {
            cardsNum = 5;
        }

        // class instantiation of multiple cards
        Bingo[] cards = new Bingo[cardsNum];
        for (int i = 0; i < cardsNum; ++i) {
            cards[i] = new Bingo();
            cards[i].fill_cards();
            cards[i].initGUI(i + 1);
            cards[i].setVisibility(true);
        }

        while (true) {
            // loop drawing numbers for N (35) rounds
            for (int i = 0; i < rounds; ++i) {

                // sleep for waiting
                try {
                    Thread.sleep(WAIT_TIME * 1000);
                    clearTerminal();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restore the interrupted status
                }

                // draw results and separate them in variables, and save them in a list of drawn
                // numbers
                result = draw();
                drawLetter = result.keySet().iterator().next();
                drawNumber = result.get(drawLetter);
                addNumToList(drawLetter, drawNumber);

                for (int j = 0; j < cardsNum; j++) {

                    // update each card on the drawn numbers
                    cards[j].update_card(drawLetter, drawNumber);

                    // check each card if they have won
                    if (cards[j].checkStatus() && i >= 5) {
                        System.out.println("Card " + (j + 1) + " Wins!");
                        printDrawNumbers();
                        displayWinnerCard(cards[j], j + 1);
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
                // if none won, draw the numbers, and continue drawing results
                printDrawNumbers();
            }

            // choice to continue the game
            System.out.print("All Cards Lose!\nContinue Game (1: Yes, Other: No): ");
            repeat = inputInt.nextInt();

            // if repeat, create new class instance and generate new cards
            // also delete existing drawn numbers
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
                // closing scanners to release resources
                scanner.close();
                inputInt.close();

                // Terminate the program
                System.exit(0);
            }
        }
    }
}
