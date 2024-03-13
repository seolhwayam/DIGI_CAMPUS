package Day8;

import java.util.Scanner;
//throws
// public static void main(String[] args) "throws ArithmeticException, InterruptedException"
public class ExceptionExam02 extends Exception {
	
	public static void main(String[] args) { //InterruptedException들이 처리해줄거야~~
		Scanner sc =new Scanner(System.in);
		
		//Thread.sleep(2000);
		
		try {
			int num = sc.nextInt();
			System.out.println(3/num);
		} catch (ArithmeticException e) {
		// TODO Auto-generated catch block
			System.out.println("저대로 입력하세용");
			return ; //프로그램 종료
		}finally {//무조건 실행시켜야하는 코드
			System.out.println("Bye");
		}
		
		
		
		
//		try {
//			Thread.sleep(2000); //2초만 자~ (1000=1초)
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

	
	}
}
