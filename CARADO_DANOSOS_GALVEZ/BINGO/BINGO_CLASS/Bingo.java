package BINGO_CLASS;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Random;

public class Bingo {

    // Arrays to store the numbers inside the bingo card
    private int[] BSetNums = new int[5];
    private int[] ISetNums = new int[5];
    private int[] NSetNums = new int[5];
    private int[] GSetNums = new int[5];
    private int[] OSetNums = new int[5];

    // getter for all existing
    public int[][] getAllSetNums() {
        int[][] allSetNums = { BSetNums, ISetNums, NSetNums, GSetNums, OSetNums };
        return allSetNums;
    }

    // Boolean arrays representing the status of numbers, true if found, else false

    private boolean[] BBool = new boolean[5];
    private boolean[] IBool = new boolean[5];
    private boolean[] NBool = new boolean[5];
    private boolean[] GBool = new boolean[5];
    private boolean[] OBool = new boolean[5];

    // JFrame for GUI
    private JFrame jFrame = new JFrame("BINGO Card");

    // Helper method to check if all elements in an array are true
    private static boolean checkIfAllTrue(boolean[] array) {
        for (boolean bool : array) {
            if (!bool) {
                return false;
            }
        }
        return true;
    }

    // Method to check if the bingo card has a winning combination
    public boolean checkStatus() {

        // taking all the columns and assessing each if are all true
        boolean[] columns = { checkIfAllTrue(BBool), checkIfAllTrue(IBool), checkIfAllTrue(NBool),
                checkIfAllTrue(GBool), checkIfAllTrue(OBool) };

        // Check for a win in any column
        for (boolean col : columns) {
            if (col) {
                return true;
            }
        }

        // Check for a win in diagonals
        boolean[] mainDiagonal = { BBool[0], IBool[1], NBool[2], GBool[3], OBool[4] };
        boolean[] reverseDiagonal = { BBool[4], IBool[3], NBool[2], GBool[1], OBool[0] };

        if (checkIfAllTrue(mainDiagonal) || checkIfAllTrue(reverseDiagonal)) {
            return true;
        }

        // Check for a win in rows
        for (int i = 0; i < 5; i++) {
            boolean[] rows = new boolean[5];

            rows[0] = BBool[i];
            rows[1] = IBool[i];

            if (i == 2) {
                rows[2] = true; // FREE
            } else {
                rows[2] = NBool[i];
            }

            rows[3] = GBool[i];
            rows[4] = OBool[i];

            if (checkIfAllTrue(rows)) {
                return true;
            }
        }

        return false;
    }

    // Method to update the card status based on the drawn number
    public void update_card(char letter, int number) {
        boolean newVal = true;

        // for loop to iterate each row, and will do only a comparison on a specific
        // letter
        for (int i = 0; i < 5; ++i) {
            switch (letter) {
                case 'B':
                    if (number == BSetNums[i]) {
                        BBool[i] = newVal;
                    }
                    break;
                case 'I':
                    if (number == ISetNums[i]) {
                        IBool[i] = newVal;
                    }
                    break;
                case 'N':
                    if (number == NSetNums[i]) {
                        NBool[i] = newVal;
                    }
                    break;
                case 'G':
                    if (number == GSetNums[i]) {
                        GBool[i] = newVal;
                    }
                    break;
                case 'O':
                    if (number == OSetNums[i]) {
                        OBool[i] = newVal;
                    }
                    break;
            }

        }
    }

    // Method to fill the card with random numbers
    public void fill_cards() {
        Random random = new Random();
        HashSet<Integer> usedNumbers = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            BSetNums[i] = getRandomUniqueNumber(usedNumbers, random, 1, 15);
            ISetNums[i] = getRandomUniqueNumber(usedNumbers, random, 16, 30);
            NSetNums[i] = getRandomUniqueNumber(usedNumbers, random, 31, 45);
            GSetNums[i] = getRandomUniqueNumber(usedNumbers, random, 46, 60);
            OSetNums[i] = getRandomUniqueNumber(usedNumbers, random, 61, 75);
        }
    }

    // Helper method to get a random unique number
    private int getRandomUniqueNumber(HashSet<Integer> usedNumbers, Random random, int start, int stop) {
        int randomNumber;
        do {
            // Generate a random number within the specified range
            randomNumber = random.nextInt((stop - start) + 1) + start;
        } while (!usedNumbers.add(randomNumber)); // Keep generating until a unique number is found

        return randomNumber;
    }

    // Method to set the visibility of the JFrame
    public void setVisibility(boolean v) {
        jFrame.setVisible(v);
    }

    // Method to initialize the GUI
    public void initGUI(int cardnum) {
        // Initializing the necessary GUI Components
        Dimension dimension = new Dimension(350, 500);
        GridLayout gridLayout = new GridLayout(0, 5);
        jFrame.setTitle(("Bingo Card: #" + cardnum));

        jFrame.setSize(dimension);
        jFrame.setLayout(gridLayout);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Add buttons for each letter
        jFrame.getContentPane().add(new JButton("B"));
        jFrame.getContentPane().add(new JButton("I"));
        jFrame.getContentPane().add(new JButton("N"));
        jFrame.getContentPane().add(new JButton("G"));
        jFrame.getContentPane().add(new JButton("O"));

        // Add buttons for each number in the corresponding letter's set
        // And making each button turn to yellow once clicked
        for (int i = 0; i < 5; i++) {
            JButton BButton = new JButton(String.valueOf(BSetNums[i]));
            BButton.addActionListener(e -> {
                BButton.setEnabled(false);
                BButton.setBackground(Color.ORANGE);
            });
            BButton.setBackground(Color.WHITE); // Set initial background color to white
            jFrame.getContentPane().add(BButton);

            JButton IButton = new JButton(String.valueOf(ISetNums[i]));
            IButton.addActionListener(e -> {
                IButton.setEnabled(false);
                IButton.setBackground(Color.ORANGE);
            });
            IButton.setBackground(Color.WHITE); // Set initial background color to white
            jFrame.getContentPane().add(IButton);

            // Free Button in the middle of the Card
            JButton NButton; // Declare NButton outside the if-else block

            if (i == 2) {
                NButton = new JButton("FREE");
                NButton.setBackground(Color.orange);
            } else {
                NButton = new JButton(String.valueOf(NSetNums[i]));
                NButton.addActionListener(e -> {
                    NButton.setEnabled(false);
                    NButton.setBackground(Color.ORANGE);
                });
                NButton.setBackground(Color.WHITE); // Set initial background color to white
            }
            jFrame.getContentPane().add(NButton);

            JButton GButton = new JButton(String.valueOf(GSetNums[i]));
            GButton.addActionListener(e -> {
                GButton.setEnabled(false);
                GButton.setBackground(Color.ORANGE);
            });
            GButton.setBackground(Color.WHITE); // Set initial background color to white
            jFrame.getContentPane().add(GButton);

            JButton OButton = new JButton(String.valueOf(OSetNums[i]));
            OButton.addActionListener(e -> {
                OButton.setEnabled(false);
                OButton.setBackground(Color.ORANGE);
            });
            OButton.setBackground(Color.WHITE); // Set initial background color to white
            jFrame.getContentPane().add(OButton);
        }
    }
}
