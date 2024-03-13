package Day8;

public class InterExam01 implements Ccc {
	
	
	public static void main(String[] args) {
		Ccc inter = new InterExam01(); //동적바인딩
		inter.disp();
		inter.disp2();
		//inter.disp3(); //접근 불가
		inter.disp4();
	}
	
	public void disp3() {
		System.out.println("Disp3");
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Disp");
		
	}

	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		System.out.println("Disp2");
		
	}
	



}
