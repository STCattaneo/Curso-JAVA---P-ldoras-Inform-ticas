import javax.swing.*;
public class Bucles5_For2 {
    public static void main(String[] args) {

        int arroba=0;

        boolean punto=false;

        String email=JOptionPane.showInputDialog("Ingrese un E-mail, por favor");

        for(int i=0; i<email.length();i++){

            if(email.charAt(i)=='@'){

                arroba++;

            }

            if(email.charAt(i)=='.'){
                punto=true;
            }
        }

        if(arroba==1 && punto==true){

            System.out.println("El E-mail es valido");

        }
        else{

            System.out.println("El E-mail NO es valido"); 

        }
        
    }
}
