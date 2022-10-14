import java.util.Scanner;

public class DaireDilimininAlani {
    public static void main(String[] args) {
        int r,a;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarı çapını giriniz: ");
        r = input.nextInt();
        System.out.println("Merkez açı ölçüsünü giriniz: ");
        a = input.nextInt();

        double alan = (pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alanı: " + alan);


    }
}
