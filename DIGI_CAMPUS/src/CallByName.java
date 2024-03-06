/*인스턴스 메소드
 * : 객체 생성 후 사용 가능
 * 
 * static 메소드
 * : 객체 유무와 상관없이 사용 가능
 * 
 * 
 * 
 * 
 * */

public class CallByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByName.display2();
		
		CallByName cbn = new CallByName();
		cbn.display();
		cbn.display2();
		
		int num = 100;
		num = cbn.display3(num);
		
		
		System.out.println(num);
		
		String str = new String("superman");
		cbn.dispaly4(str);
		
		
	}
	public void display() { //call by name
		System.out.println("call by name1");
	};
	
	public static void display2() { //call by name
		System.out.println("call by name2");
	};
	public int display3(int num) {
		System.out.println(num);
		num++;
		System.out.println(num);
		return num;
	};
	public void dispaly4(String s) {
		System.out.println(s);
	};
}
