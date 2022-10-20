import java.util.Arrays;
import java.util.Scanner;

public class DizideElemanSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n: " );
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i=0;i<=n-1;i++){
            System.out.print((i+1) + ". elemanı: ");
            array[i] =input.nextInt();
        }
        Arrays.sort(array);
        System.out.print("Sıralama: " + Arrays.toString(array));

    }
}
