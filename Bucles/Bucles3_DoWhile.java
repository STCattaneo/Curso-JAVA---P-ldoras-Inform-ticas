import javax.swing.*;
public class Bucles3_DoWhile {
    public static void main(String[] args) {

        String genero="";

        do{

            genero=JOptionPane.showInputDialog("Introduce tu género\nH para hombre\nM para mujer");

        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);

        int estatura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu estatura expresada en cm"));

        int PesoIdeal=0;

        if(genero.equalsIgnoreCase("H")){
            
            PesoIdeal=estatura-110;

        }
        else if(genero.equalsIgnoreCase("M")){

            PesoIdeal=estatura-120;

        }
        System.out.println("Tu peso ideal es " + PesoIdeal + "Kg");
    }
}
