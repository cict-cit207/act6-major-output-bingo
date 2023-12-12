import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void initGUI() {
        Dimension dimension = new Dimension(500, 400);
        GridLayout gridLayout = new GridLayout(0, 5);
        JFrame jFrame = new JFrame("BINGO Starter");

        // Numbers for Each button
        int[] BSet = { 1, 2, 3, 4, 5 };
        int[] ISet = { 6, 7, 8, 9, 10 };
        int[] NSet = { 11, 12, 13, 14, 15 };
        int[] GSet = { 16, 17, 18, 19, 20 };
        int[] OSet = { 21, 22, 23, 24, 25 };

        // Container for the buttons
        List<JButton> BSetButtons = new ArrayList<>();
        List<JButton> ISetButtons = new ArrayList<>();
        List<JButton> NSetButtons = new ArrayList<>();
        List<JButton> GSetButtons = new ArrayList<>();
        List<JButton> OSetButtons = new ArrayList<>();

        jFrame.setSize(dimension);
        jFrame.setLayout(gridLayout);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Dynamically create the B buttons. You can create a separate class
        // to make this more organized. You can better manage your code in this manner.
        // This is using an enhanced for loop

        for (int i = 0; i < BSet.length; i++) {
            JButton BButton = new JButton(String.valueOf(BSet[i]));
            BButton.addActionListener(e -> BButton.setEnabled(false));
            BSetButtons.add(BButton);

            JButton IButton = new JButton(String.valueOf(ISet[i]));
            IButton.addActionListener(e -> IButton.setEnabled(false));
            ISetButtons.add(IButton);

            JButton NButton = new JButton(String.valueOf(NSet[i]));
            NButton.addActionListener(e -> NButton.setEnabled(false));
            NSetButtons.add(NButton);

            JButton GButton = new JButton(String.valueOf(GSet[i]));
            GButton.addActionListener(e -> GButton.setEnabled(false));
            GSetButtons.add(GButton);

            JButton OButton = new JButton(String.valueOf(OSet[i]));
            OButton.addActionListener(e -> OButton.setEnabled(false));
            OSetButtons.add(OButton);
        }

        jFrame.getContentPane().add(new JButton("B"));
        jFrame.getContentPane().add(new JButton("I"));
        jFrame.getContentPane().add(new JButton("N"));
        jFrame.getContentPane().add(new JButton("G"));
        jFrame.getContentPane().add(new JButton("O"));

        // This is also using an enhanced for loop.
        for (int i = 0; i < BSetButtons.size(); i++) {
            JButton BButton = BSetButtons.get(i);
            JButton IButton = ISetButtons.get(i);
            JButton NButton = NSetButtons.get(i);
            JButton GButton = GSetButtons.get(i);
            JButton OButton = OSetButtons.get(i);

            jFrame.getContentPane().add(BButton);
            jFrame.getContentPane().add(IButton);
            jFrame.getContentPane().add(NButton);
            jFrame.getContentPane().add(GButton);
            jFrame.getContentPane().add(OButton);
        }

        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        // This is using a lambda implementation.
        javax.swing.SwingUtilities.invokeLater(Main::initGUI);
    }
}

// Be creative and have fun coding class!
// sirmark