
package bingo.card;

import java.awt.Color;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Chariz
 */
public class randomCard extends javax.swing.JPanel {

    /**
     * Creates new form randomCard
     */
    public randomCard() {
        initComponents();
        
        Set<Integer> usedNumbersColumn1 = new HashSet<>(); // Declare a set to keep track of used numbers in column 1
        Set<Integer> usedNumbersColumn2 = new HashSet<>(); // Declare a set to keep track of used numbers in column 2
        Set<Integer> usedNumbersColumn3 = new HashSet<>(); // Declare a set to keep track of used numbers in column 3
        Set<Integer> usedNumbersColumn4 = new HashSet<>(); // Declare a set to keep track of used numbers in column 4
        Set<Integer> usedNumbersColumn5 = new HashSet<>(); // Declare a set to keep track of used numbers in column 5
        
        //Column B (1-15)
            B1.setBackground(Color.WHITE); // Reset to default color
            B1.setForeground(Color.BLACK);
            B2.setBackground(Color.WHITE); // Reset to default color
            B2.setForeground(Color.BLACK);
            B3.setBackground(Color.WHITE); // Reset to default color
            B3.setForeground(Color.BLACK);
            B4.setBackground(Color.WHITE); // Reset to default color
            B4.setForeground(Color.BLACK);
            B5.setBackground(Color.WHITE); // Reset to default color
            B5.setForeground(Color.BLACK);
            
        int randomNumB1;
            do {
                randomNumB1 = new Random().nextInt(15) + 1;
            } while (!usedNumbersColumn1.add(randomNumB1));
            B1.setText("" + randomNumB1 + "");
        int randomNumB2;
            do {
                randomNumB2 = new Random().nextInt(15) + 1;
            } while (!usedNumbersColumn1.add(randomNumB2));
            B2.setText("" + randomNumB2 + "");
        int randomNumB3;
            do {
                randomNumB3 = new Random().nextInt(15) + 1;
            } while (!usedNumbersColumn1.add(randomNumB3));
            B3.setText("" + randomNumB3 + "");
        int randomNumB4;
            do {
                randomNumB4 = new Random().nextInt(15) + 1;
            } while (!usedNumbersColumn1.add(randomNumB4));
            B4.setText("" + randomNumB4 + "");
        int randomNumB5;
            do {
                randomNumB5 = new Random().nextInt(15) + 1;
            } while (!usedNumbersColumn1.add(randomNumB5));
            B5.setText("" + randomNumB5 + "");
            
           
            
            
            I1.setBackground(Color.WHITE); // Reset to default color
            I1.setForeground(Color.BLACK);
            I2.setBackground(Color.WHITE); // Reset to default color
            I2.setForeground(Color.BLACK);
            I3.setBackground(Color.WHITE); // Reset to default color
            I3.setForeground(Color.BLACK);
            I4.setBackground(Color.WHITE); // Reset to default color
            I4.setForeground(Color.BLACK);
            I5.setBackground(Color.WHITE); // Reset to default color
            I5.setForeground(Color.BLACK);

        int randomNumI1;
            do {
                randomNumI1 = new Random().nextInt(15) + 16;
            } while (!usedNumbersColumn2.add(randomNumI1));
            I1.setText("" + randomNumI1 + "");

        int randomNumI2;
            do {
                randomNumI2 = new Random().nextInt(15) + 16;
            } while (!usedNumbersColumn2.add(randomNumI2));
            I2.setText("" + randomNumI2 + "");

        int randomNumI3;
            do {
                randomNumI3 = new Random().nextInt(15) + 16;
            } while (!usedNumbersColumn2.add(randomNumI3));
            I3.setText("" + randomNumI3 + "");

        int randomNumI4;
            do {
                randomNumI4 = new Random().nextInt(15) + 16;
            } while (!usedNumbersColumn2.add(randomNumI4));
            I4.setText("" + randomNumI4 + "");

        int randomNumI5;
            do {
                randomNumI5 = new Random().nextInt(15) + 16;
            } while (!usedNumbersColumn2.add(randomNumI5));
            I5.setText("" + randomNumI5 + "");

        
            
            
            
            N1.setBackground(Color.WHITE); // Reset to default color
            N1.setForeground(Color.BLACK);
            N2.setBackground(Color.WHITE); // Reset to default color
            N2.setForeground(Color.BLACK);
            N4.setBackground(Color.WHITE); // Reset to default color
            N4.setForeground(Color.BLACK);
            N5.setBackground(Color.WHITE); // Reset to default color
            N5.setForeground(Color.BLACK);

        int randomNumN1;
            do {
                randomNumN1 = new Random().nextInt(15) + 31;
            } while (!usedNumbersColumn3.add(randomNumN1));
            N1.setText("" + randomNumN1 + "");

        int randomNumN2;
            do {
                randomNumN2 = new Random().nextInt(15) + 31;
            } while (!usedNumbersColumn3.add(randomNumN2));
            N2.setText("" + randomNumN2 + "");

        int randomNumN4;
            do {
                randomNumN4 = new Random().nextInt(15) + 31;
            } while (!usedNumbersColumn3.add(randomNumN4));
            N4.setText("" + randomNumN4 + "");

        int randomNumN5;
            do {
                randomNumN5 = new Random().nextInt(15) + 31;
            } while (!usedNumbersColumn3.add(randomNumN5));
            N5.setText("" + randomNumN5 + "");
            
            
            

            
            G1.setBackground(Color.WHITE); // Reset to default color
            G1.setForeground(Color.BLACK);
            G2.setBackground(Color.WHITE); // Reset to default color
            G2.setForeground(Color.BLACK);
            G3.setBackground(Color.WHITE); // Reset to default color
            G3.setForeground(Color.BLACK);
            G4.setBackground(Color.WHITE); // Reset to default color
            G4.setForeground(Color.BLACK);
            G5.setBackground(Color.WHITE); // Reset to default color
            G5.setForeground(Color.BLACK);

        int randomNumG1;
            do {
                randomNumG1 = new Random().nextInt(15) + 46;
            } while (!usedNumbersColumn4.add(randomNumG1));
            G1.setText("" + randomNumG1 + "");

        int randomNumG2;
            do {
                randomNumG2 = new Random().nextInt(15) + 46;
            } while (!usedNumbersColumn4.add(randomNumG2));
            G2.setText("" + randomNumG2 + "");

        int randomNumG3;
            do {
                randomNumG3 = new Random().nextInt(15) + 46;
            } while (!usedNumbersColumn4.add(randomNumG3));
            G3.setText("" + randomNumG3 + "");

        int randomNumG4;
            do {
                randomNumG4 = new Random().nextInt(15)  + 46;
            } while (!usedNumbersColumn4.add(randomNumG4));
            G4.setText("" + randomNumG4 + "");

        int randomNumG5;
            do {
                randomNumG5 = new Random().nextInt(15) + 46;
            } while (!usedNumbersColumn4.add(randomNumG5));
            G5.setText("" + randomNumG5 + "");

         
            
            
            
            
            
            O1.setBackground(Color.WHITE); // Reset to default color
            O1.setForeground(Color.BLACK);
            O2.setBackground(Color.WHITE); // Reset to default color
            O2.setForeground(Color.BLACK);
            O3.setBackground(Color.WHITE); // Reset to default color
            O3.setForeground(Color.BLACK);
            O4.setBackground(Color.WHITE); // Reset to default color
            O4.setForeground(Color.BLACK);
            O5.setBackground(Color.WHITE); // Reset to default color
            O5.setForeground(Color.BLACK);

        int randomNumO1;
            do {
                randomNumO1 = new Random().nextInt(15) + 61;
            } while (!usedNumbersColumn5.add(randomNumO1));
            O1.setText("" + randomNumO1 + "");

        int randomNumO2;
            do {
                randomNumO2 = new Random().nextInt(15) + 61;
            } while (!usedNumbersColumn5.add(randomNumO2));
            O2.setText("" + randomNumO2 + "");

        int randomNumO3;
            do {
                randomNumO3 = new Random().nextInt(15) + 61;
            } while (!usedNumbersColumn5.add(randomNumO3));
            O3.setText("" + randomNumO3 + "");

        int randomNumO4;
            do {
                randomNumO4 = new Random().nextInt(15) + 61;
            } while (!usedNumbersColumn5.add(randomNumO4));
            O4.setText("" + randomNumO4 + "");

        int randomNumO5;
            do {
                randomNumO5 = new Random().nextInt(15) + 61;
            } while (!usedNumbersColumn5.add(randomNumO5));
            O5.setText("" + randomNumO5 + "");


}
    
            
    
            

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bingoGame1 = new javax.swing.JLabel();
        bingoGame2 = new javax.swing.JLabel();
        bingoGame3 = new javax.swing.JLabel();
        bingoGame4 = new javax.swing.JLabel();
        bingoGame5 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        generateNew = new javax.swing.JButton();
        roll = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        randomCell = new javax.swing.JTextArea();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        I1 = new javax.swing.JButton();
        I2 = new javax.swing.JButton();
        I3 = new javax.swing.JButton();
        I4 = new javax.swing.JButton();
        I5 = new javax.swing.JButton();
        N1 = new javax.swing.JButton();
        N2 = new javax.swing.JButton();
        N3 = new javax.swing.JButton();
        N4 = new javax.swing.JButton();
        N5 = new javax.swing.JButton();
        G1 = new javax.swing.JButton();
        G2 = new javax.swing.JButton();
        G3 = new javax.swing.JButton();
        G4 = new javax.swing.JButton();
        G5 = new javax.swing.JButton();
        O1 = new javax.swing.JButton();
        O2 = new javax.swing.JButton();
        O3 = new javax.swing.JButton();
        O4 = new javax.swing.JButton();
        O5 = new javax.swing.JButton();

