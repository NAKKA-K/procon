import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String line1 = stdin.nextLine();
		int breakFloor = Integer.valueOf(stdin.nextLine());

		int floor = 0;
		for(int i = 1; i < Integer.valueOf(line1) + 1; i++){
			if((floor + i) == breakFloor){
				continue;
			}

			floor += i;
		}

		System.out.println(floor);
	}


}
