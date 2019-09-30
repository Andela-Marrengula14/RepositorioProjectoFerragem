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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Aurelio Macie Junior
 */
public class Venda extends javax.swing.JFrame {
    
    ConexaoBD conex = new ConexaoBD();
    ClienteBeans mod = new ClienteBeans();
    ModelDao.ClienteDao control = new ClienteDao();
    ClienteDao dao = new ClienteDao();
    
    /**
     * Creates new form Venda
     */
    public Venda() {
        initComponents();
        preencherTabela("select cliente_id, cliente_nome, cliente_contacto, cliente_quantidade, material_nome from cliente inner join material on cliente_id = material_id order by cliente_nome");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonPesquisa = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldValorPagar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVenda = new javax.swing.JTable();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldlDesejado = new javax.swing.JTextField();
        jButtonVender = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldContatco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Venda De Material");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 10, 180, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("X");
        jButton1.setToolTipText("Fechar Venda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(770, 0, 40, 30);

        jTextFieldPesquisa.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldPesquisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldPesquisa);
        jTextFieldPesquisa.setBounds(500, 0, 260, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 120, 60, 30);

        jButtonPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagemProjecto/search_24px.png"))); // NOI18N
        jButtonPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisa);
        jButtonPesquisa.setBounds(470, 0, 30, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Desejo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 190, 60, 30);

        jTextFieldNomeCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldNomeCliente.setEnabled(false);
        getContentPane().add(jTextFieldNomeCliente);
        jTextFieldNomeCliente.setBounds(150, 120, 240, 30);

        jTextFieldQuantidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldQuantidade.setEnabled(false);
        getContentPane().add(jTextFieldQuantidade);
        jTextFieldQuantidade.setBounds(150, 260, 80, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pagamento");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 330, 80, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantidade");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 260, 90, 30);

        jTextFieldValorPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldValorPagar.setEnabled(false);
        getContentPane().add(jTextFieldValorPagar);
        jTextFieldValorPagar.setBounds(150, 330, 80, 30);

        jTableVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVenda);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(400, 120, 400, 240);

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setToolTipText("Cancelar");
        jButtonCancelar.setEnabled(false);
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(270, 320, 120, 40);

        jTextFieldlDesejado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldlDesejado.setEnabled(false);
        getContentPane().add(jTextFieldlDesejado);
        jTextFieldlDesejado.setBounds(150, 190, 240, 30);

        jButtonVender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVender.setText("Vender");
        jButtonVender.setToolTipText("Vender");
        jButtonVender.setEnabled(false);
        getContentPane().add(jButtonVender);
        jButtonVender.setBounds(270, 260, 120, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagemProjecto/FundoParaTodasTelasRegistro.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 820, 420);

        jTextFieldId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldId.setEnabled(false);
        getContentPane().add(jTextFieldId);
        jTextFieldId.setBounds(150, 60, 40, 30);
        getContentPane().add(jTextFieldContatco);
        jTextFieldContatco.setBounds(210, 60, 220, 30);

        setSize(new java.awt.Dimension(824, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaActionPerformed

        mod.setPesquisa(jTextFieldPesquisa.getText());
        ClienteBeans model = control.buscaCliente(mod); 
        
        jButtonCancelar.setEnabled(true);
        jButtonVender.setEnabled(true);
        
        jTextFieldNomeCliente.setText(model.getNome());
        jTextFieldlDesejado.setText(model.getNomeDoMaterial());
        jTextFieldQuantidade.setText(String.valueOf(model.getQuantidadeDesejada()));
        
        preencherTabela("select * from cliente where cliente_nome like '%" + mod.getPesquisa() + "%'");
    }//GEN-LAST:event_jButtonPesquisaActionPerformed

    private void jTableVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVendaMouseClicked
        
     /*   String nome = ""+jTableVenda.getValueAt(jTableVenda.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select * from cliente where cliente_nome='"+nome+"'");
            try {
                conex.rs.first();
                jTextFieldNomeCliente.setText(String.valueOf(conex.rs.getString("cliente_nome")));
                jTextFieldContatco.setText(String.valueOf(conex.rs.getString("cliente_contacto")));
                jTextFieldQuantidade.setText(String.valueOf(conex.rs.getInt("cliente_quantidade")));
                    
                    ConexaoBD conexPesquisa = new ConexaoBD();
                    conexPesquisa.conexao();
                    conexPesquisa.executaSql("select * from material where material_id ="+conex.rs.getInt("id"));
                    conexPesquisa.rs.first();
                    jTextFieldlDesejado.setText(conexPesquisa.rs.getString("material_nome"));
                    conexPesquisa.desconexao();
                  
                    jTextFieldNomeCliente.setEnabled(false);
                  jTextFieldlDesejado.setEnabled(false);
                  jTextFieldQuantidade.setEnabled(false);

                  preencherTabela("select * from cliente order by cliente_id");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERRO AO SELECIONAR \n ERROR: " +ex);
            }
        conex.desconexao();*/                                           
    }//GEN-LAST:event_jTableVendaMouseClicked

    public void preencherTabela(String sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"Nome","Material","Quantidade"};
        conex.conexao();
        
        conex.executaSql(sql);
            try {
                conex.rs.first();
                do{
                  dados.add(new Object[]{conex.rs.getString("cliente_nome"),conex.rs.getString("material_nome"),conex.rs.getInt("material_quantidade")});  
                }while(conex.rs.next());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERRO AO PREENCHER ARRAYLIST\n ERROR: " +ex);
            }
            
            ModeloTabela modelo = new ModeloTabela(dados, colunas);
            
            jTableVenda.setModel(modelo);
            jTableVenda.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTableVenda.getColumnModel().getColumn(0).setResizable(false);
            jTableVenda.getColumnModel().getColumn(1).setPreferredWidth(156);
            jTableVenda.getColumnModel().getColumn(1).setResizable(false);
            jTableVenda.getColumnModel().getColumn(2).setPreferredWidth(88);
            jTableVenda.getColumnModel().getColumn(2).setResizable(false);
            jTableVenda.getTableHeader().setReorderingAllowed(false);
            jTableVenda.setAutoResizeMode(jTableVenda.AUTO_RESIZE_OFF);
            jTableVenda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonPesquisa;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVenda;
    private javax.swing.JTextField jTextFieldContatco;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValorPagar;
    private javax.swing.JTextField jTextFieldlDesejado;
    // End of variables declaration//GEN-END:variables
}
