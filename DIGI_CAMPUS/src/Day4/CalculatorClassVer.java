package Day4;

public class CalculatorClassVer {
	
	private int num1;
	int num2;
	String operator;
	
	
	public CalculatorClassVer(int num1, int num2, String operator) {
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public String getOperator() {
		return operator;
	}
	
	
	
	public void output(int num1, int num2,String operator) { //연산자 구분해서 출력하기
		switch(operator) {
			case "+" :
				System.out.println(num1+operator+num2+"="+(puls(num1,num2)));
				break;
			case "-" :
				System.out.println(num1+operator+num2+"="+(minus(num1,num2)));
				break;
			case "/" :
				System.out.println(num1+operator+num2+"="+(divide(num1,num2)));
				break;
			case "*" :
				System.out.println(num1+operator+num2+"="+(multiply(num1,num2)));
				break;
		}
	}
	
	public int puls(int num1, int num2) { // 더하기 연산 함수
		return num1+num2;
	}
	public int minus(int num1, int num2) { // 빼기 연산 함수
		return num1-num2;
	}
	public int multiply(int num1, int num2) { // 곱하기 연산 함수
		return num1*num2;
	}
	public double divide(int num1, int num2) { // 나누기 연산 함수
		return (double)num1/num2;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorClassVer c1 = new CalculatorClassVer(5,2,"*");
		c1.output(c1.getNum1(), c1.getNum2(), c1.getOperator());
		
		
		CalculatorClassVer c2 = new CalculatorClassVer(5,2,"+");
		c2.output(c2.getNum1(), c2.getNum2(), c2.getOperator());

	}

}
