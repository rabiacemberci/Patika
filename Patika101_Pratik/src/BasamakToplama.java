import java.util.Scanner;

public class BasamakToplama {
    public static void main(String[] args) {

        int a,i,numberCounter = 0,number;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        a = input.nextInt();

        while (a != 0) {
            number =a%10;
            numberCounter+=number;
            a/=10;
        }
        System.out.println(numberCounter);
    }
}
