import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input=new Scanner(System.in);

        System.out.print("1.Sayıyı Girin:");
        a=input.nextInt();

        System.out.print("2.Sayıyı Girin:");
        b=input.nextInt();

        System.out.print("3.Sayıyı Girin:");
        c=input.nextInt();

        if (a<b && a<c){
            if (b<c){
                System.out.println("a < b < c");
            } else if (c<b){
                System.out.println("a < c < b");

                }

        } else if (b<a && b<c) {
            if (a<c){
                System.out.println("b < a < c");
            } else if (c<a) {
                System.out.println("b < c < a");
            }

        } else if (c<a && c<b) {
            if (a<b){
                System.out.println("c < a < b");
            } else if (b<a) {
                System.out.println("c < b < a");

            }

        }
    }
}
