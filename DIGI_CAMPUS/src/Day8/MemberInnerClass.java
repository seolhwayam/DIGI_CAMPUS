package Day8;

class StaticInnerClass{ //정적 inner class
	private int a=30;
	private static int b=50;
	
	static class Inner{
		public void sayStaticInnerClass() {
			System.out.println(b);
		}
	}
}


class LocalInnerClass{ //지역 inner class
	private int a=30;
	private static int b=50;
	public void sayLocalOuterClass() {
		class Inner{
			public void sayStaticInnerClass() {
				System.out.println("나는 inner"+a);
			}
		}
		Inner i = new Inner();
		i.sayStaticInnerClass();
	}
	
}

class AnonymousInnerClass{ //익명 inner class
	private int a=30;
	private static int b=50;
	public void sayAnonymousInnerClass(){
		new Aaa() {

			@Override
			public void disp() {
				// TODO Auto-generated method stub
				
				System.out.println("이것은 익명이너클래스");
				
			}
			
		}.disp();
	}
	
}


class AnonymousInnerClass2{ //익명 inner class
	private int a=30;
	private static int b=50;
	public void sayAnonymousInnerClass(){
		class inner{

			public void disp() {
				// TODO Auto-generated method stub
				System.out.println("이것은 익명이너클래스");
				
			}
			
		}
		new inner() {	
		}.disp();
	}
	
}

	


public class MemberInnerClass  { //맴버 inner class
	private int a=30;
	
	class Inner{
		public void sayMemberInnerClass() {
			System.out.println(a);
		}
	}
	
	
	public static void main(String[] args) {
		//MemberInnerClass : outer 맴버필드 자유롭게 사용가능
		//사용법 : outer클래스이름.inner클래스이름  inner클래스객체이름  = new outer클래스이름(). new inner클래스 이름();
		//       inner클래스객체이름.(메소드 등)  -> innercalss내에 것 실행
		
		MemberInnerClass.Inner member = new MemberInnerClass().new Inner(); 
		member.sayMemberInnerClass();
		
		//SstaticInnerClass : outer static맴버필드 자유롭게 사용가능 
		//                  : inner class 앞에 static키워드 붙이기
		//사용법 : outer클래스이름.inner클래스이름  inner클래스객체이름  = new outer클래스이름.inner클래스 이름();
		//      inner클래스객체이름.(메소드 등)  -> innercalss내에 것 실행
		StaticInnerClass.Inner staticInner = new StaticInnerClass.Inner();
		staticInner.sayStaticInnerClass();
		
		//LocalInnerClass : outer class 메소드 내에 클래스
		// 				  : outer class 메소드 내에 클래스 안에서 "객체 생성 및 사용하고 싶은 구현 실행"해놓아야됨
		//사용법 : outer클래스이름 객체이름 = new outer클래스이름();
		//      객체이름.(메소드 등)
		//
		// ->  객체이름.(메소드 등) 하자마자 outer클래스내에 함수 발동!! -> inner클래스 내 적어뒀던"객체 생성 및 사용하고 싶은 구현 실행"로 바로 실행!!
		LocalInnerClass i = new LocalInnerClass();
		i.sayLocalOuterClass();
		
		
		//AnonymousInnerClass : outer클래스 내에 익명객체 생성하여서 사용
		//                    : outer클래스 메소드 내에 inner 클래스 생성 후 바로 객채생성(new inner클래스이름() ) 후 바로 inner클래스내 기능 실행
		//사용법 : 내부적으로 new innerclass이름(){        }.(메소드 등 실행)
		//       outet클래스이름 outer객체이름 = new outer클래스이름();
		//       outer클래스객체.(메소드등)
		AnonymousInnerClass a= new AnonymousInnerClass();
		a.sayAnonymousInnerClass();

		
	}

}
