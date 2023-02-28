package ders19.sayı.tahmin.oyunu.pkg1;

import java.util.Random;
import java.util.Scanner;

public class Ders19SayıTahminOyunu1 
{
    public static void main(String[] args) 
    {
        int tahminhakki = 6;
        String message1 = "Sayı Tahmin Oyununa Hoş Geldiniz\n"
                + "Oyunumuzda tahmin edilecek sayı 0 ile 20 arasındadır ve 6 tahmin hakkınız bulunmaktadır.\n"
                + "Tahmin bitince oyun sonlanır.\n"
                + "Ancak eğer isterseniz tekrar rastgele bir sayı atayarak oyunu tekrardan başlatabilirsiniz\n"
                + "Oyun başladı\nBaşarılar...\n"
                + "Lütfen sayı tahmininizi yapınız:";
        while(true)
        {
            System.out.println(message1);
            Random random = new Random();
            int tahminedileceksayi = random.nextInt(21);//0-20
            Scanner input = new Scanner(System.in);
            
            for (int i=tahminhakki ; i>0 ; i--) 
            {
                int tahminedilensayi = input.nextInt();
                if (tahminedileceksayi==tahminedilensayi) 
                {
                    String message2 = "Tebrikler sayıyı doğru tahmin ettiniz\n"
                            + "Tekrar oynamak için 1'e çıkmak için 0'a basınız.";
                    System.out.println(message2);
                    int cevap = input.nextInt();
                    if (cevap==0) 
                    {
                        System.out.println("Çıkış yapılıyor...");
                    }
                    else
                    {
                        break;
                    }
                }
                else if (tahminedileceksayi!=tahminedilensayi) 
                {
                    System.out.println("Hatalı bir tahmin yaptınız. "+" "+"Kalan tahmin hakkınız: "+(i-1));
                    if (i==1) 
                    {
                        String message3 = "Tahmin hakkınız bitti\n"
                                + "Tekrar oynamak için 1'e çıkmak için 0'a basınız.";
                        System.out.println(message3);
                        int cevap = input.nextInt();
                        if (cevap==0) 
                        {
                            System.out.println("Çıkış yapılıyor...");
                        }
                        else
                        {
                            break;
                        }                        
                    }
                    tahminoranı(tahminedilensayi, tahminedileceksayi);
                }
            }
        }
    }
    static void tahminoranı(int tahminedilensayi, int tahminedileceksayi)
    {
        int f = tahminedilensayi-tahminedileceksayi;
            if (f<=0 && f>-2 || f>=0 && f<2) 
            {
                System.out.println("Sayıya çok yaklaştınız."); 
            }
            else if (f<=-2 && f>-4 || f>=2 && f<4) 
            {
                System.out.println("Sayıya yaklaşıyorsunuz."); 
            }
            else if (f<=-4 && f>-14 || f>=4 && f<14) 
            {
                System.out.println("Sayıdan uzaklaşıyorsunuz."); 
            }
            else if (f<=-15 && f>-19 || f>=15 && f<19) 
            {
                System.out.println("Sayıdan çok uzaklaştınız."); 
            }
    }
}
