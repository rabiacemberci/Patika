import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {

        int n,r, toplam=1,toplam2=1,toplam3=1,i,k;
        Scanner input = new Scanner(System.in);
        System.out.println("Kümeniz kaç elemanlı: ");
        n = input.nextInt();

        System.out.println("r değerini giriniz: ");
        r = input.nextInt();


        for (i=1;i<=n;i++){
            toplam = toplam*i;
        }
        System.out.println(toplam);
        for (k=1;k<=r;k++){
            toplam2 = toplam2*k;

        }
        System.out.println(toplam2);
        for (i=1,k=1;i<=(n-r);i++,k++){
            toplam3 = toplam3*(i);
            ;
        }
        System.out.println(toplam3);
        System.out.println("C(n/r) = " + toplam/(toplam2*(toplam3)));
    }
}
