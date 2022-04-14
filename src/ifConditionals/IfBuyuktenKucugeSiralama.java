package ifConditionals;

public class IfBuyuktenKucugeSiralama {
    public static void main(String[] args) {

        // elimizde olan 3 sayiyi kucukten buyuge dogru siralamak

        int sayi1 = 23;
        int sayi2 = 13;
        int sayi3 = 55;

        if(sayi1>sayi2 && sayi1>sayi3 )
        {
            System.out.println("en buyuk sayinin girilen degeri : " + sayi1);
        }
        if (sayi2>sayi1 && sayi2>sayi3)
        {
            System.out.println("en buyuk sayinin girilen degeri : " + sayi2);
        }
        if (sayi3>sayi1 && sayi3>sayi2)
        {
            System.out.println("en buyuk sayinin girilen degeri : " + sayi3);
        }
    }
}
