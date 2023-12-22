// Code Snippet inspired by the code of Joshua Saikali (November 24, 2019)
// Changes done to code: Condensed and reworked to avoid repetitive blocks of codes by using functions.
// Added Features: Number Generator, Card Generator, Interactive buttons, Create your own bingo card.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class BingoApp {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
        }
        StartFrame.start();
    }
}

class StartFrame {

    public static void start() {
        // Creating Variables for the frame...
        JFrame k = new JFrame("Bingo!");
        JLabel bk = new JLabel(new ImageIcon("/Users/Ethan/Desktop/Bingo App/images/images.jpg"));
        JButton Play = new JButton();
        JButton view = new JButton();

        // Setting size of JFrame...
        k.setSize(600, 680);
        k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setting the location of the labels
        bk.setBounds(-10, 170, 600, 200);
        Play.setBounds(190, 400, 190, 100);
        view.setBounds(190, 520, 190, 50);

        Play.setForeground(Color.BLACK);// sets foreground/background/font
        Play.setContentAreaFilled(false);
        Play.setFocusPainted(false);
        Play.setFont(new Font("Helvetica", Font.BOLD, 12));
        Play.setText("Generate Random Card");

        view.setForeground(Color.BLACK);// sets foreground/background/font
        view.setContentAreaFilled(false);
        view.setFocusPainted(false);
        view.setFont(new Font("Helvetica", Font.BOLD, 12));
        view.setText("Create Own Card");

        k.add(bk);
        k.add(Play);
        k.add(view);
        k.setLayout(null);
        k.setVisible(true);

        Play.addActionListener(new ActionListener() { // Action Listener when called, calls random();
            public void actionPerformed(ActionEvent e) {
                k.dispose();
                random();
            }

        });
        view.addActionListener(new ActionListener() { // Action Listener when pressing "Generate Card"
            public void actionPerformed(ActionEvent e) {
                k.dispose();
                stats();
            }

        }); // Action listener when called, calls stats();
    }

    public static void random() { // Generates the numbers within the buttons (min, max, amount)
        int[] b = GenerateNumbers.generateRandomNumbers(1, 15, 5);
        int[] i = GenerateNumbers.generateRandomNumbers(16, 30, 5);
        int[] n = GenerateNumbers.generateRandomNumbers(31, 45, 4);
        int[] g = GenerateNumbers.generateRandomNumbers(46, 60, 5);
        int[] o = GenerateNumbers.generateRandomNumbers(61, 75, 5);

        CardFrame.card(b, i, n, g, o);
    }

