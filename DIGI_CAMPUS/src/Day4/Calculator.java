package Day4;
import java.util.*;

public class Calculator {
	public static void main(String[] args) {
	String answer; //사용자 계산기 지속여부 질의 변수
	do{
		Scanner sc = new Scanner(System.in);	
		 System.out.print("num1의 값:"); 
		 int num1 = sc.nextInt();//첫번째 숫자 입력 
		 System.out.print("+,-,*,/ 중 택1하여 입력해주세요:");
		 String operator = sc.next();//연산자 입력 
		 System.out.print("num2의 값:");
		 int num2 = sc.nextInt();//두번째 숫자 입력 
		 	
		 //계산기 구문 연산자에 따른 다른 결과값 출력
		 if (operator.equals("+")) { 
			 System.out.println(num1 + "" + operator + "" + num2 + "=" + (num1 + num2));
		 } else if (operator.equals("-")) {
			 System.out.println(num1 + "" + operator + "" + num2 + "=" + (num1 - num2));
		 } else if (operator.equals("*")) {
			 System.out.println(num1 + "" + operator + "" + num2 + "=" + (num1 * num2));
		 } else if (operator.equals("/")) {
			 System.out.println(num1 + "" + operator + "" + num2 + "=" + ((double) num1 / num2));
		 } else {
			 System.out.println("올바른 부호를 입력해주세요!!");
		 }
		 System.out.println("계산기를 계속 사용하시겠습니까? (y/Y 또는 N 을 눌러주세요)");
		 answer = sc.next(); // 계산기 사용여부 확인
	}while(answer.equals("Y")||answer.equals("y")); //Y또는y입력시 계산기 계속이용
		 System.out.println("계산기가 종료되었습니다."); //Y또는y 외 입력시 계산기 종료안내 출력

}
	}
