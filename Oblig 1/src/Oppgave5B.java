import java.util.Scanner;
public class Oppgave5B {
    public static void main(String args[]) {
    	Scanner karaktererScanner = new Scanner(System.in);
    	for (int i = 0; i < 10; i++) {
        String karakterer = karaktererScanner.nextLine();
        int karakter = Integer.parseInt(karakterer);
        
        if (0 <= karakter && karakter <= 39 ) {
            System.out.println("Karakteren din er F.");
        }
        if (40 <= karakter && karakter <= 49) {
            System.out.println("Karakteren din er E");
        }
        if (50 <= karakter && karakter <= 59) {
            System.out.println("Karakteren din er D");
        }
        if (60 <= karakter && karakter <= 79) {
            System.out.println("Karakteren din er C");
        }
        if (80 <= karakter && karakter <= 89) {
            System.out.println("Karakteren din er B");
        }
        if (90 <= karakter && karakter <= 100) {
            System.out.println("Karakteren din er A");
        }
        if (100 < karakter || karakter < 0) {
            System.out.println("Ugildig karakter tall. Prøv på nytt.");
            i--;
        }
    }
        karaktererScanner.close();
}
}