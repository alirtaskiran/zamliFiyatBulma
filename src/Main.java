import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int zam, ilkFiyat, sonFiyat;

        System.out.println("Lutfen urune '%' kac zam geldigini yaziniz...");
        Scanner zamOrani = new Scanner(System.in);
        zam = zamOrani.nextInt();

        System.out.println("Lutfen urunun guncel fiyatini giriniz...");
        Scanner güncelFiyat = new Scanner(System.in);
        ilkFiyat = güncelFiyat.nextInt();

        sonFiyat = (ilkFiyat * zam)/100 + ilkFiyat;
        System.out.println("Urunun zamli fiyati : " + sonFiyat);

    }
}