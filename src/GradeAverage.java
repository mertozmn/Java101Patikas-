import  java.util.Scanner;
public class GradeAverage {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;

        Scanner input=new Scanner(System.in);

        System.out.print("Matematik Notunu Girin:");
        mat=input.nextInt();
        if (mat<0 || mat>100){
            mat=0;
        }
        System.out.print("Fizik Notunu Girin:");
        fizik=input.nextInt();
        if (fizik<0 || fizik>100){
            fizik=0;
        }
        System.out.print("KimyaNotunu Girin:");
        kimya=input.nextInt();
        if (kimya<0 || kimya>100){
            kimya=0;
        }
        System.out.print("Türkçe Notunu Girin:");
        turkce=input.nextInt();
        if (turkce<0 || turkce>100){
            turkce=0;
        }
        System.out.print("Müzik Notunu Girin:");
        muzik=input.nextInt();
        if (muzik<0 || muzik>100){
            muzik=0;
        }

        double average=((mat+fizik+kimya+turkce+muzik)/5);


            if (average<=55){
                System.out.println("Kaldınız,Seneye Görüşmek Üzere :)");
            }else {
                System.out.println("Geçtiniz.");
            }
            System.out.println("Ortalamanız : "+average);
    }
}
