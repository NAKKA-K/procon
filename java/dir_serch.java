import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String lookDir = stdin.nextLine();
		String nowDir = stdin.nextLine();

		if(lookDir.equals(nowDir))
			System.out.println(lookDir);

		String lookDirArray[] = lookDir.split("/");
		String nowDirArray[] = nowDir.split("/");

		StringBuffer path = new StringBuffer();
		int count = 0;
		for(int i = 1; i < lookDirArray.length && i < nowDirArray.length; i++){
			System.out.println(lookDirArray[i] + ":" + nowDirArray[i]);
			if(lookDirArray[i].equals(nowDirArray[i])){
				count++;
			}else{
				break;
			}
		}

		for(int i = count; i < nowDirArray.length - 1; i++){
			path.append("../");
		}

		for(int i = count + 1; i < lookDirArray.length; i++){
			if(i == lookDirArray.length -1){
				path.append(lookDirArray[i]);
				break;
			}
			path.append(lookDirArray[i] + "/");
		}


		System.out.println(path.toString());
	}


}
