import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int number,topla=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        for (int i = 2; i<=number;i++){
            if (number%i==0){
                topla += number/i;
            }
        }
        if (number==topla){
            System.out.println(number+" mükemmel bir sayıdır.");
        }else{
            System.out.println(number+" mükemmel bir sayı değildir.");
        }
    }
}
