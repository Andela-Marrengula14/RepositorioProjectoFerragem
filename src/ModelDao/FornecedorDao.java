/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.FornecedorBeans;
import ModelConexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aurelio Macie Junior
 */
public class FornecedorDao {
    ConexaoBD conex = new ConexaoBD();
    FornecedorBeans mod = new FornecedorBeans();

    public void salvar(FornecedorBeans mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into fornecedor (nomeempresa, nomeentregador, identificacao, contacto, hora) values(?,?,?,?,?)");
            pst.setString(1, mod.getNomeEmpresa());
            pst.setString(2, mod.getNomeEntregador());
            pst.setString(3, mod.getNrDeIdentificacao());
            pst.setString(4, mod.getContacto());
            pst.setString(5, mod.getHoraDeEntrega());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Fornecedor Inserido Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Inserir Fornecedor!  \n Fornecedor Já Existe Registado!");
        }
        conex.desconexao();
    }

    public void editar(FornecedorBeans mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update fornecedor set nomeempresa=?, nomeentregador=?, identificacao=?, contacto=?, hora=? where id=?");
            pst.setString(1, mod.getNomeEmpresa());
            pst.setString(2, mod.getNomeEntregador());
            pst.setString(3, mod.getNrDeIdentificacao());
            pst.setString(4, mod.getContacto());
            pst.setString(5, mod.getHoraDeEntrega());
            pst.setInt(6, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Alterar Dados! \n Fornecedor Já Existe Registado!");
        }
        conex.desconexao();
    }

    
    public void excluir(FornecedorBeans mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from fornecedor where id=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Excluidos Com Sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro Na Exclusão De Dados!\n Error:" + ex);
        }
        
        conex.desconexao();
    }
    
    public FornecedorBeans buscaFornecedor(FornecedorBeans mod) {
        conex.conexao();
        conex.executaSql("select * from fornecedor where nomeempresa like '%" + mod.getPesquisa() + "%'");

           try { 
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("id"));
            mod.setNomeEmpresa(conex.rs.getString("nomeempresa"));
            mod.setNomeEntregador(conex.rs.getString("nomeEntregador"));
            mod.setNrDeIdentificacao(conex.rs.getString("identificacao"));
            mod.setContacto(conex.rs.getString("contacto"));
            mod.setHoraDeEntrega(conex.rs.getString("hora"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Fornecedor Sem Registo \n Busque Novamente, Certifique Que Escreve Correctamente");
        }

        conex.desconexao();
        return mod;
    }        
}
