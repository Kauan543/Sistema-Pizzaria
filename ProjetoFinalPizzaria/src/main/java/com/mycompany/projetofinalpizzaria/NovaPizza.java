/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetofinalpizzaria;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kauan
 */
public class NovaPizza extends javax.swing.JFrame {
    //gerado pelo Netbeans
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(NovaPizza.class.getName());
    //variavel pra guardar preço total da pizza
    private double precoTotalCalculado = 0.0;
    //variavel pra guarda a referencia da tela de pedidos
    private RealizarPedido telaPedido;
    //construtor com a referencia da tela de realizar pedido, para no futuro atualiza a tabela 
    public NovaPizza(RealizarPedido telaPedido) {
        //guarda a referencia da tela na variavel 
        this.telaPedido = telaPedido;
        initComponents();
        //preenche ambos os combos sabor
        preencherComboSabor();  
        //desabilita tudo q nao eh necessario inicialmente
        MenuPedidoCliente.setEnabled(false);
        caixaTextoLado.setEnabled(false);
        caixaTextoArea.setEnabled(false);
        comboSabor1.setEnabled(false);
        comboSabor2.setEnabled(false);
        //Cria ButtonGroups para forma
        ButtonGroup grupoForma = new ButtonGroup();
        grupoForma.add(CheckQuadrada); 
        grupoForma.add(CheckCircular); 
        grupoForma.add(CheckTriangular); 
        //Cria ButtonGroups para formas
        ButtonGroup grupoDefinicao = new ButtonGroup();
        grupoDefinicao.add(CheckDimensao); 
        grupoDefinicao.add(CheckArea); 
        //Cria ButtonGroups para sabores
        ButtonGroup grupoSabores = new ButtonGroup();
        grupoSabores.add(CheckSabor1); 
        grupoSabores.add(CheckSabor2);   
    }
    private double obterPrecoPorCm2(String nomeSabor) {
        if (nomeSabor == null){
            return 0.0;
        }
        BancoDados bd = BancoDados.getInstance();
        //busca preço por cm² no bd
        for (int i = 0; i < bd.getListaSabor().size(); i++) {
            if (bd.getListaSabor().get(i).getSabor().equals(nomeSabor)) {
                return bd.getListaSabor().get(i).getTipo().getPrecoPorCentimentroQuadrado(); 
            }
        }
        return 0;
    }
    
    private void calcularPreco() {
    try { 
        double area = 0.0;
        double valorTotal = 0.0;
        double precoPorCmQuadrado =0.0;
        Forma f;
        if (comboSabor1.getSelectedItem() != null) {
            String nomeSabor1 = comboSabor1.getSelectedItem().toString();
            double precoSabor1 = obterPrecoPorCm2(nomeSabor1);
            if (CheckSabor2.isSelected() && comboSabor2.getSelectedItem() != null) {
                //caso escolha 2 sabores
                String nomeSabor2 = comboSabor2.getSelectedItem().toString();
                double precoSabor2 = obterPrecoPorCm2(nomeSabor2);
                precoPorCmQuadrado = (precoSabor1 + precoSabor2) / 2.0;
            } else {
                //caso escolha 1 sabor
                precoPorCmQuadrado = precoSabor1;
            }
        }
        // caso escolha por area
        if (CheckArea.isSelected() && !caixaTextoArea.getText().isEmpty()) {
            area = Double.parseDouble(caixaTextoArea.getText());
            double lado = 0;
            if (CheckQuadrada.isSelected()) {
                Quadrado q = new Quadrado();
                lado = q.calcularLadoQuadrado(area);
            } else if (CheckCircular.isSelected()) {
                Circulo c = new Circulo();
                lado = c.calcularRaioCirculo(area);
            } else if (CheckTriangular.isSelected()) {
                Triangulo t = new Triangulo();
                lado = t.calcularLadoTriangulo(area);
            }
            //para garantir q apareça com no maximo 2 numeros depois da virgula
            lugarMedidaFinal.setText(String.format("Medida = %.2f", lado));
            
        } 
        //caso escolha por dimensao
        else if (CheckDimensao.isSelected() && !caixaTextoLado.getText().isEmpty()) {
            double dimensao = Double.parseDouble(caixaTextoLado.getText());
            
            if (CheckQuadrada.isSelected()) {
                f = new Quadrado(dimensao);
                area = f.calculaArea();
            } else if (CheckCircular.isSelected()) {
                f = new Circulo(dimensao);
                area = f.calculaArea();
            } else if (CheckTriangular.isSelected()) {
                f = new Triangulo(dimensao);
                area = f.calculaArea();
            }
            //para garantir q apareça com no maximo 2 numeros depois da virgula
            lugarMedidaFinal.setText(String.format("Area = %.2f", area));
        }
        //calcula valor total
        valorTotal = area * precoPorCmQuadrado;
        //salva na variavel o valor
        this.precoTotalCalculado = valorTotal;
        //para garantir q apareça com no maximo 2 numeros depois da virgula
        lugarPreco.setText(String.format("Preço: R$: %.2f", valorTotal));

    } catch (NumberFormatException e) {
        //caso alguma informação falte
        lugarPreco.setText("Preço: R$: 0.00");
    }
    catch(Exception e ){
        //caso ultrapasse limite das dimensões
        JOptionPane.showMessageDialog(this,"Limite das dimensão não se enquadra","",JOptionPane.ERROR_MESSAGE);
    }
}

