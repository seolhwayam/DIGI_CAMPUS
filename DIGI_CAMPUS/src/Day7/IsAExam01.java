package Day7;

/*is - a 관계 : 상속관계
 * extends : 상속 포현
 * 객체끼리는 단일상속만 허용한다.
 *  
 * 오버라이딩 (다형성)
 * : 부모의 메소드와 똑같은 형태로 제공
 *   내 코드가 우선
 *   부모 것을 가공하고 싶을때
 *   동적바인딩할때 필수조건
 *   부모의 내용을 수정해서 가공해서 제공하고자 할 경우
 *   
 *   
 * 우선순위는 명시적으로 상속받고 있는 클래스!
 * super은 본인거의 상속(extends)한 클래스를 말함
 * 객체쓰려면 생성자 -> 생성자 실행 -> 객체 등록
 * 
 * 
 * super호출 ,super()
 * 1. super : 부모의 맴버를 사용하고자 할때 사용.
 * 			  오버라이딩 된 맴버를 사용할때 부모를 명시적으로 적용하기 위해서 사용
 * 
 * 2. super() : 부모의 생성자를 호출
 * 				항상 sub class의 생성자 첫번째 라인에 항상 존재하고
 * 				명시적으로 사용이 가능하나 위치는 변경할 수 없다.
 * 
 * 
 * */

class A{
	public A(int a) {
		System.out.println("나는야 A 생성자 : superclass"+a);
	}
	
    public String toString() { //오버라이딩
        return super.toString() + "superman";
    }
	
	public void disp() {
		System.out.println("A.......");
	}
	
}


public class IsAExam01 extends A{ //is-a 관계 성립
	
	public IsAExam01() {
		//부모의 생성자를 호출했다.
		//super(); -생략되어 있음
		super(5); //부모의 디폴트 생성자, 내부적으로 super()가 먼저!!!최우선
		System.out.println("나는야 IsAExam01 생성자 : subclass"); 
	}
	
    public String toString() { //오버라이딩
        return super.toString() + "superman";
    }
	
	
	public static void main(String[] args) {
		IsAExam01 isa = new IsAExam01();
		System.out.println(isa); //아래와 같은 의미
		System.out.println(isa.toString()); 
		isa.disp();
		
	
	}
}
