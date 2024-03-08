class A{
	private int a;
	
	public A(){
		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}


public class HasA2 {
	private String name;
	private A age;
	

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(A age) {
		this.age=age; 
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return this.age.getA();
	}


	public static void main(String[] args) {
		//한페이지에 클래스 만들 시에 public은 하나만 가능
		HasA has = new HasA();
		has.setName("김설화");
		has.setAge(25);
		
		System.out.println(has.getName());
		System.out.println(has.getAge());
		
	}

}
