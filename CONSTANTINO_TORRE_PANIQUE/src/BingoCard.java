import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.Color;
import java.util.Random;

public class BingoCard extends javax.swing.JFrame {

    public BingoCard() {
        initComponents();

    // Create a list with numbers 1-15 for B
    List<Integer> Bnumbers = new ArrayList<>();
    for (int i = 1; i <= 15; i++) {
    Bnumbers.add(i);
    }
    // Shuffle the list
    Collections.shuffle(Bnumbers);

    // Assign the shuffled numbers to buttons
    B1.setText(Integer.toString(Bnumbers.get(0)));
    B2.setText(Integer.toString(Bnumbers.get(1)));
    B3.setText(Integer.toString(Bnumbers.get(2)));
    B4.setText(Integer.toString(Bnumbers.get(3)));
    B5.setText(Integer.toString(Bnumbers.get(4)));
    
    //rinse and repeat but with different numbers according to column
    List<Integer> Inumbers = new ArrayList<>();
    for (int i = 16; i <= 30; i++) {
    Inumbers.add(i);
    }

    Collections.shuffle(Inumbers);
    
    I1.setText(Integer.toString(Inumbers.get(0)));
    I2.setText(Integer.toString(Inumbers.get(1)));
    I3.setText(Integer.toString(Inumbers.get(2)));
    I4.setText(Integer.toString(Inumbers.get(3)));
    I5.setText(Integer.toString(Inumbers.get(4)));
    
    List<Integer> Nnumbers = new ArrayList<>();
    for (int i = 31; i <= 45; i++) {
    Nnumbers.add(i);
    }

    Collections.shuffle(Nnumbers);
    
    N1.setText(Integer.toString(Nnumbers.get(0)));
    N2.setText(Integer.toString(Nnumbers.get(1)));
    N4.setText(Integer.toString(Nnumbers.get(2)));
    N5.setText(Integer.toString(Nnumbers.get(3)));
    //skipped N3 since its free


    List<Integer> Gnumbers = new ArrayList<>();
    for (int i = 46; i <= 60; i++) {
    Gnumbers.add(i);
    }

    Collections.shuffle(Gnumbers);
    
    G1.setText(Integer.toString(Gnumbers.get(0)));
    G2.setText(Integer.toString(Gnumbers.get(1)));
    G3.setText(Integer.toString(Gnumbers.get(2)));
    G4.setText(Integer.toString(Gnumbers.get(3)));
    G5.setText(Integer.toString(Gnumbers.get(4)));
    
    List<Integer> Onumbers = new ArrayList<>();
    for (int i = 61; i <= 75; i++) {
    Onumbers.add(i);
    }

    Collections.shuffle(Onumbers);
    
    O1.setText(Integer.toString(Onumbers.get(0)));
    O2.setText(Integer.toString(Onumbers.get(1)));
    O3.setText(Integer.toString(Onumbers.get(2)));
    O4.setText(Integer.toString(Onumbers.get(3)));
    O5.setText(Integer.toString(Onumbers.get(4)));

  randomizeBackgroundColor();    
    }
    private void randomizeBackgroundColor() {
        Random rand = new Random();
        int red = rand.nextInt(256);
        int green = rand.nextInt(256);
        int blue = rand.nextInt(256);

        Color randomColor = new Color(red, green, blue);
        getContentPane().setBackground(randomColor);
   
    }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B1 = new javax.swing.JButton();
        Label = new javax.swing.JLabel();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        I2 = new javax.swing.JButton();
        I1 = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 700));
        setMinimumSize(new java.awt.Dimension(550, 700));
        setName("Background"); // NOI18N
        setPreferredSize(new java.awt.Dimension(550, 670));
        setResizable(false);
        setSize(new java.awt.Dimension(550, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        B1.setName(""); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 100));
        B1.getAccessibleContext().setAccessibleName("B1");
        B1.getAccessibleContext().setAccessibleDescription("");

        Label.setFont(new java.awt.Font("Impact", 1, 112)); // NOI18N
        Label.setForeground(new java.awt.Color(255, 255, 255));
        Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label.setText("B   I  N  G  O");
        Label.setToolTipText("");
        getContentPane().add(Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 490, 110));

        B2.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        getContentPane().add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 100, 100));

        B3.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        getContentPane().add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 100, 100));

        B4.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        getContentPane().add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 100, 100));

        B5.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        getContentPane().add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 100, 100));

        I2.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        I2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I2ActionPerformed(evt);
            }
        });
        getContentPane().add(I2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 100, 100));

        I1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        I1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I1ActionPerformed(evt);
            }
        });
        getContentPane().add(I1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 100, 100));

        I3.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        I3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I3ActionPerformed(evt);
            }
        });
        getContentPane().add(I3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 100, 100));

        I4.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        I4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I4ActionPerformed(evt);
            }
        });
        getContentPane().add(I4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 100, 100));

        I5.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        I5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I5ActionPerformed(evt);
            }
        });
        getContentPane().add(I5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 100, 100));

        N1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        N1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N1ActionPerformed(evt);
            }
        });
        getContentPane().add(N1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 100, 100));

        N2.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N2ActionPerformed(evt);
            }
        });
        getContentPane().add(N2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 100, 100));

        N3.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        N3.setForeground(new java.awt.Color(255, 255, 255));
        N3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FREE.png"))); // NOI18N
        N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N3ActionPerformed(evt);
            }
        });
        getContentPane().add(N3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 100, 100));

        N4.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        N4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N4ActionPerformed(evt);
            }
        });
        getContentPane().add(N4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 100, 100));

        N5.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        N5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N5ActionPerformed(evt);
            }
        });
        getContentPane().add(N5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 100, 100));

        G1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });
        getContentPane().add(G1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 100, 100));

        G2.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });
        getContentPane().add(G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 100, 100));

        G3.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        G3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G3ActionPerformed(evt);
            }
        });
        getContentPane().add(G3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 100, 100));

        G4.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        G4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G4ActionPerformed(evt);
            }
        });
        getContentPane().add(G4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 100, 100));

        G5.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        G5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G5ActionPerformed(evt);
            }
        });
        getContentPane().add(G5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 100, 100));

        O1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        O1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O1ActionPerformed(evt);
            }
        });
        getContentPane().add(O1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 100, 100));

        O2.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        O2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O2ActionPerformed(evt);
            }
        });
        getContentPane().add(O2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 100, 100));

        O3.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        O3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O3ActionPerformed(evt);
            }
        });
        getContentPane().add(O3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 100, 100));

        O4.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        O4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O4ActionPerformed(evt);
            }
        });
        getContentPane().add(O4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 100, 100));

        O5.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        O5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O5ActionPerformed(evt);
            }
        });
        getContentPane().add(O5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 100, 100));

        getAccessibleContext().setAccessibleName("Background");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
       B1.setEnabled(false);   // TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        B2.setEnabled(false);  // TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        B3.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        B4.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        B5.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_B5ActionPerformed

    private void I1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I1ActionPerformed
        I1.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_I1ActionPerformed

    private void I2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I2ActionPerformed
        I2.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_I2ActionPerformed

    private void I3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I3ActionPerformed
        I3.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_I3ActionPerformed

    private void I4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I4ActionPerformed
        I4.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_I4ActionPerformed

    private void I5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I5ActionPerformed
        I5.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_I5ActionPerformed

    private void N1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N1ActionPerformed
        N1.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_N1ActionPerformed

    private void N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N2ActionPerformed
        N2.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_N2ActionPerformed

    private void N3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_N3ActionPerformed

    private void N4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N4ActionPerformed
        N4.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_N4ActionPerformed

    private void N5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N5ActionPerformed
        N5.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_N5ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        G1.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_G1ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
        G2.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_G2ActionPerformed

    private void G3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G3ActionPerformed
        G3.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_G3ActionPerformed

    private void G4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G4ActionPerformed
        G4.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_G4ActionPerformed

    private void G5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G5ActionPerformed
        G5.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_G5ActionPerformed

    private void O1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O1ActionPerformed
        O1.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_O1ActionPerformed

    private void O2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O2ActionPerformed
        O2.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_O2ActionPerformed

    private void O3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O3ActionPerformed
        O3.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_O3ActionPerformed

    private void O4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O4ActionPerformed
        O4.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_O4ActionPerformed

    private void O5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O5ActionPerformed
        O5.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_O5ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(BingoCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BingoCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BingoCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BingoCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BingoCard().setVisible(true);
            }
        });
    }

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
    private javax.swing.JLabel Label;
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
    // End of variables declaration//GEN-END:variables
}
