package ifConditionals;

import java.util.Scanner;

public class IfHarfOldAnlama {
    public static void main(String[] args) {

        // girilen bir karakteri harf olup olmadigini bulalim

        System.out.println("Bir karakter giriniz");

        Scanner girilenKarakter=new Scanner(System.in);
        char karakter=girilenKarakter.next().charAt(0);

        if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z'))
        {
            System.out.println("Girilen karakter harfir");
        }
        else
        {
            System.out.println("Giridigniz karakter harf degildir");
        }
    }
}
