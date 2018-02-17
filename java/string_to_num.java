import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String inputNum = stdin.nextLine();

		try{
			int num = Integer.valueOf(inputNum);
		}catch(NumberFormatException e){
			return;
		}

		int sum = 0;
		for(char c:inputNum.toCharArray()){
			sum += Integer.valueOf(String.valueOf(c));
		}

		System.out.println(sum);
	}


}
