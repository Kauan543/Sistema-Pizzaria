/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetofinalpizzaria;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kauan
 */
public class CadastrarCliente extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CadastrarCliente.class.getName());

    /**
     * Creates new form CadastrarCliente
     */
    public CadastrarCliente() {
        initComponents();
        atualizarTabela();
        MenuClientesCadastrados.setEnabled(false);
    }

    public void atualizarTabela() {
    //Instancia a classe que prepara os dados
    PreencherTabelaCliente preenchimento = new PreencherTabelaCliente();
    
    //Chama o método gerarModelo e joga na tabela de Clientes
    tabelaClientes.setModel(preenchimento.gerarModelo());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        caixaTextoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        caixaTextoSobrenome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        caixaTextoTelefone = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        botaoLimpar = new javax.swing.JButton();
        botaoAdicionar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        botaoPesquisar = new javax.swing.JButton();
        caixaTextoPesquisa = new javax.swing.JTextField();
        botaoEditar = new javax.swing.JButton();
        botaoDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuClientes = new javax.swing.JMenu();
        MenuClientesCadastrados = new javax.swing.JMenuItem();
        menuCadastrarSabor = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dashboard");
        setMinimumSize(new java.awt.Dimension(871, 540));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(245, 245, 220));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/group.png"))); // NOI18N
        jLabel1.setText("Lista de Cliente");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Novo Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome");

        caixaTextoNome.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Sobrenome");

        caixaTextoSobrenome.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        caixaTextoSobrenome.addActionListener(this::caixaTextoSobrenomeActionPerformed);

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Telefone (Com DDD)");

        caixaTextoTelefone.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        caixaTextoTelefone.addActionListener(this::caixaTextoTelefoneActionPerformed);

        jPanel3.setOpaque(false);

        botaoLimpar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        botaoLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/broom.png"))); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(this::botaoLimparActionPerformed);

        botaoAdicionar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        botaoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.addActionListener(this::botaoAdicionarActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoAdicionar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caixaTextoNome)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(caixaTextoSobrenome)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caixaTextoTelefone))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caixaTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caixaTextoSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caixaTextoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel5.setOpaque(false);

        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/search.png"))); // NOI18N
        botaoPesquisar.addActionListener(this::botaoPesquisarActionPerformed);

        caixaTextoPesquisa.addActionListener(this::caixaTextoPesquisaActionPerformed);

        botaoEditar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        botaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pencil.png"))); // NOI18N
        botaoEditar.setText("Editar");
        botaoEditar.addActionListener(this::botaoEditarActionPerformed);

        botaoDelete.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        botaoDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/delete.png"))); // NOI18N
        botaoDelete.setText("Deletar");
        botaoDelete.addActionListener(this::botaoDeleteActionPerformed);

        tabelaClientes.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaClientes);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(botaoDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(caixaTextoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoDelete)
                            .addComponent(botaoEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(caixaTextoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(77, 77, 77))))
        );

        MenuClientes.setText("Clientes");

        MenuClientesCadastrados.setText("Clientes Cadastrados");
        MenuClientesCadastrados.addActionListener(this::MenuClientesCadastradosActionPerformed);
        MenuClientes.add(MenuClientesCadastrados);

        jMenuBar1.add(MenuClientes);

        menuCadastrarSabor.setText("Sabor");

        jMenuItem1.setText("Cadastrar Sabor");
        jMenuItem1.addActionListener(this::jMenuItem1ActionPerformed);
        menuCadastrarSabor.add(jMenuItem1);

        jMenuBar1.add(menuCadastrarSabor);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        caixaTextoNome.setText("");
        caixaTextoSobrenome.setText("");
        caixaTextoTelefone.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void caixaTextoSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoSobrenomeActionPerformed

    private void caixaTextoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoTelefoneActionPerformed

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        String nome = caixaTextoNome.getText();
        String sobrenome = caixaTextoSobrenome.getText();
        String telefone = caixaTextoTelefone.getText();
        if(nome.isEmpty()|| sobrenome.isEmpty()|| telefone.isEmpty()){
            JOptionPane.showMessageDialog(this,"Existem campos em branco por favor preencha todos os campos","",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            Cliente cliente = new Cliente(nome, sobrenome, telefone);
            if(cliente != null){
                BancoDados.getInstance().getListaCliente().add(cliente);
                JOptionPane.showMessageDialog(this,"Cadastro Realizado com sucesso");
            }
        }
        catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(this,"Telefone invalido","",JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Campo nome e sobrenome so permite letras","",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        int linhaSelecionada = tabelaClientes.getSelectedRow();
        //caso nenhuma linha selecionada
        if(linhaSelecionada == -1){
            JOptionPane.showMessageDialog(this,"Nenhuma linha foi selecionada");
            return;
        }
        String telefone = tabelaClientes.getValueAt(linhaSelecionada, 2).toString();
        BancoDados bd = BancoDados.getInstance();
        Cliente cliente = null;
        for(int i = 0; i<bd.getListaCliente().size();i++){
            if(telefone.equals(bd.getListaCliente().get(i).getTelefone())){
                cliente = bd.getListaCliente().get(i);
            }
        }
        if(cliente == null){
            JOptionPane.showMessageDialog(this, "Cliente não encontrado no banco de dados", "", JOptionPane.ERROR_MESSAGE);
        }
        else{
            EditarCliente editar = new EditarCliente(cliente);
            editar.setVisible(true);
        }
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void caixaTextoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoPesquisaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        atualizarTabela();
    }//GEN-LAST:event_formWindowActivated

    private void botaoDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeleteActionPerformed
        int linhaSelecionada = tabelaClientes.getSelectedRow();
        //caso nenhuma linha selecionada
        if(linhaSelecionada == -1){
            JOptionPane.showMessageDialog(this,"Nenhuma linha foi selecionada");
            return;
        }
        String telefone = tabelaClientes.getValueAt(linhaSelecionada, 2).toString();
        DefaultTableModel tabela =(DefaultTableModel) tabelaClientes.getModel();
        //remove linha do modelo da tabela
        tabela.removeRow(linhaSelecionada);
        BancoDados bd = BancoDados.getInstance();
        for(int i = 0;i<bd.getListaCliente().size();i++){
            if(telefone.equals(bd.getListaCliente().get(i).getTelefone())){
                //remove cliente do bd
                bd.getListaCliente().remove(i);
                JOptionPane.showMessageDialog(this,"Cliente Removido");
                return;
            }
        }
        JOptionPane.showMessageDialog(this,"Cliente não encontrado no bd");
    }//GEN-LAST:event_botaoDeleteActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        String resultadoPesquisa = caixaTextoPesquisa.getText();
        boolean encontrado = true;
        BancoDados bd = BancoDados.getInstance();
        String [] coluna = {"Nome","Sobrenome","Telefone"};
        DefaultTableModel modelo = new DefaultTableModel(coluna,0);
        //procura por telefone
        for(int i = 0; i<bd.getListaCliente().size();i++){
            Cliente cliente = bd.getListaCliente().get(i);
            if(resultadoPesquisa.equals(cliente.getTelefone())){
                encontrado = false;
                Object [] linha = {cliente.getNome(), cliente.getSobrenome(), cliente.getTelefone()};
                modelo.addRow(linha);
            }
        }
        //caso encontre por telefone, retorna resultado e encerra busca
        if(encontrado == false){
            tabelaClientes.setModel(modelo);
            return;
        }
        //caso nao encontre, buscar pelo sobrenome ou por parte do mesmo
        for(int i = 0; i<bd.getListaCliente().size();i++){
            Cliente cliente = bd.getListaCliente().get(i);
            //utilizado contains() para pegar partes do sobrenome tambem
            if(cliente.getSobrenome().contains(resultadoPesquisa)){
                encontrado = false;
                Object [] linha = {cliente.getNome(), cliente.getSobrenome(), cliente.getTelefone()};
                modelo.addRow(linha);
            }
        }
        //caso nao encontre nem por sobrenome e nem por telefone
        if(encontrado == true){
            JOptionPane.showMessageDialog(this,"Cliente não cadastrado", "",JOptionPane.ERROR_MESSAGE);
            return;
        }
        //caso encontre por sobrenome
        tabelaClientes.setModel(modelo);
        
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void MenuClientesCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClientesCadastradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuClientesCadastradosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadastrarSabor cs = new CadastrarSabor();
        cs.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CadastrarCliente().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenuItem MenuClientesCadastrados;
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoDelete;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JTextField caixaTextoNome;
    private javax.swing.JTextField caixaTextoPesquisa;
    private javax.swing.JTextField caixaTextoSobrenome;
    private javax.swing.JTextField caixaTextoTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menuCadastrarSabor;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
}
