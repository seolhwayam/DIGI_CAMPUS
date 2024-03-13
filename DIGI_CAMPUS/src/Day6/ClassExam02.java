package Day6;

public class ClassExam02 {
	
	private int a; //필드
	
	
	public ClassExam02() { //디폴트 생성자
		System.out.println("디폴트 생성자");
	}
	
	public ClassExam02(int aa) { //디폴트 생성자
		a=aa;
	}
	
	//method : getter(외부에서 필드값을 얻어감) / setter(외부에서 주는데이터를 입력)
	public void setA(int num) {
		a = num;
	}
	
	public int getA() {
		return a;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassExam02 ce1 = new ClassExam02(100); //생성자 호출
		ClassExam02 ce2 = new ClassExam02(); //생성자 호출
		ClassExam02 ce3 = new ClassExam02(); //생성자 호출
		
		ce2.setA(500);
		System.out.println(ce1.getA());
		System.out.println(ce2.a);
		System.out.println(ce3.a);
		
		
	}

}
