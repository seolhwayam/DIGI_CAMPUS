package Day8;

import java.util.InputMismatchException;
import java.util.Scanner;

/*예외처리
 * - 정상적인 마무리를 수행하게 해줌
 * - try ~ catch문
 * 
 * 
 * 
 * 
 * */
public class ExceptionExam01 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try { //예외처리
			int num = sc.nextInt();
			System.out.println(3/num);
		}catch(ArithmeticException e) {
			System.out.println("Bye");
		}catch(Exception e) {
			System.out.println("먼가 에러가 있습니다.");
		}
		
	}
}


