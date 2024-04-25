
package View;


public class AInicio_GUI extends javax.swing.JFrame {

    
    public AInicio_GUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Cliente = new javax.swing.JButton();
        Pet = new javax.swing.JButton();
        Agenda = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        dogIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Petshop Oliveira", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(null);

        Cliente.setText("Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        jPanel1.add(Cliente);
        Cliente.setBounds(30, 60, 90, 30);

        Pet.setText("Pet");
        Pet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PetActionPerformed(evt);
            }
        });
        jPanel1.add(Pet);
        Pet.setBounds(160, 60, 90, 30);

        Agenda.setText("Agenda");
        Agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendaActionPerformed(evt);
            }
        });
        jPanel1.add(Agenda);
        Agenda.setBounds(290, 60, 90, 30);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jPanel1.add(Sair);
        Sair.setBounds(160, 120, 90, 30);

        dogIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dog.png"))); // NOI18N
        jPanel1.add(dogIcon);
        dogIcon.setBounds(140, 170, 130, 120);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        dispose();
        new Cliente_GUI().setVisible(true);
    }//GEN-LAST:event_ClienteActionPerformed

    private void PetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PetActionPerformed
        dispose();
        new Pet_GUI().setVisible(true);
    }//GEN-LAST:event_PetActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        Model.Funções_DAO.sair();
    }//GEN-LAST:event_SairActionPerformed

    private void AgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendaActionPerformed
        dispose();
        new Agenda_GUI().setVisible(true);
    }//GEN-LAST:event_AgendaActionPerformed

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
            java.util.logging.Logger.getLogger(AInicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AInicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AInicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AInicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AInicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agenda;
    private javax.swing.JButton Cliente;
    private javax.swing.JButton Pet;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel dogIcon;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
