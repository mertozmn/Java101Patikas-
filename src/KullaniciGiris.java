import java.util.Scanner;
public class KullaniciGiris {
    public static void main(String[] args) {
        String userName,password,karar,newPassword;

        Scanner input=new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Girin : ");
       userName=input.nextLine();

        System.out.print("Şifrenizi Girin : ");
        password=input.nextLine();




        if (userName.equals("warrior") && password.equals("18811938")){
            System.out.println("Giriş Yaptınız.");

        }else if (password!="18811938"&&userName.equals("warrior")){
            System.out.println("Yanlış Şifre !");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");
            karar=input.nextLine();
            if (karar.equals("evet")){
                System.out.print("Yeni Şifrenizi Girin : ");
                password=input.nextLine();

                if (password.equals("18811938")){
                    System.out.println("Şifre Oluşturulamadı Lütfen Başka Bir Şifre Girin.");

                }else if (password.equals("warrior")){
                    System.out.println("Kullanıcı adınızdan farklı bir şifre giriniz.");
                }else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }else {

            }


            }else if (userName!="warrior" && password.equals("18811938")){
            System.out.println("Kullanıcı adını yanlış girdiniz !");
        }
        }
    }

    /*
    Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı
    sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması
    gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
     sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.


     */
