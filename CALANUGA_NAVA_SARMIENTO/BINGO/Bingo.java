// CALANUGA,GILLIE
// NAVA, ANGELIKA MARIE
// SARMIENTO, REYCEL
// BSCS 2A

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bingo {
    private static final int ROWS = 6;
    private static final int COLS = 5;

    private List<List<Integer>> columnNumbers;
    private JButton[][] bingoButtons;
    private JFrame frame;



    public Bingo() {
        frame = new JFrame("Bingo Game");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        initializeNumbers();// Range of numbers per column
        setupGUI();// the design of the BINGO Card
        fillBoard();

        setBingoWord();// The BINGO Word in the top of the card
        frame.setVisible(true);


    }


    private void setBingoWord() {
        // The Word BINGO in the top of the game that couldn't change
        bingoButtons[0][0].setText("B");
        bingoButtons[0][1].setText("I");
        bingoButtons[0][2].setText("N");
        bingoButtons[0][3].setText("G");
        bingoButtons[0][4].setText("O");
        bingoButtons[3][2].setText("FREE");// The Free or blank column
    }
    private void initializeNumbers() {
        //Ranges for each Column
        columnNumbers = new ArrayList<>();
        columnNumbers.add(generateNumbers(1, 15));  // Exact Range for B
        columnNumbers.add(generateNumbers(16, 30)); // Exact Range for I
        columnNumbers.add(generateNumbers(31, 45)); // Exact Range for N
        columnNumbers.add(generateNumbers(46, 60)); // Exact Range for G
        columnNumbers.add(generateNumbers(61, 75)); // Exact Range for O
    }

    // The number that generate from specific ranges in exact column and did not repeat
    private List<Integer> generateNumbers(int start, int end) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        return numbers;
    }

    // the design for card
    private void setupGUI() {
        frame.setLayout(new GridLayout(ROWS, COLS));

        bingoButtons = new JButton[ROWS][COLS];

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                bingoButtons[row][col] = new JButton();
                bingoButtons[row][col].setBorder(BorderFactory.createLineBorder(Color.yellow,8));
                bingoButtons[row][col].setHorizontalAlignment(JButton.CENTER);
                frame.add(bingoButtons[row][col]);
                bingoButtons[row][col].setBackground(Color.MAGENTA);
                bingoButtons[row][col].setForeground(Color.BLACK);
                bingoButtons[row][col].setFont(new Font("SansSerif",Font.BOLD|Font.ITALIC,40));


                // Action listener for buttons
                final int currentRow = row;
                final int currentCol = col;
                bingoButtons[row][col].addActionListener(e -> {
                    // It changed from the color MAGENTA to BLUE when select
                    if (bingoButtons[currentRow][currentCol].getBackground() != Color.MAGENTA) {
                        bingoButtons[currentRow][currentCol].setBackground(Color.BLUE);

                    } else {
                        bingoButtons[currentRow][currentCol].setBackground(Color.BLUE);
                        handleButtonClick(currentRow,currentCol);

                    }
                });

            }
        }
    }


    private void fillBoard() {
        for (int col = 0; col < COLS; col++) {
            List<Integer> numbers = columnNumbers.get(col);
            for (int row = 0; row < ROWS; row++) {
                bingoButtons[row][col].setText(String.valueOf(numbers.get(row)));
            }
        }
    }

    //Disabled the button
    public void handleButtonClick(int row,int col){
        bingoButtons[row][col].setEnabled(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Bingo::new);
    }
}
