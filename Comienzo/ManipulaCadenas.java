package Comienzo;
public class ManipulaCadenas {
    public static void main(String[] args){

        String mi_nombre="Santiago Tomás";

        System.out.println("Tu nombre es " + mi_nombre + ", y tiene " + mi_nombre.length() + " letras, siendo la primer letra la " 
        + mi_nombre.charAt(0) + " y la ultima la " + mi_nombre.charAt(mi_nombre.length()-1));
    }
}
