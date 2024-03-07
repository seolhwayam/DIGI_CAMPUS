import java.util.Scanner;

public class Calc3 {
	//변수선언
	private	int num1,num2;
	private	char ch;
	private double result; 
			
	public Calc3() {
		
	}
	public Calc3(int n1,char c,int n2) {
		num1 = n1;
		ch = c;
		num2 = n2; 
	}
	
	public void setNum1(int n) {
		num1 = n;
	}
	public void setNum2(int n) {
		num2 = n;
	}
	public void setCh(char c) {
		ch = c; 
	}
	
	public int getNum1() {
		return num1; 
	}
	public int getNum2() {
		return num2;
	}
	public char getCh() {
		return ch;
	}
	
	public double puls(int num1, int num2) { // 더하기 연산 함수
		return result = num1+num2;
	}
	public double minus(int num1, int num2) { // 빼기 연산 함수
		return result = num1-num2;
	}
	public double multiply(int num1, int num2) { // 곱하기 연산 함수
		return result = num1*num2;
	}
	public double divide(int num1, int num2) { // 나누기 연산 함수
		return result = num1/num2;
	}
	
	public void outPut(int n1,int n2) {
		System.out.println(num1+""+ch+""+num2+"="+result);
	}
	
	
	public void select() {
		switch (ch) {
			case '+':
				puls(num1,num2);
				break;
			case '-':
				minus(num1,num2);
				break;
			case '*':
				multiply(num1,num2);
				break;
			case '/':
				divide(num1,num2);
				break;
		}
		outPut(num1,num2);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String answer;
		
		Calc3 calc = new Calc3();
		
		do {
			System.out.println("숫자를 입력해주세요 : ");
			calc.setNum1(sc.nextInt());
			System.out.println("연산자를 입력해주세요 : ");
			calc.setCh(sc.next().charAt(0));
			System.out.println("숫자를 입력해주세요 : ");
			calc.setNum2(sc.nextInt());
			
			calc.select();
			System.out.println("계산기를 계속 이용하겠습니까?(y/Y) : ");
			answer = sc.next();
		}while(answer.equals("y")||answer.equals("Y"));
		System.out.println("계산기가 종료되었습니다.");
		
	
	}

}

