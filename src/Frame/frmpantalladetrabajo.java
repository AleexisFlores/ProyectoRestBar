/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import AppPackage.AnimationClass;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author root
 */
public class frmpantalladetrabajo extends javax.swing.JFrame {

    /**
     * Creates new form frmpantalladetrabajo
     */
    public frmpantalladetrabajo() {
        initComponents();
          tabla t=new tabla();
     
//     t.ver_tabla(tabla);
    
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        jTable1.setRowSorter(new TableRowSorter(model));
    }

    /**TableModel
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        AgregarOrden = new javax.swing.JMenuItem();
        Imprimir = new javax.swing.JMenuItem();
        Modificar = new javax.swing.JMenuItem();
        cobrar = new javax.swing.JMenuItem();
        Nuevo = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblme = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lbladmin = new javax.swing.JLabel();
        lblventas = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        AgregarOrden.setText("Agregar Orden ");
        jPopupMenu1.add(AgregarOrden);

        Imprimir.setText("Imprimir");
        jPopupMenu1.add(Imprimir);

        Modificar.setText("Modificar");
        jPopupMenu1.add(Modificar);

        cobrar.setText("Cobrar");
        jPopupMenu1.add(cobrar);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre del cliente");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 150, -1));

        jLabel3.setText("Mesero");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, -1, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 130, -1));

        jLabel4.setText("Mesa");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 115, -1, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 80, -1));

        jButton1.setText("Aceptar");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jButton2.setText("Canselar");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        javax.swing.GroupLayout NuevoLayout = new javax.swing.GroupLayout(Nuevo.getContentPane());
        Nuevo.getContentPane().setLayout(NuevoLayout);
        NuevoLayout.setHorizontalGroup(
            NuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
        );
        NuevoLayout.setVerticalGroup(
            NuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );

        jDialog1.setBackground(new java.awt.Color(255, 255, 255));
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Sin nombre.jpg"))); // NOI18N
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 40, 290, 150));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setText("AHORA NO JOVEN");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, 20));

        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jDialog1.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 500, 220));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(232, 167, 53));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(42, 49, 50));
        jPanel3.setForeground(new java.awt.Color(200, 0, 10));

        lblme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Menu_32px.png"))); // NOI18N
        lblme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblme.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblmeMouseMoved(evt);
            }
        });
        lblme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmeMouseClicked(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 917, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblme)
                    .addComponent(jLabel18))
                .addContainerGap())
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 60));

        jPanel1.setBackground(new java.awt.Color(226, 196, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(226, 196, 153));
        jTable1.setForeground(new java.awt.Color(200, 0, 10));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1", "Sofía", "$15"},
                {"2", "2", "Manuel", "$20"},
                {"3", "1", "María ", "$25"},
                {"5", "2", "Melisa", "$30"},
                {"4", "2", "Rodrigo", "$20"}
            },
            new String [] {
                "Mesa", "Mesero", "Cliente", "Total"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(153, 153, 153));
        jTable1.setInheritsPopupMenu(true);
        jTable1.setSelectionBackground(new java.awt.Color(232, 167, 53));
        jTable1.setSelectionForeground(new java.awt.Color(200, 0, 10));
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 900, 190));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(200, 0, 10));
        jLabel1.setText("Ordenes Activas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 380, 50));

        jButton3.setBackground(new java.awt.Color(226, 196, 153));
        jButton3.setForeground(new java.awt.Color(140, 0, 4));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/hola1.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 50, 50));

        lbladmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/anillo (32 x 32).jpg"))); // NOI18N
        jPanel1.add(lbladmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 10, -1, -1));

        lblventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bars-chart (32 x 32).jpg"))); // NOI18N
        jPanel1.add(lblventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 50, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Search_32px.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jTextField2.setText("BUSCAR");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 109, 260, 30));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 980, 365));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased

    }//GEN-LAST:event_jPanel1MouseReleased

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
    }//GEN-LAST:event_jTable1MouseReleased

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
if(evt.isPopupTrigger()){
jPopupMenu1.show(evt.getComponent(),evt.getX(),evt.getY());
}
    }//GEN-LAST:event_jTable1MousePressed

    private void lblmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmeMouseClicked
      /*  
*/
    }//GEN-LAST:event_lblmeMouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        int dialog=JOptionPane.YES_NO_OPTION;
        int resultado=JOptionPane.showConfirmDialog(null, "Desea salir","Exit",dialog);
        if(resultado==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void lblmeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmeMouseMoved
      AnimationClass Calculadorai =new AnimationClass();
        AnimationClass Calculadorad =new AnimationClass();

        Calculadorad.jLabelXRight(-40, 0, 10, 5, lbladmin);

        Calculadorai.jLabelXLeft(0, -40, 10, 5, lbladmin);
        Calculadorad.jLabelXRight(-40, 0, 10, 5, lblventas);

        Calculadorai.jLabelXLeft(0, -40, 10, 5, lblventas);
    }//GEN-LAST:event_lblmeMouseMoved

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 jDialog1.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

 jDialog1.setVisible(true);
    jDialog1.setLocationRelativeTo(null);
    jDialog1.setSize(500,236);
    jDialog1.setLocationRelativeTo(null);
    this.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(frmpantalladetrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmpantalladetrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmpantalladetrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmpantalladetrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmpantalladetrabajo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarOrden;
    private javax.swing.JMenuItem Imprimir;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JDialog Nuevo;
    private javax.swing.JMenuItem cobrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbladmin;
    private javax.swing.JLabel lblme;
    private javax.swing.JLabel lblventas;
    // End of variables declaration//GEN-END:variables
}
