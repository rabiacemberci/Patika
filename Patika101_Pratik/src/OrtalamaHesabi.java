import java.util.Scanner;

public class OrtalamaHesabi {
    public static void main(String[] args) {

        int number, i, toplam = 0, sayac = 0;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        for (i = 1; i<=number;i++){
            if (i%3==0 && i%4 ==0) {
                toplam += i;
                sayac++;
            }
        }
        ortalama = (toplam / sayac);
        System.out.println("Ortalama : " + ortalama);





    }
}
