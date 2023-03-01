public class Arrays2 {
    public static void main(String[] args) {
        
        int[] RandomNum=new int[150];

        for(int i=0; i<RandomNum.length; i++){

            RandomNum[i]=(int)Math.round(Math.random()*100);

        }

        for(int l:RandomNum){

            System.out.println(l);

        }

    }
}