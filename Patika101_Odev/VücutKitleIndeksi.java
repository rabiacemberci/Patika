import java.util.Scanner;

public class VücutKitleIndeksi {
    public static void main(String[] args) {
        int kilo;
        double boy;
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu (m cinsinden) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextInt();

        double indeks = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksi: " + indeks);
    }
}