        bingoGame1.setFont(new java.awt.Font("Raleway ExtraBold", 0, 60)); // NOI18N
        bingoGame1.setForeground(new java.awt.Color(255, 102, 51));
        bingoGame1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bingoGame1.setText("I");

        bingoGame2.setFont(new java.awt.Font("Raleway ExtraBold", 0, 60)); // NOI18N
        bingoGame2.setForeground(new java.awt.Color(255, 102, 51));
        bingoGame2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bingoGame2.setText("B");

        bingoGame3.setFont(new java.awt.Font("Raleway ExtraBold", 0, 60)); // NOI18N
        bingoGame3.setForeground(new java.awt.Color(255, 102, 51));
        bingoGame3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bingoGame3.setText("N");

        bingoGame4.setFont(new java.awt.Font("Raleway ExtraBold", 0, 60)); // NOI18N
        bingoGame4.setForeground(new java.awt.Color(255, 102, 51));
        bingoGame4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bingoGame4.setText("G");

        bingoGame5.setFont(new java.awt.Font("Raleway ExtraBold", 0, 60)); // NOI18N
        bingoGame5.setForeground(new java.awt.Color(255, 102, 51));
        bingoGame5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bingoGame5.setText("O");

        back.setBackground(new java.awt.Color(255, 204, 102));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        generateNew.setBackground(new java.awt.Color(255, 204, 102));
        generateNew.setText("Generate New Card");
        generateNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateNewActionPerformed(evt);
            }
        });

        roll.setBackground(new java.awt.Color(255, 102, 0));
        roll.setFont(new java.awt.Font("Raleway Medium", 1, 36)); // NOI18N
        roll.setForeground(new java.awt.Color(255, 255, 255));
        roll.setText("ROLL");
        roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollActionPerformed(evt);
            }
        });

        jLabel5.setText("61-75");

        jLabel3.setText("46-60");

        jLabel4.setText("31-45");

        jLabel2.setText("16-30");

        jLabel1.setText("1-15");

        randomCell.setColumns(1);
        randomCell.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        randomCell.setRows(1);
        randomCell.setTabSize(1);
        jScrollPane1.setViewportView(randomCell);

        B1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        I1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        I1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I1ActionPerformed(evt);
            }
        });

        I2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        I2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I2ActionPerformed(evt);
            }
        });

        I3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        I3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I3ActionPerformed(evt);
            }
        });

        I4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        I4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I4ActionPerformed(evt);
            }
        });

        I5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        I5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I5ActionPerformed(evt);
            }
        });

        N1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        N1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N1ActionPerformed(evt);
            }
        });

        N2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N2ActionPerformed(evt);
            }
        });

        N3.setBackground(new java.awt.Color(255, 102, 0));
        N3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        N3.setForeground(new java.awt.Color(255, 255, 255));
        N3.setText("Free");
        N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N3ActionPerformed(evt);
            }
        });

        N4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        N4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N4ActionPerformed(evt);
            }
        });

        N5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        N5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N5ActionPerformed(evt);
            }
        });

        G1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });

        G2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });

        G3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        G3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G3ActionPerformed(evt);
            }
        });

        G4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        G4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G4ActionPerformed(evt);
            }
        });

        G5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        G5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G5ActionPerformed(evt);
            }
        });

        O1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        O1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O1ActionPerformed(evt);
            }
        });

        O2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        O2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O2ActionPerformed(evt);
            }
        });

        O3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        O3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O3ActionPerformed(evt);
            }
        });

        O4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        O4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O4ActionPerformed(evt);
            }
        });

        O5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        O5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bingoGame2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bingoGame1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(I5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(generateNew, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(O1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bingoGame3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(bingoGame4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(4, 4, 4)
                                            .addComponent(bingoGame5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(O2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(N3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(O3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(N4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(O4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(N5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(O5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel4)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(roll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bingoGame1)
                                    .addComponent(bingoGame3)
                                    .addComponent(bingoGame4)
                                    .addComponent(bingoGame2)
                                    .addComponent(bingoGame5))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(N1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(O2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(N3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(N4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(generateNew))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        JFrame frame = new JFrame("Main Menu");
        Start bingoPanel = new Start();
        frame.getContentPane().add(bingoPanel);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JFrame topLevelFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topLevelFrame.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void generateNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateNewActionPerformed
        JFrame frame = new JFrame("Bingo");
        randomCard bingoPanel = new randomCard();
        frame.getContentPane().add(bingoPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JFrame topLevelFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topLevelFrame.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_generateNewActionPerformed

    private void rollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollActionPerformed
        Random random = new Random();

    // Array to store the letters
    char[] letters = {'B', 'I', 'N', 'G', 'O'};

    // Randomly select a letter
    char selectedLetter = letters[random.nextInt(letters.length)];

    // Randomly generate a number based on the selected letter range
    int randomNumber;
    switch (selectedLetter) {
        case 'B':
            randomNumber = random.nextInt(15) + 1;
            break;
        case 'I':
            randomNumber = random.nextInt(15) + 16;
            break;
        case 'N':
            randomNumber = random.nextInt(15) + 31;
            break;
        case 'G':
            randomNumber = random.nextInt(15) + 46;
            break;
        case 'O':
            randomNumber = random.nextInt(15) + 61;
            break;
        default:
            throw new IllegalStateException("Unexpected value: " + selectedLetter);
    }

    // Display the combination in the randomCell text field
    randomCell.setText(selectedLetter + "" + randomNumber);
    }//GEN-LAST:event_rollActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        if (B1.getBackground().equals(Color.WHITE)) {
        B1.setBackground(new Color(255, 102, 51)); // Red background when clicked
        B1.setForeground(Color.WHITE);
        } 
        
        else {
        B1.setBackground(Color.WHITE); // Reset to default color
        B1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        if (B2.getBackground().equals(Color.WHITE)) {
        B2.setBackground(new Color(255, 102, 51)); // Red background when clicked
        B2.setForeground(Color.WHITE);
        } 
        
        else {
        B2.setBackground(Color.WHITE); // Reset to default color
        B2.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        if (B3.getBackground().equals(Color.WHITE)) {
        B3.setBackground(new Color(255, 102, 51)); // Red background when clicked
        B3.setForeground(Color.WHITE);
        } 
        
        else {
        B3.setBackground(Color.WHITE); // Reset to default color
        B3.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        if (B4.getBackground().equals(Color.WHITE)) {
        B4.setBackground(new Color(255, 102, 51)); // Red background when clicked
        B4.setForeground(Color.WHITE);
        } 
        
        else {
        B4.setBackground(Color.WHITE); // Reset to default color
        B4.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        if (B5.getBackground().equals(Color.WHITE)) {
        B5.setBackground(new Color(255, 102, 51)); // Red background when clicked
        B5.setForeground(Color.WHITE);
        } 
        
        else {
        B5.setBackground(Color.WHITE); // Reset to default color
        B5.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_B5ActionPerformed

    private void I1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I1ActionPerformed
        if (I1.getBackground().equals(Color.WHITE)) {
        I1.setBackground(new Color(255, 102, 51)); // Red background when clicked
        I1.setForeground(Color.WHITE);
        } 
        
        else {
        I1.setBackground(Color.WHITE); // Reset to default color
        I1.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_I1ActionPerformed

    private void I2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I2ActionPerformed
        if (I2.getBackground().equals(Color.WHITE)) {
        I2.setBackground(new Color(255, 102, 51)); // Red background when clicked
        I2.setForeground(Color.WHITE);
        } 
        
        else {
        I2.setBackground(Color.WHITE); // Reset to default color
        I2.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_I2ActionPerformed

    private void I3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I3ActionPerformed
        if (I3.getBackground().equals(Color.WHITE)) {
        I3.setBackground(new Color(255, 102, 51)); // Red background when clicked
        I3.setForeground(Color.WHITE);
        } 
        
        else {
        I3.setBackground(Color.WHITE); // Reset to default color
        I3.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_I3ActionPerformed

    private void I4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I4ActionPerformed
        if (I4.getBackground().equals(Color.WHITE)) {
        I4.setBackground(new Color(255, 102, 51)); // Red background when clicked
        I4.setForeground(Color.WHITE);
        } 
        
        else {
        I4.setBackground(Color.WHITE); // Reset to default color
        I4.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_I4ActionPerformed

    private void I5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I5ActionPerformed
        if (I5.getBackground().equals(Color.WHITE)) {
        I5.setBackground(new Color(255, 102, 51)); // Red background when clicked
        I5.setForeground(Color.WHITE);
        } 
        
        else {
        I5.setBackground(Color.WHITE); // Reset to default color
        I5.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_I5ActionPerformed

    private void N1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N1ActionPerformed
        if (N1.getBackground().equals(Color.WHITE)) {
        N1.setBackground(new Color(255, 102, 51)); // Red background when clicked
        N1.setForeground(Color.WHITE);
        } 
        
        else {
        N1.setBackground(Color.WHITE); // Reset to default color
        N1.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_N1ActionPerformed

    private void N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N2ActionPerformed
        if (N2.getBackground().equals(Color.WHITE)) {
        N2.setBackground(new Color(255, 102, 51)); // Red background when clicked
        N2.setForeground(Color.WHITE);
        } 
        
        else {
        N2.setBackground(Color.WHITE); // Reset to default color
        N2.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_N2ActionPerformed

    private void N3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N3ActionPerformed
        if (N3.getBackground().equals(Color.WHITE)) {
        N3.setBackground(new Color(255, 102, 51)); // Red background when clicked
        N3.setForeground(Color.WHITE);
        } 
        
        else {
        N3.setBackground(Color.WHITE); // Reset to default color
        N3.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_N3ActionPerformed

    private void N4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N4ActionPerformed
        if (N4.getBackground().equals(Color.WHITE)) {
        N4.setBackground(new Color(255, 102, 51)); // Red background when clicked
        N4.setForeground(Color.WHITE);
        } 
        
        else {
        N4.setBackground(Color.WHITE); // Reset to default color
        N4.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_N4ActionPerformed

    private void N5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N5ActionPerformed
        if (N5.getBackground().equals(Color.WHITE)) {
        N5.setBackground(new Color(255, 102, 51)); // Red background when clicked
        N5.setForeground(Color.WHITE);
        } 
        
        else {
        N5.setBackground(Color.WHITE); // Reset to default color
        N5.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_N5ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        if (G1.getBackground().equals(Color.WHITE)) {
        G1.setBackground(new Color(255, 102, 51)); // Red background when clicked
        G1.setForeground(Color.WHITE);
        } 
        
        else {
        G1.setBackground(Color.WHITE); // Reset to default color
        G1.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_G1ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
        if (G2.getBackground().equals(Color.WHITE)) {
        G2.setBackground(new Color(255, 102, 51)); // Red background when clicked
        G2.setForeground(Color.WHITE);
        } 
        
        else {
        G2.setBackground(Color.WHITE); // Reset to default color
        G2.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_G2ActionPerformed

    private void G3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G3ActionPerformed
        if (G3.getBackground().equals(Color.WHITE)) {
        G3.setBackground(new Color(255, 102, 51)); // Red background when clicked
        G3.setForeground(Color.WHITE);
        } 
        
        else {
        G3.setBackground(Color.WHITE); // Reset to default color
        G3.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_G3ActionPerformed

    private void G4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G4ActionPerformed
        if (G4.getBackground().equals(Color.WHITE)) {
        G4.setBackground(new Color(255, 102, 51)); // Red background when clicked
        G4.setForeground(Color.WHITE);
        } 
        
        else {
        G4.setBackground(Color.WHITE); // Reset to default color
        G4.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_G4ActionPerformed

    private void G5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G5ActionPerformed
        if (G5.getBackground().equals(Color.WHITE)) {
        G5.setBackground(new Color(255, 102, 51)); // Red background when clicked
        G5.setForeground(Color.WHITE);
        } 
        
        else {
        G5.setBackground(Color.WHITE); // Reset to default color
        G5.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_G5ActionPerformed

    private void O1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O1ActionPerformed
        if (O1.getBackground().equals(Color.WHITE)) {
        O1.setBackground(new Color(255, 102, 51)); // Red background when clicked
        O1.setForeground(Color.WHITE);
        } 
        
        else {
        O1.setBackground(Color.WHITE); // Reset to default color
        O1.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_O1ActionPerformed

    private void O2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O2ActionPerformed
        if (O2.getBackground().equals(Color.WHITE)) {
        O2.setBackground(new Color(255, 102, 51)); // Red background when clicked
        O2.setForeground(Color.WHITE);
        } 
        
        else {
        O2.setBackground(Color.WHITE); // Reset to default color
        O2.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_O2ActionPerformed

    private void O3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O3ActionPerformed
        if (O3.getBackground().equals(Color.WHITE)) {
        O3.setBackground(new Color(255, 102, 51)); // Red background when clicked
        O3.setForeground(Color.WHITE);
        } 
        
        else {
        O3.setBackground(Color.WHITE); // Reset to default color
        O3.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_O3ActionPerformed

    private void O4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O4ActionPerformed
        if (O4.getBackground().equals(Color.WHITE)) {
        O4.setBackground(new Color(255, 102, 51)); // Red background when clicked
        O4.setForeground(Color.WHITE);
        } 
        
        else {
        O4.setBackground(Color.WHITE); // Reset to default color
        O4.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_O4ActionPerformed

    private void O5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O5ActionPerformed
        if (O5.getBackground().equals(Color.WHITE)) {
        O5.setBackground(new Color(255, 102, 51)); // Red background when clicked
        O5.setForeground(Color.WHITE);
        } 
        
        else {
        O5.setBackground(Color.WHITE); // Reset to default color
        O5.setForeground(Color.BLACK);
        }// TODO add your handling code here:
    }//GEN-LAST:event_O5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton G1;
    private javax.swing.JButton G2;
    private javax.swing.JButton G3;
    private javax.swing.JButton G4;
    private javax.swing.JButton G5;
    private javax.swing.JButton I1;
    private javax.swing.JButton I2;
    private javax.swing.JButton I3;
    private javax.swing.JButton I4;
    private javax.swing.JButton I5;
    private javax.swing.JButton N1;
    private javax.swing.JButton N2;
    private javax.swing.JButton N3;
    private javax.swing.JButton N4;
    private javax.swing.JButton N5;
    private javax.swing.JButton O1;
    private javax.swing.JButton O2;
    private javax.swing.JButton O3;
    private javax.swing.JButton O4;
    private javax.swing.JButton O5;
    private javax.swing.JButton back;
    private javax.swing.JLabel bingoGame1;
    private javax.swing.JLabel bingoGame2;
    private javax.swing.JLabel bingoGame3;
    private javax.swing.JLabel bingoGame4;
    private javax.swing.JLabel bingoGame5;
    private javax.swing.JButton generateNew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea randomCell;
    private javax.swing.JButton roll;
    // End of variables declaration//GEN-END:variables
}
