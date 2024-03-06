
import java.util.*;
public class CalculatorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculatorMethod.output(CalculatorMethod.operator(),CalculatorMethod.inputNum1(),CalculatorMethod.inputNum2());

	}
	public static int inputNum1() { // 첫번째 숫자를 입력받는 함수
		Scanner sc= new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();
		return num1;
	}
	public static int inputNum2() {// 두번째 숫자를 입력받는 함수
		Scanner sc= new Scanner(System.in);
		System.out.println("두 번째 숫자를 입력해주세요 : ");
		int num2 = sc.nextInt();
		return num2;
	}
	public static String operator() { // 연산자를 입력받는 함수
		Scanner sc= new Scanner(System.in);
		System.out.println("연산자를 입력해주세요(+,-,*,/) : ");
		String operator = sc.next();
		return operator;
	}
	
	
	public static void output(String operator,int num1, int num2) { //연산자 구분해서 출력하기
		switch(operator) {
			case "+" :
				System.out.println(num1+operator+num2+"="+(CalculatorMethod.puls(num1,num2)));
				break;
			case "-" :
				System.out.println(num1+operator+num2+"="+(CalculatorMethod.minus(num1,num2)));
				break;
			case "/" :
				System.out.println(num1+operator+num2+"="+(CalculatorMethod.divide(num1,num2)));
				break;
			case "*" :
				System.out.println(num1+operator+num2+"="+(CalculatorMethod.multiply(num1,num2)));
				break;
			default:
				System.out.println("연산자를 잘못입력하였습니다.");
		}
	}
	
	public static int puls(int num1, int num2) { // 더하기 연산 함수
		return num1+num2;
	}
	public static int minus(int num1, int num2) { // 빼기 연산 함수
		return num1-num2;
	}
	public static int multiply(int num1, int num2) { // 곱하기 연산 함수
		return num1*num2;
	}
	public static double divide(int num1, int num2) { // 나누기 연산 함수
		return (double)num1/num2;
	}
	
	

	
	
	
	
	

}
