import javax.swing.*;
public class Bucles6_For3 {
    public static void main(String[] args) {

        long resultado=1l;

        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        for(int i=numero; i>0; i--){

            resultado=resultado*i;

        }

        System.out.println("El factorial de " + numero + " es " + resultado);
        
    }
}
