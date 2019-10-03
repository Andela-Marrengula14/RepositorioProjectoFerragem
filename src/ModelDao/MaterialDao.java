/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.MaterialBeans;
import ModelConexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aurelio Macie Junior
 */
public class MaterialDao {
    ConexaoBD conex = new ConexaoBD();
    MaterialBeans mod = new MaterialBeans();

    public void salvar(MaterialBeans mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into material (material_nome, material_quantidade, material_valor) values(?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getQuantidade());
            pst.setFloat(3, mod.getValor());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Material Inserido Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Inserir Material! \n Error: "+ex);
        }
        conex.desconexao();
    }

    public void editar(MaterialBeans mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update material set material_nome=?, material_quantidade=?, material_valor=? where material_id=?");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getQuantidade());
            pst.setFloat(3, mod.getValor());
            pst.setInt(4, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Alterar DadosJunior! \n Error: "+ex);
        }
        conex.desconexao();
    }

    
    public void excluir(MaterialBeans mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from material where material_id=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Excluidos Com Sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro Na Exclusão De Dados! \n Error:" + ex);
        }
        
        conex.desconexao();
    }

    public void aumentar(int aumento, int codigo){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update material set material_quantidade=? where material_id=?");
            pst.setInt(1, aumento);
            pst.setInt(2, codigo);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Alterar Dados! \n Error: "+ex);
        }
        conex.desconexao();
    }
    
    public MaterialBeans buscaMaterial(MaterialBeans mod) {
        conex.conexao();
        conex.executaSql("select * from material where material_nome like '%" + mod.getPesquisa() + "%'");

           try { 
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("material_id"));
            mod.setNome(conex.rs.getString("material_nome"));
            mod.setQuantidade(conex.rs.getInt("material_quantidade"));
            mod.setValor(conex.rs.getFloat("material_valor"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Material Sem Registo! \n Busque Novamente, Certifique Que Escreve Correctamente");
        }

        conex.desconexao();
        return mod;
    }
//qwqwqwqwqqwq        
}