    public static void stats() {
        JFrame k = new JFrame();// creating variables for all labels
        JLabel bk = new JLabel(new ImageIcon());
        JLabel title = new JLabel(new ImageIcon("/images/images.jpg"));
        JLabel star = new JLabel(new ImageIcon("/images/star.jpg"));
        JButton gen = new JButton();
        JButton back = new JButton("Back");
        JButton roll = new JButton();

        back.setForeground(Color.BLACK);// sets foreground/background/font
        back.setContentAreaFilled(false);
        back.setFocusPainted(false);

        gen.setText("Generate Card");// sets foreground/background/font
        gen.setForeground(Color.BLACK);
        gen.setContentAreaFilled(false);
        gen.setFocusPainted(false);
        int x = 175;

        roll.setText("Roll");// sets foreground/background/font
        roll.setForeground(Color.BLACK);
        roll.setContentAreaFilled(false);
        roll.setFocusPainted(false);

        JTextField B[] = new JTextField[5];// Jtextfield arrays for user input
        JTextField I[] = new JTextField[5];
        JTextField N[] = new JTextField[4];
        JTextField G[] = new JTextField[5];
        JTextField O[] = new JTextField[5];

        for (int p = 0; p < B.length; p++) {// for loops that set bounds to each index in each Jtextfield array
            B[p] = new JTextField();
            B[p].setBounds(100, x, 75, 75);
            x = x + 75;
            B[p].setOpaque(false);
            k.add(B[p]);

        }
        x = 175;
        for (int p = 0; p < I.length; p++) {
            I[p] = new JTextField();
            I[p].setBounds(175, x, 75, 75);
            x = x + 75;
            I[p].setOpaque(false);
            k.add(I[p]);
        }
        x = 175;
        for (int p = 0; p < N.length; p++) {
            N[p] = new JTextField();
            while (x == 325) {
                x = x + 75;
            }
            N[p].setBounds(250, x, 75, 75);
            x = x + 75;
            N[p].setOpaque(false);
            k.add(N[p]);
        }
        x = 175;
        for (int p = 0; p < G.length; p++) {
            G[p] = new JTextField();
            G[p].setBounds(325, x, 75, 75);
            x = x + 75;
            G[p].setOpaque(false);
            k.add(G[p]);
        }
        x = 175;
        for (int p = 0; p < O.length; p++) {
            O[p] = new JTextField();
            O[p].setBounds(400, x, 75, 75);
            x = x + 75;
            O[p].setOpaque(false);
            k.add(O[p]);
        }

        for (int p = 0; p < B.length; p++) {
            try {
                N[p].setFont(new Font("Helvetica", Font.BOLD, 18));
            } catch (Exception e) {

            }
            B[p].setFont(new Font("Helvetica", Font.BOLD, 18));// sets font of the text field
            I[p].setFont(new Font("Helvetica", Font.BOLD, 18));
            G[p].setFont(new Font("Helvetica", Font.BOLD, 18));
            O[p].setFont(new Font("Helvetica", Font.BOLD, 18));

        }

        B[0].setText("1-15");// sets range in text field that user is instructed to input
        I[0].setText("16-30");
        N[0].setText("31-45");
        G[0].setText("46-60");
        O[0].setText("61-75");

        back.setBounds(400, 570, 75, 40);
        title.setBounds(40, 60, 500, 114);
        gen.setBounds(190, 570, 190, 50);// sets bounds of all labels/button
        roll.setBounds(95, 570, 75, 40);
        bk.setBounds(0, 0, 600, 680);
        star.setBounds(250, 325, 75, 75);
        k.setSize(600, 680);
        k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        k.add(back);
        k.add(star);
        k.add(title);
        k.add(gen);
        k.add(bk);
        k.add(roll);
        k.setLayout(null);
        k.setVisible(true);

        gen.addActionListener(new ActionListener() { // Action Listener when called, check
            String BS[] = new String[5];
            String IS[] = new String[5];
            String NS[] = new String[4];
            String GS[] = new String[5];
            String OS[] = new String[5];
            int Bi[] = new int[5];
            int Ii[] = new int[5];
            int Ni[] = new int[4];
            int Gi[] = new int[5];
            int Oi[] = new int[5];

            public void actionPerformed(ActionEvent e) {
                boolean isGood = true;
                try {
                    for (int p = 0; p < B.length; p++) {
                        try {
                            BS[p] = B[p].getText();
                            Bi[p] = Integer.parseInt(BS[p]);
                            IS[p] = I[p].getText();
                            Ii[p] = Integer.parseInt(IS[p]);
                            NS[p] = N[p].getText();
                            Ni[p] = Integer.parseInt(NS[p]);
                            GS[p] = G[p].getText();
                            Gi[p] = Integer.parseInt(GS[p]);
                            OS[p] = O[p].getText();
                            Oi[p] = Integer.parseInt(OS[p]);
                        } catch (Exception ignored) {
                        }
                    }
                } catch (Exception ignored) {
                    isGood = false;
                }

                if (isGood) {
                    B[0].setText("Invalid!");
                    I[0].setText("Enter");
                    N[0].setText("Numbers");
                    G[0].setText("To");
                    O[0].setText("Continue");
                } else {
                    // Use CardFrame.card directly
                    CardFrame.card(Bi, Ii, Ni, Gi, Oi);
                    k.dispose();
                }

            }
        });
        back.addActionListener(new ActionListener() { // Action Listener when pressing "Generate Card"
            public void actionPerformed(ActionEvent e) {
                k.dispose();
                start();
            }
        });
    }
}

class CardFrame {

