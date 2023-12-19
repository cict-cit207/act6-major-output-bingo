import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Bingo {

    private int[] BSetNums = new int[5];
    private int[] ISetNums = new int[5];
    private int[] NSetNums = new int[5];
    private int[] GSetNums = new int[5];
    private int[] OSetNums = new int[5];

    private boolean[] BBool = new boolean[5];
    private boolean[] IBool = new boolean[5];
    private boolean[] NBool = new boolean[5];
    private boolean[] GBool = new boolean[5];
    private boolean[] OBool = new boolean[5];

    private JFrame jFrame = new JFrame("BINGO Card");

    private static boolean checkIfAllTrue(boolean[] array) {
        for (boolean bool : array) {
            if (!bool) {
                return false;
            }
        }
        return true;
    }

    public boolean checkStatus() {
        boolean[] columns = { checkIfAllTrue(BBool), checkIfAllTrue(IBool), checkIfAllTrue(NBool),
                checkIfAllTrue(GBool),
                checkIfAllTrue(OBool) };

        for (boolean row : columns) {
            if (row) {
                return true;
            } else {
                continue;
            }
        }

        boolean[] rows = { false, false, false, false, false };
        for (int i = 0; i < 5; i++) {
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

    public void update_card(char letter, int number) {
        for (int i = 0; i < 5; ++i) {

            switch (letter) {
                case 'B':
                    if (number == BSetNums[i]) {
                        BBool[i] = true;
                    }
                    break;
                case 'I':
                    if (number == ISetNums[i]) {
                        IBool[i] = true;
                    }
                    break;
                case 'N':
                    if (number == NSetNums[i]) {
                        NBool[i] = true;
                    }
                    break;
                case 'G':
                    if (number == GSetNums[i]) {
                        GBool[i] = true;
                    }
                    break;
                case 'O':
                    if (number == OSetNums[i]) {
                        OBool[i] = true;
                    }
                    break;
            }

        }
    }

    public void reset_cards() {
        Arrays.fill(BSetNums, 0);
        Arrays.fill(ISetNums, 0);
        Arrays.fill(NSetNums, 0);
        Arrays.fill(GSetNums, 0);
        Arrays.fill(OSetNums, 0);

        Arrays.fill(BBool, false);
        Arrays.fill(IBool, false);
        Arrays.fill(NBool, false);
        Arrays.fill(GBool, false);
        Arrays.fill(OBool, false);
    }

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

    private int getRandomUniqueNumber(HashSet<Integer> usedNumbers, Random random, int start, int stop) {
        int randomNumber;
        do {
            // Generate a random number within the specified range
            randomNumber = random.nextInt((stop - start) + 1) + start;
        } while (!usedNumbers.add(randomNumber)); // Keep generating until a unique number is found

        return randomNumber;
    }

    public void setVisibility(boolean v) {
        jFrame.setVisible(v);
    }

    public void initGUI() {

        Dimension dimension = new Dimension(350, 500);
        GridLayout gridLayout = new GridLayout(0, 5);

        jFrame.setSize(dimension);
        jFrame.setLayout(gridLayout);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jFrame.getContentPane().add(new JButton("B"));
        jFrame.getContentPane().add(new JButton("I"));
        jFrame.getContentPane().add(new JButton("N"));
        jFrame.getContentPane().add(new JButton("G"));
        jFrame.getContentPane().add(new JButton("O"));

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

            JButton NButton; // Declare NButton outside the if-else block

            if (i == 2) {
                NButton = new JButton("FREE");
            } else {
                NButton = new JButton(String.valueOf(NSetNums[i]));
                NButton.addActionListener(e -> {
                    NButton.setEnabled(false);
                    NButton.setBackground(Color.ORANGE);
                });
            }

            NButton.setBackground(Color.WHITE); // Set initial background color to white
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