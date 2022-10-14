import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        int km;
        double  kmucreti=10;
        Scanner input = new Scanner(System.in);
        System.out.print("Km sayısını giriniz: ");
        km = input.nextInt();

        kmucreti += km*2.20;
        kmucreti = (kmucreti<20)?20:kmucreti;

        System.out.println("Ücret: " + kmucreti);
    }
}
