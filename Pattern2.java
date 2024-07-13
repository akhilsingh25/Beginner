public class Pattern2 {
    public static void main(String[] args) {

            printTriangle(6);

            System.out.println("--------------------");
            printAlbhabetTrianger(6);
        
    }

    public static void printTriangle(int n){

        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print(i);
            }
            System.out.println();
        }

    }

     public static void printAlbhabetTrianger(int n){
        String[] alphabet = {"*","A","B","C","D","E","F","G","H","I","J","k","L","M","N","O","P"};

        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print(alphabet[i]);
            }
            System.out.println();
        }
     }
}
