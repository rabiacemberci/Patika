import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int i,n,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        n = input.nextInt();
        System.out.print("Kaçını üssü hesaplansın: ");
        k = input.nextInt();
        int toplam=1;

        for (i=1;i<=k;i++){
            toplam *=n;
        }
        System.out.println("SOnuç: " + toplam);

    }
}
