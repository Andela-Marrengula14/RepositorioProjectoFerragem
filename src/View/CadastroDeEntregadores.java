/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ModelBeans.FornecedorBeans;
import ModelBeans.ModeloTabela;
import ModelConexao.ConexaoBD;
import ModelDao.FornecedorDao;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Aurelio Macie Junior
 */
public class CadastroDeEntregadores extends javax.swing.JFrame {
    FornecedorBeans mod = new FornecedorBeans();
    ModelDao.FornecedorDao control = new FornecedorDao();
    FornecedorDao dao = new FornecedorDao();
    CadastroDeEmpresa empresa = new CadastroDeEmpresa();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;
    /**
     * Creates new form CadastroDeFornecedores
     */
    public CadastroDeEntregadores() {
        initComponents();
        preencherEmpresa();
        preencherTabela("select * from fornecedor order by id");
    }

        public void preencherEmpresa(){
        conex.conexao();
        conex.executaSql("select * from empresa order by nome");
        try {
            conex.rs.first();
            jComboBoxNomeDaEmpresa.removeAllItems();
            do{
            jComboBoxNomeDaEmpresa.addItem(conex.rs.getString("nome"));
        }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro Ao Preencher Empresa" +ex);
        }
        conex.desconexao();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFornecedores = new javax.swing.JTable();
        jButtonSalvar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNomeEntregador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldContacto = new javax.swing.JTextField();
        jComboBoxNomeDaEmpresa = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButtonInformacaoAuxiliar = new javax.swing.JButton();
        jTextFieldIdentificacao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldHoraDeEntrega = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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

        jTableFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFornecedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFornecedores);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 270, 700, 140);

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

        jButtonSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSair.setText("X");
        jButtonSair.setToolTipText("Fechar Cadastro De Entregador");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(770, 0, 41, 30);

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

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagemProjecto/search_24px.png"))); // NOI18N
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(470, 0, 30, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Formulário De Cadastro De Entregador");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 10, 370, 40);

        jTextFieldPesquisar.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldPesquisar);
        jTextFieldPesquisar.setBounds(499, 0, 260, 30);

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 70, 30, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Data De Entrega");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(460, 70, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome Da Empresa");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 120, 150, 30);

        jTextFieldNomeEntregador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldNomeEntregador.setEnabled(false);
        getContentPane().add(jTextFieldNomeEntregador);
        jTextFieldNomeEntregador.setBounds(220, 170, 230, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome Do Entregador");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 170, 160, 30);

        jTextFieldContacto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldContacto.setEnabled(false);
        getContentPane().add(jTextFieldContacto);
        jTextFieldContacto.setBounds(580, 120, 180, 30);

        jComboBoxNomeDaEmpresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxNomeDaEmpresa.setEnabled(false);
        getContentPane().add(jComboBoxNomeDaEmpresa);
        jComboBoxNomeDaEmpresa.setBounds(220, 120, 230, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contacto");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(500, 120, 70, 30);

        jButtonInformacaoAuxiliar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagemProjecto/information_24px.png"))); // NOI18N
        jButtonInformacaoAuxiliar.setToolTipText("Poderá Registrar Uma Empresa Caso Entregador Não Pertença As Registradas!");
        jButtonInformacaoAuxiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInformacaoAuxiliarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInformacaoAuxiliar);
        jButtonInformacaoAuxiliar.setBounds(780, 380, 30, 30);

        jTextFieldIdentificacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldIdentificacao.setEnabled(false);
        getContentPane().add(jTextFieldIdentificacao);
        jTextFieldIdentificacao.setBounds(580, 170, 180, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Identificacao");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 170, 100, 30);

        jTextFieldHoraDeEntrega.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldHoraDeEntrega.setEnabled(false);
        getContentPane().add(jTextFieldHoraDeEntrega);
        jTextFieldHoraDeEntrega.setBounds(580, 70, 100, 30);

        jTextFieldId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldId.setEnabled(false);
        getContentPane().add(jTextFieldId);
        jTextFieldId.setBounds(90, 70, 40, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagemProjecto/FundoParaTodasTelasRegistro.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, -10, 840, 430);

        setSize(new java.awt.Dimension(826, 448));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag=1;
        
        jComboBoxNomeDaEmpresa.setEnabled(true);
        jTextFieldNomeEntregador.setEnabled(true);
        jTextFieldContacto.setEnabled(true);
        jTextFieldIdentificacao.setEnabled(true);
        jTextFieldHoraDeEntrega.setEnabled(true);
        
        jButtonExcluir.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        
        jTextFieldId.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldContacto.setText("");
        //jComboBoxNomeDaEmpresa.setText("");
        jTextFieldNomeEntregador.setText("");
        jTextFieldIdentificacao.setText("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        
        jTextFieldId.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldContacto.setText("");
        jTextFieldHoraDeEntrega.setText("");
        jTextFieldNomeEntregador.setText("");
        jTextFieldIdentificacao.setText("");
        
        jButtonCancelar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        
        jTextFieldContacto.setEnabled(false);
        jComboBoxNomeDaEmpresa.setEnabled(false);
        jTextFieldNomeEntregador.setEnabled(false);
        jTextFieldIdentificacao.setEnabled(false);
        jTextFieldHoraDeEntrega.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
       
        jTextFieldPesquisar.setText("");
        if(jTextFieldContacto.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Preencha O Campo 'Contacto' Para Continuar!");
           jTextFieldContacto.requestFocus();
       }else if(jTextFieldNomeEntregador.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Preencha O Campo 'Nome Do Entregador' Para Continuar!");
           jTextFieldNomeEntregador.requestFocus();
       }else if(jTextFieldIdentificacao.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Preencha O Campo 'Identificação' Para Continuar!");
           jTextFieldIdentificacao.requestFocus();
       }else if(jTextFieldHoraDeEntrega.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Preencha O Campo 'Data De Entrega' Para Continuar!");
           jTextFieldHoraDeEntrega.requestFocus();   
           
       } else if (flag==1){ 
       
        mod.setNomeEmpresa((String)jComboBoxNomeDaEmpresa.getSelectedItem());
        mod.setNomeEntregador(jTextFieldNomeEntregador.getText());
        mod.setHoraDeEntrega(jTextFieldHoraDeEntrega.getText());
        mod.setContacto(jTextFieldContacto.getText());
        mod.setNrDeIdentificacao(jTextFieldIdentificacao.getText());
        control.salvar(mod);  
            
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        
        //jComboBoxNomeDaEmpresa.setText("");
        jTextFieldNomeEntregador.setText("");
        jTextFieldHoraDeEntrega.setText("");
        jTextFieldContacto.setText("");
        jTextFieldIdentificacao.setText("");
        jTextFieldId.setText("");
        
        jComboBoxNomeDaEmpresa.setEnabled(!true);
        jTextFieldNomeEntregador.setEnabled(!true);
        jTextFieldHoraDeEntrega.setEnabled(!true);
        jTextFieldContacto.setEnabled(!true);
        jTextFieldIdentificacao.setEnabled(false);
        preencherTabela("select * from fornecedor order by id");
       } else{
           
        jComboBoxNomeDaEmpresa.setEnabled(!true);
        jTextFieldNomeEntregador.setEnabled(!true);
        jTextFieldHoraDeEntrega.setEnabled(!true);
        jTextFieldContacto.setEnabled(!true);
        jTextFieldIdentificacao.setEnabled(false);  
        
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);            
        
        mod.setCodigo(Integer.parseInt(jTextFieldId.getText()));
        mod.setNomeEmpresa((String)jComboBoxNomeDaEmpresa.getSelectedItem());
        mod.setNomeEntregador(jTextFieldNomeEntregador.getText());
        mod.setHoraDeEntrega(jTextFieldHoraDeEntrega.getText());
        mod.setContacto(jTextFieldContacto.getText());
        mod.setNrDeIdentificacao(jTextFieldIdentificacao.getText());
        control.editar(mod);
        
        //jComboBoxNomeDaEmpresa.setText("");
        jTextFieldNomeEntregador.setText("");
        jTextFieldHoraDeEntrega.setText("");
        jTextFieldContacto.setText("");
        jTextFieldIdentificacao.setText("");
        jTextFieldId.setText("");
        
        preencherTabela("select * from fornecedor order by id");
       }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        
        flag = 2;
        
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        
        jComboBoxNomeDaEmpresa.setEnabled(true);
        jTextFieldNomeEntregador.setEnabled(true);
        jTextFieldContacto.setEnabled(true);
        jTextFieldIdentificacao.setEnabled(true);
        jTextFieldHoraDeEntrega.setEnabled(true);
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
    int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Excluir?");
            if(resposta == JOptionPane.YES_OPTION){
                mod.setCodigo(Integer.parseInt(jTextFieldId.getText()));
                control.excluir(mod);
                
                jTextFieldPesquisar.setText("");
                //jComboBoxNomeDaEmpresa.setText("");
                jTextFieldNomeEntregador.setText("");
                jTextFieldContacto.setText("");
                jTextFieldIdentificacao.setText("");
                jTextFieldId.setText("");
                jTextFieldHoraDeEntrega.setText("");
                
                jButtonEditar.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                
                preencherTabela("select * from fornecedor order by id");
            }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed

        mod.setPesquisa(jTextFieldPesquisar.getText());
        FornecedorBeans model = control.buscaFornecedor(mod);

        jTextFieldId.setText(String.valueOf(model.getCodigo()));
        jComboBoxNomeDaEmpresa.setSelectedItem(String.valueOf(model.getNomeEmpresa()));
        jTextFieldNomeEntregador.setText(model.getNomeEntregador());
        jTextFieldContacto.setText(model.getContacto());
        jTextFieldIdentificacao.setText(model.getNrDeIdentificacao());
        jTextFieldHoraDeEntrega.setText(model.getHoraDeEntrega());
        
        
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        
        jTextFieldId.setEnabled(false);
        jComboBoxNomeDaEmpresa.setEnabled(false);
        jTextFieldNomeEntregador.setEnabled(false);
        jTextFieldContacto.setEnabled(false);
        jTextFieldIdentificacao.setEnabled(false);
        jTextFieldHoraDeEntrega.setEnabled(false);
        
        jTextFieldId.setText("");
        //jComboBoxNomeDaEmpresa.setText("");
        jTextFieldNomeEntregador.setText("");
        jTextFieldContacto.setText("");
        jTextFieldIdentificacao.setText("");  
        jTextFieldHoraDeEntrega.setText("");

        preencherTabela("select * from fornecedor where nomeempresa like '%" + mod.getPesquisa() + "%'");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTableFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFornecedoresMouseClicked
        
        String nome = ""+jTableFornecedores.getValueAt(jTableFornecedores.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select * from fornecedor where nomeempresa='"+nome+"'");
            try {
                conex.rs.first();
                jTextFieldId.setText(String.valueOf(conex.rs.getInt("id")));
                jComboBoxNomeDaEmpresa.setSelectedItem(String.valueOf(conex.rs.getString("nomeempresa")));
                jTextFieldNomeEntregador.setText(String.valueOf(conex.rs.getString("nomeentregador")));
                jTextFieldContacto.setText(conex.rs.getString("contacto"));
                jTextFieldIdentificacao.setText(conex.rs.getString("identificacao"));
                jTextFieldHoraDeEntrega.setText(String.valueOf(conex.rs.getString("hora")));
        
        jButtonExcluir.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        
        jComboBoxNomeDaEmpresa.setEnabled(false);
        jTextFieldNomeEntregador.setEnabled(false);
        jTextFieldContacto.setEnabled(false);
        jTextFieldIdentificacao.setEnabled(false); 
        jTextFieldHoraDeEntrega.setEnabled(false);

        preencherTabela("select * from fornecedor order by id");
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, "ERRO AO SELECIONAR" +ex);
            }
        conex.desconexao();                                    
    }//GEN-LAST:event_jTableFornecedoresMouseClicked

    private void jButtonInformacaoAuxiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInformacaoAuxiliarActionPerformed
        if(empresa==null){
            empresa = new CadastroDeEmpresa();
            empresa.setVisible(true);
            empresa.setResizable(false);
        }else{
            empresa.setVisible(true);
            empresa.setResizable(false);
        }
    }//GEN-LAST:event_jButtonInformacaoAuxiliarActionPerformed

       
        public void preencherTabela(String sql){
            
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"id","Nome Da Empresa","Nome Do Entregador","Identificacao","Contacto","Data De Entrega"};
        conex.conexao();
        
        conex.executaSql(sql);
            try {
                conex.rs.first();
                do{
                  dados.add(new Object[]{conex.rs.getInt("id"),conex.rs.getString("nomeempresa"),conex.rs.getString("nomeentregador"),conex.rs.getString("identificacao"),conex.rs.getString("contacto"),conex.rs.getString("hora")});  
                }while(conex.rs.next());
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, "ERRO AO PREENCHER ARRAYLIST"+ex);
            }
            
            ModeloTabela modelo = new ModeloTabela(dados, colunas);
            
            jTableFornecedores.setModel(modelo);
            jTableFornecedores.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTableFornecedores.getColumnModel().getColumn(0).setResizable(false);
            jTableFornecedores.getColumnModel().getColumn(1).setPreferredWidth(160);
            jTableFornecedores.getColumnModel().getColumn(1).setResizable(false);
            jTableFornecedores.getColumnModel().getColumn(2).setPreferredWidth(160);
            jTableFornecedores.getColumnModel().getColumn(2).setResizable(false);
            jTableFornecedores.getColumnModel().getColumn(3).setPreferredWidth(110);
            jTableFornecedores.getColumnModel().getColumn(3).setResizable(false);
            jTableFornecedores.getColumnModel().getColumn(4).setPreferredWidth(120);
            jTableFornecedores.getColumnModel().getColumn(4).setResizable(false);
            jTableFornecedores.getColumnModel().getColumn(5).setPreferredWidth(114);
            jTableFornecedores.getColumnModel().getColumn(5).setResizable(false);
            jTableFornecedores.getTableHeader().setReorderingAllowed(false);
            jTableFornecedores.setAutoResizeMode(jTableFornecedores.AUTO_RESIZE_OFF);
            jTableFornecedores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(CadastroDeEntregadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeEntregadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeEntregadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeEntregadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeEntregadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonInformacaoAuxiliar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxNomeDaEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFornecedores;
    private javax.swing.JTextField jTextFieldContacto;
    private javax.swing.JTextField jTextFieldHoraDeEntrega;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldIdentificacao;
    private javax.swing.JTextField jTextFieldNomeEntregador;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables
}
