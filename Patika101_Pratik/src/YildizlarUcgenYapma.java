import java.util.Scanner;

public class YildizlarUcgenYapma {
    public static void main(String[] args) {
        int n,i,k,j;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz: ");
        n =input.nextInt();

        for (i=1;i<=n;i++){
            for (k=1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for (j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (i=1;i<n;i++){
            for (k=1;k<=i;k++){
                System.out.print(" ");
            }
            for (j=1;j<=(2*(n-i)-1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
