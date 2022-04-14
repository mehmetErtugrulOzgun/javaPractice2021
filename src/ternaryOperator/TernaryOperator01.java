package ternaryOperator;

public class TernaryOperator01 {
    public static void main(String[] args) {

        // Not1 : Ternaryi islemi If Statement ile yapacagimiz islemleri basit olarak yapmamizi saglar
        // Not2 : Ternaryi islemi bize bir sonuc donecegi icin, bu islemi bir variable’a atamaliyiz.

        int x=10;

        String sonuc=(x/2==0) ? "cift sayi" : "tek sayi";
        System.out.println(sonuc);
    }
}
