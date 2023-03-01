package Comienzo;
public class ManipulaCadenas3 {
    public static void main(String[] args){
        String frase_1="Hola Mundo";

        String frase_2="hola mundo";

        System.out.println(frase_1.equals(frase_2)); //comparación entre frase_1 y frase_2 contemplando mayúsculas y minúsclas

        System.out.println(frase_1.equalsIgnoreCase(frase_2)); //comparación entre frase_1 y frase_2 sin contemplar mayúsculas y minúsculas
    }    
}
