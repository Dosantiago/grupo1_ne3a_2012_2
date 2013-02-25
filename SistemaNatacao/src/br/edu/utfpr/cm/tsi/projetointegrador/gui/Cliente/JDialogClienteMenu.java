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

        Cadastro_cliente = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        rNome = new javax.swing.JTextField();
        Endereco = new javax.swing.JLabel();
        rEndereco = new javax.swing.JTextField();
        Bairro = new javax.swing.JLabel();
        rBairro = new javax.swing.JTextField();
        Cidade = new javax.swing.JLabel();
        rCidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rTelefone = new javax.swing.JTextField();
        CPF = new javax.swing.JLabel();
        rCPF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Cadastro_cliente.setFont(new java.awt.Font("Tahoma", 1, 18));
        Cadastro_cliente.setText("Cadastro Cliente:");

        Nome.setText("Nome:");

        rNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rNomeActionPerformed(evt);
            }
        });

        Endereco.setText("Endereço:");

        rEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rEnderecoActionPerformed(evt);
            }
        });

        Bairro.setText("Bairro:");

        rBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBairroActionPerformed(evt);
            }
        });

        Cidade.setText("Cidade:");

        rCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rCidadeActionPerformed(evt);
            }
        });

        jLabel1.setText("Telefone:");

        rTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rTelefoneActionPerformed(evt);
            }
        });

        CPF.setText("CPF:");

        rCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rCPFActionPerformed(evt);
            }
        });

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");

        jButton3.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton1)
                .addGap(54, 54, 54)
                .addComponent(jButton2)
                .addGap(44, 44, 44)
                .addComponent(jButton3)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cidade)
                    .addComponent(rCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 72, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Cadastro_cliente)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(Nome))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(rNome, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(CPF))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(rCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(Endereco))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(rEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(Bairro))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(rBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(rTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(57, 129, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(Cidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(Cadastro_cliente)
                    .addGap(11, 11, 11)
                    .addComponent(Nome)
                    .addGap(6, 6, 6)
                    .addComponent(rNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(CPF)
                    .addGap(6, 6, 6)
                    .addComponent(rCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(Endereco)
                    .addGap(6, 6, 6)
                    .addComponent(rEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(Bairro)
                    .addGap(6, 6, 6)
                    .addComponent(rBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(jLabel1)
                    .addGap(6, 6, 6)
                    .addComponent(rTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(128, 128, 128)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void rNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rNomeActionPerformed
// TODO add your handling code here:
    nome=rNome.getText();
}//GEN-LAST:event_rNomeActionPerformed

private void rEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rEnderecoActionPerformed
// TODO add your handling code here:
    endereco=rEndereco.getText();
}//GEN-LAST:event_rEnderecoActionPerformed

private void rBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBairroActionPerformed
     bairro=rBairro.getText();
}//GEN-LAST:event_rBairroActionPerformed

private void rCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rCidadeActionPerformed
     cidade=rCidade.getText();
}//GEN-LAST:event_rCidadeActionPerformed

private void rTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rTelefoneActionPerformed
// TODO add your handling code here:
    telefone=rTelefone.getText();
}//GEN-LAST:event_rTelefoneActionPerformed

private void rCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rCPFActionPerformed
// TODO add your handling code here:
    cpf=rCPF.getText();
}//GEN-LAST:event_rCPFActionPerformed

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
    private javax.swing.JLabel Bairro;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Cadastro_cliente;
    private javax.swing.JLabel Cidade;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel Nome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField rBairro;
    private javax.swing.JTextField rCPF;
    private javax.swing.JTextField rCidade;
    private javax.swing.JTextField rEndereco;
    private javax.swing.JTextField rNome;
    private javax.swing.JTextField rTelefone;
    // End of variables declaration//GEN-END:variables
}