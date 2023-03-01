import javax.swing.*;
public class PlazoFijo {
    public static void main(String[] args) {
        
        double Saldo=0;

        double acumulado=0;

        double interes=0.10;

        double f=6;

        double[][] PlazoFijo=new double [6][5];

        do{

            Saldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el capital incial que desea invertir \n El monto debe ser $10000 minimamente"));

        } while (Saldo<10000);

        for(int i=0; i<6; i++){ // Array n°1

            PlazoFijo[i][0]=Saldo;

            acumulado=Saldo;

            for(int j=1; j<5; j++){ // Array n°2

                acumulado=acumulado+(acumulado*interes);

                PlazoFijo[i][j]=acumulado;

            }

            interes= interes + 0.01;

        }

        for(double[] k:PlazoFijo){ // Array n°3
            System.out.println("\n");
            System.out.printf("%1.2f",((interes*100)-f));
            System.out.print("% ");
            for(double l:k){ // Array n°4

                System.out.printf("%1.2f",l);
                System.out.print(" ");
            }

            f--;

        }

    }
}
