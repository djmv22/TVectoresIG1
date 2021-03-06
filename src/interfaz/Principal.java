/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author DanielDeJesus
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    double v[];
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdElementoMayor = new javax.swing.JButton();
        cmdElementoMenor = new javax.swing.JButton();
        cmdProductoria = new javax.swing.JButton();
        cmdSumatoria = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLongitudVector = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenarManual = new javax.swing.JButton();
        cmdLlenarAuto = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        cmbOperaciones = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        cmdElementoMayor.setText("Elemento Mayor");

        cmdElementoMenor.setText("Elemento Menor");

        cmdProductoria.setText("Productoria");
        cmdProductoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdProductoriaActionPerformed(evt);
            }
        });

        cmdSumatoria.setText("Sumatoria");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel1.setText("Ejercicio Número 1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Longitud del vector:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtLongitudVector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudVectorKeyTyped(evt);
            }
        });
        jPanel2.add(txtLongitudVector, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 240, 70));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 27, 110, -1));

        cmdLlenarManual.setText("Llenar Manual");
        cmdLlenarManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenarManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 110, -1));

        cmdLlenarAuto.setText("Llenar Auto");
        cmdLlenarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarAutoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenarAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 110, -1));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 110, -1));

        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sumatoria", "Productoria", "Elemento Mayor", "Elemento Menor" }));
        jPanel3.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 110, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 160, 220));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane2.setViewportView(txtResultado);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 230, 120));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 260, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdProductoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdProductoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdProductoriaActionPerformed

    private void txtLongitudVectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudVectorKeyTyped
        char c=evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtLongitudVectorKeyTyped

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int longitud;
        
        if(txtLongitudVector.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite la longitud", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitudVector.requestFocusInWindow();
        }
        else if(Integer.parseInt(txtLongitudVector.getText().trim())==0){
            JOptionPane.showMessageDialog(this, "La longitud no puede ser 0", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitudVector.requestFocusInWindow();
            txtLongitudVector.selectAll();
        }
        else{
            longitud = Integer.parseInt(txtLongitudVector.getText().trim());
            v = new double[longitud];
            JOptionPane.showMessageDialog(this, "Vector Creado Exitosamente");
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenarManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarManualActionPerformed
        double n;
        for (int i = 0; i < v.length; i++) {
            n = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el elemento en la posicion: "+i));
            v[i]=n;
        }
    }//GEN-LAST:event_cmdLlenarManualActionPerformed

    private void cmdLlenarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarAutoActionPerformed
         double n;
        for (int i = 0; i < v.length; i++) {
            n = (int)(Math.random()* 50 + 1);
            v[i]=n;
        }
        JOptionPane.showMessageDialog(this, "Vector Llenado Correctamente");
    }//GEN-LAST:event_cmdLlenarAutoActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        String res;
        int op;
        double sumatoria=0,productoria=1,resultado=0;
        
        op = cmbOperaciones.getSelectedIndex();
        switch(op){
            case 0:
                for (int i = 0; i < v.length; i++) {
                     sumatoria=sumatoria+v[i];
                }
                resultado = sumatoria;
                break;
            case 1:
                for (int i = 0; i < v.length; i++) {
                    productoria=productoria*v[i];
                }
                resultado = productoria;
                break;
            case 2:
                for (int i = 0; i < v.length; i++) {
                    if(v[1]<v[i]){
                       v[1]=v[i];    
            } 
                }
                resultado = v[1];
                break;
            case 3:
                for (int i = 0; i < v.length; i++) {
                    if(v[0]>v[i]){
                     v[0]=v[i];
            }  
                }
                resultado = v[0];
                break;
        }
        
        res = String.valueOf(resultado);
        txtResultado.setText(res);
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtLongitudVector.setText("");
        txtResultado.setText("");
        v=null;
        
        cmbOperaciones.setSelectedIndex(0);        
        txtLongitudVector.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperaciones;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdElementoMayor;
    private javax.swing.JButton cmdElementoMenor;
    private javax.swing.JButton cmdLlenarAuto;
    private javax.swing.JButton cmdLlenarManual;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdProductoria;
    private javax.swing.JButton cmdSumatoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtLongitudVector;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
