package PaySystem;

public class EmployeeData {
	private static Employee EmployeeData[] = new Employee[10];
	private static int EmployeeNumber[] = new int[10];
	int num =0;
	
	public void inputEmployee(String name,int employeeNumber,String rank,int workYear,String contractWoker,String adminYN) {
		EmployeeData[num] = new Employee(name,employeeNumber,rank,workYear,contractWoker,adminYN);
		EmployeeNumber[num] = employeeNumber;
		num++;
	}
	
	
	public void information() {
		for(int i=0; i<10; i++) {
			if(EmployeeData[i]==null) {
				break;
			}
			System.out.println(EmployeeData[i].getName()+"/"+EmployeeData[i].getEmployeeNumber()+"/"+EmployeeData[i].getRank()+"/"+EmployeeData[i].getContractWoker()+"/"+EmployeeData[i].getWorkYear()+"/"+EmployeeData[i].getAdminYN());
		}
	}

	public Employee getEmployeeData(int num) {
		return EmployeeData[num];
	}
	
	//직급 변경
	public void setEmployeeDataRank(int num,String rank) {
		EmployeeData[num].setRank(rank);
	}
	
	//계약직 변경
	public void setEmployeeDataContractWoker(int num,String yN) {
		EmployeeData[num].setContractWoker(yN);
	}
		

	public int[] getEmployeeNumber() {
		return EmployeeNumber;
	}

	public void setEmployeeNumber(int[] employeeNumber) {
		EmployeeNumber = employeeNumber;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	

}
