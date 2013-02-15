/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Principal.java
 *
 * Created on 08/02/2013, 19:25:10
 */
package br.edu.utfpr.cm.tsi.projetointegrador.gui;



/**
 *
 * @author Douglas Santiago
 */
public class Principal extends javax.swing.JFrame {

    /** Creates new form Principal */
    public Principal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        CadastroBut = new javax.swing.JMenu();
        ClienteCadBot = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ProdutoCadBut = new javax.swing.JRadioButtonMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        FuncionarioCadBut = new javax.swing.JRadioButtonMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        HorarioCadBut = new javax.swing.JRadioButtonMenuItem();
        ConsultaBut = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        ProdutoConsBut = new javax.swing.JRadioButtonMenuItem();
        FuncionarioConsBut = new javax.swing.JRadioButtonMenuItem();
        HorarioBut = new javax.swing.JMenu();
        NataçãoHorBut = new javax.swing.JRadioButtonMenuItem();
        HidroHorBut1 = new javax.swing.JRadioButtonMenuItem();
        EditarBut = new javax.swing.JMenu();
        ClienteEdiBut = new javax.swing.JRadioButtonMenuItem();
        ProdutoEdiBut = new javax.swing.JRadioButtonMenuItem();
        FuncionarioEdiBut1 = new javax.swing.JRadioButtonMenuItem();
        HorarioEdiBut2 = new javax.swing.JRadioButtonMenuItem();
        RelatorioBut = new javax.swing.JMenu();
        Ajudabut = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Natação");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DINAMICAr.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/usercadastro.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/produto.png"))); // NOI18N

        jMenuBar1.setForeground(new java.awt.Color(51, 0, 255));
        jMenuBar1.setAlignmentX(1.2F);

        CadastroBut.setText("Cadastro");
        CadastroBut.setToolTipText("");

        ClienteCadBot.setSelected(true);
        ClienteCadBot.setText("Cliente");
        ClienteCadBot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        ClienteCadBot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClienteCadBotMouseClicked(evt);
            }
        });
        ClienteCadBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteCadBotActionPerformed(evt);
            }
        });
        CadastroBut.add(ClienteCadBot);
        CadastroBut.add(jSeparator1);

        ProdutoCadBut.setSelected(true);
        ProdutoCadBut.setText("Produto");
        ProdutoCadBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/produto.png"))); // NOI18N
        CadastroBut.add(ProdutoCadBut);
        CadastroBut.add(jSeparator5);

        FuncionarioCadBut.setSelected(true);
        FuncionarioCadBut.setText("Funcionario");
        FuncionarioCadBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/funcionario.png"))); // NOI18N
        CadastroBut.add(FuncionarioCadBut);
        CadastroBut.add(jSeparator4);

        HorarioCadBut.setSelected(true);
        HorarioCadBut.setText("Horario");
        HorarioCadBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gnome_fish.jpg"))); // NOI18N
        CadastroBut.add(HorarioCadBut);

        jMenuBar1.add(CadastroBut);

        ConsultaBut.setText("Consulta");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Cliente");
        jRadioButtonMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        ConsultaBut.add(jRadioButtonMenuItem1);

        ProdutoConsBut.setSelected(true);
        ProdutoConsBut.setText("Produto");
        ProdutoConsBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/produto.png"))); // NOI18N
        ConsultaBut.add(ProdutoConsBut);

        FuncionarioConsBut.setSelected(true);
        FuncionarioConsBut.setText("Funcionario");
        FuncionarioConsBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/funcionario.png"))); // NOI18N
        ConsultaBut.add(FuncionarioConsBut);

        jMenuBar1.add(ConsultaBut);

        HorarioBut.setText("Horarios");

        NataçãoHorBut.setSelected(true);
        NataçãoHorBut.setText("Natação");
        NataçãoHorBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/natação.png"))); // NOI18N
        HorarioBut.add(NataçãoHorBut);

        HidroHorBut1.setSelected(true);
        HidroHorBut1.setText("Hidroginastica");
        HidroHorBut1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hidro.png"))); // NOI18N
        HorarioBut.add(HidroHorBut1);

        jMenuBar1.add(HorarioBut);

        EditarBut.setText("Editar");

        ClienteEdiBut.setSelected(true);
        ClienteEdiBut.setText("Cliente");
        ClienteEdiBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        EditarBut.add(ClienteEdiBut);

        ProdutoEdiBut.setSelected(true);
        ProdutoEdiBut.setText("Produto");
        ProdutoEdiBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/produto.png"))); // NOI18N
        EditarBut.add(ProdutoEdiBut);

        FuncionarioEdiBut1.setSelected(true);
        FuncionarioEdiBut1.setText("Funcionario");
        FuncionarioEdiBut1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/funcionario.png"))); // NOI18N
        EditarBut.add(FuncionarioEdiBut1);

        HorarioEdiBut2.setSelected(true);
        HorarioEdiBut2.setText("Horario");
        HorarioEdiBut2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gnome_fish.jpg"))); // NOI18N
        EditarBut.add(HorarioEdiBut2);

        jMenuBar1.add(EditarBut);

        RelatorioBut.setText("Relatorios");
        jMenuBar1.add(RelatorioBut);

        Ajudabut.setText("Ajuda");
        jMenuBar1.add(Ajudabut);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void ClienteCadBotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClienteCadBotMouseClicked
}//GEN-LAST:event_ClienteCadBotMouseClicked

private void ClienteCadBotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteCadBotActionPerformed
    new JDialogClienteMenu().setVisible(true);
}//GEN-LAST:event_ClienteCadBotActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ajudabut;
    private javax.swing.JMenu CadastroBut;
    private javax.swing.JRadioButtonMenuItem ClienteCadBot;
    private javax.swing.JRadioButtonMenuItem ClienteEdiBut;
    private javax.swing.JMenu ConsultaBut;
    private javax.swing.JMenu EditarBut;
    private javax.swing.JRadioButtonMenuItem FuncionarioCadBut;
    private javax.swing.JRadioButtonMenuItem FuncionarioConsBut;
    private javax.swing.JRadioButtonMenuItem FuncionarioEdiBut1;
    private javax.swing.JRadioButtonMenuItem HidroHorBut1;
    private javax.swing.JMenu HorarioBut;
    private javax.swing.JRadioButtonMenuItem HorarioCadBut;
    private javax.swing.JRadioButtonMenuItem HorarioEdiBut2;
    private javax.swing.JRadioButtonMenuItem NataçãoHorBut;
    private javax.swing.JRadioButtonMenuItem ProdutoCadBut;
    private javax.swing.JRadioButtonMenuItem ProdutoConsBut;
    private javax.swing.JRadioButtonMenuItem ProdutoEdiBut;
    private javax.swing.JMenu RelatorioBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
