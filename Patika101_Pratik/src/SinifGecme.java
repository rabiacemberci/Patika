import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,not=0,sayac=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        mat = input.nextInt();
        if (mat<0 || mat>100){
            System.out.println("'0' ve '100' aralığında olmayan notlar ortalamaya dehil edilemez.");
        }else{
            sayac++;
            not+=mat;
        }

        System.out.println("Fizik notunuz: ");
        fizik = input.nextInt();
        if (fizik<0 || fizik>100){
            System.out.println("'0' ve '100' aralığında olmayan notlar ortalamaya dehil edilemez.");
        }else{
            sayac++;
            not+=fizik;
        }

        System.out.println("Türkçe notunuz: ");
        turkce = input.nextInt();
        if (turkce<0 || turkce>100){
            System.out.println("'0' ve '100' aralığında olmayan notlar ortalamaya dehil edilemez.");
        }else{
            sayac++;
            not+=turkce;
        }

        System.out.println("Kimya notunuz: ");
        kimya = input.nextInt();
        if (kimya<0 || kimya>100){
            System.out.println("'0' ve '100' aralığında olmayan notlar ortalamaya dehil edilemez.");
        }else{
            sayac++;
            not+=kimya;
        }

        System.out.println("Müzik notunuz: ");
        muzik = input.nextInt();
        if (muzik<0 || muzik>100){
            System.out.println("'0' ve '100' aralığında olmayan notlar ortalamaya dehil edilemez.");
        }else{
            sayac++;
            not+=muzik;
        }

        double average = not/sayac;
        if (average<55){
            System.out.println("Snıfta kaldınız, seneye görüşmek üzere.. ");
        }else {
            System.out.println("Tebrikler, geçtiniz..");
        }
        System.out.println("Ortalamanız: " + average);
    }
}
