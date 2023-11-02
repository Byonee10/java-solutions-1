import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        //Girdi almak için scanner objesi yaratıyoruz.
        Scanner scanner = new Scanner(System.in);
        // Girdi istediğimizi belirtiyoruz.
        System.out.print("Bir film türü veya 1-3 arasında numara girin: ");
        //Girdimizi okuyor.
        String turadi = scanner.nextLine();
        //Turadi'ya atadığımız değeri kontrol ediyoruz ve filmleri printliyoruz.
        // 1 ila 3 arası değer de alabilir alternatif için.
        if (turadi.equalsIgnoreCase("aksiyon")|| turadi.equals("1")){
            System.out.println("Tür adı: Aksiyon");
            System.out.println("Matrix");
            System.out.println("Die Hard");
            System.out.println("Mad Max");
        }
        else if(turadi.equalsIgnoreCase("komedi")||turadi.equals("2")){
            System.out.println("Tür adı: Komedi");
            System.out.println("Superbad");
            System.out.println("The Hangover");
            System.out.println("Dumb and Dumber");
        }
        else if(turadi.equalsIgnoreCase("dram")||turadi.equals("3")){
            System.out.println("Tür adı: Dram");
            System.out.println("The Shawshank Redemption");
            System.out.println("Forrest Gump");
            System.out.println("The Green Mile");
        }
        // Eğer girdimiz aksiyon/dram/komedi veya 1-3 arası numara değilse bunu printliyoruz.
        
        else {
            System.out.print("Geçerli tür ismi veya numara giriniz");
        
        }
        // Scanner'ı kapatıyoruz. Gerekli değil ama istediği için yaptım.
        scanner.close();
    }
}

