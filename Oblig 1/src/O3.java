import java.util.Scanner;
public class O3 {
	public static void main(String args[]) {
		Scanner tallScanner = new Scanner(System.in);
		String s = tallScanner.nextLine();
        int fakultet = Integer.parseInt(s);
        int fact = 1;
        for (int i = 1; i <= fakultet; i++) {
        fact = fact*i;
        }
        System.out.print(fact);
        tallScanner.close();
	}
}