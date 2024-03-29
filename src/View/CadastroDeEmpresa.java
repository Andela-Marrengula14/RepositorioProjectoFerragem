/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ModelBeans.EmpresaBeans;
import ModelBeans.ModeloTabela;
import ModelConexao.ConexaoBD;
import ModelDao.EmpresaDao;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Aurelio Macie Junior
 */
public class CadastroDeEmpresa extends javax.swing.JFrame {

    
    EmpresaBeans mod = new EmpresaBeans();
    ModelDao.EmpresaDao control = new EmpresaDao();
    EmpresaDao dao = new EmpresaDao();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;
    
    /**
     * Creates new form CadastroDeEmpresa
     */
    public CadastroDeEmpresa() {
        initComponents();
        preencherTabela("select * from empresa order by id");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpresaFornecedora = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButtonFechar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldContacto = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jTextFieldLocalizacao = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jTextFieldFornecedora = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cadastro De Empresa Fornecedora");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 10, 330, 40);

        jTextFieldPesquisar.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldPesquisar);
        jTextFieldPesquisar.setBounds(510, 0, 270, 30);

        jTableEmpresaFornecedora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableEmpresaFornecedora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmpresaFornecedoraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmpresaFornecedora);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 270, 720, 140);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fornecedora");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 120, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 70, 20, 30);

        jTextFieldId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldId.setEnabled(false);
        getContentPane().add(jTextFieldId);
        jTextFieldId.setBounds(80, 70, 40, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contacto");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(470, 120, 80, 30);

        jButtonFechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonFechar.setText("X");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFechar);
        jButtonFechar.setBounds(790, 0, 40, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(470, 190, 80, 30);

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldEmail.setEnabled(false);
        getContentPane().add(jTextFieldEmail);
        jTextFieldEmail.setBounds(550, 190, 230, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Localização");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 190, 90, 30);

        jTextFieldContacto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldContacto.setEnabled(false);
        getContentPane().add(jTextFieldContacto);
        jTextFieldContacto.setBounds(550, 120, 230, 30);

        jButtonNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNovo);
        jButtonNovo.setBounds(60, 240, 80, 23);

        jButtonEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar);
        jButtonEditar.setBounds(280, 240, 90, 23);

        jTextFieldLocalizacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldLocalizacao.setEnabled(false);
        getContentPane().add(jTextFieldLocalizacao);
        jTextFieldLocalizacao.setBounds(160, 190, 250, 30);

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(510, 240, 90, 23);

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir);
        jButtonExcluir.setBounds(400, 240, 80, 23);

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(160, 240, 90, 23);

        jTextFieldFornecedora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldFornecedora.setEnabled(false);
        getContentPane().add(jTextFieldFornecedora);
        jTextFieldFornecedora.setBounds(160, 120, 250, 30);

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagemProjecto/search_24px.png"))); // NOI18N
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(480, 0, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagemProjecto/FundoParaTodasTelasRegistro.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 840, 410);

        setSize(new java.awt.Dimension(845, 446));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
    int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Excluir?");
            if(resposta == JOptionPane.YES_OPTION){
                mod.setCodigo(Integer.parseInt(jTextFieldId.getText()));
                control.excluir(mod);
                
                jTextFieldPesquisar.setText("");
                jTextFieldId.setText("");
                jTextFieldContacto.setText("");
                jTextFieldFornecedora.setText("");
                jTextFieldEmail.setText("");
                jTextFieldLocalizacao.setText("");
                
                jButtonEditar.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                preencherTabela("select * from empresa order by id");
            }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        
        flag = 1; 
        
        jTextFieldFornecedora.setEnabled(true);
        jTextFieldLocalizacao.setEnabled(true);
        jTextFieldContacto.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        
        jTextFieldFornecedora.setText("");
        jTextFieldLocalizacao.setText("");
        jTextFieldContacto.setText("");
        jTextFieldEmail.setText("");
        
        jButtonExcluir.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        
        flag = 2;
        
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        
        jTextFieldFornecedora.setEnabled(true);
        jTextFieldLocalizacao.setEnabled(true);
        jTextFieldContacto.setEnabled(true);
        jTextFieldEmail.setEnabled(true);

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        jTextFieldId.setText("");
        jTextFieldFornecedora.setEnabled(false);
        jTextFieldLocalizacao.setEnabled(false);
        jTextFieldContacto.setEnabled(false);
        jTextFieldEmail.setEnabled(false);        
        
        jTextFieldFornecedora.setText("");
        jTextFieldLocalizacao.setText("");
        jTextFieldContacto.setText("");
        jTextFieldEmail.setText("");
        
        jButtonCancelar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        jTextFieldPesquisar.setText("");
        if (jTextFieldFornecedora.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Preencha O Campo 'Nome' Para Continuar!");
           jTextFieldFornecedora.requestFocus();
       }else if(jTextFieldLocalizacao.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Preencha O Campo 'Contacto' Para Continuar!");
           jTextFieldLocalizacao.requestFocus();
       }else if(jTextFieldContacto.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Preencha O Campo 'Nascimento' Para Continuar!");
           jTextFieldContacto.requestFocus();
       }else if(jTextFieldEmail.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Preencha O Campo 'Número De Identificação' Para Continuar!");
           jTextFieldEmail.requestFocus();
           
       } else if (flag==1){ 
       
        mod.setNome(jTextFieldFornecedora.getText());
        mod.setLocalizacao(jTextFieldLocalizacao.getText());
        mod.setContacto(jTextFieldContacto.getText());
        mod.setEmail(jTextFieldEmail.getText());
        control.salvar(mod);  
            
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        
        jTextFieldFornecedora.setText("");
        jTextFieldLocalizacao.setText("");
        jTextFieldContacto.setText("");
        jTextFieldEmail.setText("");
        jTextFieldId.setText("");
        
        jTextFieldContacto.setEnabled(!true);
        jTextFieldLocalizacao.setEnabled(!true);
        jTextFieldFornecedora.setEnabled(!true);
        jTextFieldEmail.setEnabled(!true);
        preencherTabela("select * from empresa order by id");
       } else{
           
        jTextFieldContacto.setEnabled(!true);
        jTextFieldFornecedora.setEnabled(!true);
        jTextFieldLocalizacao.setEnabled(!true);
        jTextFieldEmail.setEnabled(!true);  
        
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);            
        
        mod.setCodigo(Integer.parseInt(jTextFieldId.getText()));
        mod.setNome(jTextFieldFornecedora.getText());
        mod.setContacto(jTextFieldContacto.getText());
        mod.setLocalizacao(jTextFieldLocalizacao.getText());
        mod.setEmail(jTextFieldEmail.getText());
        control.editar(mod);
        
        jTextFieldFornecedora.setText("");
        jTextFieldContacto.setText("");
        jTextFieldLocalizacao.setText("");
        jTextFieldEmail.setText("");
        jTextFieldId.setText("");
        
        preencherTabela("select * from empresa order by id");
       }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed

        mod.setPesquisa(jTextFieldPesquisar.getText());
        EmpresaBeans model = control.buscaEmpresa(mod);

        jTextFieldId.setText(String.valueOf(model.getCodigo()));
        jTextFieldFornecedora.setText(model.getNome());
        jTextFieldLocalizacao.setText(model.getLocalizacao());
        jTextFieldContacto.setText(model.getContacto());
        jTextFieldEmail.setText(model.getEmail());
        
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        
        jTextFieldId.setEnabled(false);
        jTextFieldFornecedora.setEnabled(false);
        jTextFieldLocalizacao.setEnabled(false);
        jTextFieldContacto.setEnabled(false);
        jTextFieldEmail.setEnabled(false);
        
        
        jTextFieldId.setText("");
        jTextFieldFornecedora.setText("");
        jTextFieldLocalizacao.setText("");
        jTextFieldContacto.setText("");
        jTextFieldEmail.setText("");        

        preencherTabela("select * from empresa where nome like '%" + mod.getPesquisa() + "%'");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTableEmpresaFornecedoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmpresaFornecedoraMouseClicked
        
        String nome = ""+jTableEmpresaFornecedora.getValueAt(jTableEmpresaFornecedora.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select * from empresa where nome='"+nome+"'");
            try {
                conex.rs.first();
                jTextFieldId.setText(String.valueOf(conex.rs.getInt("id")));
                jTextFieldFornecedora.setText(String.valueOf(conex.rs.getString("nome")));
                jTextFieldLocalizacao.setText(String.valueOf(conex.rs.getString("localizacao")));
                jTextFieldContacto.setText(String.valueOf(conex.rs.getString("contacto")));
                jTextFieldEmail.setText(String.valueOf(conex.rs.getString("email")));
        
        jButtonExcluir.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        
        jTextFieldFornecedora.setEnabled(false);
        jTextFieldLocalizacao.setEnabled(false);
        jTextFieldContacto.setEnabled(false);
        jTextFieldEmail.setEnabled(false);

        preencherTabela("select * from empresa order by id");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "ERRO AO SELECIONAR" +ex);
            }
        conex.desconexao();                                           

    }//GEN-LAST:event_jTableEmpresaFornecedoraMouseClicked

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

        public void preencherTabela(String sql){
            
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"id","Nome","Localização","Contacto","Email"};
        conex.conexao();
        
        conex.executaSql(sql);
            try {
                conex.rs.first();
                do{
                  dados.add(new Object[]{conex.rs.getInt("id"),conex.rs.getString("nome"),conex.rs.getString("localizacao"),conex.rs.getString("contacto"),conex.rs.getString("email")});  
                }while(conex.rs.next());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERRO AO PREENCHER ARRAYLIST"+ex);
            }
            
            ModeloTabela modelo = new ModeloTabela(dados, colunas);
            
            jTableEmpresaFornecedora.setModel(modelo);
            jTableEmpresaFornecedora.getColumnModel().getColumn(0).setPreferredWidth(56);
            jTableEmpresaFornecedora.getColumnModel().getColumn(0).setResizable(false);
            jTableEmpresaFornecedora.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTableEmpresaFornecedora.getColumnModel().getColumn(1).setResizable(false);
            jTableEmpresaFornecedora.getColumnModel().getColumn(2).setPreferredWidth(170);
            jTableEmpresaFornecedora.getColumnModel().getColumn(2).setResizable(false);
            jTableEmpresaFornecedora.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTableEmpresaFornecedora.getColumnModel().getColumn(3).setResizable(false);
            jTableEmpresaFornecedora.getColumnModel().getColumn(4).setPreferredWidth(198);
            jTableEmpresaFornecedora.getTableHeader().setReorderingAllowed(false);
            jTableEmpresaFornecedora.setAutoResizeMode(jTableEmpresaFornecedora.AUTO_RESIZE_OFF);
            jTableEmpresaFornecedora.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(CadastroDeEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmpresaFornecedora;
    private javax.swing.JTextField jTextFieldContacto;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFornecedora;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLocalizacao;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables
}
