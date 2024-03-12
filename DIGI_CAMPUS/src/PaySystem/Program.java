package PaySystem;

import java.util.Scanner;


public class Program {
	EmployeeData employee = new EmployeeData();
	Admin admin = new Admin();
	Scanner sc = new Scanner(System.in);
	private int start = 0;
	
	
	public void menuAdmin() {
		boolean a = true;
		System.out.println("관리자 급여시스템 시작합니다");
		if (start != 0) {//직원생성시
			System.out.println("사번을 입력해주세요 : ");
			int EmployeeNumber = sc.nextInt();
			int Number = pickEmployeeNumber(EmployeeNumber);
			if (employee.getEmployeeData(Number).getAdminYN().equals("N")) {
				System.out.println("당신은 관리자가 아닙니다. ");
				menuAdmin();
			}else if (employee.getEmployeeData(Number).getAdminYN().equals("Y")) {
				while (a == true) {
					adminMethod();
					break;
				}
			}
		} else {
			while (a == true) {
				adminMethod();
				break;
			}
		}
	}
	
	public void adminMethod () {
		boolean a = true;
		while(a==true) {
			System.out.println("메뉴를 선택해주세요 (1.직원생성 2.직원직급/계약직여부 변경 3.직원조회 4.급여체계 변경 5.종료)");
			int select = sc.nextInt();
			switch(select) {
				case 1:
					System.out.println("직원 생성메뉴입니다. 순서대로 입력해주세요 (이름,사번,직급,연차,계약직,관리자여부)");
					System.out.println("계약직과 관리자 여부는 Y/N입력 해주세요.");
					admin.addEmployee(sc.next(), sc.nextInt(), sc.next(),sc.nextInt(), sc.next(), sc.next());
					start =1;
					break;
				case 2:
					System.out.println("직원 변경 메뉴입니다 (1.직급 변경 2.계약직 변경)");
					int num = sc.nextInt();
					if(num==1) {//직급변경
						System.out.println("직원 직급 변경 메뉴입니다.");
						admin.changeRank();
					}else if(num==2) {
						System.out.println("직원 계약직 여부 변경 메뉴입니다.");
						admin.changeContractWoker();
					}
					break;
				case 3:
						admin.information();					
					break;
				case 4:
					System.out.println("급여체계 변경입니다. 변경하실 급여를 입력해주세요");
					System.out.println("1. 기본급 / 2. 직무급 / 3. 시간외 수당 / 4. 계약직 급여");
					int k = sc.nextInt();
					if(k==1) { //기본급 변경
						admin.changeBasePay();
					}else if(k==2) {//직무급 변경
						admin.changeRankPay();
					}else if(k==3) {// 시간외 수당
						admin.changeOvertimePay();
					}else if(k==4) {
						admin.changeContractPay();
					}
					break;
				case 5:
					System.out.println("관리자 시스템을 종료합니다.");
					a=false;
					break;
					}
		}

	}
	
	
	public int pickEmployeeNumber(int a) {
		int EmployeeNumber[] = employee.getEmployeeNumber();
		for(int i=0; i<10; i++) {
			if(a==EmployeeNumber[i]) {
				return i;
			}
		}
		return 55555;
	}


	public void menuEmployee() {
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		System.out.println("사용자 급여시스템 시작합니다");
		System.out.println("사용자의 사번을 입력해주세요 : ");
		int EmployeeNumber = sc.nextInt();
		int Number = pickEmployeeNumber(EmployeeNumber);
		if(employee.getEmployeeData(Number).getName().equals(null)) {
			System.out.println("당신은 등록된 직원이 아닙니다.");
			menuEmployee();
		}else {
		while(a==true) {
			System.out.println("메뉴를 선택해주세요 (1.정보조회 2.시간외수당 신청 3.급여조회 4.종료)");
			int select = sc.nextInt();
			switch(select) {
				case 1:
					System.out.println("정보조회 메뉴입니다.");
					employee.getEmployeeData(Number).pringInfomation();
					break;
				case 2:
					System.out.println("시간외수당 신청 메뉴입니다.");
					employee.getEmployeeData(Number).changeOvertimePay();
					break;
				case 3:
					System.out.println("급여조회 메뉴입니다.");
					employee.getEmployeeData(Number).PaySearch();
					break;
				case 4:
					System.out.println("사용자 시스템을 종료합니다.");
					a=false;
					break;
			}

			}
		}
	}
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Program p = new Program();
			System.out.println("소상공인들은 위해 제작된 급여프로그램입니다.(10인이하 사업장 가능)");
			while(true) {
				System.out.println("급여시스템 시작합니다");
				System.out.println("메뉴를 선택해주세요 (1.사용자 2.관리자 3.종료)");
				int select = sc.nextInt();
				if(select==1){
					p.menuEmployee();
				}else if(select==2) {
					p.menuAdmin();
				}else if(select==3) {
					System.out.println("급여시스템을 종료합니다.");
					break;
					
				}
			}
			
	}
}
