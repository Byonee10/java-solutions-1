import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir film türü veya 1-3 arasında numara girin: ");
        String turadi = scanner.nextLine();

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
        else {
            System.out.print("Geçerli tür ismi veya numara giriniz");
        
        }

        scanner.close();
    }
}

