/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ModelBeans.StockBeans;
import ModelBeans.MaterialBeans;
import ModelBeans.ModeloTabela;
import ModelConexao.ConexaoBD;
import ModelDao.MaterialDao;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Aurelio Macie Junior
 */
public class StockMaterial extends javax.swing.JFrame {
    
    MaterialBeans mod = new MaterialBeans();
    ModelDao.MaterialDao control = new MaterialDao();
    MaterialDao dao = new MaterialDao();
    ConexaoBD conex = new ConexaoBD();
    /**
     * Creates new form StockMaterial
     */
    public StockMaterial() {
        initComponents();
        preencherTabela("select * from material order by material_id");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldNomeDoMaterial = new javax.swing.JTextField();
        jTextFieldValorPorUnidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAdicionar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStockMaterial = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Adicionar");
        jButton1.setToolTipText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 190, 90, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("X");
        jButton2.setToolTipText("Fechar Stock");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(770, 0, 40, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantidade Por Adicionar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(470, 160, 190, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 60, 30, 30);

        jTextFieldId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldId.setEnabled(false);
        getContentPane().add(jTextFieldId);
        jTextFieldId.setBounds(90, 60, 50, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantidade Actual");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(470, 110, 140, 30);

        jTextFieldQuantidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldQuantidade.setEnabled(false);
        getContentPane().add(jTextFieldQuantidade);
        jTextFieldQuantidade.setBounds(610, 110, 80, 30);

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagemProjecto/search_24px.png"))); // NOI18N
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(460, 0, 40, 30);

        jTextFieldNomeDoMaterial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldNomeDoMaterial.setEnabled(false);
        getContentPane().add(jTextFieldNomeDoMaterial);
        jTextFieldNomeDoMaterial.setBounds(200, 110, 190, 30);

        jTextFieldValorPorUnidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldValorPorUnidade.setEnabled(false);
        getContentPane().add(jTextFieldValorPorUnidade);
        jTextFieldValorPorUnidade.setBounds(200, 160, 60, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Valor Por Unidade");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 160, 150, 30);

        jTextFieldPesquisar.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldPesquisar);
        jTextFieldPesquisar.setBounds(500, 0, 260, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Strockar Produto");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 0, 310, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome do material");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 110, 180, 30);

        jTextFieldAdicionar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAdicionar);
        jTextFieldAdicionar.setBounds(470, 190, 80, 30);

        jTableStockMaterial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableStockMaterial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableStockMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableStockMaterialMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableStockMaterial);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 270, 700, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagemProjecto/FundoParaTodasTelasRegistro.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 810, 410);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 80, 34, 14);

        setSize(new java.awt.Dimension(825, 449));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*mod.setNome(jTextFieldNomeDoMaterial.getText());
        mod.setQuantidade(Integer.valueOf(jTextFieldQuantidade.getText()));
        mod.setValor(Float.valueOf(jTextFieldValorPorUnidade.getText()));
        control.editar(mod);
        preencherTabela("select * from material order by id");*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableStockMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStockMaterialMouseClicked
        
        String nome = ""+jTableStockMaterial.getValueAt(jTableStockMaterial.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select * from material where material_nome='"+nome+"'");
            try {
                conex.rs.first();
                jTextFieldId.setText(String.valueOf(conex.rs.getInt("material_id")));
                jTextFieldNomeDoMaterial.setText(String.valueOf(conex.rs.getString("material_nome")));
                jTextFieldQuantidade.setText(String.valueOf(conex.rs.getInt("material_quantidade")));
                jTextFieldValorPorUnidade.setText(String.valueOf(conex.rs.getFloat("material_valor")));
        
        /*jButtonExcluir.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);*/
        
        jTextFieldNomeDoMaterial.setEnabled(false);
        jTextFieldQuantidade.setEnabled(false);
        jTextFieldValorPorUnidade.setEnabled(false);

        preencherTabela("select * from material order by material_id");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERRO AO SELECIONAR" +ex);
            }
        conex.desconexao();                                           
    }                                           

        public void preencherTabela(String sql){
            
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"ID","Nome","Quantidade","Valor Por Unidade"};
        conex.conexao();
        
        conex.executaSql(sql);
            try {
                conex.rs.first();
                do{
                  dados.add(new Object[]{conex.rs.getInt("material_id"),conex.rs.getString("material_nome"),conex.rs.getInt("material_quantidade"),conex.rs.getFloat("material_valor")});  
                }while(conex.rs.next());
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, "ERRO AO PREENCHER ARRAYLIST"+ex);
            }
            
            ModeloTabela modelo = new ModeloTabela(dados, colunas);
            
            jTableStockMaterial.setModel(modelo);
            jTableStockMaterial.getColumnModel().getColumn(0).setPreferredWidth(79);
            jTableStockMaterial.getColumnModel().getColumn(0).setResizable(false);
            jTableStockMaterial.getColumnModel().getColumn(1).setPreferredWidth(205);
            jTableStockMaterial.getColumnModel().getColumn(1).setResizable(false);
            jTableStockMaterial.getColumnModel().getColumn(2).setPreferredWidth(205);
            jTableStockMaterial.getColumnModel().getColumn(2).setResizable(false);
            jTableStockMaterial.getColumnModel().getColumn(3).setPreferredWidth(205);
            jTableStockMaterial.getColumnModel().getColumn(3).setResizable(false);
            jTableStockMaterial.getTableHeader().setReorderingAllowed(false);
            jTableStockMaterial.setAutoResizeMode(jTableStockMaterial.AUTO_RESIZE_OFF);
            jTableStockMaterial.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            conex.desconexao();
    }//GEN-LAST:event_jTableStockMaterialMouseClicked

        
    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed

        mod.setPesquisa(jTextFieldPesquisar.getText());
        MaterialBeans model = control.buscaMaterial(mod);

        jTextFieldId.setText(String.valueOf(model.getCodigo()));
        jTextFieldNomeDoMaterial.setText(model.getNome());
        jTextFieldQuantidade.setText(String.valueOf(model.getQuantidade()));
        jTextFieldValorPorUnidade.setText(String.valueOf(model.getValor()));
        
        jTextFieldId.setEnabled(false);
        jTextFieldNomeDoMaterial.setEnabled(false);
        jTextFieldQuantidade.setEnabled(false);
        jTextFieldValorPorUnidade.setEnabled(false);
        
        
        jTextFieldId.setText("");
        jTextFieldNomeDoMaterial.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldValorPorUnidade.setText("");

        preencherTabela("select * from material where material_nome like '%" + mod.getPesquisa() + "%'");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAdicionarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(StockMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockMaterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStockMaterial;
    private javax.swing.JTextField jTextFieldAdicionar;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNomeDoMaterial;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValorPorUnidade;
    // End of variables declaration//GEN-END:variables
}
