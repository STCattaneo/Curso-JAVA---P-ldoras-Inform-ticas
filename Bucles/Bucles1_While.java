import javax.swing.*;
public class Bucles1_While {
    public static void main(String[] args) {

        String clave="Santiago"; //Aqui se establece previamente la contraseña

        String pass=""; //En esta variable se almacenará lo que ingrese para comparar si es identico a clave

        while (clave.equals(pass)==false) { 
            /*Basicamente en la condición se pregunta ¿es falso que clave es igual a pass?
            de ser verdad que es falso ejecutar el bloque de código a continuación
            de ser mentira que es falso ignorar el bloque de código a continuación*/

            pass=JOptionPane.showInputDialog("Introduce la contraseña, por favor");

            if (clave.equals(pass)==false) { 
                /*Al igual que antes en la condición se pregunta ¿es falso que clave es igual a pass?
                de ser verdad que es falso ejecutar la sig. linea de código
                de ser mentira que es falso ignorar la sig. linea de código*/
                
                System.out.println("La contraseña es incorrecta");

            }

        }

        System.out.println("Contraseña correcta \nAcesso permitido");
        
    }
}
