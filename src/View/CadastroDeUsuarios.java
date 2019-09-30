/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ModelBeans.ModeloTabela;
import ModelBeans.UsuarioBeans;
import ModelConexao.ConexaoBD;
import ModelDao.UsuarioDao;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Aurelio Macie Junior
 */
public class CadastroDeUsuarios extends javax.swing.JFrame {

    UsuarioBeans mod = new UsuarioBeans();
    ModelDao.UsuarioDao control = new UsuarioDao();
    UsuarioDao dao = new UsuarioDao();
    ConexaoBD conex = new ConexaoBD();
    int flag=0 ;
    
    public CadastroDeUsuarios() {
        initComponents();
        preencherTabela("select * from usuario order by id");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jTextFieldId = new javax.swing.JTextField();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomeUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxTipoUsuario = new javax.swing.JComboBox<>();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jLabelConfirmarSenha = new javax.swing.JLabel();
        jPasswordFieldConfirmarSenha = new javax.swing.JPasswordField();
        jButtonPesquisar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelFundoCadastroUsuarios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 280, 700, 140);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("X");
        jButton1.setToolTipText("Fechar Cadastro de Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(760, 0, 40, 30);

        jButtonNovo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.setToolTipText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNovo);
        jButtonNovo.setBounds(60, 240, 90, 25);

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
        jButtonSalvar.setBounds(170, 240, 90, 25);

        jTextFieldId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldId.setEnabled(false);
        getContentPane().add(jTextFieldId);
        jTextFieldId.setBounds(90, 50, 40, 30);

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
        jButtonEditar.setBounds(280, 240, 90, 25);

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
        jButtonExcluir.setBounds(390, 240, 90, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 150, 50, 30);

        jTextFieldNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldNomeUsuario.setEnabled(false);
        getContentPane().add(jTextFieldNomeUsuario);
        jTextFieldNomeUsuario.setBounds(120, 100, 240, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Formulário De Cadastro De Usuário");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 330, 40);

        jPasswordFieldSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordFieldSenha.setEnabled(false);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(510, 100, 240, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 100, 50, 30);

        jComboBoxTipoUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Gestor De Venda" }));
        jComboBoxTipoUsuario.setToolTipText("");
        jComboBoxTipoUsuario.setEnabled(false);
        jComboBoxTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxTipoUsuario);
        jComboBoxTipoUsuario.setBounds(120, 150, 240, 30);

