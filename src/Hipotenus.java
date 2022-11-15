import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        //Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

        int a, b;
        double c;
        //Kullanıcıdan verileri al.
        Scanner inp = new Scanner(System.in);
        System.out.print("1.Kenar uzunluğunu Girin:");
        a = inp.nextInt();
        System.out.print("2.Kenar uzunluğunu girin:");
        b = inp.nextInt();

        c = Math.sqrt((a * a) +( b * b));
        System.out.print("Hipotenüs:" + c);
    }
}
