import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int km, age, type;
        double price;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();
        System.out.print("Kaç yaşındasınız: ");
        age = input.nextInt();
        System.out.println("Yolculuk tipi giriniz\n1-Tek Yön\n2-Gidiş-Dönüş");
        type = input.nextInt();

        price = km*0.10;

        if (km>0 && age>0 && (type==1 || type==2)){
            switch (type){
                case 1:
                    if (age<12){
                        System.out.println("İndirimli Uçak bileti: " + price*0.50 + "tl");
                    }else if(age>=12 && age<=24){
                        System.out.println("İndirimli Uçak bileti: " + price*0.90 + "tl");
                    }else if (age>65){
                        System.out.println("indirimli Uçak bileti: " + price*0.70 + "tl");
                    }else{
                        System.out.println("Uçak bileti: " + price + "tl");
                    }
                    break;
                case 2:
                    if (age<12){
                        System.out.println("İndirimli Uçak bileti: " + 2*(price*0.50*0.80) + "tl");
                    }else if(age>=12 && age<=24){
                        System.out.println("İndirimli Uçak bileti: " + 2*(price*0.90*0.80) + "tl");
                    }else if (age>65){
                        System.out.println("indirimli Uçak bileti: " + 2*(price*0.70*0.80) + "tl");
                    }else{
                        System.out.println("Uçak bileti: " + 2*(price*0.80) + "tl");
                    }
                    break;
            }
        }else {
            System.out.println("Hatalı veri girdiniz!!");
        }
    }
}
