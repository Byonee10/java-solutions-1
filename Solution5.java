import java.util.Scanner;
public class Solution5 {
    public static void main(String[] args) {
        //Girdi almak için scanner objesi yaratıyoruz.
        

        Scanner scanner = new Scanner(System.in);

        // Aracın türünü girdi olarak istiyoruz.
        System.out.println("Araç türü giriniz:");
        String aracTuru = scanner.nextLine();

        //Park süresini soruyoruz
        System.out.println("Park süresi giriniz:");

        //Aldığımız değer string olacağı için Double.parseDouble() yöntemi ile
        //bunu sayıya çeviriyoruz ki hesaplarken yazı değil sayı halini kullanalım.
        double parkSuresi = Double.parseDouble(scanner.nextLine());


        //switch ile park saatlik ücretini atıyoruz.

        double parkUcreti;
        // araç türünü belli standart kalıba sokuyoruz ki kontrol ederken 
        //büyük küçük harf ayrımı yapmasın.
        switch(aracTuru.toLowerCase()) {
            case("otomobil"): parkUcreti = 5.0;break;
            case("kamyonet"): parkUcreti = 7.5;break;
            case("kamyon"): parkUcreti = 10.0;break;
            default:
            parkUcreti = 0;
            System.out.println("Geçerli bir araç türü giriniz.");
        }

        double totalUcret = parkUcreti*parkSuresi;
        // Toplam ücreti hesapladık ve printliyoruz.
        System.out.println("Toplam ücretiniz: " + totalUcret + " TL");
    
        // Scanner'ı kapatıyoruz. Gerekli değil ama istediği için yaptım.
        scanner.close();

    }
}
