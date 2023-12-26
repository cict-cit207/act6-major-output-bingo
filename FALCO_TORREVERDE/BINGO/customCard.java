
package bingo.card;

import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.sql.*;

/**
 *
 * @author Chariz
 */
public class customCard extends javax.swing.JPanel {

    /**
     * Creates new form randomCard
     */
    public customCard() {
    initComponents();
    
    }
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
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        N3 = new javax.swing.JButton();
        inputB1 = new javax.swing.JTextField();
        inputB2 = new javax.swing.JTextField();
        inputB3 = new javax.swing.JTextField();
        inputB4 = new javax.swing.JTextField();
        inputB5 = new javax.swing.JTextField();
        inputI1 = new javax.swing.JTextField();
        inputI2 = new javax.swing.JTextField();
        inputI3 = new javax.swing.JTextField();
        inputI4 = new javax.swing.JTextField();
        inputI5 = new javax.swing.JTextField();
        inputN1 = new javax.swing.JTextField();
        inputN2 = new javax.swing.JTextField();
        inputN4 = new javax.swing.JTextField();
        inputN5 = new javax.swing.JTextField();
        inputG1 = new javax.swing.JTextField();
        inputG2 = new javax.swing.JTextField();
        inputG3 = new javax.swing.JTextField();
        inputG4 = new javax.swing.JTextField();
        inputG5 = new javax.swing.JTextField();
        inputO1 = new javax.swing.JTextField();
        inputO2 = new javax.swing.JTextField();
        inputO3 = new javax.swing.JTextField();
        inputO4 = new javax.swing.JTextField();
        inputO5 = new javax.swing.JTextField();

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
        generateNew.setText("Generate Card");
        generateNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateNewActionPerformed(evt);
            }
        });

        jLabel5.setText("61-75");

        jLabel3.setText("46-60");

        jLabel4.setText("31-45");

        jLabel2.setText("16-30");

        jLabel1.setText("1-15");

        N3.setBackground(new java.awt.Color(255, 102, 0));
        N3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        N3.setForeground(new java.awt.Color(255, 255, 255));
        N3.setText("Free");
        N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N3ActionPerformed(evt);
            }
        });

        inputB1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputB1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputB1ActionPerformed(evt);
            }
        });

        inputB2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputB2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputB2ActionPerformed(evt);
            }
        });

        inputB3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputB3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputB3ActionPerformed(evt);
            }
        });

        inputB4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputB4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputB4ActionPerformed(evt);
            }
        });

        inputB5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputB5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputB5ActionPerformed(evt);
            }
        });

        inputI1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputI1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputI1ActionPerformed(evt);
            }
        });

        inputI2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputI2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputI2ActionPerformed(evt);
            }
        });

        inputI3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputI3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputI3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputI3ActionPerformed(evt);
            }
        });

        inputI4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputI4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputI4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputI4ActionPerformed(evt);
            }
        });

        inputI5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputI5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputI5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputI5ActionPerformed(evt);
            }
        });

        inputN1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputN1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputN1ActionPerformed(evt);
            }
        });

        inputN2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputN2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputN2ActionPerformed(evt);
            }
        });

        inputN4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputN4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputN4ActionPerformed(evt);
            }
        });

        inputN5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputN5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputN5ActionPerformed(evt);
            }
        });

        inputG1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputG1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputG1ActionPerformed(evt);
            }
        });

        inputG2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputG2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputG2ActionPerformed(evt);
            }
        });

        inputG3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputG3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputG3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputG3ActionPerformed(evt);
            }
        });

        inputG4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputG4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputG4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputG4ActionPerformed(evt);
            }
        });

        inputG5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputG5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputG5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputG5ActionPerformed(evt);
            }
        });

        inputO1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputO1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputO1ActionPerformed(evt);
            }
        });

        inputO2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputO2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputO2ActionPerformed(evt);
            }
        });

        inputO3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputO3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputO3ActionPerformed(evt);
            }
        });

        inputO4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputO4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputO4ActionPerformed(evt);
            }
        });

        inputO5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inputO5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputO5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputO5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel4)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bingoGame2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bingoGame1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(inputB2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputI2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(inputB3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputI3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(inputB4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputI4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(inputB5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputI5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(inputB1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputI1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(generateNew, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bingoGame3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bingoGame4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(bingoGame5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(N3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputG3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputO3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(inputN1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputG1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputO1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(inputN2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputG2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputO2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(inputN4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputG4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputO4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(inputN5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputG5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputO5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputB1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputI1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputN1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputG1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputO1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputB2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputI2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputN2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputG2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputO2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputB3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputI3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputG3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputO3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputB4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputI4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputN4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputG4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputO4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputB5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputI5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputN5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputG5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputO5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(generateNew))
                .addGap(51, 51, 51))
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
        JFrame frame = new JFrame("Main Menu");
        generatedCard genCard = new generatedCard();
        
        genCard.B1.setText(inputB1.getText());
        genCard.B2.setText(inputB2.getText());
        genCard.B3.setText(inputB3.getText());
        genCard.B4.setText(inputB4.getText());
        genCard.B5.setText(inputB5.getText());
        
        genCard.I1.setText(inputI1.getText());
        genCard.I2.setText(inputI2.getText());
        genCard.I3.setText(inputI3.getText());
        genCard.I4.setText(inputI4.getText());
        genCard.I5.setText(inputI5.getText());
        
        genCard.N1.setText(inputN1.getText());
        genCard.N2.setText(inputN2.getText());
        genCard.N4.setText(inputN4.getText());
        genCard.N5.setText(inputN5.getText());
        
        genCard.G1.setText(inputG1.getText());
        genCard.G2.setText(inputG2.getText());
        genCard.G3.setText(inputG3.getText());
        genCard.G4.setText(inputG4.getText());
        genCard.G5.setText(inputG5.getText());
        
        genCard.O1.setText(inputO1.getText());
        genCard.O2.setText(inputO2.getText());
        genCard.O3.setText(inputO3.getText());
        genCard.O4.setText(inputO4.getText());
        genCard.O5.setText(inputO5.getText());
        
        frame.getContentPane().add(genCard);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JFrame topLevelFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topLevelFrame.dispose();
    }//GEN-LAST:event_generateNewActionPerformed

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

    private void inputB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputB1ActionPerformed

    private void inputB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputB2ActionPerformed

    private void inputB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputB3ActionPerformed

    private void inputB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputB4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputB4ActionPerformed

    private void inputB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputB5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputB5ActionPerformed

    private void inputI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputI1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputI1ActionPerformed

    private void inputI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputI2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputI2ActionPerformed

    private void inputI3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputI3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputI3ActionPerformed

    private void inputI4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputI4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputI4ActionPerformed

    private void inputI5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputI5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputI5ActionPerformed

    private void inputN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputN1ActionPerformed

    private void inputN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputN2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputN2ActionPerformed

    private void inputN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputN4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputN4ActionPerformed

    private void inputN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputN5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputN5ActionPerformed

    private void inputG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputG1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputG1ActionPerformed

    private void inputG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputG2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputG2ActionPerformed

    private void inputG3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputG3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputG3ActionPerformed

    private void inputG4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputG4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputG4ActionPerformed

    private void inputG5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputG5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputG5ActionPerformed

    private void inputO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputO1ActionPerformed

    private void inputO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputO2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputO2ActionPerformed

    private void inputO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputO3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputO3ActionPerformed

    private void inputO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputO4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputO4ActionPerformed

    private void inputO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputO5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputO5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton N3;
    private javax.swing.JButton back;
    private javax.swing.JLabel bingoGame1;
    private javax.swing.JLabel bingoGame2;
    private javax.swing.JLabel bingoGame3;
    private javax.swing.JLabel bingoGame4;
    private javax.swing.JLabel bingoGame5;
    private javax.swing.JButton generateNew;
    private javax.swing.JTextField inputB1;
    private javax.swing.JTextField inputB2;
    private javax.swing.JTextField inputB3;
    private javax.swing.JTextField inputB4;
    private javax.swing.JTextField inputB5;
    private javax.swing.JTextField inputG1;
    private javax.swing.JTextField inputG2;
    private javax.swing.JTextField inputG3;
    private javax.swing.JTextField inputG4;
    private javax.swing.JTextField inputG5;
    private javax.swing.JTextField inputI1;
    private javax.swing.JTextField inputI2;
    private javax.swing.JTextField inputI3;
    private javax.swing.JTextField inputI4;
    private javax.swing.JTextField inputI5;
    private javax.swing.JTextField inputN1;
    private javax.swing.JTextField inputN2;
    private javax.swing.JTextField inputN4;
    private javax.swing.JTextField inputN5;
    private javax.swing.JTextField inputO1;
    private javax.swing.JTextField inputO2;
    private javax.swing.JTextField inputO3;
    private javax.swing.JTextField inputO4;
    private javax.swing.JTextField inputO5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
