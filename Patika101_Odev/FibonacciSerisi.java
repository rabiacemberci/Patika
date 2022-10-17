import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int n1=0,n2=1,n3;
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int dimension = input.nextInt();

        for (int i=2;i<=dimension;i++){
            n3 =n1+n2;
            System.out.println(n1 + "+" + n2 + "=" + n3);
            n1=n2;
            n2=n3;
            System.out.println();
        }
    }
}
