package Giris;
import java.util.Scanner;

public class DersNotu {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;


        Scanner inp=new Scanner(System.in);

        System.out.print("Matematik Notunu girin:");
        mat= inp.nextInt();

        System.out.print("Fizik Notunu Girin:");
        fizik=inp.nextInt();

        System.out.print("Kimya Notunu Girin:");
        kimya=inp.nextInt();

        System.out.print("Türkçe Notunu Girin:");
        turkce=inp.nextInt();

        System.out.print("Tarih Notunu Girin:");
        tarih=inp.nextInt();

        System.out.print("Müzik Notunu Girin:");
        muzik=inp.nextInt();

        int sonuc=(mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama=sonuc/6;

        System.out.println("Not Ortalaması:"+ortalama);
        String kosul=(ortalama>=60)?"Geçti":"Kaldı";

        System.out.println(kosul);


    }
}
