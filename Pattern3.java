import java.util.Scanner;

public class Pattern3 {
    /*
     A
    B C
    C D E
    D E F G

     */

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.close();

        String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","k","L","M","N","O","P"};

        for(int i=0;i<=n;i++){
            for(int k=0;k<=i;k++){
                System.out.print(alphabet[k+i]);
            }
            System.out.println();
        }
    }

  

    
}
