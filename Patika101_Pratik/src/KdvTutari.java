import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {

        float tutar, kdvorani,kdvtutari,kdvlifiyat;

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyat giriniz: ");
        tutar = input.nextInt();

        boolean büyükfiyat = tutar<1000;
        boolean küçükfiyat = tutar>1000;
        kdvorani = (float) (büyükfiyat ? 0.18 : 0.08);
        kdvtutari = tutar*kdvorani;
        kdvlifiyat = (tutar + (tutar * kdvorani));

        System.out.println("KDV'siz fiyat: " + tutar);
        System.out.println("KDV'li fiyat: " + kdvlifiyat);
        System.out.println("KDV tutarı: " + kdvtutari);



    }
}
