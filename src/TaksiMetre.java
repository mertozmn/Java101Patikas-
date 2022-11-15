import java.util.Scanner;
public class TaksiMetre {
    public static void main(String[] args) {
        /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
         */
        int acılıs_ucreti=10;
        double gidilen_mesafe,tutar,km_basına=2.20;

        Scanner inp=new Scanner(System.in);
        System.out.print("Gidilen Mesafe:");
        gidilen_mesafe=inp.nextInt();

        tutar=(acılıs_ucreti+(km_basına*gidilen_mesafe));
      tutar= tutar<20?20:tutar;
        System.out.print("Ödeyeceğiniz Tutar:"+tutar+"TL");


    }
}