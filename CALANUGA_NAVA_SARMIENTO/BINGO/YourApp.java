import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class YourApp {

    public static void initGUI(){
        Dimension dimension = new Dimension(400,200);
        GridLayout gridLayout = new GridLayout(0,1);
        JFrame jFrame = new JFrame("BINGO Starter");

        // Sample set for B numbers in BINGO app.
        // This should be randomized with no repetitions.
        int[] BSet = {1,2,3,4,5};
        // Container for the B buttons
        List<JButton> BSetButtons = new ArrayList<>();

        jFrame.setSize(dimension);
        jFrame.setLayout(gridLayout);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Dynamically create the B buttons. You can create a separate class
        // to make this more organized. You can better manage your code in this manner.
        // This is using an enhanced for loop.
        for (int j : BSet) {
            JButton tempButton = new JButton(String.valueOf(j));
            // This is using a lambda implementation.
            tempButton.addActionListener(e -> tempButton.setEnabled(false));
            BSetButtons.add(tempButton);
        }

        jFrame.getContentPane().add(new JButton("B"));

        // This is also using an enhanced for loop.
        for (JButton bSetButton : BSetButtons) {
            jFrame.getContentPane().add(bSetButton);
        }


        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        // This is using a lambda implementation.
        javax.swing.SwingUtilities.invokeLater(YourApp::initGUI);
    }
}

// Be creative and have fun coding class!
// sirmark