import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int sum(int a,int b){
        int result = a+b;
        System.out.println("Toplam: " + result);
        return result;
    }
    static int minos(int a, int b){
        int result = a-b;
        System.out.println("Çıkarma: " + result);
        return result;
    }
    static int times(int a, int b){
        int result = a*b;
        System.out.println("Çarpma: " + result);
        return result;
    }
    static int divided(int a, int b){
        if (b==0){
            System.out.println("İkinci sayı 0'dan büyük olmalı.");
            return 0;
        }
        int result = a/b;
        System.out.println("Bölme: " + result);
        return result;
    }
    static int power(int a, int b){
        int result = (int) Math.pow(a,b);
        System.out.println("Üssü: " + result);
        return result;
    }
    static void factorial(int a,int b){
        int result=1,result1 = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        for (int k = 1; k <= b; k++) {
            result1 *= k;
        }
        System.out.println("Sonuç1 : " +result+ "\n" + "Sonuç2: " + result1 );

    }
    static int mod(int a,int b){
        return a%b;
    }
    static void rectangel(int a,int b){
        System.out.println("Dikdörtgen Çevre: " + 2*(a+b));
        System.out.println("Dikdörtgen Alan: " + a*b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu= "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);
        while (true) {
            System.out.print("Bir işlem seçiniz: ");
            select = input.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("İlk sayı: ");
            int a = input.nextInt();
            System.out.print("İkinci sayı: ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minos(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    factorial(a,b);
                    break;
                case 7:
                    mod(a, b);
                    System.out.println("Mod: " + mod(a, b));
                    break;
                case 8:
                    rectangel(a, b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz.");
            }
        }
        System.out.println("Güle Güle");
    }
}
