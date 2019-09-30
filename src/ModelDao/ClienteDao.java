/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.ClienteBeans;
import ModelConexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aurelio Macie Junior
 */
public class ClienteDao {
    ConexaoBD conexMaterial = new ConexaoBD();
    ConexaoBD conex = new ConexaoBD();
    ClienteBeans cliente = new ClienteBeans();
    String nomeMaterial;
    int codMaterial;
    
    public void salvar(ClienteBeans cliente) {
        buscaMaterialId(cliente.getNomeDoMaterial());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into clientes (cliente_nome, cliente_contacto, cliente_material_id, cliente_quantidade) values(?,?,?,?)");
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getContacto());
            pst.setInt(3, codMaterial);
            pst.setInt(4, cliente.getQuantidadeDesejada());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cliente Inserido Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Inserir Cliente! \n Error: "+ex);
        }
        conex.desconexao();
    }

    public void editar(ClienteBeans cliente) {
        buscaMaterialId(cliente.getNomeDoMaterial());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update clientes set cliente_nome=?, cliente_contacto=?, cliente_material_id=?, cliente_quantidade=? where cliente_id=?");
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getContacto());
            pst.setInt(3, codMaterial);
            pst.setInt(4, cliente.getQuantidadeDesejada());
            pst.setInt(5, cliente.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Alterar Dados! \n Error: "+ex);
        }
        conex.desconexao();
    }

    
    public void excluir(ClienteBeans cliente){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from clientes where cliente_id=?");
            pst.setInt(1, cliente.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Excluidos Com Sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro Na Exclusão De Dados!\n Error:" + ex);
        }
        
        conex.desconexao();
    }
    
    public void buscaMaterialId(String nome){
        conex.conexao();
        conex.executaSql("select * from material where material_nome='"+nome+"'");
        try {
            conex.rs.first();
            codMaterial=conex.rs.getInt("material_id");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Ao Buscar Material"+ex);
        }
    }
    
    public ClienteBeans buscaCliente(ClienteBeans cliente) {
        conex.conexao();
        

           try {
            conex.executaSql("select * from clientes where cliente_nome like '%" + cliente.getPesquisa() + "%'");
            conex.rs.first();
               buscaNomeMaterial(conex.rs.getInt("cliente_material_id"));
            cliente.setCodigo(conex.rs.getInt("cliente_id"));
            cliente.setNome(conex.rs.getString("cliente_nome"));
            cliente.setContacto(conex.rs.getString("cliente_contacto"));
            cliente.setNomeDoMaterial(nomeMaterial);
            cliente.setQuantidadeDesejada((Integer) conex.rs.getInt("cliente_quantidade"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente Sem Registo \n Error: "+ex);
        }

        conex.desconexao();
        return cliente;
    }
    
    public void buscaNomeMaterial(int cod){
        conexMaterial.conexao();
        
        try {
            conexMaterial.executaSql("select * from material where material_id = "+cod);
            conexMaterial.rs.first();
            nomeMaterial = conexMaterial.rs.getString("material_nome");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Na Busta Do Nome Do Bairro \n "+ex);
        }
        conexMaterial.desconexao();
    }
}
