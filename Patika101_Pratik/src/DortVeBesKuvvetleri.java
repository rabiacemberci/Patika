import java.util.Scanner;

public class DortVeBesKuvvetleri {
    public static void main(String[] args) {
        int i,k,number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır değeri belirtiniz: ");
        number = input.nextInt();

        System.out.print("Dört sayısının kuvvetleri : ");
        for (i=1;i<=number;i*=4){
            System.out.print(i + " ");
        }
        System.out.print("Beş sayısının kuvvetleri: ");
        for (k=1;k<=number;k*=5){
            System.out.print(k + " ");
        }

    }
}
