import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        int month,day;
        String burc="";
        boolean isError=false;
        Scanner input=new Scanner(System.in);

        System.out.print("Ay Girin:");
        month=input.nextInt();
        System.out.print("Gün Girin:");
        day= input.nextInt();

        if (month==1){
            /*
            Oğlak Burcu : 22 Aralık - 21 Ocak / Kova Burcu : 22 Ocak - 19 Şubat
             */
            if (1<=day && 31>=day){
                if (day<22){
                    burc="Oğlak";
                }else {
                    burc="Kova";

                }

            }


            else {
                isError=true;
            }
        } else if (month==2) {
            /*
            Balık Burcu : 20 Şubat - 20 Mart / Kova Burcu : 22 Ocak - 19 Şubat
             */
            if (1<=day && 28>=day){
                if (day<20){
                    burc="Kova";
                }else {
                    burc="Balık";
                }
            }else {
                isError=true;
            }
            
        } else if (month==3) {
            /*
              Balık Burcu : 20 Şubat - 20 Mart
             */
            if (1<=day && 31>=day){
                if (day<21){
                    burc="Balık";
                }else {
                    burc="Koç";
                }
            } else {
                isError=true;
            }
        } else if (month==4) {
            /*
             Koç Burcu : 21 Mart - 20 Nisan / Boğa Burcu : 21 Nisan - 21 Mayıs
             */
            if (1<=day && 30>=day){
                if (day<21){
                    burc="Koç";
                }else {
                    burc="Boğa";
                }
            }else {
                isError=true;
            }

        } else if (month==5) {
            /*
            İkizler Burcu : 22 Mayıs - 22 Haziran / / Boğa Burcu : 21 Nisan - 21 Mayıs
             */

            if (1<=day && 31>=day){
                if (day<22){
                    burc="Boğa";
                }else {
                    burc="İkizler";
                }
            }else {
                isError=true;
            }

        } else if (month==6) {
            /*
            İkizler Burcu : 22 Mayıs - 22 Haziran / Yengeç Burcu : 23 Haziran - 22 Temmuz
             */

            if (1<=day && 30>=day){
                if (day<23){
                    burc="İkizler";
                }else {
                    burc="Yengeç";
                }
            }else {
                isError=true;
            }

        }else if (month==7) {
            /*
            Yengeç Burcu : 23 Haziran - 22 Temmuz / Aslan Burcu : 23 Temmuz - 22 Ağustos
             */

            if (1<=day && 31>=day){
                if (day<23){
                    burc="Yengeç";
                }else {
                    burc="Aslan";
                }
            }else {
                isError=true;
            }

        }else if (month==8) {
            /*
            Aslan Burcu : 23 Temmuz - 22 Ağustos / Başak Burcu : 23 Ağustos - 22 Eylül
             */

            if (1<=day && 31>=day){
                if (day<23){
                    burc="Aslan";
                }else {
                    burc="Başak";
                }
            }else {
                isError=true;
            }

        }else if (month==9) {
            /*
           Başak Burcu : 23 Ağustos - 22 Eylül / Terazi Burcu : 23 Eylül - 22 Ekim
             */

            if (1<=day && 30>=day){
                if (day<23){
                    burc="Başak";
                }else {
                    burc="Terazi";
                }
            }else {
                isError=true;
            }

        }else if (month==10) {
            /*
          Terazi Burcu : 23 Eylül - 22 Ekim / Akrep Burcu : 23 Ekim - 21 Kasım
             */

            if (1<=day && 31>=day){
                if (day<23){
                    burc="Terazi";
                }else {
                    burc="Akrep";
                }
            }else {
                isError=true;
            }

        }else if (month==11) {
            /*
          Akrep Burcu : 23 Ekim - 21 Kasım / Yay Burcu : 22 Kasım - 21 Aralık
             */

            if (1<=day && 30>=day){
                if (day<22){
                    burc="Akrep";
                }else {
                    burc="Yay";
                }
            }else {
                isError=true;
            }

        }else if (month==12) {
            /*
         Yay Burcu : 22 Kasım - 21 Aralık / Oğlak Burcu : 22 Aralık - 21 Ocak
             */

            if (1<=day && 31>=day){
                if (day<22){
                    burc="Yay";
                }else {
                    burc="Oğlak";
                }
            }else {
                isError=true;
            }

        }

        else {
            isError=true;
        }

        if (isError){
            System.out.println("Hatalı giriş yaptınız.");
        }else {
            System.out.println("Burcunuz:"+burc);
        }

    }
}
