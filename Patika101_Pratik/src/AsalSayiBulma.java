import java.util.Scanner;

public class AsalSayiBulma {
    static boolean asalSayi(int a){
        boolean isPrime = true;
        for (int i=2;i<a;i++){
            if (a%i==0) {
                isPrime = false;
                System.out.println(a + " sayısı ASAL değildir!");
                break;
            }else{
                System.out.println(a + " sayısı ASALDIR!");
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int a = input.nextInt();
        System.out.println(asalSayi(a));

    }

}
