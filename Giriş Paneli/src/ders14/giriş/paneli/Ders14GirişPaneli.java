package ders14.giriş.paneli;

import java.util.Scanner;

public class Ders14GirişPaneli 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        String kadi1 = "Programlamagunlugum";
        String ksifre1 = "112233";
        
        System.out.print("Lütfen kullanıcı adını giriniz: ");
        String kadi2 = input.nextLine();
        System.out.print("Lütfen kullanıcı şifrenizi giriniz: ");
        String ksifre2 = input.nextLine();
        
        if (kadi1.equals(kadi2) && ksifre1.equals(ksifre2)) 
        {
            System.out.println("Giriş başarılıdır. \n Hoş geldiniz. ");
        }
        else if (kadi1.equals(kadi2) &&! ksifre1.equals(ksifre2)) 
        {
            System.out.println("Girmiş olduğunuz şifre hatalıdır! ");
        }
        else if (!kadi1.equals(kadi2) && ksifre1.equals(ksifre2)) 
        {
            System.out.println("Girmiş olduğunuz kullanıcı adı hatalıdır! ");
        }
        else
        {
            System.out.println("Bilgileriniz hatalıdır lütfen tekrar deeyiniz! ");
        }
    }
    
}
