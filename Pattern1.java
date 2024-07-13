public class Pattern1{

    public static void main(String[] args) {


        for(int i=0;i<4;i++){
            for(int j=0;j<6;j++){
                System.out.print("0");

            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("0");
            }
            System.out.println();
        }



    }
}