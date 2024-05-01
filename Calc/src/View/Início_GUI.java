package View;

import javax.swing.JOptionPane;


public class Início_GUI extends javax.swing.JFrame {

    
    public Início_GUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calc_Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        v1_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        v2_txt = new javax.swing.JTextField();
        clr_BTN = new javax.swing.JButton();
        som_BTN = new javax.swing.JButton();
        sub_BTN = new javax.swing.JButton();
        mul_BTN = new javax.swing.JButton();
        div_BTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        mensagem_txt = new javax.swing.JLabel();
        sair_BTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        calc_Panel.setBackground(new java.awt.Color(204, 255, 153));
        calc_Panel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALCULADORA");
        calc_Panel.add(jLabel1);
        jLabel1.setBounds(230, 20, 340, 50);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Insira o primeiro valor");
        calc_Panel.add(jLabel2);
        jLabel2.setBounds(30, 90, 160, 30);

        v1_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v1_txtActionPerformed(evt);
            }
        });
        calc_Panel.add(v1_txt);
        v1_txt.setBounds(30, 120, 350, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Insira o segundo valor");
        calc_Panel.add(jLabel3);
        jLabel3.setBounds(400, 90, 160, 30);

        v2_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v2_txtActionPerformed(evt);
            }
        });
        calc_Panel.add(v2_txt);
        v2_txt.setBounds(400, 120, 350, 20);

        clr_BTN.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clr_BTN.setText("C");
        clr_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_BTNActionPerformed(evt);
            }
        });
        calc_Panel.add(clr_BTN);
        clr_BTN.setBounds(50, 190, 70, 70);

        som_BTN.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        som_BTN.setText("+");
        som_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                som_BTNActionPerformed(evt);
            }
        });
        calc_Panel.add(som_BTN);
        som_BTN.setBounds(210, 190, 70, 70);

        sub_BTN.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        sub_BTN.setText("-");
        sub_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_BTNActionPerformed(evt);
            }
        });
        calc_Panel.add(sub_BTN);
        sub_BTN.setBounds(310, 190, 70, 70);

        mul_BTN.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        mul_BTN.setText("x");
        mul_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mul_BTNActionPerformed(evt);
            }
        });
        calc_Panel.add(mul_BTN);
        mul_BTN.setBounds(410, 190, 70, 70);

        div_BTN.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        div_BTN.setText("/");
        div_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div_BTNActionPerformed(evt);
            }
        });
        calc_Panel.add(div_BTN);
        div_BTN.setBounds(510, 190, 70, 70);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RESULTADO");
        calc_Panel.add(jLabel4);
        jLabel4.setBounds(290, 300, 210, 50);

        mensagem_txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mensagem_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calc_Panel.add(mensagem_txt);
        mensagem_txt.setBounds(160, 360, 470, 60);

        sair_BTN.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sair_BTN.setText("Sair");
        sair_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_BTNActionPerformed(evt);
            }
        });
        calc_Panel.add(sair_BTN);
        sair_BTN.setBounds(330, 440, 130, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calc_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calc_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(800, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void som_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_som_BTNActionPerformed
        
        Model.Operações_DAO.soma();
        
    }//GEN-LAST:event_som_BTNActionPerformed

    private void v1_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v1_txtActionPerformed
        
        
    }//GEN-LAST:event_v1_txtActionPerformed

    private void v2_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v2_txtActionPerformed
        
    }//GEN-LAST:event_v2_txtActionPerformed

    private void sub_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_BTNActionPerformed
        
        Model.Operações_DAO.sub();
        
    }//GEN-LAST:event_sub_BTNActionPerformed

    private void mul_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mul_BTNActionPerformed
        
        Model.Operações_DAO.mult();
        
    }//GEN-LAST:event_mul_BTNActionPerformed

    private void div_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div_BTNActionPerformed
        
        Model.Operações_DAO.div();
        
    }//GEN-LAST:event_div_BTNActionPerformed

    private void sair_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_BTNActionPerformed
        Model.Funções_DAO.sair();
    }//GEN-LAST:event_sair_BTNActionPerformed

    private void clr_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_BTNActionPerformed
        Model.Operações_DAO.clr();
    }//GEN-LAST:event_clr_BTNActionPerformed

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
            java.util.logging.Logger.getLogger(Início_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Início_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Início_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Início_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Início_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel calc_Panel;
    public static javax.swing.JButton clr_BTN;
    public static javax.swing.JButton div_BTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel mensagem_txt;
    public static javax.swing.JButton mul_BTN;
    private javax.swing.JButton sair_BTN;
    public static javax.swing.JButton som_BTN;
    public static javax.swing.JButton sub_BTN;
    public static javax.swing.JTextField v1_txt;
    public static javax.swing.JTextField v2_txt;
    // End of variables declaration//GEN-END:variables
}
