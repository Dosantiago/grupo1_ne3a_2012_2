/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JDialogCadastroCliente.java
 *
 * Created on 23/02/2013, 20:18:04
 */
package br.edu.utfpr.cm.tsi.projetointegrador.gui.Cliente;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniele
 */











public class JDialogCadastroCliente extends javax.swing.JDialog {
    
    private Conexao conexao=new Conexao();
    
    public JDialogCadastroCliente() {
         initComponents ();
         setLocationRelativeTo(null);
         
    }

    
    
    
    
    
    
    
  //  /** Creates new form JDialogCadastroCliente */
  
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cadastro_cliente = new javax.swing.JLabel();
        jLabel1Telefone = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jFormattedTextTelefone = new javax.swing.JFormattedTextField();
        jLabelMatricula = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabelEndereço = new javax.swing.JLabel();
        jTextEndereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jTextBairro = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextCidade = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabelSistemaNadar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextCPF = new javax.swing.JFormattedTextField();
        jFormattedTextMatricula = new javax.swing.JFormattedTextField();

        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cadastro_cliente.setFont(new java.awt.Font("Tahoma", 1, 18));
        Cadastro_cliente.setText("Cadastro Cliente:");
        getContentPane().add(Cadastro_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel1Telefone.setText("Telefone:");
        getContentPane().add(jLabel1Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        try {
            jFormattedTextTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 80, -1));

        jLabelMatricula.setText("Matricula:");
        getContentPane().add(jLabelMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabelNome.setText("Nome:");
        getContentPane().add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 350, -1));

        jLabelEndereço.setText("Endereço:");
        getContentPane().add(jLabelEndereço, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jTextEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 340, -1));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jLabelBairro.setText("Bairro");
        getContentPane().add(jLabelBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jTextBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBairroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, -1));

        jLabelCidade.setText("Cidade:");
        getContentPane().add(jLabelCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        jTextCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 70, -1));

        jLabelEmail.setText("Email:");
        getContentPane().add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 100, -1));

        jLabelSistemaNadar.setText("Sistema Nadar ");
        getContentPane().add(jLabelSistemaNadar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        jLabel1.setText("CPF:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 50, -1));

        try {
            jFormattedTextCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextCPFActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, -1));

        try {
            jFormattedTextMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-525)/2, (screenSize.height-488)/2, 525, 488);
    }// </editor-fold>//GEN-END:initComponents

private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
       
    int pos=JOptionPane.showConfirmDialog(rootPane, "Deseja Cadastrar o cliente:  "  +jTextNome.getText()+"?");
    if(pos == 0){
        try {
            Sql.addCliente(jFormattedTextMatricula.getText(),
                           jTextNome.getText(),
                           jFormattedTextCPF.getText(),
                           jTextEndereco.getText(),
                           jTextBairro.getText(),
                           jFormattedTextTelefone.getText(),
                           jTextCidade.getText(),
                           jTextEmail.getText());               
        } catch (Exception ex){
            Logger.getLogger(JDialogCadastroCliente.class.getName()).log(Level.SEVERE,null, ex);
        }
        JOptionPane.showMessageDialog(rootPane,"Cliente: "+  jTextNome.getText()+  "\n Cadastrado com sucesso!");
        int clienteId=Integer.parseInt(jFormattedTextMatricula.getText());
        dispose();
        buscar(jFormattedTextMatricula.getText(),jTextNome.getText(),jFormattedTextCPF.getText(),
                jTextEndereco.getText(),jTextBairro.getText(),jFormattedTextTelefone.getText(),
                jTextCidade.getText(),jTextEmail.getText());
        
        new JDialogVisualizarCliente(clienteId).setVisible(true);
        }
    
    else if(pos==2){
        dispose();
    }
      //try {
    //     addCliente();
            
            
      //  } catch (Exception ex) {
            
        //    Logger.getLogger(JDialogCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
      //  }
    //JOptionPane.showMessageDialog(rootPane, "Cliente: " + jTextFieldNome.getText()+ " Cadastrado");
   // dispose();
//            new JDialogVisualizarCliente().setVisible(true);
    
  
}//GEN-LAST:event_jButtonConfirmarActionPerformed

private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
// TODO add your handling code here:  
    JOptionPane.showMessageDialog(rootPane, "Cadastro de cliente cancelado");
    dispose();
}//GEN-LAST:event_jButtonCancelarActionPerformed

private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextNomeActionPerformed

private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextEmailActionPerformed

private void jTextEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEnderecoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextEnderecoActionPerformed

private void jTextBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBairroActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextBairroActionPerformed

private void jFormattedTextTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextTelefoneActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jFormattedTextTelefoneActionPerformed

private void jTextCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCidadeActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextCidadeActionPerformed

private void jFormattedTextCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextCPFActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jFormattedTextCPFActionPerformed

private void jFormattedTextMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextMatriculaActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jFormattedTextMatriculaActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cadastro_cliente;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JFormattedTextField jFormattedTextCPF;
    private javax.swing.JFormattedTextField jFormattedTextMatricula;
    private javax.swing.JFormattedTextField jFormattedTextTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Telefone;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereço;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSistemaNadar;
    private javax.swing.JTextField jTextBairro;
    private javax.swing.JTextField jTextCidade;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextEndereco;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables

    
    public static List buscar(String matricula,String nome,String CPF,String endereço, String bairro,
      String telefone, String cidade, String email){

            List lista=null;
            lista.add(matricula);
            lista.add(CPF);
            lista.add(endereço);
            lista.add(bairro);
            lista.add(telefone);
            lista.add(cidade);
            lista.add(email);
            return lista;
    
    
    
    
    
    
// private void addCliente() throws Exception{
    
  //      Connection con = conexao.getConnection();
   
 //try {
   //         String sql = "INSERT INTO cliente(matricula,nome,cpf,endereco,bairro,telefone,cidade,email) Values (?,?, ?, ?, ?,?,?,?)";
            
     //       con.setAutoCommit(false);
       //     java.sql.PreparedStatement pst = con.prepareStatement(sql);
         //   pst.setString(1, jFormattedTextMatricula.getText());
           // pst.setString(2, jTextNome.getText());  
        //    pst.setString(3, jFormattedTextCPF.getText());
          //  pst.setString(4, jTextEndereco.getText());
         //   pst.setString(5, jTextBairro.getText());
         //   pst.setString(6, jFormattedTextTelefone.getText());
         //   pst.setString(7, jTextCidade.getText());
         //   pst.setString(8, jTextEmail.getText());
        //    pst.execute();
            
          //  con.commit();
            
    //    } catch (SQLException ex) {
      //      Logger.getLogger(JDialogCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
            
       // }
 
         //   }
 
       // private void set(){
      
        
   // }

}

 
}

    
    
    
    
    






