
package bingo.card;

import javax.swing.JFrame;

/**
 *
 * @author Chariz
 */
public class BingoCard {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                start();
            }
        });
    }

    private static void start() {
        JFrame frame = new JFrame("BINGO Main Menu");
        Start bingoPanel = new Start();

        frame.getContentPane().add(bingoPanel);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}
