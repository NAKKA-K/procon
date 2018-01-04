import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		String s[] = line.split(" ", 0);

		int num = Integer.valueOf(s[0]); //page
		int pageNum = Integer.valueOf(s[1]);
		int page = num / pageNum;
		int input = Integer.valueOf(s[2]);

		if(input <= page){
			for(int i = (input - 1) * pageNum + 1; i < ((input - 1) * pageNum + pageNum) + 1; i++){
				System.out.print(i);
				if(i != ((input - 1) * pageNum + pageNum)) System.out.print(" ");
			}
		}else if(input == page + 1 && num % pageNum > 0){
			for(int i = (input - 1) * pageNum + 1; i < (((input - 1) * pageNum) + (num % pageNum)) + 1; i++){
				System.out.print(i);
				if(i != (((input - 1) * pageNum) + (num % pageNum))) System.out.print(" ");
			}
		}else{
			System.out.print("none");
		}
		System.out.println();



	}

}
