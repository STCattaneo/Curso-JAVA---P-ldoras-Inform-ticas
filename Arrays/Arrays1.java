public class Arrays1{
    public static void main(String[] args) {
        
        //int [] mi_array={5, 38, 15, 92, 71}; Así se declara e inicia un arrays en la misma linea

        // A continuación se ve como el array se declara e inicia (posición por posición) de forma separada

        int [] mi_array=new int [5];

        mi_array[0]=5;
        mi_array[1]=38;
        mi_array[2]=15;
        mi_array[3]=92;
        mi_array[4]=71;

        for (int i=0; i<mi_array.length; i++){

            System.out.println("Valor de la posición " + i + " = " + mi_array[i]);

        }

    }
}