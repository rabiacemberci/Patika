import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlıcan;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut km değerini giriniz : ");
        armut = input.nextDouble();

        System.out.print("Elma km değerini giriniz : ");
        elma = input.nextDouble();

        System.out.print("Domates km değerini giriniz : ");
        domates = input.nextDouble();

        System.out.print("Muz km değerini giriniz : ");
        muz = input.nextDouble();

        System.out.print("Patlıcan km değerini giriniz : ");
        patlıcan = input.nextDouble();

        double sonuc = ((armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5.00));
        System.out.println("Toplam tutar: " + sonuc);
    }

}
