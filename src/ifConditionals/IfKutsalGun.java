package ifConditionals;

import java.util.Scanner;

public class IfKutsalGun {
    public static void main(String[] args) {

        //  Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
        //gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
        //ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        System.out.println("Bir gun giriniz");
        Scanner girilenGun=new Scanner(System.in);
        String gun=girilenGun.nextLine().toLowerCase();

        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe")
        || gun.equals("cuma") || gun.equals("cumartesi") || gun.equals("pazar"))
        {
            if (gun.equals("cuma"))
            {
                System.out.println("Muslumanlar icin kutsal gun");
            }
            else if (gun.equals("cumartesi"))
            {
                System.out.println("Yahudiler icin kutsal gun");
            }
            else if (gun.equals("pazar"))
            {
                System.out.println("Hiristiyanlar icin kutsal gun");
            }
            else
            {
                System.out.println("Girdiginiz gun kutsal gun degildir");
            }
        }
        else
        {
            System.out.println("Gecersiz bir gun girdiniz girdiginiz gun : " + gun);
        }
    }
}
