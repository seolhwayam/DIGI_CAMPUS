package Day8;
/*인터페이스
 * 상수, 추상메소드만! 생성가능
 * 변수 -> 상수만 가능(fianl static 생략되어 있음)
 * 메소드 -> 추상만 가능( abstract 생략되어 있음)
 * 
 * 인터페이스는 다중상속을 대체,.
 * 구현객체는 무조건 오버라이딩을 제공해야 객체를 생성할 수 있다.
 * implements 인터페이스이름1, 인터페이스이름2..... -> 다중상속 가능
 * 인터페이스끼리는 다중상속 가능
 * */

public interface Aaa {
	int A =10; //인터페이스 상에는 변수 상수로 인식 | fianl static 생략되어 있음
	
	void disp(); //abstract 생략되어 있음.
	

}
