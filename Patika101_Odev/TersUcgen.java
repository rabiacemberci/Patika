import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int step;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı: ");
        step = input.nextInt();

        for (int i=1;i<=step;i++){
            for (int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*(step-i))+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
