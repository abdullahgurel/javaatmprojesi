import java.util.Scanner;
public class atmProjesi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right>0) {
            System.out.print("Kullanıcı Adınızı Giriniz:");
            userName = input.nextLine();
            System.out.print("Şifrenizi Giriniz:");
            password = input.nextLine();
            if(userName.equals("123") && password.equals("123")) {
                System.out.println("Merhaba kodluyoruz bankasına hoşgeldiniz.");

                do {
                    System.out.println(
                            "1-Para Yatırma\n" +
                                    "2-Para Çekme\n" +
                                    "3-Bakiye Sorgula\n" +
                                    "4-Çıkış");
                    System.out.print("Ne İşlem Yapmak İstiyorsunuz: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1 :
                            System.out.print("Para Miktarı: ");
                            int price = input.nextInt();
                            balance+=price;
                            break;
                        case 2 :
                            System.out.print("Çekilecek Miktar: ");
                            price = input.nextInt();
                            if (price>balance) {
                                System.out.println("Bakiye Yetersiz");
                            }else {
                                balance-=price;
                            }
                            break;
                        case 3 :
                            System.out.println("Bakiye Miktarı" + balance);
                            break;

                    }
                }while (select !=4);
                     System.out.println("Tekrar Görüşmek Üzere");
                    break;
            }
            else  {
                right--;
                System.out.println("Hatalı Kullanıcı Adı Veya Şifre Tekrar Deneyiniz");
                if (right==0) {
                    System.out.println("Banka Hesabınız Bloke Olmuştur.");
                }
                System.out.println("Kalan Hakkınız: "+ right);
            }
        }
    }
}
