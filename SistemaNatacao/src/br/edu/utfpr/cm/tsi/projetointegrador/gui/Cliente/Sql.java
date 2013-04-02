/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.gui.Cliente;

import br.edu.utfpr.cm.tsi.projetointegrador.coneccao.ConnectionManager;
import br.edu.utfpr.cm.tsi.projetointegrador.gui.Horario.JDialogCadastrodeHorario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniele
 */
public class Sql {

    static Connection con = new ConnectionManager().Conexao();

    public static boolean addCliente(Cliente cliente){
    String sql = "INSERT INTO cliente(matricula,nome,cpf,endereco,bairro,telefone,cidade,email) Values (?, ?, ?, ?, ?, ?, ?, ?)";
     try{
         
            con.setAutoCommit(false);
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cliente.getMatricula());
            pst.setString(2, cliente.getNome());
            pst.setString(3, cliente.getCPF());
            pst.setString(4, cliente.getEndereco());
            pst.setString(5, cliente.getBairro());
            pst.setString(6, cliente.getTelefone());
            pst.setString(7, cliente.getCidade());
            pst.setString(8, cliente.getEmail());
            pst.execute();

            con.commit();

        } catch (Exception ex) {
            Logger.getLogger(JDialogCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public static boolean excluirCliente(String matricula) throws Exception {
        try {

            String sql = "DELETE FROM cliente where matricula = ?";



            con.setAutoCommit(false);
            java.sql.PreparedStatement pst = con.prepareStatement(sql);


            pst.setString(1, matricula);
            pst.execute();
            con.commit();

        } catch (SQLException ex) {
            Logger.getLogger(JDialogCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public static boolean buscarCliente(String matricula) {


        Connection con = new ConnectionManager().Conexao();

        try {

            String sql = "SELECT * FROM cliente where matricula = ? ";
            con.setAutoCommit(false);
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, matricula);
            pst.execute();
            con.commit();

        } catch (SQLException ex) {
            Logger.getLogger(JDialogCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;


    }

    public static boolean addHorario(String matricula, String nome, String horario) throws Exception {

        try {
            String sql = "INSERT INTO horario ( matricula, nome,horario)Values (?, ?,?)";

            con.setAutoCommit(false);
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, matricula);
            pst.setString(2, nome);
            pst.setString(3, horario);

            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(JDialogCadastrodeHorario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public static void main(String[] args) {
//        buscarCliente(" ");
    }
}