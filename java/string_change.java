import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int counter = stringChange();
		System.out.println(counter);
	}

	static int stringChange(){
		Scanner stdin = new Scanner(System.in);
		StringBuffer line1 = new StringBuffer();
		line1.append(stdin.nextLine());
		String line2 = stdin.nextLine();

		if(line1.equals(line2)){
			return 0;
		}

		int counter = 0;
		for(int i = 0; i < line2.length(); i++){
			for(int j = 0; j < line1.length(); j++){
				if(line2.charAt(i) != line1.charAt(j)){
					//TODO: replace to head
					char serchChar = line2.charAt(i);
					int indexSerchChar = line1.indexOf(String.valueOf(serchChar), j + 1);
					if(indexSerchChar == -1){
						return -1;
					}

					line1.deleteCharAt(indexSerchChar);
					line1.insert(0, serchChar);
					counter++;
					i = -1;

					System.out.println(counter + ":" + line1);
					if(line2.equals(line1.toString())){
						return counter;
					}

					break;
				}else{
					i++;
				}
			}

		}
		return counter;
	}


}
