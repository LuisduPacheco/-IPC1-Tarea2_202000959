/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

public class principal {
    public static void main(String[] args) {
       //ALMACENAMIENTO PARA USUARIOS
       //Vector a partir de la clase usuario
        Usuario[] usuarios = new Usuario[10];
        
       //Usuario creado por defecto -Administrador
       //colocado en la primera posición del arreglo
       usuarios[0] = new Usuario("Luis","Pacheco","202000959"); 
        
        logint2 ventana = new logint2(usuarios);
        ventana.setVisible(true);
    }
    
}