    private static JButton createButton(String text) {
        JButton button = new JButton();
        button.setText(text);
        button.setForeground(Color.BLACK);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setFont(new Font("Comic Sans MS", Font.PLAIN, 26));
        button.addActionListener(new ActionListener() {
            private boolean right = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    button.setForeground(Color.GREEN);
                } else if (right) {
                    button.setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        return button;
    }

    public static void card(int[] b, int[] i, int[] n, int[] g, int[] o) {
        // Creates frame for card

        JFrame R = new JFrame("Bingo!");
        int x = 175;
        JButton reset = new JButton();
        reset.setText("Generate New Card");
        reset.setBounds(195, 570, 190, 40);
        reset.setForeground(Color.RED);
        reset.setContentAreaFilled(false);
        reset.setFocusPainted(false);

        R.setSize(600, 680);
        R.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel(new ImageIcon("C:/Users/Ethan/Desktop/Bingo App/images/images.jpg"));
        JLabel star = new JLabel(new ImageIcon("C:/Users/Ethan/Desktop/Bingo App/images/star.jpg"));
        JLabel nice = new JLabel(new ImageIcon("images/bk2.png"));
        JButton back = new JButton("Back");
        back.setForeground(Color.BLACK);
        back.setContentAreaFilled(false);
        back.setFocusPainted(false);

        JButton roll = new JButton();
        roll.setText("Roll");// sets foreground/background/font
        roll.setForeground(Color.BLACK);
        roll.setContentAreaFilled(false);
        roll.setFocusPainted(false);

        back.setBounds(400, 570, 75, 40);
        title.setBounds(40, 60, 500, 114);
        star.setBounds(250, 325, 75, 75);
        roll.setBounds(95, 570, 75, 40);
        nice.setBounds(0, 0, 600, 680);

        JButton B[] = new JButton[5];
        JButton I[] = new JButton[5];
        JButton N[] = new JButton[4];
        JButton G[] = new JButton[5];
        JButton O[] = new JButton[5];

        // For loops to setText to all of the buttons
        for (int p = 0; p < b.length; p++) {
            B[p] = createButton(String.valueOf(b[p]));
            R.add(B[p]);

        }
        for (int p = 0; p < i.length; p++) {
            I[p] = createButton(String.valueOf(i[p]));
            R.add(I[p]);
        }
        for (int p = 0; p < n.length; p++) {
            N[p] = createButton(String.valueOf(n[p]));
            R.add(N[p]);
        }
        for (int p = 0; p < g.length; p++) {
            G[p] = createButton(String.valueOf(g[p]));
            R.add(G[p]);
        }
        for (int p = 0; p < o.length; p++) {
            O[p] = createButton(String.valueOf(o[p]));
            R.add(O[p]);
        }

        for (int p = 0; p < b.length; p++) {
            B[p].setBounds(100, x, 75, 75);
            x = x + 75;
        }
        x = 175;
        for (int p = 0; p < i.length; p++) {
            I[p].setBounds(175, x, 75, 75);
            x = x + 75;
        }
        x = 175;
        for (int p = 0; p < n.length; p++) {
            while (x == 325) {
                x = x + 75;
            }
            N[p].setBounds(250, x, 75, 75);

            x = x + 75;
        }
        x = 175;
        for (int p = 0; p < g.length; p++) {
            G[p].setBounds(325, x, 75, 75);
            x = x + 75;
        }
        x = 175;
        for (int p = 0; p < o.length; p++) {
            O[p].setBounds(400, x, 75, 75);
            x = x + 75;
        }

        R.add(title);// adds all of the components to the Frame...
        R.add(back);
        R.add(reset);
        R.add(star);
        R.add(nice);
        R.add(roll);
        R.setLayout(null);
        R.setVisible(true);

        reset.addActionListener(new ActionListener() { // Action Listener when pressing "Generate Card"
            public void actionPerformed(ActionEvent e) {
                R.dispose();
                StartFrame.random();

            }

        });
        back.addActionListener(new ActionListener() { // Action Listener when pressing "Generate Card"
            public void actionPerformed(ActionEvent e) {
                R.dispose();
                StartFrame.start();

            }

        });
        roll.addActionListener(new ActionListener() { // Action Listener to roll for a random number
            public void actionPerformed(ActionEvent e) {

                Random random = new Random();
                int x = random.nextInt(75) + 1;

                if (x < 16) {
                    roll.setText("B " + x);
                }

                else if ((x > 15) && (x < 31)) {
                    roll.setText("I " + x);
                } else if ((x > 30) && (x < 46)) {
                    roll.setText("N " + x);
                } else if ((x > 45) && (x < 61)) {
                    roll.setText("G " + x);
                } else if ((x > 60) && (x < 76)) {
                    roll.setText("O " + x);
                }

            }
        });

    }
}

class GenerateNumbers { // Generates the numbers for each box in bingo.

    public static int[] generateRandomNumbers(int from, int to, int amount) {
        Random random = new Random();
        int[] result = new int[amount];
        for (int i = 0; i < amount; i++) {
            boolean found = false;
            while (!found) {
                result[i] = random.nextInt(to - from + 1) + from;
                found = true;
                for (int j = 0; j < i; j++) {
                    if (result[i] == result[j]) {
                        found = false;
                    }
                }
            }
        }
        return result;
    }
}
