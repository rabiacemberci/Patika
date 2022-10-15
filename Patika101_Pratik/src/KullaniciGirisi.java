import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password,newPassword;
        int select;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Başarılı giriş yaptınız.");

        }else {
            System.out.println("Şifre yanlış!!!\nŞifrenizi değiştirmek ister misiniz? \n1-Yes 2-No");
            select = input.nextInt();
            switch (select) {
                case 1:
                    Scanner inp = new Scanner(System.in);
                    System.out.print("Yeni şifre giriniz: ");
                    newPassword = inp.nextLine();

                    if (newPassword.equals("java123")) {
                        System.out.println("Eski şifre ile aynı olamaz!!\n" +
                                "Şifre oluşturulamadı, lütfen başka şifre giriniz:");
                    } else{
                        System.out.println("Şifre oluşturuldu..");
                    }
                    break;
                case 2:
                    System.out.println("Şifre değiştirilmek istenmiyor.");
                    break;
            }
        }
    }
}
