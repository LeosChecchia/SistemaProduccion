/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import java.awt.Dimension;
import javax.swing.JDesktopPane;

/**
 *
 * @author Leoch
 */
public class FrmMenu extends javax.swing.JFrame {
    
    public static JDesktopPane jDesktopPane_menu;

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        this.setSize(1200, 700);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Producción");
        
        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0,0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_nuevo_usuario = new javax.swing.JMenuItem();
        jMenuItem_gestionar_usuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_nuevo_menu = new javax.swing.JMenuItem();
        jMenuItem_gestionar_producto = new javax.swing.JMenuItem();
        jMenuItem_actualizar_stock = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_nuevo_cliente = new javax.swing.JMenuItem();
        jMenuItem_gestionar_clientes = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_nueva_categoria = new javax.swing.JMenuItem();
        jMenuItem_gestionar_categoria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_nueva_venta = new javax.swing.JMenuItem();
        jMenuItem_gestionar_ventas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_reportes_clientes = new javax.swing.JMenuItem();
        jMenuItem_reportes_categorias = new javax.swing.JMenuItem();
        jMenuItem_reportes_productos = new javax.swing.JMenuItem();
        jMenuItem_reportes_ventas = new javax.swing.JMenuItem();
        jMenu_ver_historial = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem_cerrar_sesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jMenuItem_nuevo_usuario.setText("Nuevo Usuario");
        jMenu1.add(jMenuItem_nuevo_usuario);

        jMenuItem_gestionar_usuario.setText("Gestionar Usuario");
        jMenu1.add(jMenuItem_gestionar_usuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenu2.setText("Producto");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jMenuItem_nuevo_menu.setText("Nuevo Producto");
        jMenu2.add(jMenuItem_nuevo_menu);

        jMenuItem_gestionar_producto.setText("Gestionar Producto");
        jMenu2.add(jMenuItem_gestionar_producto);

        jMenuItem_actualizar_stock.setText("Actualizar Stock");
        jMenu2.add(jMenuItem_actualizar_stock);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenu3.setText("Cliente");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jMenuItem_nuevo_cliente.setText("Nuevo Cliente");
        jMenuItem_nuevo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_nuevo_cliente);

        jMenuItem_gestionar_clientes.setText("Gestionar Clientes");
        jMenu3.add(jMenuItem_gestionar_clientes);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenu4.setText("Categoría");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jMenuItem_nueva_categoria.setText("Nueva Categoria");
        jMenu4.add(jMenuItem_nueva_categoria);

        jMenuItem_gestionar_categoria.setText("Gestionar Categoria");
        jMenu4.add(jMenuItem_gestionar_categoria);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        jMenu5.setText("Facturar");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jMenuItem_nueva_venta.setText("Nueva Venta");
        jMenuItem_nueva_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_ventaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_nueva_venta);

        jMenuItem_gestionar_ventas.setText("Gestionar Ventas");
        jMenu5.add(jMenuItem_gestionar_ventas);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jMenuItem_reportes_clientes.setText("Reportes Clientes");
        jMenu6.add(jMenuItem_reportes_clientes);

        jMenuItem_reportes_categorias.setText("Reportes Categorías");
        jMenu6.add(jMenuItem_reportes_categorias);

        jMenuItem_reportes_productos.setText("Reportes Productos");
        jMenu6.add(jMenuItem_reportes_productos);

        jMenuItem_reportes_ventas.setText("Reportes Ventas");
        jMenu6.add(jMenuItem_reportes_ventas);

        jMenuBar1.add(jMenu6);

        jMenu_ver_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenu_ver_historial.setText("Historial");
        jMenu_ver_historial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jMenuItem16.setText("Ver Historial");
        jMenu_ver_historial.add(jMenuItem16);

        jMenuBar1.add(jMenu_ver_historial);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenu8.setText("Cerrar Sesión");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_cerrar_sesion.setText("Cerrar Sesión");
        jMenu8.add(jMenuItem_cerrar_sesion);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_nuevo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_nuevo_clienteActionPerformed

    private void jMenuItem_nueva_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_nueva_ventaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem_actualizar_stock;
    private javax.swing.JMenuItem jMenuItem_cerrar_sesion;
    private javax.swing.JMenuItem jMenuItem_gestionar_categoria;
    private javax.swing.JMenuItem jMenuItem_gestionar_clientes;
    private javax.swing.JMenuItem jMenuItem_gestionar_producto;
    private javax.swing.JMenuItem jMenuItem_gestionar_usuario;
    private javax.swing.JMenuItem jMenuItem_gestionar_ventas;
    private javax.swing.JMenuItem jMenuItem_nueva_categoria;
    private javax.swing.JMenuItem jMenuItem_nueva_venta;
    private javax.swing.JMenuItem jMenuItem_nuevo_cliente;
    private javax.swing.JMenuItem jMenuItem_nuevo_menu;
    private javax.swing.JMenuItem jMenuItem_nuevo_usuario;
    private javax.swing.JMenuItem jMenuItem_reportes_categorias;
    private javax.swing.JMenuItem jMenuItem_reportes_clientes;
    private javax.swing.JMenuItem jMenuItem_reportes_productos;
    private javax.swing.JMenuItem jMenuItem_reportes_ventas;
    private javax.swing.JMenu jMenu_ver_historial;
    // End of variables declaration//GEN-END:variables
}
