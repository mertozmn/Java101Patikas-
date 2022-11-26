import  java.util.Scanner;
public class HavaSıcaklığı {
    public static void main(String[] args) {
        int heat;

        Scanner input=new Scanner(System.in);

        System.out.print("Hava Sıcaklığını Girin:");
        heat=input.nextInt();
//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        if (heat<5){
            System.out.println("Kayak yapmaya gidebilirsin.");
        } else if (heat>=5 && heat<=15) {
            if (heat>=10){
                System.out.println("Sinemaya gidebilirsin.");
                System.out.println("Pikniğe gidebilirsin.");
            }else {
                System.out.println("Sinemaya gidebilirsin.");
            }

        } else if (heat>=10 && heat<=25) {
            if (heat<=15){
                System.out.println("Sinemaya gidebilirsin.");
                System.out.println("Pikniğe gidebilirsin.");
            }else  {
                System.out.println("Pikniğe gidebilirsin.");
            }

        }else {
            System.out.println("Yüzmeye gidebilirsin.");
        }

    }
}

/*
Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 */