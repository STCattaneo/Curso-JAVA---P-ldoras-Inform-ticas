import java.util.*;
public class Condicionales1_if{
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduce tu edad, por favor");

        int edad=entrada.nextInt();

        if (edad>=18){
            System.out.println("Eres mayor de edad");
        }
    }
}
