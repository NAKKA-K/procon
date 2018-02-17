import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String line1 = stdin.nextLine();
		String line2 = stdin.nextLine();

		try{
			if((1 > Integer.valueOf(line1) || Integer.valueOf(line1) > 1000) && (line2.length() < 1 || line2.length() > 50)){
				return;
			}
		}catch(NumberFormatException e){
			return;
		}

		ArrayList<Integer> returnArray = new ArrayList<Integer>();
		for(int i = 1, arrayIndex = 0; i <= Integer.valueOf(line1) && arrayIndex < line2.length(); i++){
			if(line2.charAt(arrayIndex) == 'R' && isPrime(i, Integer.valueOf(line1))){
				returnArray.add(i);
				arrayIndex++;
			}else if(line2.charAt(arrayIndex) == 'B' && isPrime(i, Integer.valueOf(line1)) == false){
				returnArray.add(i);
				arrayIndex++;
			}
		}

		for(int value:returnArray){
			System.out.println(value + " ");
		}
	}

	static boolean isPrime(int num, int maxNum){
		if(num < 2){
			return false;
		}else if(num == 2){
			return true;
		}

		for(int j = 2; j <= maxNum; j++){
			if(num % j == 0 && num != j){
				return false;
			}
		}

		return true;
	}

}
