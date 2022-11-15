import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
        double tutar,kdv_oran=0.18, kdv_tutar,kdvsiz_fiyat,kdvli_fiyat;

        Scanner inp=new Scanner(System.in);

        System.out.print("Bir Para Değeri Girin:");
         tutar=inp.nextInt();

        kdv_tutar=tutar*kdv_oran;
        kdvli_fiyat=tutar+kdv_tutar;

        System.out.println("KDV Oranı:"+kdv_oran);
        System.out.println("KDV Tutarı:"+kdv_tutar);
        System.out.println("KDV'li Fiyat:"+kdvli_fiyat);
        System.out.println("KDV'siz Fiyat:"+tutar);

    }
}
