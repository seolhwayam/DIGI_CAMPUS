
import java.util.*;
public class CalculatorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		CalculatorMethod.output(CalculatorMethod.operator(sc),CalculatorMethod.inputNum(sc),CalculatorMethod.inputNum(sc));

	}
	public static int inputNum(Scanner sc) { // 첫번째 숫자를 입력받는 함수
		System.out.println("숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();
		return num1;
	}
	public static String operator(Scanner sc) { // 연산자를 입력받는 함수
		System.out.println("연산자를 입력해주세요(+,-,*,/) : ");
		String operator = sc.next();
		return operator;
	}
	
	
	public static void output(String operator,int num1, int num2) { //연산자 구분해서 출력하기
		int result=0;
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
