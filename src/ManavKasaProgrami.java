import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00,toplam_tutar;
        double armut_kilogram,elma_kilogram,domates_kilogram,muz_kilogram,patlican_kilogram;

        Scanner inp=new Scanner(System.in);

        System.out.print("Armutun kg cinsinden ağırlığını girin:");
        armut_kilogram=inp.nextInt();
        System.out.print("Elmanın kg cinsinden  ağırlığını girin:");
        elma_kilogram=inp.nextInt();
        System.out.print("Domatesin kg cinsinden ağırlığını girin:");
        domates_kilogram=inp.nextInt();
        System.out.print("Muzun kg cinsinden ağırlığını girin:");
        muz_kilogram=inp.nextInt();
        System.out.print("Patlıcanın kg cinsinden  ağırlığını girin:");
        patlican_kilogram=inp.nextInt();

        toplam_tutar=(armut*armut_kilogram)+(elma*elma_kilogram)+(domates*domates_kilogram)+(muz*muz_kilogram)+(patlican*patlican_kilogram);
        System.out.print("Toplam Tutar:"+toplam_tutar+"TL");
    }
}
