package Day7;
class AA{
	private int a; //10
	
	public AA(int a) {
		this.a = a;
	}


	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
}
class BB extends AA{//20
	private int b;
	
	public BB(int a, int b) {
		super(a);
		this.b = b;
		
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
}

class CC extends BB{//30
	private int c;
	
	public CC(int a, int b, int c) {
		super(a,b);
		this.c = c;
	}	

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	
}
public class SuperExam01   {
	public static void main(String[] args) {
		CC cc = new CC(10,20,30);
		cc.setA(5);

		System.out.println(cc.getA()); //10
		System.out.println(cc.getB()); //20
		System.out.println(cc.getC()); //30
		
	}

}
