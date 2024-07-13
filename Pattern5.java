public class Pattern5 {
    
    public static void main(String[] args) {
        
            // shiftedPyramid(4);
             starPattern(5);


    }

    public static void shiftedPyramid(int n){


        for(int i=0;i<n;i++){
            for(int space=1;space<=n-i-1;space++){
                System.out.print("-");
            }
            for(int num=i+1;num<=2*i +1;num++ ){
                System.out.print(num);
            }
            for(int k=2*i;k>i;k--){
                System.out.print(k);
            }
            System.out.println("");
        }
    }

    public static void starPattern(int n) {


        int mid = (n/2) +1;
        for(int i=0;i<mid;i++){
            for(int space=1;space<=mid-i-1;space++){
                System.out.print("-");
        }
        for(int j=1;j<=2*i +1;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    for(int i=1;i<=mid-1;i++){
        for(int space=1;space<=i;space++){
            System.out.print("-");

    }
    for(int j=1;j<=n-(2*i);j++){
        System.out.print("*");
    }
    System.out.println();
    

    
}}
}