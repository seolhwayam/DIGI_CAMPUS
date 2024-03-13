package Day8;


public class InnerClassExam02 { //local inner class 
	   
	   private int a;
	   private static int b;
	   
	   public void display() { //local inner class
		   class Test { //로컬이기 때문에 그 함수 안에서 처리해야된다.
			      public void disp() {
			         System.out.println(a);
			         System.out.println(b);
			      }
			   }
		   Test t = new Test(); // inner class 객체 생성
		   t.disp(); // 함수 실행
	   }
	   
	   
	   public static void main(String[] args) {
		   
	      InnerClassExam02 outer = new InnerClassExam02();
	      outer.display();
	     
	      
	      
	      
	      
	   }
	}
