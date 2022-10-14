import java.util.Scanner;

public class AlanBulma {
    public static void main(String[] args) {

        int a,b,c ;

        Scanner input = new Scanner(System.in);
        System.out.print("1. kenarı giriniz: ");
        a = input.nextInt();
        System.out.print("2. kenarı giriniz: ");
        b = input.nextInt();
        System.out.print("3. kenarı giriniz: ");
        c = input.nextInt();

        int u = (a+b+c)/2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin çevresi: " + u);
        System.out.println("Üçgenin alanı: " + alan);

    }
}
