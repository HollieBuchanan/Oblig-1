import java.util.Scanner;
public class Oblig1 {
    public static void main(String args[]) {
        Scanner inn = new Scanner(System.in);
        String lønn = inn.nextLine();
        int nettolønn = Integer.parseInt(lønn);
        if (nettolønn < 164101) {
            System.out.println("Ingen skatt, lønn din er " + nettolønn + "kr");
        }
        if (164100 < nettolønn && nettolønn < 230951) {
            double skatt1 = nettolønn*0.0093;
            int skatt1a = (int)skatt1;
            nettolønn = nettolønn - skatt1a;
            System.out.println("Skatt på 0.93%, lønn din er " + nettolønn + "kr");
        }
        if (230950 < nettolønn && nettolønn < 580651) {
            double skatt2 = nettolønn*0.0241;
            int skatt2a = (int)skatt2;
            nettolønn = nettolønn - skatt2a;
            System.out.println("Skatt på 2.41%, lønn din er " + nettolønn + "kr");
        }
        if (580650 < nettolønn && nettolønn < 934051) {
            double skatt3 = nettolønn*0.1152;
            int skatt3a = (int)skatt3;
            nettolønn = nettolønn - skatt3a;
            System.out.println("Skatt på 11.52%, lønn din er " + nettolønn + "kr");
        }
        if (934051 < nettolønn) {
            double skatt4 = nettolønn*0.1452;
            int skatt4a = (int)skatt4;
            nettolønn = nettolønn - skatt4a;
            System.out.println("Skatt på 14.52%, lønn din er " + nettolønn + "kr");
        } 
       inn.close();
    }
}
