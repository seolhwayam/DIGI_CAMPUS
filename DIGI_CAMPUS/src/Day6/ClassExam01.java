package Day6;

public class ClassExam01 {
	/*[구성요소]
	 * 1. field 
	 * - 객체가 생성된 후 지속적으로 사용되어지는 변수
	 * - 접근지정자 주로 private
	 * - static , final(읽기전용, 상수화)
	 * - 인스턴스 field , static field
	 * 
	 * 
	 * 2. constructor(생성자 함수)
	 * - 객체 생성시 자동호출되어지는 함수(only one호출)
	 * - 생성자 함수를 명시적으로 제공하지 않을 경우 디폴트 생성자를 제공(내부적)
	 * - 리턴타입이 존재하지 않음.
	 * - 함수명은 클래스이름과 동일함.
	 * - 기능
	 * 	1) 디폴트 기능 : 객체 등록
	 * 	2) 사용자 기능 : 겍체 생성시 필드 초기화
	 * - 오버로딩 가능
	 * - 접근지정자를 주로 public으로 지정.
	 * - 디폴트생성자를 명시적으로 만들경우 숨어있는 디폴트는 제공하지 않는다.
	 * - 명시적으로 생성자를 하나이상 만들경우 디폴트는 제공하지 않는다.
	 * 
	 * 3. method
	 * - 외부에서 내부의 필드를 접근해서 사용할 수 있게 하기위해.
	 * - 접근지정자를 주로 public으로 지정
	 * - 인스턴스 메소드,static 메소드
	 * -> this 여부(o 인스턴스 / x static)
	 * - 오버로딩이 가능하다.(다형성)
	 * 
	 * [오버로딩]
	 * : 동일한 함수명으로 여러개의 함수를 만들어서 제공(편의성)
	 * - 같은 기능을 수행하는 것을 하나의 이름으로 묶어서 제공함으로써 사용자가 편하게 쓸수있게 해주는 기능.
	 * - 함수명을 동일하게 하면서(매개변수, 인자, agument)를 구분을 할수있어야한다.
	 *	1) 매개변수 개수가 다를 경우
	 *	2) 매개변수 타입이 다를 경우
	 * 
	 * static은 미리 만들어진 것
	 * */
	
	private int a;
	private int b;
	private int c;
	
	public void output(int a,int b) {
		
	}
	public void output(int a) {
		
	}
	public void output(double a) {
		
	}
	public void output() {
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
