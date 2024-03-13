package Day8;

public class InnerClassExam03 { //anonymous inner class
	private int a;
	public void dispinter() {
		new Aaa() { //Aaa는 인터페이스

			@Override
			public void disp() { //Aaa의 추상메소드를 오버라이딩
				// TODO Auto-generated method stub
				System.out.println(a);
			}
			
			
		}.disp(); //익명객체 생성 -> 일회성으로 실행
	}
	public static void main(String[] args) {
		InnerClassExam03 inter = new InnerClassExam03();
		inter.dispinter();
	}

}
