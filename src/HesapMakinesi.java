import  java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1,sayi2,secim;


        Scanner input=new Scanner(System.in);

        System.out.print("1.Sayıyı Girin:");
        sayi1=input.nextInt();
        System.out.print("2.Sayıyı Girin:");
        sayi2=input.nextInt();

        System.out.println("1.Toplama \n2.Çıkarma \n3.Çarpma \n4.Bölme");
        System.out.print("Bir işlem seçin:");
        secim=input.nextInt();


        if (secim==1){
            System.out.println("Toplam:"+(sayi1+sayi2));
        } else if (secim==2) {
            System.out.println("Fark:"+(sayi1-sayi2));

        }else if (secim==3){
            System.out.println("Çarpım:"+(sayi1*sayi2));
        } else if (secim==4) {

            if (sayi2!=0){
                System.out.println("Bölme:"+(sayi1/sayi2));
            }else {
                System.out.println("Bir sayı 0'a bölünemez !");
            }

        }else {
            System.out.println("Yanlış değer girdiniz.");
        }


    }
}
