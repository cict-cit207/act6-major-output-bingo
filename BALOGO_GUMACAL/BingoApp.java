import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

// Our Bingo App generates random numbers. To generate new numbers, run the code again. Button will change color to mark that number.

public class BingoApp extends JFrame {
    private static final String[] BINGO_LETTERS = { "B", "I", "N", "G", "O" };
    private List<JButton> bingoButtons;

    public BingoApp() {
        super("Bingo Card App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 600);

        // Creating JPanel
        JPanel contentPane = new JPanel(new GridLayout(6, 5, 0, 0));
        contentPane.setBorder(new EmptyBorder(10, 20, 20, 20));
        contentPane.setBackground(new Color(225, 210, 120));

        setContentPane(contentPane);

        bingoButtons = new ArrayList<>();
        initializeBingoButtons(); // Initializing Bingo buttons

        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Method to initialize Bingo buttons
    private void initializeBingoButtons() {
        Map<String, List<Integer>> numberRanges = new HashMap<>();
        numberRanges.put("B", generateNumbersInRange(1, 15));
        numberRanges.put("I", generateNumbersInRange(16, 30));
        numberRanges.put("N", generateNumbersInRange(31, 45));
        numberRanges.put("G", generateNumbersInRange(46, 60));
        numberRanges.put("O", generateNumbersInRange(61, 75));

        // Adding Bingo letters
        for (int i = 0; i < 5; i++) {
            JLabel label = new JLabel(BINGO_LETTERS[i], SwingConstants.CENTER);
            label.setFont(new Font("Impact", Font.BOLD, 50));
            getContentPane().add(label);
        }

        // Creating buttons for the Bingo card
        for (int i = 0; i < 25; i++) {
            JButton button;
            if (i == 12) { // Special case for the"FREE" space
                button = new FreeButton("FREE");
                button.setBackground(new Color(225, 210, 10)); // Color for FREE space
            } else {
                String letter = BINGO_LETTERS[i % 5];
                List<Integer> numbers = numberRanges.get(letter);
                button = new JButton(Integer.toString(numbers.get(i / 5)));
                button.addActionListener(new BingoButtonListener()); // Adding ActionListener for button clicks
                button.setBackground(Color.WHITE);
                button.setFont(new Font("Times New Roman", Font.BOLD, 35));
            }
            button.setBorder(BorderFactory.createLineBorder(new Color(50, 50, 50), 2));

            bingoButtons.add(button);
            getContentPane().add(button);
        }
    }

    // Method to generate a list of shuffled numbers within the specified range
    // [start, end]
    private List<Integer> generateNumbersInRange(int start, int end) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        return numbers;
    }

    // ActionListener class to handle button clicks
    private class BingoButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            Color originalColor = clickedButton.getBackground();

            // Toggle the background color of the clicked button between white and gold
            if (originalColor.equals(Color.WHITE)) {
                clickedButton.setBackground(new Color(225, 210, 10));
            } else {
                clickedButton.setBackground(Color.WHITE);
            }
        }
    }

    // Custom JButton class for the central "FREE" space
    private class FreeButton extends JButton {
        public FreeButton(String text) {
            super(text);
            setForeground(new Color(0, 102, 0)); // Dark green text color
            setFont(new Font("Times New Roman", Font.BOLD, 20));
        }
    }

    // Main method to start the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BingoApp());
    }
}
