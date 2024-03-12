package PaySystem;

import java.util.Scanner;

public class Admin {
	private Pay pay;
	private EmployeeData employee;

	public Admin() {
		this.pay = new Pay();
		this.employee = new EmployeeData();
		
	}
	Scanner sc= new Scanner(System.in);
	
	//직원생성 메소드
	public void addEmployee(String name,int employeeNumber,String rank,int workYear,String contractWoker,String adminYN) {
		employee.inputEmployee(name, employeeNumber, rank, workYear, contractWoker, adminYN);
	}
	
	//직원직급 변경 메소드
	public void changeRank() {
		System.out.println("어떤 직원의 직급을 변경하겠습니까? 사번을 입력해주세요 : ");
		int a= pickEmployeeNumber(sc.nextInt());
		System.out.println("변경할 직급을 입력해주세요 : ");
		employee.setEmployeeDataRank(a,sc.next());
	}
	//계약직 여부 변경
	public void changeContractWoker() {
		System.out.println("어떤 직원의 계약직 여부를 변경하겠습니까? 사번을 입력해주세요 : ");
		int a= pickEmployeeNumber(sc.nextInt());
		System.out.println("변경된 계약직 여부를 입력해주세요 (Y:계약직 | N:정규직) ");
		String YN = sc.next();
		employee.setEmployeeDataContractWoker(a,YN);
	}
	
	//사번찾기
	public int pickEmployeeNumber(int a) {
		int EmployeeNumber[] = employee.getEmployeeNumber();
		for(int i=0; i<10; i++) {
			if(EmployeeNumber[i] == a ) {
				return i;
			}
		}
		return 0;
	}
	
	//기본급 변경
	public void changeBasePay() {
		System.out.println("기본급 변경입니다. 변경된 급여를 입력해주세요 : ");
		Pay.setBasePay(sc.nextInt());
	}
	
	//직무급 변경
	public void changeRankPay() {
		System.out.println("직무급 변경입니다. 변경된 급여를 입력해주세요 : ");
		Pay.setRankPay(sc.nextInt());
	}
	
	//시간외 급여
	public void changeOvertimePay() {
		System.out.println("시간외급여 변경입니다. 변경된 급여를 입력해주세요 : ");
		Pay.setOvertimePay(sc.nextInt());
	}
	
	//시간외 급여
	public void changeContractPay() {
		System.out.println("계약직급여 변경입니다. 변경된 급여를 입력해주세요 : ");
		Pay.setContractPay(sc.nextInt());
	}
	
	public void information() {
		employee.information();
	}
	
	public Pay getPay() {
		return pay;
	}

	public void setPay(Pay pay) {
		this.pay = pay;
	}

	public EmployeeData getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeData employee) {
		this.employee = employee;
	}
	

	
	
	
}
