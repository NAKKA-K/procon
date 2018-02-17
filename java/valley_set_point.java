import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int win = stdin.nextInt();
		int lose = stdin.nextInt();
		int setGet = stdin.nextInt();
		int setLost = stdin.nextInt();

		int[][] re = new int[win + lose][2];
		int reIndex = 0;

		for(int i = 0; i < win; i++){
			re[reIndex++][0] = 3;
		}
		for(int i = 0; i < lose; i++){
			re[reIndex++][1] = 3;
		}

		try{
			reIndex = 0;
			if(setGet % win == 0){
				for(int i = 0; i < win; i++){
					re[reIndex++][1] = 0;
				}
			}else if(setGet - (win * 3) / (win + lose) == 0){
					re[reIndex++][1] = setGet - (win * 3);
			}else{
				System.out.println("AMBIGUITY");
				return;
			}

			if(setLost % lose == 0){
				for(int i = 0; i < lose; i++){
					re[reIndex++][1] = 3;
				}
			}else if(setLost - (lose * 3) / (win + lose) == 0){
				re[reIndex++][1] = setLost - (lose * 3);
			}else{
				System.out.println("AMBIGUITY");
				return;
			}
		}catch(ArithmeticException e){
			System.out.println("AMBIGUITY");
			return;
		}

		for(int i = 0; i < re.length; i++){
			System.out.print(re[i][0] + "-" + re[i][1] + ",");
		}
	}

}
