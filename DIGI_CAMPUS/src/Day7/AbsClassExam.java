package Day7;

/*추상 클래스
 * : 추상 메소드를 하나이상 가지고 있는 클래스
 * : 추상 클래스는 객체 생성을 할 수는 없고, 상속을 해주는 목적으로 사용한다.
 * 
 * 추상 메소드
 * : 서브 클래스의 강제성을 부여 (오버라이딩)
 * : 오버라이딩을 하지 않을경우 서브 클래스도 추상 클래스화 되서 객체생성 불가
 * 
 * 상속관계시 항상 공통횐것은 수퍼클래스에 정의
 * 개념적으로는 수퍼에 있어야하지만 기능적으로 수퍼에 정의할수 없을때 만든다.
 * 
 * 
 * 
 * */
abstract class Area{ //추상클래스
	public abstract void draw(); //추상메소드
}

class Rect extends Area{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rect");
		
	}
	
}

class Circle extends Area{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}
	
}

class Tri extends Area{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Tri");
		
	}
	
}
public class AbsClassExam {
	public static void main(String[] args) {
		Tri tri = new Tri();
		tri.draw();
		Rect rect = new Rect();
		rect.draw();
		Circle cir = new Circle();
		cir.draw();
		
		
		
		
		
	}

}
