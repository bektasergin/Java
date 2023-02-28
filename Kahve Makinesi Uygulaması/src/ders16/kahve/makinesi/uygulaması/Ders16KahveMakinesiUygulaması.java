package ders16.kahve.makinesi.uygulaması;

import java.util.Scanner;

public class Ders16KahveMakinesiUygulaması 
{
    public static void main(String[] args) throws InterruptedException 
    {
       String kahvecesitleri = 
               "1-)Dibek Kahvesi\n"
               + "2-)Menengiç Kahvesi\n"
               + "3-)Çörekotu Kahvesi\n"
               + "4-)Adana Gar Kahvesi\n"
               + "5-)Sütlü Türk Kahvesi\n";
        System.out.println(kahvecesitleri);
        System.out.print("Kaç numaralı kahveyi istersiniz: ");
        Scanner input = new Scanner(System.in);
        int kahvesecimi = input.nextInt();
        String seker =
                "a-)Şekersiz\n"
                + "b-)Az şekerli\n"
                + "c-)Orta Şekerli\n"
                + "d-)Şekerli";
        System.out.println(seker);
        System.out.print("Kahvenizin şeker durumunu seçiniz: ");
        input.nextLine();
        String sekersayisi = input.nextLine();
        String secim = "";
        if (sekersayisi.equals("a")) 
        {
            secim = "Şekersiz";
        }
        else if (sekersayisi.equals("b")) 
        {
            secim = "Az Şekerli";
        }
        else if (sekersayisi.equals("c")) 
        {
            secim = "Orta Şekerli";
        }
        else if (sekersayisi.equals("d")) 
        {
            secim = "Şekerli";
        }
        else
        {
            System.out.println("Şeker seçiminiz hatalıdır. ");
        }
        
        switch(kahvesecimi)
        {
            case 1:System.out.println("Kahveniz Hazırlanıyor...");
                Thread.sleep(2000);
                String bildirim = secim+" dibek kahveniz hazir\n Afiyet olsun.";
                System.out.println(bildirim);
                break;
            case 2:System.out.println("Kahveniz Hazırlanıyor...");
                Thread.sleep(2000);
                String bildirim2 = secim+" Menengiç kahveniz hazir\n Afiyet olsun.";
                System.out.println(bildirim2);
                break;
            case 3:System.out.println("Kahveniz Hazırlanıyor...");
                Thread.sleep(2000);
                String bildirim3 = secim+" Çörekotu kahveniz hazir\n Afiyet olsun.";
                System.out.println(bildirim3);
                break;
            case 4:System.out.println("Kahveniz Hazırlanıyor...");
                Thread.sleep(2000);
                String bildirim4 = secim+" Adana Gar kahveniz hazir\n Afiyet olsun.";
                System.out.println(bildirim4);
                break;
            case 5:System.out.println("Kahveniz Hazırlanıyor...");
                Thread.sleep(2000);
                String bildirim5 = secim+" Sütlü Türk kahveniz hazir\n Afiyet olsun.";
                System.out.println(bildirim5);
                break;
            default:System.out.println("Kahve seçiminiz hatalıdır.");    
            
        }
    }
    
}
