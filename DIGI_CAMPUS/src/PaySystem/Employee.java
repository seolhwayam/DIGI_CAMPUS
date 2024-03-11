package PaySystem;

import java.util.Scanner;

public class Employee {
	private String name;
	private int employeeNumber;
	private String rank;
	private int workYear;
	private String contractWoker;
	private int overtimePay;
	private String adminYN;
    private PaySearch pay;
	Scanner sc= new Scanner(System.in);
	
	public Employee(String name,int employeeNumber,String rank,int workYear,String contractWoker,String adminYN){
		this.name = name;
		this.employeeNumber = employeeNumber;
		this.rank = rank;
		this.workYear = workYear;
		this.contractWoker = contractWoker;
		this.adminYN = adminYN;
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getContractWoker() {
		return contractWoker;
	}

	public void setContractWoker(String yN) {
		this.contractWoker = yN;
	}
	
	public void setOvertimePay(int a) {
		overtimePay =a;
	}

	public int getOvertimePay() {
		return overtimePay;
	}


	public int getWorkYear() {
		return workYear;
	}

	public String isAdminYN() {
		return adminYN;
	}
	
	public String getAdminYN() {
		return adminYN;
	}

	public void setAdminYN(String adminYN) {
		this.adminYN = adminYN;
	}
	
	//시간외 근무시간 변경하기
	public void changeOvertimePay() {
		System.out.println("시간외 근무시간을 입력해주세요 : ");
		setOvertimePay(sc.nextInt());
	}
	//직원정보 찍기
	public void pringInfomation() {
		System.out.println(name+"/"+employeeNumber+"/"+rank+"/"+workYear+"/"+contractWoker);
	}
	//급여정보 조회
	public void PaySearch() {
		pay = new PaySearch(rank,workYear,overtimePay,contractWoker);
		pay.printPay();
	}

	
	
	
	
	
	
}
