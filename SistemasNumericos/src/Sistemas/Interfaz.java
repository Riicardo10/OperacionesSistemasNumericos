package Sistemas;
import javax.swing.JOptionPane;
public class Interfaz extends javax.swing.JFrame {
    public Interfaz() {
        initComponents();
        setLocationRelativeTo(this);
    }
    Operaciones metodos = new Operaciones();
    int resultadoBass, resbas, r;
    int num1, num2, resultado, dato1, dato2, base1, base2;
    String operacion, bas1, bas2, original;
    String errores = "";
    String errorBas = "";
    String decimal1, decimal2;
    public void limpiarCampos(){
        txtDato1.setText(null);
        txtDato2.setText(null);
        lblNumero1.setText(null);
        lblNumero2.setText(null);
        txtResultado.setText(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboOperacion = new javax.swing.JComboBox();
        txtDato1 = new javax.swing.JTextField();
        txtDato2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxBase1 = new javax.swing.JComboBox();
        bttAceptar = new javax.swing.JButton();
        bttSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxBase2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxResultadoBase = new javax.swing.JComboBox();
        bttVaciar = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        lblNumero1 = new javax.swing.JLabel();
        lblNumero2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblRes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(":::OPERACIONES DE SISTEMAS::");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Introduce datos:"));

        jComboOperacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "+", "-", "*", "/" }));

        txtDato1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDato1KeyTyped(evt);
            }
        });

        txtDato2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDato2KeyTyped(evt);
            }
        });

        jLabel1.setText("Base:");

        jComboBoxBase1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        bttAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ok.gif"))); // NOI18N
        bttAceptar.setText("Ok");
        bttAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAceptarActionPerformed(evt);
            }
        });

        bttSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eye.png"))); // NOI18N
        bttSalir.setText("Salir");
        bttSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("Base:");

        jComboBoxBase2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel3.setText("Operacion a efectuar:");

        jLabel4.setText("Resultado en base:");

        jComboBoxResultadoBase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        bttVaciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/clear.png"))); // NOI18N
        bttVaciar.setText("Limpiar");
        bttVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVaciarActionPerformed(evt);
            }
        });

        txtResultado.setFocusable(false);

        jLabel5.setText("Decimal 1");

        jLabel6.setText("Decimal 2");

        lblRes.setText(":::RESULTADO:::");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxResultadoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bttAceptar))
                                    .addComponent(jComboOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bttVaciar)
                                .addGap(26, 26, 26)
                                .addComponent(bttSalir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxBase2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDato2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxBase1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDato1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(lblRes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxBase1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxBase2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxResultadoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttAceptar))
                .addGap(18, 18, 18)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblRes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttVaciar)
                    .addComponent(bttSalir)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDato1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDato1KeyTyped
        int c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtDato1KeyTyped
    private void txtDato2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDato2KeyTyped
        int c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtDato2KeyTyped
    private void bttAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAceptarActionPerformed
        try{          
            decimal1 = txtDato1.getText();
            decimal2 = txtDato2.getText();
            if(decimal1.length() == 0){
                errores += "\t-Ingrese numero 1\n";
            }
            if(decimal2.length() == 0){
                errores += "\t-Ingrese numero 2";
            }
            if(!(errores.length() == 0)){
                JOptionPane.showMessageDialog(null, "ERROR:\n" + errores, "MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE); // ...
            }
            else{
                resultado = 0;
                boolean bandera = true;
                dato1 = Integer.parseInt(decimal1);
                bas1 = jComboBoxBase1.getSelectedItem().toString();
                base1 = Integer.parseInt(bas1);
                if(!metodos.validar(dato1, base1)){
                    errores += "\t-Verificar numero 1. Base invalida\n";
                    lblNumero1.setText("");
                    bandera = false;
                }
                dato2 = Integer.parseInt(decimal2);
                bas2 = jComboBoxBase2.getSelectedItem().toString();
                base2 = Integer.parseInt(bas2);
                if(!metodos.validar(dato2, base2)){
                    errores += "\t-Verificar numero 2. Base invalida";
                    lblNumero2.setText("");
                    bandera = false;
                }
                if(bandera){
                    num1 = metodos.convertirNumeroDecimal(dato1, base1);
                    num2 = metodos.convertirNumeroDecimal(dato2, base2);
                    lblNumero1.setText(num1 + "");
                    lblNumero2.setText(num2 + "");
                    operacion = jComboOperacion.getSelectedItem().toString();
                    if(operacion.equals("+")){
                        resultado = metodos.suma(num1, num2);
                    }
                    if(operacion.equals("-")){
                        resultado = metodos.resta(num1, num2);
                    }
                    if(operacion.equals("*")){
                        resultado = metodos.multiplicacion(num1, num2);
                    }
                    if(operacion.equals("/")){
                        resultado = metodos.divisionSistema(num1, num2);
                    }
                    String resultadoBase = jComboBoxResultadoBase.getSelectedItem().toString();
                    resultadoBass = Integer.parseInt(resultadoBase);
                    original = metodos.convertidor(resultado, resultadoBass);
                    txtResultado.setText(original);
                    resbas = jComboBoxResultadoBase.getSelectedIndex();
                    r = metodos.convertirNumeroDecimal(Integer.parseInt(original), (resbas+2));
                    lblRes.setText(r + "");
                }
                else{
                    JOptionPane.showMessageDialog(null, ":::ERROR:::\n" + errores, "MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE);
                    txtResultado.setText(null);
                    lblRes.setText("");
                }
            }
        }
        catch(Exception e){}
        errorBas = "";
        errores = "";
    }//GEN-LAST:event_bttAceptarActionPerformed
    private void bttSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalirActionPerformed
        Object opcion[] = {"SI", "NO"};
        int salir = JOptionPane.showOptionDialog(null, "¿REALMENTE DESEA SALIR?", ":::MENSAJE DE SALIDA:::",
            JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_CANCEL_OPTION, null, opcion, 0);
        if(salir == 0){
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_bttSalirActionPerformed
    private void bttVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVaciarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_bttVaciarActionPerformed
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAceptar;
    private javax.swing.JButton bttSalir;
    private javax.swing.JButton bttVaciar;
    private javax.swing.JComboBox jComboBoxBase1;
    private javax.swing.JComboBox jComboBoxBase2;
    private javax.swing.JComboBox jComboBoxResultadoBase;
    private javax.swing.JComboBox jComboOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblNumero2;
    private javax.swing.JLabel lblRes;
    private javax.swing.JTextField txtDato1;
    private javax.swing.JTextField txtDato2;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}