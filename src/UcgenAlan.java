import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        int a,b,c;
        double u,alan;
        Scanner inp=new Scanner(System.in);
        System.out.print("1.Kenarı Girin:");
        a=inp.nextInt();
        System.out.print("2.Kenarı Girin:");
        b=inp.nextInt();
        System.out.print("3.Kenarı Girin:");
        c=inp.nextInt();
        /*
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

      */

       u=(a+b+c)/2;
       alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
       System.out.println("Üçgenin Alanı:"+alan);
    }
}
