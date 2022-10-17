import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String userName, password;
        int right=3;
        int balance = 1500;
        int select;
        Scanner input = new Scanner(System.in);
        while (right>0){
            System.out.print("Kullanıcı adını giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz bankasına hoşgeldiniz.");
                do {
                    System.out.println("1-Para Yatırma.\n2-Para Çekme.\n3-Bakiye Sorgula.\n4-Çıkış Yap.");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                }while (select!=4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }else {
                right--;
                System.out.println("Kullanıcı veya şifre hatalı! Tekrar giriş yapınız.");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan hakkınız: " + right);
                }
            }

        }






    }
}

