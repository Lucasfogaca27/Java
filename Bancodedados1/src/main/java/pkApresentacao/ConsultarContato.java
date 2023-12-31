package pkApresentacao;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pkBanco.ContatoDAO;
import pkNegocio.Contato;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author fluca
 */
public class ConsultarContato extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultarContato
     */
    public ConsultarContato() {
        super("Consultar Contato", false, true,
                false, false);
        //titulo, redimensionar, fechar, maximizar, minimizar
        this.setLocation(450, 170);
        initComponents();
        getRootPane().setDefaultButton(btnConsultar);
        
    }
    
     private void fechar(){
        dispose();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblConsultar = new javax.swing.JLabel();
        cboConsultar = new javax.swing.JComboBox<>();
        txtConsultar = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itemConsultar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemExcluir = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemAlterar = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itemLimpar = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        itemFechar = new javax.swing.JMenuItem();

        lblConsultar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblConsultar.setText("Consultar Por:      ");

        cboConsultar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cboConsultar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Telefone" }));

        txtConsultar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnFechar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        menuArquivo.setText("Arquivo");

        itemConsultar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemConsultar.setText("Consultar");
        itemConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarActionPerformed(evt);
            }
        });
        menuArquivo.add(itemConsultar);
        menuArquivo.add(jSeparator1);

        itemExcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemExcluir.setText("Excluir");
        itemExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExcluirActionPerformed(evt);
            }
        });
        menuArquivo.add(itemExcluir);
        menuArquivo.add(jSeparator2);

        itemAlterar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAlterar.setText("Alterar");
        itemAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlterarActionPerformed(evt);
            }
        });
        menuArquivo.add(itemAlterar);
        menuArquivo.add(jSeparator3);

        itemLimpar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemLimpar.setText("Limpar");
        itemLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLimparActionPerformed(evt);
            }
        });
        menuArquivo.add(itemLimpar);
        menuArquivo.add(jSeparator4);

        itemFechar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemFechar.setText("Fechar");
        itemFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFecharActionPerformed(evt);
            }
        });
        menuArquivo.add(itemFechar);

        jMenuBar1.add(menuArquivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblConsultar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(btnExcluir)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(btnLimpar)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFechar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConsultar)
                    .addComponent(cboConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnLimpar)
                    .addComponent(btnFechar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        fechar();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void itemFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFecharActionPerformed
        fechar();
    }//GEN-LAST:event_itemFecharActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void itemLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLimparActionPerformed
        limpar();
    }//GEN-LAST:event_itemLimparActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void itemConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_itemConsultarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void itemExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_itemExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void itemAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_itemAlterarActionPerformed

    private void limpar(){
        txtConsultar.setText("");
        DefaultTableModel model = (DefaultTableModel)tabela.getModel();
        if (model.getRowCount () != 0) {
            for (int i = model.getRowCount ()-1; i>=0; i--){
                model.removeRow(i);
            }
        }
    }
   
    private void consultar(){
        DefaultTableModel model = (DefaultTableModel)tabela.getModel();
        if (model.getRowCount () != 0) {
            for (int i = model.getRowCount ()-1; i>=0; i--){
                model.removeRow(i);
            }
        }
        ContatoDAO contatoDAO = new ContatoDAO();
        List<Contato> contatos = contatoDAO.consultarContato
            (cboConsultar.getSelectedItem().toString(),
               txtConsultar.getText().toUpperCase());
        if(!contatos.isEmpty()){
            for(Contato contato: contatos){
               model.addRow(new Object[]{contato.getNome(),
                contato.getTelefone()});
            }
        }else{
            JOptionPane.showMessageDialog(null,
                    "Nenhum contato encontrado!",
                    "Nenhum contato", JOptionPane.INFORMATION_MESSAGE);
            txtConsultar.requestFocus();
            txtConsultar.selectAll();
        }
    }
    
    private void excluir(){
        if (tabela.getSelectedRow() >= 0){
            Object[] opcoes = {"Sim","Não"};
            int retorno = JOptionPane.showOptionDialog(null,
                    "Tem certeza que deseja excluir?",
                    "Excluir", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    opcoes, opcoes[0]);
            if (retorno == 0){
                ContatoDAO contatoDAO = new ContatoDAO();
                DefaultTableModel model = (DefaultTableModel)tabela.getModel();
                Contato contato = new Contato
                (model.getValueAt(tabela.getSelectedRow(),0).toString(),
                model.getValueAt(tabela.getSelectedRow(),1).toString());
                boolean contatoDeletado = contatoDAO.deletarContato(contato);
                   if(contatoDeletado == true){
                        model.removeRow(tabela.getSelectedRow());
                        JOptionPane.showMessageDialog(null,
                                "Contato deletado com sucesso!",
                                "Deletado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                   JOptionPane.showMessageDialog(null,
                                "Erro ao tentar excluir",
                                "ERRO JUMENTO!", JOptionPane.ERROR_MESSAGE);
                  }
            }
        }  
        else{
            JOptionPane.showMessageDialog(null,
                    "Selecione o contato que deseja exlcuir",
                    "Excluir", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    private void alterar(){
        if (tabela.getSelectedRow() >=0){
           DefaultTableModel model = (DefaultTableModel)tabela.getModel();
           String nome = model.getValueAt(tabela.getSelectedRow(), 0).toString();
           String telefone = model.getValueAt(tabela.getSelectedRow(), 1).toString();
           CadastrarContato alterar = new CadastrarContato(nome, telefone);
           Principal.dPane.add(alterar);
           alterar.setVisible(true);
           dispose();
        } else {
            JOptionPane.showMessageDialog(null,
                    "Selecione o contato que deseja alterar",
                    "Alterar", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cboConsultar;
    private javax.swing.JMenuItem itemAlterar;
    private javax.swing.JMenuItem itemConsultar;
    private javax.swing.JMenuItem itemExcluir;
    private javax.swing.JMenuItem itemFechar;
    private javax.swing.JMenuItem itemLimpar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JLabel lblConsultar;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtConsultar;
    // End of variables declaration//GEN-END:variables
}
