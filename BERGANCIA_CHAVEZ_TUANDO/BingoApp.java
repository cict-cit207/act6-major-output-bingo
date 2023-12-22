//Bingo Card GUI Application
//this program allows the user to create Bingo Cards, Check Buttons, and Change background or foreground colors of cards!

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class BingoApp extends javax.swing.JFrame {

     //Create new Bingo Card
    public BingoApp() {
        initComponents();}

    //initialize necessary components
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        gridPanel = new javax.swing.JPanel();

        BButton = new javax.swing.JButton();
        IButton = new javax.swing.JButton();
        NButton = new javax.swing.JButton();
        GButton = new javax.swing.JButton();
        OButton = new javax.swing.JButton();

        jSeparator6 = new javax.swing.JSeparator();

        ButtonsGrid = new javax.swing.JPanel();

        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();

        changeBGColorItem = new javax.swing.JMenuItem();
        changeFGColorItem = new javax.swing.JMenuItem();
        createNewCardItem = new javax.swing.JMenuItem();

        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bingo App");
        setBackground(java.awt.Color.pink);

        mainPanel.setBackground(new java.awt.Color(255, 153, 102));
        mainPanel.setLayout(new java.awt.GridLayout());

        gridPanel.setBackground(new java.awt.Color(255, 153, 102));

        BButton.setBackground(new java.awt.Color(255, 153, 102));
        BButton.setFont(new java.awt.Font("Bodoni MT", 1, 48)); // NOI18N
        BButton.setForeground(new java.awt.Color(255, 255, 204));
        BButton.setText("B");
        BButton.setBorder(null);
        BButton.setBorderPainted(false);
        BButton.setContentAreaFilled(false);
        BButton.setFocusPainted(false);
        BButton.setFocusable(false);

        IButton.setBackground(new java.awt.Color(255, 153, 102));
        IButton.setFont(new java.awt.Font("Bodoni MT", 1, 48)); // NOI18N
        IButton.setForeground(new java.awt.Color(255, 255, 204));
        IButton.setText("I");
        IButton.setBorder(null);
        IButton.setBorderPainted(false);
        IButton.setContentAreaFilled(false);

        NButton.setBackground(new java.awt.Color(255, 153, 102));
        NButton.setFont(new java.awt.Font("Bodoni MT", 1, 48)); // NOI18N
        NButton.setForeground(new java.awt.Color(255, 255, 204));
        NButton.setText("N");
        NButton.setBorder(null);
        NButton.setBorderPainted(false);
        NButton.setContentAreaFilled(false);

        GButton.setBackground(new java.awt.Color(255, 153, 102));
        GButton.setFont(new java.awt.Font("Bodoni MT", 1, 48)); // NOI18N
        GButton.setForeground(new java.awt.Color(255, 255, 204));
        GButton.setText("G");
        GButton.setBorder(null);
        GButton.setBorderPainted(false);
        GButton.setContentAreaFilled(false);

        OButton.setBackground(new java.awt.Color(255, 153, 102));
        OButton.setFont(new java.awt.Font("Bodoni MT", 1, 48)); // NOI18N
        OButton.setForeground(new java.awt.Color(255, 255, 204));
        OButton.setText("O");
        OButton.setBorder(null);
        OButton.setBorderPainted(false);
        OButton.setContentAreaFilled(false);

        jSeparator6.setForeground(new java.awt.Color(255, 255, 204));

        //get randomized numbers from class CardNumbers
        CardNumbers cardnums = new CardNumbers();
        ArrayList bingoList = cardnums.getFinalList();

        //for layout of the buttons
        ButtonsGrid.setOpaque(false);
        ButtonsGrid.setLayout(new java.awt.GridLayout(5,5, 0, 0));

        //create a list of JButtons
        List<JButton> gridButtons = new ArrayList<>();

        for(Object i : bingoList){
            JButton tempButton = new JButton(String.valueOf(i));
            tempButton.addActionListener(e -> tempButton.setEnabled(false));
            tempButton.setOpaque(false);
            tempButton.setFont(new java.awt.Font("Dubai", 1, 20));
            tempButton.setContentAreaFilled(true);
            tempButton.setBorderPainted(true);

            //check for Free cell to disable it for the user
            String free = tempButton.getText();
            if(free.equals("Free")){
                tempButton.disable();
            }

            //add tempButton to list
            gridButtons.add(tempButton);
        }

        //add list to grid
        for(JButton gridNums: gridButtons){
            ButtonsGrid.add(gridNums);
        }


        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(gridPanel);
        gridPanel.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(BButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(IButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(NButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(10, 10, 10)
                                                .addComponent(GButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(OButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(51, 51, 51))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(38, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(ButtonsGrid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(193, 193, 193)))
                                                .addGap(39, 39, 39))))
        );

        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BButton)
                                        .addComponent(IButton)
                                        .addComponent(NButton)
                                        .addComponent(GButton)
                                        .addComponent(OButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(ButtonsGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        mainPanel.add(gridPanel);

        //menus of the Application
        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        //menu item for changing background color
        changeBGColorItem.setMnemonic('o');
        changeBGColorItem.setText("Change Background Color");
        changeBGColorItem.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBackgroundColorsActionPerformed();
            }
        });
        fileMenu.add(changeBGColorItem);

        //menu item for changing foreground color
        changeFGColorItem.setMnemonic('s');
        changeFGColorItem.setText("Change Foreground Color");
        changeFGColorItem.addActionListener(new ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeForegroundColorsActionPerformed();
            }
        });
        fileMenu.add(changeFGColorItem);

        //menu item for creating another card
        createNewCardItem.setMnemonic('a');
        createNewCardItem.setText("Generate New Card");
        createNewCardItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewCard();
            }
            private void run() {
                    new BingoApp().setVisible(true);
            };
        });
        fileMenu.add(createNewCardItem);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Instructions");
        contentsMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello there, user!");
                JOptionPane.showMessageDialog(null, "This Application is made with joy and love for the game 'Bingo'");
                JOptionPane.showMessageDialog(null, "Get ready for an exciting and fun-filled Bingo experience. Whether " +
                        "you're a seasoned player or trying it for the first time, Bingo is a game that brings people together for moments of anticipation, joy, and a dash of luck.");
                JOptionPane.showMessageDialog(null, "You'll be given a Bingo card with a unique combination of numbers arranged in columns under the letters B, I, N, G, and O.");
                JOptionPane.showMessageDialog(null, "You can also get new cards by pressing 'File' and 'Generate New Card'!");
                JOptionPane.showMessageDialog(null, "You can change background and foreground colors as well!");
                JOptionPane.showMessageDialog(null, "Listen carefully and press down all the numbers you can get!");
                JOptionPane.showMessageDialog(null, "Hope you enjoy our Bingo App!!!");
            }
        });
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About The Creators");
        aboutMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This Bingo Application was made by Mauricio Manuel F. Bergancia, Michael Rey T. Tuando, and Mherlie Joy U. Chavez");
                JOptionPane.showMessageDialog(null, "They are all from WVSU's College of ICT!");
                JOptionPane.showMessageDialog(null, "You can reach them out on Facebook, Instagram, and Twitter!");
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );
        pack();
    }

    //functions for events
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void changeBackgroundColorsActionPerformed() {
        // Show a color chooser dialog
        Color bgColor = JColorChooser.showDialog(this, "Choose Background Color", getBackground());
        if (bgColor != null) {
            // Set the background color of the relevant components
            ButtonsGrid.setBackground(bgColor);
            BButton.setBackground(bgColor);
            IButton.setBackground(bgColor);
            NButton.setBackground(bgColor);
            GButton.setBackground(bgColor);
            OButton.setBackground(bgColor);

            mainPanel.setBackground(bgColor);
            gridPanel.setBackground(bgColor);

            jSeparator6.setBackground(bgColor);

        }
    }

    private void changeForegroundColorsActionPerformed() {
        // Show a color chooser dialog
        Color fgcolor = JColorChooser.showDialog(this, "Choose Foreground Color", getForeground());
        if (fgcolor != null) {
            // Set the background color of the relevant components
            ButtonsGrid.setForeground(fgcolor);
            BButton.setForeground(fgcolor);
            IButton.setForeground(fgcolor);
            NButton.setForeground(fgcolor);
            GButton.setForeground(fgcolor);
            OButton.setForeground(fgcolor);
            mainPanel.setForeground(fgcolor);
            gridPanel.setForeground(fgcolor);
            jSeparator6.setForeground(fgcolor);
        }
    }

    private void addNewCard(){
        //create a new bingo card
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BingoApp().setVisible(true);
            }
        });
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BingoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BingoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BingoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BingoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BingoApp().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton BButton;
    private javax.swing.JPanel ButtonsGrid;
    private javax.swing.JButton GButton;
    private javax.swing.JButton IButton;
    private javax.swing.JButton NButton;
    private javax.swing.JButton OButton;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;

    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel gridPanel;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem changeBGColorItem;
    private javax.swing.JMenuItem createNewCardItem;
    private javax.swing.JMenuItem changeFGColorItem;
}
