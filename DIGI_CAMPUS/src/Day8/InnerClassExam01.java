package Day8;
/*Inner class 
 * : outer class의 맴버를 내것처럼 사용할 수 있게 해주는 클래스
 *   특정목적 1. outer class의 맞는 목적
 *   	   2. event 처리시 주로 사용
 *   
 * 1. member inner class ★ : outerclass 안에 innerclass 사용시
 * 2. static inner class : inner class 앞에 static 붙이기(outer클래스 중에 static만 쓰고 싶을 때!!)
 * 3. local inner class : outer class메소드 안에 클래스
 * 4. anonymous inner class(익명) ★  : 익명 클래스 생성
 * 
 * 
 * outer class
 * inner class
 * 
 * 
 * */

public class InnerClassExam01 { //member inner class 
	   
	   private int a;
	   private static int b;
	   
	   class Test {
	      public void disp() {
	         System.out.println(a);
	         System.out.println(b);
	      }
	   }
	   public static void main(String[] args) {
	      
	      InnerClassExam01 outer = new InnerClassExam01();
	      InnerClassExam01.Test inner = outer.new Test();
	      
	      InnerClassExam01.Test test = new InnerClassExam01().new Test();
	      inner.disp();
	      test.disp();
	      
	      
	      
	      
	   }
	}