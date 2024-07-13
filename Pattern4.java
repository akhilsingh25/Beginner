public class Pattern4 {

    public static void main(String[] args) {
        triangleWithSpace(4);
        System.out.println("-------------------");
        invertedTriangle(5);
    }



    /*
       1 
      23
     321 
     */
    public static void triangleWithSpace(int n){

for(int i=1;i<=n;i++){

        for(int k=0;k<n-i;k++){
            System.out.print(" ");
        } for(int l=1;l<=i;l++){
            System.out.print(l);
        }    System.out.println();
    }

}





    public static void invertedTriangle(int n){

        for(int i=n;i>=1;i--){
            for(int k = n;k>n-i;k--){
                System.out.print(i);
            }
            System.out.println();
        }

    }
    
}
