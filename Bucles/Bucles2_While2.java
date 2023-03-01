import java.util.*;
public class Bucles2_While2 {
    public static void main(String[] args) {
        
        int aleatorio=(int)(Math.random()*100);

        Scanner entrada=new Scanner(System.in);

        int numero=-1;

        int intentos=0;

        while(numero!=aleatorio){

            intentos++;

            System.out.println("Adivina el número");

            numero=entrada.nextInt();

            if (aleatorio<numero){

                System.out.println("Más bajo");

            }

            else if (aleatorio>numero){

                System.out.println("Más alto");

            }
        }

        System.out.println("Correcto. \nEl número de intentos que te tomó fue " + intentos); 

    }
}
