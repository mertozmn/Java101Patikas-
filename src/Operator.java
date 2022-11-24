public class Operator {
    public static void main(String[] args) {
        int A=10;
        int B=20;
        int C=40;
        int D=10;

        //System.out.println(A==B);        // false false true false false false
        //System.out.println(A==C);
        //System.out.println(A==D);
        //System.out.println(B==C);
        //System.out.println(B==D);
        //System.out.println(C==D);

        //System.out.println(A<=B);
        //System.out.println(A<=C);
        //System.out.println(A<=D);     // truetrue true true false false
        //System.out.println(B<=C);
        //System.out.println(B<=D);
        //System.out.println(C<=D);

        //System.out.println(A>=B);
        //System.out.println(A>=C);    //false false true false true true
        //System.out.println(A>=D);
        //System.out.println(B>=C);
        //System.out.println(B>=D);
        //System.out.println(C>=D);

        //System.out.println(A!=B);
        //System.out.println(A!=C);
        //System.out.println(A!=D);    //
        //System.out.println(B!=C);
        //System.out.println(B!=D);
        //System.out.println(C!=D);

        //System.out.println(A<B);
        //System.out.println(A<C);
        //System.out.println(A<D);
        //System.out.println(B<C);
        //System.out.println(B<D);
        //System.out.println(C<D);

        //System.out.println(A>B);
        //System.out.println(A>C);
        //System.out.println(A>D);
        //System.out.println(B>C);
        //System.out.println(B>D);
        //System.out.println(C>D);

        boolean kosul1=(A>B);
        boolean kosul2=(A<C);
        boolean sonuc1=kosul1 || kosul2;

        System.out.println(sonuc1);

       int  c=(sonuc1==false)? 10:20;

       System.out.println(c);

       if (A>B && A>C){
           System.out.println("A en büyük sayıdır.");
       }else if (B>A && B>C){
           System.out.println("B en büyük sayıdır.");

       }else {
           System.out.println("C en büyük sayıdır.");
       }
    int day=8;

       switch (day) {
           case 1:System.out.println("Pazartesi");
           break;

           case 2:System.out.println("Salı");
           break;

           case 3:System.out.println("Çarşamba");
           break;

           case 4:System.out.println("Perşembe");
           break;

           case 5:System.out.println("Cuma");
           break;

           case 6: System.out.println("Cumartesi");
           break;

           case 7: System.out.println("Pazar");
           break;

           default:System.out.println("Yanlış değer girdiniz");
       }






    }
}
