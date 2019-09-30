/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ModelBeans.ClienteBeans;
import ModelBeans.ModeloTabela;
import ModelConexao.ConexaoBD;
import ModelDao.ClienteDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Aurelio Macie Junior
 */
public class CadastroDeClientes extends javax.swing.JFrame {

    ClienteBeans mod = new ClienteBeans();
    ModelDao.ClienteDao control = new ClienteDao();
    ClienteDao dao = new ClienteDao();
    ConexaoBD conex = new ConexaoBD();
    int flag=0 ;
        
        
    public CadastroDeClientes() {
        
        initComponents();
        preencherMaterial();
        preencherTabela("select * from clientes order by cliente_id");
        
    }

    public void preencherMaterial(){
        conex.conexao();
        conex.executaSql("select * from material order by material_nome");
        try {
            conex.rs.first();
            jComboBoxMaterialDesejado.removeAllItems();
            do{
            jComboBoxMaterialDesejado.addItem(conex.rs.getString("material_nome"));
        }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro Ao Preencher Material" +ex);
        }
        conex.desconexao();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jTextFieldContacto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxMaterialDesejado = new javax.swing.JComboBox<>();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 270, 700, 140);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("X");
        jButton1.setToolTipText("Fechar Cadastro De Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(771, 0, 39, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Formulário De Cadastro De Cliente");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 330, 60);

        jTextFieldId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldId.setEnabled(false);
        getContentPane().add(jTextFieldId);
        jTextFieldId.setBounds(90, 70, 40, 30);

        jButtonNovo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.setToolTipText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNovo);
        jButtonNovo.setBounds(60, 230, 90, 25);

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(170, 230, 90, 25);

        jButtonEditar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setToolTipText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar);
        jButtonEditar.setBounds(280, 230, 90, 25);

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagemProjecto/search_24px.png"))); // NOI18N
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(470, 0, 30, 30);

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setToolTipText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir);
        jButtonExcluir.setBounds(390, 230, 90, 25);

        jTextFieldContacto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldContacto.setEnabled(false);
        getContentPane().add(jTextFieldContacto);
        jTextFieldContacto.setBounds(130, 170, 260, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 114, 50, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantidade");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(460, 170, 90, 30);

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldNome.setEnabled(false);
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(130, 120, 260, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Material Desejado");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(420, 120, 130, 30);

        jComboBoxMaterialDesejado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxMaterialDesejado.setEnabled(false);
        getContentPane().add(jComboBoxMaterialDesejado);
        jComboBoxMaterialDesejado.setBounds(550, 120, 210, 30);

        jTextFieldQuantidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldQuantidade.setEnabled(false);
        getContentPane().add(jTextFieldQuantidade);
        jTextFieldQuantidade.setBounds(550, 170, 70, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contacto");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 174, 70, 20);

        jTextFieldPesquisar.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPesquisar);
        jTextFieldPesquisar.setBounds(500, 0, 260, 30);

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setToolTipText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(500, 230, 90, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 70, 40, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagemProjecto/FundoParaTodasTelasRegistro.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 820, 420);

        setSize(new java.awt.Dimension(824, 446));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag=1;
        
        jTextFieldQuantidade.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldContacto.setEnabled(true);
        jComboBoxMaterialDesejado.setEnabled(true);
        
        jButtonExcluir.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        
        jTextFieldId.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldContacto.setText("");
        jTextFieldNome.setText("");
        jTextFieldQuantidade.setText("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        
        jTextFieldId.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldContacto.setText("");
        jTextFieldNome.setText("");
        jTextFieldQuantidade.setText("");
        
        jButtonCancelar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        
        jTextFieldContacto.setEnabled(false);
        jComboBoxMaterialDesejado.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldQuantidade.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
            
        jTextFieldPesquisar.setText("");
        if (jTextFieldNome.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Preencha O Campo 'Nome' Para Continuar!");
           jTextFieldNome.requestFocus();
       }else if(jTextFieldContacto.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Preencha O Campo 'Contacto' Para Continuar!");
           jTextFieldContacto.requestFocus();  
           }else if(jTextFieldQuantidade.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Preencha O Campo 'Quantidade' Para Continuar!");
           jTextFieldQuantidade.requestFocus(); 
           
           } else
           
        if (flag==1){  
            
            
        mod.setNome(jTextFieldNome.getText());
        mod.setContacto(jTextFieldContacto.getText());
        mod.setNomeDoMaterial((String)jComboBoxMaterialDesejado.getSelectedItem());
        mod.setQuantidadeDesejada(Integer.parseInt(jTextFieldQuantidade.getText()));
        control.salvar(mod);
        
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);

        jTextFieldContacto.setText("");
        jTextFieldNome.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldId.setText("");
        
        
        jTextFieldContacto.setEnabled(false);
        jComboBoxMaterialDesejado.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldQuantidade.setEnabled(false);
                
        preencherTabela("select * from clientes order by cliente_id");
        
        }else{
            
        jTextFieldContacto.setEnabled(false);
        jComboBoxMaterialDesejado.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldQuantidade.setEnabled(false);            
            
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        
        mod.setCodigo(Integer.parseInt(jTextFieldId.getText()));   
        mod.setNome(jTextFieldNome.getText());
        mod.setContacto(jTextFieldContacto.getText());
        mod.setNomeDoMaterial((String)jComboBoxMaterialDesejado.getSelectedItem());
        mod.setQuantidadeDesejada(Integer.parseInt(jTextFieldQuantidade.getText()));
        control.editar(mod);
        
        jTextFieldContacto.setText("");
        jTextFieldNome.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldId.setText("");
        preencherTabela("select * from clientes order by cliente_id");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        
        flag=2;
        
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);

        jTextFieldNome.setEnabled(true);
        jTextFieldContacto.setEnabled(true);
        jComboBoxMaterialDesejado.setEnabled(true);
        jTextFieldQuantidade.setEnabled(true);
        //jTextFieldId.setText("");
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        
        mod.setPesquisa(jTextFieldPesquisar.getText());
        ClienteBeans model = control.buscaCliente(mod);
        
        
        jTextFieldId.setText("");
        jTextFieldId.setText(String.valueOf(model.getCodigo()));
        jTextFieldNome.setText(model.getNome());
        jTextFieldContacto.setText(model.getContacto());
        jComboBoxMaterialDesejado.setSelectedItem(model.getNomeDoMaterial());
        jTextFieldQuantidade.setText(String.valueOf(model.getQuantidadeDesejada()));
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        
        jComboBoxMaterialDesejado.setEnabled(false);
        jTextFieldContacto.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldQuantidade.setEnabled(false);
        preencherTabela("select * from clientes where cliente_nome like '%" + mod.getPesquisa() + "%'");
        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
    int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Reamente Excluir?");
            if(resposta == JOptionPane.YES_OPTION){
                mod.setCodigo(Integer.parseInt(jTextFieldId.getText()));
                control.excluir(mod);
                
                jTextFieldPesquisar.setText("");
                jTextFieldId.setText("");
                jTextFieldContacto.setText("");
                jTextFieldNome.setText("");
                
                jButtonEditar.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                preencherTabela("select * from clientes order by cliente_id");
            }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
       
        String nome = ""+jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select * from clientes where cliente_nome='"+nome+"'");
            try {
                conex.rs.first();
                jTextFieldId.setText(String.valueOf(conex.rs.getInt("cliente_id")));
                jTextFieldNome.setText(String.valueOf(conex.rs.getString("cliente_nome")));
                jTextFieldContacto.setText(String.valueOf(conex.rs.getString("cliente_contacto")));
                jComboBoxMaterialDesejado.setSelectedItem(String.valueOf(conex.rs.getString("cliente_material_id")));
                jTextFieldQuantidade.setText(String.valueOf(conex.rs.getString("cliente_quantidade")));
        
        jButtonExcluir.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        
        jTextFieldNome.setEnabled(false);
        jTextFieldContacto.setEnabled(false);
        jComboBoxMaterialDesejado.setEnabled(false);
        jTextFieldQuantidade.setEnabled(false);
        
        preencherTabela("select * from clientes order by cliente_id");
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(rootPane, "ERRO AO SELECIONAR" +ex);
            }
        conex.desconexao();                                           

    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void preencherTabela(String sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"ID","Nome","Contacto","Material","Quantidade"};
        conex.conexao();
        
        conex.executaSql(sql);
            try {
                conex.rs.first();
                do{
                  dados.add(new Object[]{conex.rs.getInt("cliente_id"),conex.rs.getString("cliente_nome"),conex.rs.getString("cliente_contacto"),conex.rs.getString("cliente_material_id"),conex.rs.getInt("cliente_quantidade")});  
                }while(conex.rs.next());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERRO AO PREENCHER ARRAYLIST\n"+ex);
            }
            
            ModeloTabela modelo = new ModeloTabela(dados, colunas);
            
            jTableClientes.setModel(modelo);
            jTableClientes.getColumnModel().getColumn(0).setPreferredWidth(39);
            jTableClientes.getColumnModel().getColumn(0).setResizable(false);
            jTableClientes.getColumnModel().getColumn(1).setPreferredWidth(165);
            jTableClientes.getColumnModel().getColumn(1).setResizable(false);
            jTableClientes.getColumnModel().getColumn(2).setPreferredWidth(165);
            jTableClientes.getColumnModel().getColumn(2).setResizable(false);
            jTableClientes.getColumnModel().getColumn(3).setPreferredWidth(165);
            jTableClientes.getColumnModel().getColumn(3).setResizable(false);
            jTableClientes.getColumnModel().getColumn(4).setPreferredWidth(160);
            jTableClientes.getColumnModel().getColumn(4).setResizable(false);
            jTableClientes.getTableHeader().setReorderingAllowed(false);
            jTableClientes.setAutoResizeMode(jTableClientes.AUTO_RESIZE_OFF);
            jTableClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            conex.desconexao();
        
    }
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
            java.util.logging.Logger.getLogger(CadastroDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxMaterialDesejado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldContacto;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldQuantidade;
    // End of variables declaration//GEN-END:variables
}
