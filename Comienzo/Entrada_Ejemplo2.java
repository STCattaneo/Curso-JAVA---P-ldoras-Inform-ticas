package Comienzo;
import javax.swing.*;

public class Entrada_Ejemplo2 {
    public static void main(String[] args) {
        
        String nombre=JOptionPane.showInputDialog("Introduzca su nombre, por favor");

        String edad=JOptionPane.showInputDialog("Introduzca su edad, por favor");// Aqui se guarda la edad ingresada pero en forma de cadena de texto

        int edad_usuario=Integer.parseInt(edad);//Aqui la edad en forma de cadena de texto se convierte a una variable de tipo numerico

        System.out.println("Hola " + nombre + ", el año que viene tendrás " + (edad_usuario+1) + " años");
        
        //Tambien se puede usar un operador de incremento en lugar de sumar 1 a la edad en la impresion de pantalla


    }
        
}
