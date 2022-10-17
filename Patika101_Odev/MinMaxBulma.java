import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
        int counter,maxNumber=0,minNumber=0,numberi = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        counter =input.nextInt();

        for (int i=1; i<=counter;i++){
            System.out.print(i + ".sayıyı giriniz: ");
            numberi = input.nextInt();
            if (i == 1){
                maxNumber = numberi;
                minNumber = numberi;
            }else {
                if (numberi > maxNumber){
                    maxNumber = numberi;
                }else if (numberi < minNumber){
                    minNumber = numberi;
                }
            }
        }
        System.out.println("En büyük sayı: " + maxNumber);
        System.out.println("En küçük sayı: " + minNumber);
    }
}
