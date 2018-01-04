import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String str = "";
        for(char c:line.toCharArray()){
        	switch(c){
        	case 'A':
        		str += "4";
        		break;
        	case 'E':
        		str += "3";
        		break;
        	case 'G':
        		str += "6";
        		break;
        	case 'I':
        		str += "1";
        		break;
        	case 'O':
        		str += "0";
        		break;
        	case 'S':
        		str += "5";
        		break;
        	case 'Z':
        		str += "2";
        		break;
        	default:
        		str += c;
        	}
        }

        System.out.println(str);

	}

}
