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
public class Metodos {

    private static int length;

    public String nombre;
    public String curso;
    public int edad;
    private int contador;
    public String estu;

    public Metodos(String nombre, String curso, int edad) {
        this.nombre = nombre;
        this.curso = curso;
        this.edad = edad;
    }

    public Metodos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //int[] Metodos = new int[2];

   
    
    public void Bucar() {
          Metodos nota = new Metodos();
          estu= nota.getNombre();
        int buscar = 5;
        boolean encontrado = false;
        for (int i = 0; i < Metodos.length; i++) {
            if (nota == nota) {
               JOptionPane.showInputDialog("Ingrese el nombre del estudiante que desea buscar");
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Estudiante encontrado"+ nota.getNombre()+ nota.getCurso());
        } else {
            System.out.println("Estudiante no encontrado");
        }   
        }
       
            
    

    public void AgregarEstudiante() {
        Metodos nota = new Metodos();
        contador = 0;
        
        for (contador = 0; contador < 1; contador++) {
           
            
            nota.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre del estudiante:"));

            nota.setCurso(JOptionPane.showInputDialog(null, "Digite el nombre del curso del estudiante:"));

            nota.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la edad del estudiante:")));
        }
    }

    public void listarEstudiantes() {

        Metodos nota = new Metodos();
       // estu = nota.getNombre();
        if (contador == 0) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Lista de estudiantes:");
            for (int i = 0; i < contador; i++) {
                System.out.println("no pude hacer este punto :( ");

            }
        }
    }

    /* public void Eliminar() {
        System.out.print("Estudiante a buscar: ");
        String matricula = leerEntrada();
        for (int i = 0; i < contador; i++) {
            if (compararStrings(estudiantes[i].matricula, matricula)) {
                System.out.println(estudiantes[i]);
                return;
            }
        }
        System.out.println("No encontrado.");
        {

        }*/
}
