import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TACUELBINGO {

    //sagwa butang para maaccess ka tanan, di ko sure nalingin na ulo ko sir puro error
    private static JButton[][] buttons = new JButton[5][5];
    private static JFrame jFrame;

    // METHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHOD
    public static void initGUI(){
        Dimension dimension = new Dimension(400,200);
        GridLayout gridLayout = new GridLayout(0,5); //set to 5 columns cuz 5 letters
        JFrame jFrame = new JFrame("BINGO Starter");

        //assign numbers to each letter array set
        //controlled by minimum, maximum value
        //and amount set to 5 each cuz 5x5 card
        int[] BSet = generateNumbers(1, 15, 5);
        int[] ISet = generateNumbers(16, 30, 5);
        int[] NSet = generateNumbers(31, 45, 5);
        int[] GSet = generateNumbers(46, 60, 5);
        int[] OSet = generateNumbers(61, 75, 5);

        jFrame.setSize(dimension);
        jFrame.setLayout(gridLayout);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Create nonfunctional buttons for letters
        String[] letters = {"B", "I", "N", "G", "O"};
        for (String letter : letters) {
            jFrame.getContentPane().add(generateButtonLETTER(letter));
        }

        //create + populate buttons with numbers
        for (int i = 0; i < 5; i++) {
            buttons[i][0] = createButtonNUMBER(BSet[i], buttons);
            buttons[i][1] = createButtonNUMBER(ISet[i], buttons);
            buttons[i][2] = createButtonNUMBER(NSet[i], buttons);
            buttons[i][3] = createButtonNUMBER(GSet[i], buttons);
            buttons[i][4] = createButtonNUMBER(OSet[i], buttons);
        }

        //create buttons for numbers
        //loop to repeatedly fill frame with buttons
        for(int i = 0; i < 5;i++) {
            for (int j = 0; j < 5;j++){
                jFrame.getContentPane().add(buttons[i][j]);
            }
        }

        jFrame.setVisible(true);
    }
    // METHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHOD

    // METHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHOD
    //function to generate a specified number of unique random numbers within set value range
    private static int[] generateNumbers(int min, int max, int count) {

        int[] numbers = new int[count];
        List<Integer> usedNumbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int num;
            //make sure to not repeat generating generated number
            do{
                num = random.nextInt(max - min + 1) + min;
            }
            while (usedNumbers.contains(num));
            usedNumbers.add(num);
            numbers[i] = num;
        }

        return numbers;
    }
    // METHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHOD

    // METHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHOD
    //method creating buttons for a LETTER
    private static JButton generateButtonLETTER(String letter) {
        JButton button = new JButton(letter);
            button.setEnabled(false); // Disable the letter buttons (non-playable)
            return button;
    }
    // METHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHOD

    // METHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHOD
    //method creating buttons for a NUMBER
    private static JButton createButtonNUMBER(int number, JButton[][] buttons) {
        JButton button = new JButton(String.valueOf(number));
        button.addActionListener(e->{
            button.setEnabled(false);
            if (checkBingo()){
                int option = JOptionPane.showOptionDialog(jFrame, "BINGO!", "Bingo Winner",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null,new Object[]{"OK"}, "OK");
                //click ok = close da program
                if (option == 0){
                    System.exit(0);
                }
            }});
        return button;
    }
    // METHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHOD

    // METHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHOD
    //check for bingo
    private static boolean checkBingo(){
        return checkRow()||checkColumn()||checkDiagonal();
    }
    
    //check if a row is all triggered, BINGO
    private static boolean checkRow(){
        for (int i = 0; i < 5; i++) {
            boolean bingo = true;
            for (int j = 0; j < 5; j++) {
                if (buttons[i][j].isEnabled()) {
                    bingo = false;
                    break;
                }
            }
            if (bingo){
                return true;
            }
        }
        return false;
    }
    //check if a column is all triggered, BINGO
    private static boolean checkColumn() {
        for (int i = 0; i < 5; i++) {
            boolean bingo = true;
            for (int j = 0; j < 5; j++) {
                if (buttons[j][i].isEnabled()) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) {
                return true;
            }
        }
        return false;
    }
    


    //check if a diagonal is all trigger, BINGO
    private static boolean checkDiagonal() {
        boolean diagonal1 = true;
        boolean diagonal2 = true;
        for (int i = 0; i < 5; i++) {
            if (buttons[i][i].isEnabled()) {
                diagonal1 = false;
            }
            if (buttons[i][4 - i].isEnabled()) {
                diagonal2 = false;
            }
        }
        return diagonal1 || diagonal2;
    }
    // METHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHODMETHOD

    
    // MAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAIN
    public static void main(String[] args) {
        // This is using a lambda implementation.
        javax.swing.SwingUtilities.invokeLater(TACUELBINGO::initGUI);
    }
}
    // MAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAINMAIN

// Be creative and have fun coding class!
// sirmark