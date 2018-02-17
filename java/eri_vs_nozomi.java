import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String line1 = stdin.nextLine();

		if(line1.charAt(0) == 'E' || line1.charAt(line1.length() - 1) == 'E')
			System.out.println("Eri");
		else
			System.out.println("Nozomi");
	}

}
