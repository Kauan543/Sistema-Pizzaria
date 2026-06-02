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
public class EditarCliente extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(EditarCliente.class.getName());
    private Cliente clienteEmEdicao;
    /**
     * Creates new form EditarCliente
     */
    public EditarCliente() {
        initComponents();
    }
    //construtor criado para ja receber ter o cliente q sera alterado
    public EditarCliente(Cliente cliente) {
        initComponents(); // Sempre chame o initComponents() primeiro!
        this.clienteEmEdicao = cliente;
        caixaTextoNome.setText(cliente.getNome());
        caixaTextoSobrenome.setText(cliente.getSobrenome());
        caixaTextoTelefone.setText(cliente.getTelefone());
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
        caixaTextoSobrenome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        caixaTextoTelefone = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        botaoLimpar = new javax.swing.JButton();
        botaoAdicionar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuClientes = new javax.swing.JMenu();
        MenuClientesCadastrados = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 220));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pencil.png"))); // NOI18N
        jLabel1.setText("Editar Cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 932;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jLabel1, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
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
        botaoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/diskette.png"))); // NOI18N
        botaoAdicionar.setText("Salvar");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caixaTextoNome)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        MenuClientes.setText("Clientes");

        MenuClientesCadastrados.setText("Clientes Cadastrados");
        MenuClientesCadastrados.addActionListener(this::MenuClientesCadastradosActionPerformed);
        MenuClientes.add(MenuClientesCadastrados);

        jMenuBar1.add(MenuClientes);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

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

    private void MenuClientesCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClientesCadastradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuClientesCadastradosActionPerformed

    private void caixaTextoSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoSobrenomeActionPerformed

    private void caixaTextoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoTelefoneActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        caixaTextoNome.setText("");
        caixaTextoSobrenome.setText("");
        caixaTextoTelefone.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        String nome = caixaTextoNome.getText();
        String sobrenome = caixaTextoSobrenome.getText();
        String telefone = caixaTextoTelefone.getText();
        if(nome.isEmpty()|| sobrenome.isEmpty()|| telefone.isEmpty()){
            JOptionPane.showMessageDialog(this,"Existem campos em branco por favor preencha todos os campos","",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            clienteEmEdicao.setNome(nome);
            clienteEmEdicao.setSobrenome(sobrenome);
            clienteEmEdicao.setTelefone(telefone);
            JOptionPane.showMessageDialog(this,"Edição feita com sucesso!");
            
        }
        catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(this,"Telefone invalido","",JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Campo nome e sobrenome so permite letras","",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoAdicionarActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new EditarCliente().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenuItem MenuClientesCadastrados;
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JTextField caixaTextoNome;
    private javax.swing.JTextField caixaTextoSobrenome;
    private javax.swing.JTextField caixaTextoTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
