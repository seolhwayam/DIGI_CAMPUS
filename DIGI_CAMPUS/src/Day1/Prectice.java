package Day1;

public class Prectice {
	
	private String menu;
	
	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}
	

	public Prectice() {
		menu = "null";
	}
	
	public Prectice(String menu) {
		this.menu = menu;
	}
	
	public void print() {
		if(menu.equals("null")) {
			System.out.println("커피메뉴를 입력하지 않았습니다.");
		}else {
			System.out.println("주문하신 커피메뉴는"+ menu +"입니다.");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Prectice co = new Prectice("커피");
				co.print();
				
				Prectice co1 = new Prectice();
				co1.print();
				
				co.setMenu("딸기라떼");
				System.out.println(co.getMenu());
	}
		
		
		
		
		
	
}
