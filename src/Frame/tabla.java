/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class tabla extends JFrame {

        
        JButton btn1 =new JButton("+");
      
        JButton btn2 =new JButton("-");
        JLabel lbl = new JLabel(" 1 ");
        
        
        
    public void ver_tabla (JTable tabla){
      tabla.setDefaultRenderer(Object.class, new render());
      

        
   DefaultTableModel d= new DefaultTableModel(getFilas(), getColumnas()){
   
   public boolean isCellEditable(int row,int column){
   return false;
   }
   };

            btn1.setName("mas");   
            btn2.setName("menos");
            
        tabla.setModel(d);
        tabla.setRowHeight(25);
    }
    //Datos de las filas
    private Object[][] getFilas()
    {
         Object fila[][]=new Object[][] {
                            {"soda", "0.50", btn1,"2",btn2},
                            {"pizza", "2.50",  btn1,"2 ",btn2},
                            {"papas", "1.00", btn1,"2 ",btn2}};
         return fila;
    }
//Encabezados de la tabla
    private String[] getColumnas()
    {
          String columna[]=new String[]{"Nombre","Precio ($)","Agregar", "Cantidad","Eliminar"};
          return columna;
    }
 
    public static void main(String args[]) {
        tabla obj = new tabla();
        obj.setVisible(true);
    }
}









