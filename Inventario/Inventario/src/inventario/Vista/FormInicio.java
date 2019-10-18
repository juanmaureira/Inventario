/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario.Vista;

/**
 *
 * @author juaneduardomaureirallanos
 */
public class FormInicio extends javax.swing.JFrame {

    /**
     * Creates new form FormInicio
     */
    public FormInicio() {
        initComponents();
        this.setTitle("Registro");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuCrearCliente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuCrearProducto = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuCreaeProveedor = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnuIngresarVenta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/esucomex.png"))); // NOI18N

        jMenu1.setText("Archivo");

        mnuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Clientes");

        mnuCrearCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnuCrearCliente.setText("Agregar Cliente");
        mnuCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCrearClienteActionPerformed(evt);
            }
        });
        jMenu2.add(mnuCrearCliente);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Productos");

        mnuCrearProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mnuCrearProducto.setText("Agregar Productos");
        mnuCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCrearProductoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuCrearProducto);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Proveedor");

        mnuCreaeProveedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mnuCreaeProveedor.setText("Agregar Proveedor");
        mnuCreaeProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCreaeProveedorActionPerformed(evt);
            }
        });
        jMenu4.add(mnuCreaeProveedor);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ventas");

        mnuIngresarVenta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        mnuIngresarVenta.setText("Ingresar Venta");
        mnuIngresarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIngresarVentaActionPerformed(evt);
            }
        });
        jMenu5.add(mnuIngresarVenta);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCrearClienteActionPerformed
        Cliente cliente = new Cliente(new javax.swing.JDialog(), rootPaneCheckingEnabled);
        cliente.setVisible(true);
        
    }//GEN-LAST:event_mnuCrearClienteActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCrearProductoActionPerformed
        Producto producto = new Producto(this, rootPaneCheckingEnabled);
        producto.setVisible(true);
    }//GEN-LAST:event_mnuCrearProductoActionPerformed

    private void mnuCreaeProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCreaeProveedorActionPerformed
        Proveedor proveedor = new Proveedor(this, rootPaneCheckingEnabled);
        proveedor.setVisible(true);
    }//GEN-LAST:event_mnuCreaeProveedorActionPerformed

    private void mnuIngresarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIngresarVentaActionPerformed
        Venta venta = new Venta(this, rootPaneCheckingEnabled);
        venta.setVisible(true);
    }//GEN-LAST:event_mnuIngresarVentaActionPerformed

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
            java.util.logging.Logger.getLogger(FormInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuCreaeProveedor;
    private javax.swing.JMenuItem mnuCrearCliente;
    private javax.swing.JMenuItem mnuCrearProducto;
    private javax.swing.JMenuItem mnuIngresarVenta;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}