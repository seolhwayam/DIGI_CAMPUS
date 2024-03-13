package Day8;

import java.util.Scanner;

public class Exception_test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a = "a";
		
		
		try {
			int num = Integer.parseInt(a);
			System.out.println(num);
		}catch(NumberFormatException e) {
			System.out.println("문자로 바꿀 수 없는 숫자형입니다.");
		}
		
		
		
	}

}
