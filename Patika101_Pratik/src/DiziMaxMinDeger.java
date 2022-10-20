import java.util.Arrays;
import java.util.Scanner;

public class DiziMaxMinDeger {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[] array = {15,12,788,1,-1,-778,2,0};
        System.out.println("Dizi: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.print("Girilen Sayı: ");
        int a = input.nextInt();
        for (int i = 0; i<array.length;i++){
            if (a<array[i]){
                System.out.println("Girilen sayıdan küçük en yakın sayı: " + array[i-1]);
                System.out.println("Girilen sayıdan büyük en yakın sayı: " + array[i]);
                break;
            }
        }
    }
}
