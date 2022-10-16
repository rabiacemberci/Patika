import java.util.Scanner;

public class HarmonikSayiBulma {
    public static void main(String[] args) {

        double n,i;
        double topla=0;
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        n = input.nextInt();

        for (i=1;i<=n;i++){
            topla += 1/i;
        }
        System.out.println("Sonuç: " + topla);
    }
}
