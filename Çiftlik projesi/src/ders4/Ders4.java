package ders4;

public class Ders4 
{
    public static void main(String[] args) 
    {
        int koyun=5;
        int kopek=4;
        int kedi=9, inek=6;
        
        int sutSatisFiyati=5;
        float gunlukSutMiktari=158.45f;
        
        System.out.println("Köpek sayısı: "+kopek);
        System.out.println("Koyun sayısı: "+koyun);
        System.out.println("Kedi sayısı: "+kedi);
        System.out.println("İnek sayısı: "+inek);
        
        double sutGeliri=gunlukSutMiktari*sutSatisFiyati;
        int toplamHayvanSayisi=koyun+kopek+kedi+inek;
        
        System.out.println("Çiftlikteki hayvan sayısı: "+toplamHayvanSayisi);
        System.out.println("Günlük süt geliri: "+sutGeliri);


    }
}
