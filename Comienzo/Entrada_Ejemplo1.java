package Comienzo;
import java.util.*;//Aqui, con el *, se importan TODAS las clases del paquete java.util

public class Entrada_Ejemplo1 {

    public static void main(String[] args){

        Scanner entrada=new Scanner(System.in);//Creamos un objeto (instanciamos/ejemplarizamos la clase) llamado "entrada" en el cual se guardara la info que ingrese
        
        System.out.println("Introduce tu nombre, por favor");

        String nombre=entrada.nextLine();//El texto ingresado se guardara en la variable

        System.out.println("Introduce tu edad, por favor");

        int edad=entrada.nextInt();//El numero ingresado se guardara enla variable

        System.out.println("Hola " + nombre + ", el año que viene tendrás " + (edad+1) + " años");
        
    }
    
}
