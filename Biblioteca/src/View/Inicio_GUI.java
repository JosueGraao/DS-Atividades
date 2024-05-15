
package View;

import java.util.Random;


public class Inicio_GUI extends javax.swing.JFrame {

    String total = "",total2 = "",senha = "";
            
    public Inicio_GUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinFieldBeanInfo1 = new com.toedter.components.JSpinFieldBeanInfo();
        fundo = new org.edisoncor.gui.panel.PanelImage();
        jScrollPane1 = new javax.swing.JScrollPane();
        reg_txt = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        pref_txt = new javax.swing.JTextPane();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        gerarR_btn = new org.edisoncor.gui.button.ButtonAction();
        rein_btn = new org.edisoncor.gui.button.ButtonAction();
        textFieldRound1 = new org.edisoncor.gui.textField.TextFieldRound();
        textFieldRound2 = new org.edisoncor.gui.textField.TextFieldRound();
        gerarP_btn = new org.edisoncor.gui.button.ButtonAction();
        clockFace1 = new org.edisoncor.gui.varios.ClockFace();
        textFieldRound3 = new org.edisoncor.gui.textField.TextFieldRound();
        senha_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fundo_img.jpg"))); // NOI18N
        fundo.setLayout(null);

        reg_txt.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jScrollPane1.setViewportView(reg_txt);

        fundo.add(jScrollPane1);
        jScrollPane1.setBounds(250, 230, 180, 260);

        pref_txt.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jScrollPane2.setViewportView(pref_txt);

        fundo.add(jScrollPane2);
        jScrollPane2.setBounds(490, 230, 180, 260);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/barba_img.png"))); // NOI18N
        panelImage1.setLayout(null);
        fundo.add(panelImage1);
        panelImage1.setBounds(20, 20, 420, 140);

        gerarR_btn.setText("Gerar R");
        gerarR_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarR_btnActionPerformed(evt);
            }
        });
        fundo.add(gerarR_btn);
        gerarR_btn.setBounds(70, 190, 116, 35);

        rein_btn.setText("Reiniciar");
        rein_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rein_btnActionPerformed(evt);
            }
        });
        fundo.add(rein_btn);
        rein_btn.setBounds(70, 310, 116, 35);

        textFieldRound1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldRound1.setText("Regular");
        fundo.add(textFieldRound1);
        textFieldRound1.setBounds(300, 200, 80, 21);

        textFieldRound2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldRound2.setText("Preferencial");
        fundo.add(textFieldRound2);
        textFieldRound2.setBounds(520, 200, 120, 21);

        gerarP_btn.setText("Gerar P");
        gerarP_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarP_btnActionPerformed(evt);
            }
        });
        fundo.add(gerarP_btn);
        gerarP_btn.setBounds(70, 250, 116, 35);
        fundo.add(clockFace1);
        clockFace1.setBounds(70, 360, 120, 120);

        textFieldRound3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldRound3.setText("Senha");
        fundo.add(textFieldRound3);
        textFieldRound3.setBounds(530, 20, 100, 21);

        senha_txt.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        senha_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senha_txt.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        fundo.add(senha_txt);
        senha_txt.setBounds(490, 60, 180, 110);

        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 700, 500);

        setSize(new java.awt.Dimension(700, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gerarR_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarR_btnActionPerformed
        Random ale = new Random();       
      int  valor = ale.nextInt(200);
      
      
        senha_txt.setText("");
        total = total + "R" + valor+"\n";
        String senha = "R" + valor;
        reg_txt.setText(String.valueOf(total));
        senha_txt.setText(String.valueOf(senha));
       
    }//GEN-LAST:event_gerarR_btnActionPerformed

    private void gerarP_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarP_btnActionPerformed
        Random ale2 = new Random();       
      int  valor = ale2.nextInt(200);

       senha_txt.setText("");
       total2 = total2 + "P" + valor+"\n";
       String senha = "P" + valor+"\n";
       pref_txt.setText(String.valueOf(total2));
       senha_txt.setText(String.valueOf(senha));
    }//GEN-LAST:event_gerarP_btnActionPerformed

    private void rein_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rein_btnActionPerformed
        total = "";
        total2 = "";
        reg_txt.setText("");
        pref_txt.setText("");
        senha_txt.setText("");
    }//GEN-LAST:event_rein_btnActionPerformed

     
    
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
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_GUI().setVisible(true);
            }
        });
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.varios.ClockFace clockFace1;
    private org.edisoncor.gui.panel.PanelImage fundo;
    public org.edisoncor.gui.button.ButtonAction gerarP_btn;
    public org.edisoncor.gui.button.ButtonAction gerarR_btn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.components.JSpinFieldBeanInfo jSpinFieldBeanInfo1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JTextPane pref_txt;
    private javax.swing.JTextPane reg_txt;
    public org.edisoncor.gui.button.ButtonAction rein_btn;
    public javax.swing.JLabel senha_txt;
    private org.edisoncor.gui.textField.TextFieldRound textFieldRound1;
    private org.edisoncor.gui.textField.TextFieldRound textFieldRound2;
    private org.edisoncor.gui.textField.TextFieldRound textFieldRound3;
    // End of variables declaration//GEN-END:variables
}
