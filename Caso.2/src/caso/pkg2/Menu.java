/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author estef
 */
public class Menu {
     private byte opc;
   
    public void mostrarMenu(){
        Metodos m=new Metodos();
         while(opc!=3){ 
         opc=Byte.parseByte(JOptionPane.showInputDialog(null,
                 "***MENÚ PRINCIPAL***\n\n"
                         + "1.Agregar estudiante\n"
                         + "2.listar estudiantes\n"
                         + "3. modificarElementos\n"
                         + "4.Bucar \n"
                         + "5.Salir\n"
                         + "Digite su opción:"));
         switch(opc){
             case 1:{
                m.AgregarEstudiante();  
                break;
             } 
             case 2:{
                m.listarEstudiantes();
                break;
             }
             case 3:{
               // m.modificarElementos();
                break;
             }
              case 5:{
                m.Bucar();
                break;
             }
             case 6:{
                System.exit(0);
                break;
             }
             default:{
                JOptionPane.showMessageDialog(null,"¡Opción incorrecta!");
             }
         }
      }
        
    }
}


