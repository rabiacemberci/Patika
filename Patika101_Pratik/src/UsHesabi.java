import java.util.Scanner;

public class UsHesabi {
    static int usDeger(int a,int b){
        int sonuc = (int) Math.pow(a,b);
        return sonuc;
    }
    public static void main(String[] args) {
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("Taban değerini giriniz: ");
            int a = input.nextInt();
            System.out.print("Üs değerini giriniz: ");
            int b = input.nextInt();
            System.out.print("Sonuç: " + usDeger(a,b)+"\n");

        }

    }
}
