public class Arrays3 {
    public static void main(String[] args) {
        
        int [][][] MiArray=new int [2][3][4];

        for (int i=0; i<2;i++){

            for (int j=0; j<3;j++){

                for (int t=0; t<4;t++){

                    MiArray[i][j][t]=(int)Math.round(Math.random()*100);

                }

            }

        }
        for (int [][] l:MiArray){

            System.out.println();

            for (int[] k:l){

                System.out.println();

                for (int h:k){

                    System.out.print(h + " ");

                }

            }

        }


    }
}
