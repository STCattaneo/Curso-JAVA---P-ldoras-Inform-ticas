package Comienzo;
import javax.swing.*;

public class Entrada_Números {
    public static void main(String[] args) {
        
        String num1=JOptionPane.showInputDialog("Introduce un número, por favor");

        double num2=Double.parseDouble(num1);

        System.out.println("La raiz de " + num2 + " es ");
        
        System.out.printf("%1.2f" , Math.sqrt(num2));

    }
}
