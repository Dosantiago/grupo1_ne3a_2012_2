/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JDialogClienteMenu.java
 *
 * Created on 24/02/2013, 20:43:09
 */
package br.edu.utfpr.cm.tsi.projetointegrador.gui.Cliente;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniele
 */
public class JDialogClienteMenu extends javax.swing.JDialog {
    
    private static String nome;  
    private static String endereco;
    private static String bairro;
    private static String cidade;
    private static String telefone;      
    private static String cpf;
    
    private Conexao conexao = new Conexao();

    /** Creates new form JDialogClienteMenu */
    public JDialogClienteMenu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jLabelControleCliente = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rNomeActionPerformed(evt);
            }
        });
        getContentPane().add(rNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 243, -1));

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 386, -1, -1));

        jButton2.setText("Excluir");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 386, -1, -1));

        jButton3.setText("Cancelar");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 386, -1, -1));

        jLabelNome.setText("Nome:");
        getContentPane().add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabelControleCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelControleCliente.setText("Controle Cliente");
        getContentPane().add(jLabelControleCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabelCPF.setText("CPF:");
        getContentPane().add(jLabelCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextFieldCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, -1));

        jLabelEndereco.setText("Endereço:");
        getContentPane().add(jLabelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        getContentPane().add(jTextFieldEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 290, -1));

        jLabelBairro.setText("Bairro:");
        getContentPane().add(jLabelBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));
        getContentPane().add(jTextFieldBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 90, -1));

        jLabelTelefone.setText("Telefone:");
        getContentPane().add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 100, -1));

        jLabelCidade.setText("Cidade");
        getContentPane().add(jLabelCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-470)/2, (screenSize.height-502)/2, 470, 502);
    }// </editor-fold>//GEN-END:initComponents

private void rNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rNomeActionPerformed
// TODO add your handling code here:
    nome=rNome.getText();
}//GEN-LAST:event_rNomeActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                JDialogClienteMenu dialog = new JDialogClienteMenu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelControleCliente;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField rNome;
    // End of variables declaration//GEN-END:variables
}
