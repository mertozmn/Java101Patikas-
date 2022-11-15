import  java.util.Scanner;
public class KdvTutarıHesabı {
    public static void main(String[] args) {
        /*
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */
        double kdv_oran1=0.18,kdv_oran2=0.08,kdv_tutar,kdvli_fiyat;

        Scanner inp=new Scanner(System.in);

        System.out.print("Para Değeri Girin:");
        int tutar=inp.nextInt();

        kdv_tutar= (0<tutar && 1000>=tutar) ?tutar*kdv_oran1 :tutar*kdv_oran2;
        kdvli_fiyat=tutar+kdv_tutar;




        System.out.println("KDV Tutarı:"+kdv_tutar);
        System.out.println("KDV'li Fiyat:"+kdvli_fiyat);
        System.out.println("KDV'siz Fiyat:"+tutar);
    }
}
