package ders25.havaalanı.gişe.uygulaması;

import java.util.Scanner;

public class Ders25HavaalanıGişeUygulaması 
{
    public static int toplamaliyet(int toplamsure)
    {
        int havaalanigirisucreti=50;
        int dkmaaliyet=2;
        return (toplamsure*dkmaaliyet+havaalanigirisucreti);
    }
    
public static int toplamaliyet(int toplamsure, int otoparksuresi)
    {
        int havaalanigirisucreti=50;
        int dkmaaliyet=2;
        int otoparkmaliyet=3;
        return ((toplamsure*dkmaaliyet)+(otoparksuresi*otoparkmaliyet)+havaalanigirisucreti);
    }
        
    public static void main(String[] args) throws InterruptedException 
    {
        Scanner input = new Scanner(System.in);
        String message = "Havaalanımıza Hoş geldiniz\n"
                + "Havaalanı giriş ücreti 50TL'dir.\n"
                + "Havaalanı araçsız girişler için A kapısından araçlı "
                + "girişler için B kapısından giriş yapınız.\n"
                + "Havaalaninda gecirdiginiz her bir dakika icin ücrete tabi tutulacaksiniz"
                + "ve bu ücreti çikista ödeyeceksiniz.\n"
                +"Havaalaninda geçirdiginiz her dakika için 2 TL ücret alinir\n"
                + "Havaalninda aracinizla gecirdiginiz her dakika için 2 TL ve ek olarak"
                +"otoparkta geçirdiginiz her dakika için 3 TL ücret alınır.\n";
        System.out.println(message);
        System.out.println("    ");
        System.out.println("    ");
        System.out.print("Lütfen kapıyı seçiniz: ");
        String kapisecimi=input.nextLine();
        while(true)
        {
            if (kapisecimi.equals("A"))
            {
                String c1 = "Havaalanının çıkış gişesine hoş geldiniz.\n"
                        + "Lütfen havaalanında geçirdiğiniz toplam dakikayı giriniz: ";
                System.out.print(c1);
                int toplamsure=input.nextInt();
                System.out.println("Toplam ödeme miktarı: "+toplamaliyet(toplamsure)+" TL'dir.");
                System.out.println("Ödeme işleminiz gerçekleşiyor...");
                Thread.sleep(2000);
                System.out.println("Ödeme işleminiz başarıyla gerçekleşti iyi günler dileriz :)");
                return;                
            }
            else if (kapisecimi.equals("B"))
            {
                String c2= "Havaalanının çıkış gişesine hoş geldiniz.\n"
                        + "Lütfen havaalanında geçirdiğiniz toplam dakikayı giriniz: ";
                System.out.print(c2);
                int toplamsure=input.nextInt();
                System.out.print("Aracınızın otoparkta kaldığı süre: ");
                int otoparksuresi=input.nextInt();
                System.out.println("Toplam ödeme miktarı: "+toplamaliyet(toplamsure, otoparksuresi)+" TL'dir.");
                System.out.println("Ödeme işleminiz gerçekleşiyor...");
                Thread.sleep(2000);
                System.out.println("Ödeme işleminiz başarıyla gerçekleşti iyi günler dileriz :)");
                return;                
            }
            else
            {
                System.out.println("Geçersiz bir seçim yaptınız.");
                break;
            }
        }

               
    }
    
}
