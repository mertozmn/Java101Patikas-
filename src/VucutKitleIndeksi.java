import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy,kilo,vki;

        Scanner inp=new Scanner(System.in);

        System.out.print("Metre cinsinden boyunuzu girin:");
        boy=inp.nextDouble();

        System.out.print("Kilogram cinsinden kilonuzu girin: ");
        kilo=inp.nextDouble();

        vki=kilo/(boy*boy);
        System.out.print("Vücut Kite İndeksiniz:"+vki);

    }
}
