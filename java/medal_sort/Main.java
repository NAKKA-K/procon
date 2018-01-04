import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		int num = Integer.valueOf(line);
		int medal[][] = new int[num][3];

		for(int i = 0; i < num; i++){
			//ƒƒ_ƒ‹”‚ÌŠi”[
			line = sc.nextLine();
			String strs[] = line.split(" ", 0);
			for(int j = 0; j < 3; j++){
				medal[i][j] = Integer.valueOf(strs[j]);
			}
		}

		//
		int rank[] = new int[num];
		int max[] = new int[3];
		for(int i = 0; i < num; i++){
			max[0] = 0; max[1] = 0; max[2] = 0;
			for(int j = i; j < num; j++){
				if(medal[i][0] > max[0]){
					max[0] = medal[i][0];
					rank[i] = j;
				}else if(medal[i][0] == max[0] && medal[i][1] > max[1]){
					max[1] = medal[i][1];
					rank[i] = j;
				}else if(medal[i][0] == max[0] && medal[i][1] == max[1] && medal[i][2] > max[2]){
					max[2] = medal[i][2];
					rank[i] = j;
				}
			}
		}

		for(int i = 0; i < num; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(medal[rank[i]][j]);
				if(j != 2){
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
