import java.util.Scanner;
public class DaireAlani {
    public static void main(String[] args) {
        int r,a;
        double pi=3.14,alan,cevre;

        Scanner inp=new Scanner(System.in);

        System.out.print("Yarıçapı Girin:");
        r=inp.nextInt();
        System.out.print("Merkez Açıyı Girin:");
        a=inp.nextInt();



        alan=(pi*r*r*a)/360;
        cevre=2*pi*r;

        System.out.println("Dairenin Alani:"+alan);
        System.out.println("Dairenin Cevresi:"+cevre);

    }
}
