import javax.swing.*;
public class Arrays4 {
    public static void main(String[] args) {
        
        double Saldo=0;

        double acumulado=0;

        double interes=0.10;

        double[][] PlazoFijo=new double [6][5];

        do {

            Saldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el capital que desea invertir \n El monto debe ser $10000 minimamente"));

        } while (Saldo<10000);

        for(int i=0; i<6; i++){ // For n°1

            PlazoFijo[i][0]=Saldo;

            acumulado=Saldo;

            for(int j=1; j<5; j++){ // For n°2

                acumulado=acumulado+(acumulado*interes);

                PlazoFijo[i][j]=acumulado;

            }

            interes = interes + 0.01;

        }

        for(double[] k:PlazoFijo){ // For-Each n°1
            System.out.println();
            for(double l:k){ // For-Each n°2

                System.out.printf("%1.2f",l);
                System.out.print(" ");

            }
        }
    }
}
