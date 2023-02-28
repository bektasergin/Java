package ders12.banka.uygulaması;

import java.util.Scanner;

public class Ders12BankaUygulaması 
{

    public static void main(String[] args) 
    {
        double faiz_orani = 24;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Yatırmak istediğiniz para tutarını giriniz: ");
        double anapara = input.nextDouble();
        
        System.out.print("Vade süresini giriniz(yıl cinsinden): ");
        int vade_suresi = input.nextInt();
        
        double faiz_getirisi = (anapara)*(faiz_orani/100)*vade_suresi;
        
        double toplam_getiri = (anapara+faiz_getirisi);
        
        System.out.println("Faiz getirisi: "+ faiz_getirisi+"TL'dir. ");
        System.out.println("Faiziyle beraber alınan tutar: "+toplam_getiri+"TL'dir. ");
        
    }
    
}
