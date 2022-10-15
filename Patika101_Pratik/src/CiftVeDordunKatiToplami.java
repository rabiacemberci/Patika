import java.util.Scanner;

public class CiftVeDordunKatiToplami {
    public static void main(String[] args) {
        int i, number;
        int toplam=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            number =input.nextInt();
            if (number%4 == 0 || number%2==0){
                toplam += number;
            }
        }while (number%2==0);
        System.out.println("Toplam: " + toplam);

    }
}