        jTextFieldPesquisar.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldPesquisar);
        jTextFieldPesquisar.setBounds(450, 0, 300, 30);

        jLabelConfirmarSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelConfirmarSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConfirmarSenha.setText("Confirmar Senha");
        getContentPane().add(jLabelConfirmarSenha);
        jLabelConfirmarSenha.setBounds(390, 150, 130, 30);

        jPasswordFieldConfirmarSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordFieldConfirmarSenha.setEnabled(false);
        getContentPane().add(jPasswordFieldConfirmarSenha);
        jPasswordFieldConfirmarSenha.setBounds(510, 150, 240, 30);

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagemProjecto/search_24px.png"))); // NOI18N
        jButtonPesquisar.setToolTipText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(420, 0, 30, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Senha");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 100, 50, 30);

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
        jButtonCancelar.setBounds(500, 240, 90, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 50, 30, 30);

        jLabelFundoCadastroUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagemProjecto/FundoParaTodasTelasRegistro.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoCadastroUsuarios);
        jLabelFundoCadastroUsuarios.setBounds(0, 0, 800, 410);

        setSize(new java.awt.Dimension(814, 437));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed

        mod.setPesquisa(jTextFieldPesquisar.getText());
        UsuarioBeans model = control.buscaUsuario(mod);

        jPasswordFieldConfirmarSenha.setText(model.getSenha());
        jTextFieldId.setText(String.valueOf(model.getCodigo()));
        jTextFieldNomeUsuario.setText(model.getNome());
        jPasswordFieldSenha.setText(model.getSenha());
        jComboBoxTipoUsuario.setSelectedItem(model.getTipo());
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        
        jPasswordFieldConfirmarSenha.setText("");
        jTextFieldId.setText("");
        jTextFieldNomeUsuario.setText("");
        jPasswordFieldSenha.setText("");
        
        
        jTextFieldNomeUsuario.setEnabled(false);
        jPasswordFieldConfirmarSenha.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jComboBoxTipoUsuario.setEnabled(false);
        
        preencherTabela("select * from usuario where nome like '%" + mod.getPesquisa() + "%'");        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        
        jTextFieldNomeUsuario.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfirmarSenha.setEnabled(true);
        jComboBoxTipoUsuario.setEnabled(true);

        jButtonExcluir.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);

        jTextFieldNomeUsuario.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfirmarSenha.setText("");
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        
        jTextFieldId.setText("");
        jTextFieldNomeUsuario.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfirmarSenha.setText("");
        
        jTextFieldNomeUsuario.setEnabled(!true);
        jPasswordFieldSenha.setEnabled(!true);
        jPasswordFieldConfirmarSenha.setEnabled(!true);
        jComboBoxTipoUsuario.setEnabled(!true);
        
        jButtonCancelar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
            /*if (jPasswordFieldConfirmarSenha != jPasswordFieldConfirmarSenha) {
                
            } else {
                   */   
        jTextFieldPesquisar.setText("");
        if (jTextFieldNomeUsuario.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Preencha O Campo 'Nome' Para Continuar!");
           jTextFieldNomeUsuario.requestFocus();
       }else if(jPasswordFieldConfirmarSenha.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Preencha O Campo 'Senha' Para Continuar!");
           jPasswordFieldSenha.requestFocus();
       }else if(jPasswordFieldConfirmarSenha.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Preencha O Campo 'CONFIRMAR SENHA' Para Continuar!");
           jPasswordFieldConfirmarSenha.requestFocus();
       }else if(jPasswordFieldConfirmarSenha != jPasswordFieldConfirmarSenha){
           JOptionPane.showMessageDialog(null, "Senhas Não Compatíveis");
       } else
           
        if (flag==1){ 
            
            
        mod.setNome(jTextFieldNomeUsuario.getText());
        mod.setSenha(jPasswordFieldSenha.getText());
        mod.setTipo((String)jComboBoxTipoUsuario.getSelectedItem());
        control.salvar(mod);
        
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);

        jTextFieldNomeUsuario.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfirmarSenha.setText("");
        
        jTextFieldNomeUsuario.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jPasswordFieldConfirmarSenha.setEnabled(false);
        jComboBoxTipoUsuario.setEnabled(false);
        preencherTabela("select * from usuario order by id");
        
        }else{

        jTextFieldNomeUsuario.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jPasswordFieldConfirmarSenha.setEnabled(false);
        jComboBoxTipoUsuario.setEnabled(false);
        
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);            
        
        mod.setCodigo(Integer.parseInt(jTextFieldId.getText()));
        mod.setNome(jTextFieldNomeUsuario.getText());
        mod.setSenha(jPasswordFieldSenha.getText());
        mod.setTipo((String)jComboBoxTipoUsuario.getSelectedItem());
        control.editar(mod);
        
        jTextFieldNomeUsuario.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfirmarSenha.setText("");
        preencherTabela("select * from usuario order by id");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag=2;
        
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        
        jTextFieldNomeUsuario.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfirmarSenha.setEnabled(true);
        jComboBoxTipoUsuario.setEnabled(true);
        preencherTabela("select * from usuario order by id");
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
    int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Excluir?");
            if(resposta == JOptionPane.YES_OPTION){
                mod.setCodigo(Integer.parseInt(jTextFieldId.getText()));
                control.excluir(mod);
                
                jTextFieldPesquisar.setText("");
                jTextFieldId.setText("");
                jTextFieldNomeUsuario.setText("");
                jPasswordFieldSenha.setText("");
                jPasswordFieldConfirmarSenha.setText("");
                jButtonEditar.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                preencherTabela("select * from usuario order by id");
            }        
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked
        
        String nome = ""+jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select * from usuario where nome='"+nome+"'");
            try {
                conex.rs.first();
                jTextFieldId.setText(String.valueOf(conex.rs.getInt("id")));
                jTextFieldNomeUsuario.setText(String.valueOf(conex.rs.getString("nome")));
                jPasswordFieldSenha.setText(String.valueOf(conex.rs.getString("senha")));
                jPasswordFieldConfirmarSenha.setText(String.valueOf(conex.rs.getString("senha")));
                jComboBoxTipoUsuario.setSelectedItem(String.valueOf(conex.rs.getString("tipo")));
        
        jButtonExcluir.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        
        jTextFieldNomeUsuario.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jPasswordFieldConfirmarSenha.setEnabled(false);
        jComboBoxTipoUsuario.setEnabled(false);

        preencherTabela("select * from usuario order by id");
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(rootPane, "ERRO AO SELECIONAR" +ex);
            }
        conex.desconexao();                                           

    }//GEN-LAST:event_jTableUsuariosMouseClicked

    private void jComboBoxTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoUsuarioActionPerformed

        public void preencherTabela(String sql){
            
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"id","Nome","Tipo"};
        conex.conexao();
        
        conex.executaSql(sql);
            try {
                conex.rs.first();
                do{
                  dados.add(new Object[]{conex.rs.getInt("id"),conex.rs.getString("nome"),conex.rs.getString("tipo")});  
                }while(conex.rs.next());
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, "ERRO AO PREENCHER ARRAYLIST"+ex);
            }
            
            ModeloTabela modelo = new ModeloTabela(dados, colunas);
            
            jTableUsuarios.setModel(modelo);
            jTableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(94);
            jTableUsuarios.getColumnModel().getColumn(0).setResizable(false);
            jTableUsuarios.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTableUsuarios.getColumnModel().getColumn(1).setResizable(false);
            jTableUsuarios.getColumnModel().getColumn(2).setPreferredWidth(300);
            jTableUsuarios.getColumnModel().getColumn(2).setResizable(false);
            jTableUsuarios.getTableHeader().setReorderingAllowed(false);
            jTableUsuarios.setAutoResizeMode(jTableUsuarios.AUTO_RESIZE_OFF);
            jTableUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            conex.desconexao();
        
    }
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
            java.util.logging.Logger.getLogger(CadastroDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeUsuarios().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBoxTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelConfirmarSenha;
    private javax.swing.JLabel jLabelFundoCadastroUsuarios;
    private javax.swing.JPasswordField jPasswordFieldConfirmarSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNomeUsuario;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables
}
