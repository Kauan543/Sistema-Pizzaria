/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetofinalpizzaria;

import javax.swing.JOptionPane;

/**
 *
 * @author Kauan
 */
public class CadastrarSabor extends javax.swing.JFrame {
    //gerado pelo netbeans
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CadastrarSabor.class.getName());
    //construtor
    public CadastrarSabor() {
        initComponents();
        MenuCadastrarSabor1.setEnabled(false);
        preencherComboTipo();
    }
    //busca no bd os tipos e preenche o combo
    public void preencherComboTipo(){
        BancoDados bd = BancoDados.getInstance();
        for(int i = 0; i < bd.getListaTipo().size();i++){
            comboTipoPizza.addItem(bd.getListaTipo().get(i).getCategoria());
        }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        caixaTextoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        botaoLimpar = new javax.swing.JButton();
        botaoAdicionar = new javax.swing.JButton();
        comboTipoPizza = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuClientes = new javax.swing.JMenu();
        MenuClientesCadastrados = new javax.swing.JMenuItem();
        MenuCadastrarSabor = new javax.swing.JMenu();
        MenuAtualizarPreco = new javax.swing.JMenuItem();
        MenuCadastrarSabor1 = new javax.swing.JMenuItem();
        MenuPedido = new javax.swing.JMenu();
        MenuPedidoCliente = new javax.swing.JMenuItem();
        menuVerPedidos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 220));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pizza.png"))); // NOI18N
        jLabel1.setText("Cadastrar Sabor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 932;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jLabel1, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Novo Sabor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome");

        caixaTextoNome.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipo Pizza");

        jPanel3.setOpaque(false);

        botaoLimpar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        botaoLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/broom.png"))); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(this::botaoLimparActionPerformed);

        botaoAdicionar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        botaoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        botaoAdicionar.setText("Criar");
        botaoAdicionar.addActionListener(this::botaoAdicionarActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botaoAdicionar, botaoLimpar});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoAdicionar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        comboTipoPizza.addActionListener(this::comboTipoPizzaActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caixaTextoNome)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboTipoPizza, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboTipoPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 362, 61, 0);
        jPanel1.add(jPanel2, gridBagConstraints);
        jPanel2.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new java.awt.GridBagConstraints());

        MenuClientes.setText("Clientes");

        MenuClientesCadastrados.setText("Clientes Cadastrados");
        MenuClientesCadastrados.addActionListener(this::MenuClientesCadastradosActionPerformed);
        MenuClientes.add(MenuClientesCadastrados);

        jMenuBar1.add(MenuClientes);

        MenuCadastrarSabor.setText("Sabor");

        MenuAtualizarPreco.setText("Atualizar Preço");
        MenuAtualizarPreco.addActionListener(this::MenuAtualizarPrecoActionPerformed);
        MenuCadastrarSabor.add(MenuAtualizarPreco);

        MenuCadastrarSabor1.setText("Cadastrar Sabor");
        MenuCadastrarSabor1.addActionListener(this::MenuCadastrarSabor1ActionPerformed);
        MenuCadastrarSabor.add(MenuCadastrarSabor1);

        jMenuBar1.add(MenuCadastrarSabor);

        MenuPedido.setText("Pedido");

        MenuPedidoCliente.setText("Pedido Cliente");
        MenuPedidoCliente.addActionListener(this::MenuPedidoClienteActionPerformed);
        MenuPedido.add(MenuPedidoCliente);

        menuVerPedidos.setText("Visualizar Pedidos");
        menuVerPedidos.addActionListener(this::menuVerPedidosActionPerformed);
        MenuPedido.add(menuVerPedidos);

        jMenuBar1.add(MenuPedido);

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
    //Limpa campo nome
    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        caixaTextoNome.setText("");

    }//GEN-LAST:event_botaoLimparActionPerformed
    
    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        String nomeSabor = caixaTextoNome.getText();
        String tipo = (String) comboTipoPizza.getSelectedItem();
        BancoDados bd = BancoDados.getInstance();
        //caso campo nome em branco
        if(nomeSabor.isEmpty()|| tipo.isEmpty()){
            JOptionPane.showMessageDialog(this,"Existem campos em branco por favor preencha todos os campos","",JOptionPane.ERROR_MESSAGE);
            return;
        }
        //verifica se ja existe aquela sabor
        for(int j = 0; j< bd.getListaSabor().size();j++){
            Sabor s = bd.getListaSabor().get(j);
            if(s.getSabor().equals(nomeSabor)){
                JOptionPane.showMessageDialog(this,"Sabor ja cadastrado","",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        try{
            for(int i = 0; i < bd.getListaTipo().size();i++){
                TipoPizza tipop = bd.getListaTipo().get(i);
                if(tipop.getCategoria().equals(tipo)){
                    Sabor sabor = new Sabor(nomeSabor,tipop);
                    bd.getListaSabor().add(sabor);
                    JOptionPane.showMessageDialog(this,"Sabor Adicionado");
                    return;
                }
            }
        }
        //para garantir que so tenham letras no nome do sabor
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Somentes letras podem ser utilizadas para nome do sabor","",JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this,"Erro ao encontrar o tipo","",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void comboTipoPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoPizzaActionPerformed
        
    }//GEN-LAST:event_comboTipoPizzaActionPerformed

    private void MenuClientesCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClientesCadastradosActionPerformed
        CadastrarCliente cc = new CadastrarCliente();
        cc.setVisible(true);
    }//GEN-LAST:event_MenuClientesCadastradosActionPerformed

    private void MenuAtualizarPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAtualizarPrecoActionPerformed
        AtualizarPreco atualizar = new AtualizarPreco();
        atualizar.setVisible(true);
    }//GEN-LAST:event_MenuAtualizarPrecoActionPerformed

    private void MenuCadastrarSabor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarSabor1ActionPerformed
        CadastrarSabor cs = new CadastrarSabor();
        cs.setVisible(true);
    }//GEN-LAST:event_MenuCadastrarSabor1ActionPerformed

    private void MenuPedidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPedidoClienteActionPerformed
        RealizarPedido rp = new RealizarPedido();
        rp.setVisible(true);
    }//GEN-LAST:event_MenuPedidoClienteActionPerformed

    private void menuVerPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerPedidosActionPerformed
        VisualizarPedidos vp = new VisualizarPedidos();
        vp.setVisible(true);
    }//GEN-LAST:event_menuVerPedidosActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new CadastrarSabor().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAtualizarPreco;
    private javax.swing.JMenu MenuCadastrarSabor;
    private javax.swing.JMenuItem MenuCadastrarSabor1;
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenuItem MenuClientesCadastrados;
    private javax.swing.JMenu MenuPedido;
    private javax.swing.JMenuItem MenuPedidoCliente;
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JTextField caixaTextoNome;
    private javax.swing.JComboBox<String> comboTipoPizza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JMenuItem menuVerPedidos;
    // End of variables declaration//GEN-END:variables
}