    //para ver se ja existe sabor no combo e nao ficar preenchendo varias vezes
    private boolean itemExiste(javax.swing.JComboBox<String> combo, String item) {
        for (int i = 0; i < combo.getItemCount(); i++) {
            if (combo.getItemAt(i).equals(item)) {
                return true;
            }
        }
        return false;
    }
    //para preencher combos de sabor
    public void preencherComboSabor() {
        BancoDados bd = BancoDados.getInstance();
        for (int i = 0; i < bd.getListaSabor().size(); i++) {
            String sabor = bd.getListaSabor().get(i).getSabor();
            if (!itemExiste(comboSabor1, sabor)) {
                comboSabor1.addItem(sabor);
            }
            if (!itemExiste(comboSabor2, sabor)) {
                comboSabor2.addItem(sabor);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CheckQuadrada = new javax.swing.JRadioButton();
        CheckCircular = new javax.swing.JRadioButton();
        CheckTriangular = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CheckDimensao = new javax.swing.JRadioButton();
        CheckArea = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        caixaTextoLado = new javax.swing.JTextField();
        lugarMedida = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        caixaTextoArea = new javax.swing.JTextField();
        lugarArea = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboSabor2 = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        comboSabor1 = new javax.swing.JComboBox<>();
        CheckSabor1 = new javax.swing.JRadioButton();
        CheckSabor2 = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        lugarPreco = new javax.swing.JLabel();
        lugarMedidaFinal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuClientes = new javax.swing.JMenu();
        MenuClientesCadastrados = new javax.swing.JMenuItem();
        MenuCadastrarSabor = new javax.swing.JMenu();
        MenuAtualizarPreco = new javax.swing.JMenuItem();
        MenuCadastrarSabor1 = new javax.swing.JMenuItem();
        MenuPedido = new javax.swing.JMenu();
        MenuPedidoCliente = new javax.swing.JMenuItem();
        menuVerPedidos = new javax.swing.JMenuItem();

        jLabel2.setText("jLabel2");

        jLabel4.setText("jLabel4");

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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pizza.png"))); // NOI18N
        jLabel1.setText("Nova Pizza");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Montar Pizza", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setOpaque(false);

        jPanel4.setBackground(new java.awt.Color(255, 153, 51));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jPanel3.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Forma da Pizza:");

        CheckQuadrada.setText("Quadrada");
        CheckQuadrada.addActionListener(this::CheckQuadradaActionPerformed);

        CheckCircular.setText("Circular");
        CheckCircular.addActionListener(this::CheckCircularActionPerformed);

        CheckTriangular.setText("Triangular");
        CheckTriangular.addActionListener(this::CheckTriangularActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CheckQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(CheckCircular, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckQuadrada)
                    .addComponent(CheckCircular)
                    .addComponent(CheckTriangular))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel5.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Definir Por:");

        CheckDimensao.setText("Dimensão");
        CheckDimensao.addActionListener(this::CheckDimensaoActionPerformed);

        CheckArea.setText("Área (Cm²)");
        CheckArea.addActionListener(this::CheckAreaActionPerformed);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CheckDimensao, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(CheckArea, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckDimensao)
                    .addComponent(CheckArea))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel6.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Lado da forma (Cm):");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        caixaTextoLado.addActionListener(this::caixaTextoLadoActionPerformed);

        lugarMedida.setBackground(new java.awt.Color(245, 245, 220));
        lugarMedida.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lugarMedida.setForeground(new java.awt.Color(51, 51, 51));
        lugarMedida.setText("Max: | Min:");
        lugarMedida.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(caixaTextoLado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lugarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaTextoLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lugarMedida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Área (Cm²):");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        lugarArea.setBackground(new java.awt.Color(245, 245, 220));
        lugarArea.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lugarArea.setForeground(new java.awt.Color(51, 51, 51));
        lugarArea.setText("Max:1600cm² | Min: 100cm²");
        lugarArea.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(caixaTextoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lugarArea))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaTextoArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lugarArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Sabor(es) (até 2): ");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Sabor 1: ");

        comboSabor2.addActionListener(this::comboSabor2ActionPerformed);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Sabor 2: ");

        comboSabor1.addActionListener(this::comboSabor1ActionPerformed);

        CheckSabor1.setText("1");
        CheckSabor1.addActionListener(this::CheckSabor1ActionPerformed);

        CheckSabor2.setText("2");
        CheckSabor2.addActionListener(this::CheckSabor2ActionPerformed);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CheckSabor1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboSabor1, 0, 229, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboSabor2, 0, 241, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(CheckSabor2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckSabor1)
                    .addComponent(CheckSabor2))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboSabor2)
                            .addComponent(comboSabor1))
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(new javax.swing.border.MatteBorder(null));

        lugarPreco.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lugarPreco.setForeground(new java.awt.Color(0, 0, 0));
        lugarPreco.setText("Preço: R$:0.00 ");

        lugarMedidaFinal.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lugarMedidaFinal.setForeground(new java.awt.Color(0, 0, 0));
        lugarMedidaFinal.setText("Área ou lado :");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lugarPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lugarMedidaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lugarPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lugarMedidaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/confirm.png"))); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/close.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addGap(103, 103, 103)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addGap(129, 129, 129))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(236, 236, 236))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        preencherComboSabor();
    }//GEN-LAST:event_formWindowActivated

    private void comboSabor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSabor2ActionPerformed
        calcularPreco();
    }//GEN-LAST:event_comboSabor2ActionPerformed

    private void comboSabor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSabor1ActionPerformed
        calcularPreco();
    }//GEN-LAST:event_comboSabor1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CheckTriangularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckTriangularActionPerformed
        //mostra max e min de triangulo
        if(!CheckArea.isSelected()){
            lugarMedida.setText("Max:60 | Min:20");
        }
        calcularPreco();
    }//GEN-LAST:event_CheckTriangularActionPerformed

    private void CheckAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckAreaActionPerformed
        caixaTextoLado.setEnabled(false);
        caixaTextoArea.setEnabled(true);
        lugarMedidaFinal.setText("Área ou lado :");
        caixaTextoLado.setText("");
        //mostra max e min de area
        lugarArea.setText("Max:1600cm² | Min: 100cm²");
        lugarMedida.setText("Max: | Min:");
        calcularPreco();
    }//GEN-LAST:event_CheckAreaActionPerformed

    private void CheckSabor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckSabor2ActionPerformed
        comboSabor2.setEnabled(true);
        comboSabor1.setEnabled(true);
        //habilita os dois combos
        calcularPreco();
        lugarMedida.setText("Max: | Min:");
    }//GEN-LAST:event_CheckSabor2ActionPerformed

    private void CheckDimensaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckDimensaoActionPerformed
        caixaTextoLado.setEnabled(true);
        caixaTextoArea.setEnabled(false);
        lugarMedidaFinal.setText("Área ou lado :");
        caixaTextoArea.setText("");
        //mostra max e min da forma escolhida
        if (CheckQuadrada.isSelected()) {
            lugarMedida.setText("Max:40 | Min:10");
        } 
        else if (CheckCircular.isSelected()) {
            lugarMedida.setText("Max:23 | Min:7");
        } 
        else if (CheckTriangular.isSelected()) {
            lugarMedida.setText("Max:60 | Min:20");
        }
        lugarArea.setText("Max: | Min:");
        calcularPreco();
    }//GEN-LAST:event_CheckDimensaoActionPerformed
    private void caixaTextoLadoKeyReleased(java.awt.event.KeyEvent evt) {                                           
        calcularPreco();
    }
    private void caixaTextoAreaKeyReleased(java.awt.event.KeyEvent evt) {                                           
        calcularPreco();
    }
    private void CheckSabor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckSabor1ActionPerformed
        //habilita combo 1 e desabilita o 2 
        comboSabor1.setEnabled(true);
        comboSabor2.setEnabled(false);
        calcularPreco();
    }//GEN-LAST:event_CheckSabor1ActionPerformed

    private void CheckQuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckQuadradaActionPerformed
        //mostra max e min de quadrado
        if(!CheckArea.isSelected()){
            lugarMedida.setText("Max:40 | Min:10");
        }
        calcularPreco();
    }//GEN-LAST:event_CheckQuadradaActionPerformed

    private void CheckCircularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckCircularActionPerformed
        //mostra max e min de circulo
        if(!CheckArea.isSelected()){
            lugarMedida.setText("Max:23 | Min:7");
        }
        calcularPreco();
    }//GEN-LAST:event_CheckCircularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (precoTotalCalculado == 0.0) {
            JOptionPane.showMessageDialog(this, "Calcule o preço preenchendo as dimensões corretamente antes de confirmar.");
            return;
        }
        double area = 0.0;
        Forma f = null;
        try{
                //caso escolha por area
            if (CheckArea.isSelected() && !caixaTextoArea.getText().isEmpty()) {
                area = Double.parseDouble(caixaTextoArea.getText());
                double lado = 0;
                //instacia a forma de acordo com a escolha
                if (CheckQuadrada.isSelected()) {
                    f = new Quadrado();
                } else if (CheckCircular.isSelected()) {
                    f = new Circulo();
                } else if (CheckTriangular.isSelected()) {
                    f = new Triangulo();
                }
                else{
                    //para evitar exceção
                    JOptionPane.showMessageDialog(this,"Não possivel criar uma pizza sem escolher um formato","",JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
                //caso escolha por medida
            else if(CheckDimensao.isSelected() && !caixaTextoLado.getText().isEmpty()){
                double dimensao = Double.parseDouble(caixaTextoLado.getText());
                //instacia a forma de acordo com a escolha
                if (CheckQuadrada.isSelected()) {
                    f = new Quadrado(dimensao);
                } else if (CheckCircular.isSelected()) {
                    f = new Circulo(dimensao);
                } else if (CheckTriangular.isSelected()) {
                    f = new Triangulo(dimensao);
                }
                else{
                    //para evitar exceção
                    JOptionPane.showMessageDialog(this,"Não possivel criar uma pizza sem escolher um formato","",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                area = f.calculaArea();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro ao instaciar forma");
        }
        ArrayList<Sabor> sabores = new ArrayList<>();
        //para adicionar o sabor(es) no array list
        if (comboSabor1.getSelectedItem() != null) {
            String nome1 = comboSabor1.getSelectedItem().toString();
            Sabor sabor1= new Sabor(nome1);
            sabores.add(sabor1);
        }
        if (CheckSabor2.isSelected() && comboSabor2.getSelectedItem() != null) {
            String nome2 = comboSabor2.getSelectedItem().toString();
            Sabor sabor2= new Sabor(nome2);
            sabores.add(sabor2);
        }
        //cria pizza
        Pizza pizza = new Pizza(area,f,sabores);
        if (this.telaPedido != null) {
            //pega referencia da tela e usa o metodo atualizar tabela passando as informações da pizza
            this.telaPedido.atualizarTabela(pizza, precoTotalCalculado, area);
        }
        //fecha tela
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void caixaTextoLadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoLadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoLadoActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new NovaPizza(null).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CheckArea;
    private javax.swing.JRadioButton CheckCircular;
    private javax.swing.JRadioButton CheckDimensao;
    private javax.swing.JRadioButton CheckQuadrada;
    private javax.swing.JRadioButton CheckSabor1;
    private javax.swing.JRadioButton CheckSabor2;
    private javax.swing.JRadioButton CheckTriangular;
    private javax.swing.JMenuItem MenuAtualizarPreco;
    private javax.swing.JMenu MenuCadastrarSabor;
    private javax.swing.JMenuItem MenuCadastrarSabor1;
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenuItem MenuClientesCadastrados;
    private javax.swing.JMenu MenuPedido;
    private javax.swing.JMenuItem MenuPedidoCliente;
    private javax.swing.JTextField caixaTextoArea;
    private javax.swing.JTextField caixaTextoLado;
    private javax.swing.JComboBox<String> comboSabor1;
    private javax.swing.JComboBox<String> comboSabor2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lugarArea;
    private javax.swing.JLabel lugarMedida;
    private javax.swing.JLabel lugarMedidaFinal;
    private javax.swing.JLabel lugarPreco;
    private javax.swing.JMenuItem menuVerPedidos;
    // End of variables declaration//GEN-END:variables
}
