package Day5;
class AA{
	private int aa;
	
	public AA(){
		
	}

	public int getA() {
		return aa;
	}

	public void setA(int a) {
		this.aa = aa;
	}
	
}
class BB{
	private int aa;
	
	public BB(){
		
	}

	public int getA() {
		return aa;
	}

	public void setA(int aa) {
		this.aa = aa;
	}
	
}
class CC{
	private int aa;
	
	public CC(){
		
	}

	public int getA() {
		return aa;
	}

	public void setA(int aa) {
		this.aa = aa;
	}
	
}


public class HasA2 {
	//객체주입
	private AA aa;
	private BB bb;
	private CC cc;
	
	

	public AA getAA() {
		return aa;
	}



	public void setAA(AA aa) {
		this.aa = aa;
	}



	public BB getBB() {
		return bb;
	}



	public void setBB(BB bb) {
		this.bb = bb;
	}



	public CC getCC() {
		return cc;
	}



	public void setCC(CC cc) {
		this.cc = cc;
	}



	public static void main(String[] args) {
		HasA2 has = new HasA2();
		AA a = new AA();
		BB B = new BB();
		CC C = new CC();
		
		a.setA(5);
		has.setAA(a);
		
		System.out.println(has.getAA());
		
		
	}

}
