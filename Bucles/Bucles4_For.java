import javax.swing.*;
public class Bucles4_For {
    public static void main(String[] args) {

        boolean arroba=false;

        String email=JOptionPane.showInputDialog("Ingrese un E-mail, por favor");

        for(int i=0; i<email.length();i++){

            if(email.charAt(i)=='@'){

                arroba=true;

            }
        }

        if(arroba==true){

            System.out.println("El E-mail es valido");

        }
        else{

            System.out.println("El E-mail NO es valido"); 

        }
        
    }
}
