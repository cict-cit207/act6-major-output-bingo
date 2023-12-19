import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

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
        try (Scanner inputInt = new Scanner(System.in)) {

            Map<Character, Integer> result;
            char drawLetter;
            int drawNumber;
            int rounds = 35;
            int repeat;

            while (true) {
                Bingo card = new Bingo();
                card.fill_cards();
                card.initGUI();
                card.setVisibility(true);
                for (int i = 0; i < rounds; ++i) {
                    try {
                        Thread.sleep(2500);
                    } catch (InterruptedException e) {
                        // Handle interrupted exception (e.g., log or rethrow)
                        Thread.currentThread().interrupt(); // Restore the interrupted status
                    }

                    result = draw();
                    drawLetter = result.keySet().iterator().next();
                    drawNumber = result.get(drawLetter);
                    System.out.println("Letter '" + drawLetter + "' = " + drawNumber);
                    card.update_card(drawLetter, drawNumber);
                    if (card.checkStatus()) {
                        System.out.println("You Win!");
                        return;
                    }
                }
                System.out.print("You Lose!\nContinue Game (1: Yes, Other: No): ");
                repeat = inputInt.nextInt();
                if (repeat == 1) {
                    card.setVisibility(false);
                    continue;
                } else {
                    break;
                }
            }
        }
    }
}
