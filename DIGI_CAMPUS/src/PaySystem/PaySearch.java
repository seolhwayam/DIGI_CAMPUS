package PaySystem;

public class PaySearch {
	private int basePay;
	private int rankPay;
	private int overtimePay;
	private int workYear;
	private int overtime;
	private int total;
	private String rank;
	private String contractWoker;
	private Pay pay = new Pay();
	
	public PaySearch(String rank ,int workYear, int overtime,String contractWoker) {
		this.rankPay = Pay.getRankPay();
		this.overtimePay = Pay.getOvertimePay();
		this.workYear =  workYear;
		this.overtime = overtime;
		this.contractWoker = contractWoker;
		this.rank = rank;
	}
	
	public int Pay() {
		if(rank.equals("L0")) {
			basePay = (Pay.getBasePay())*2;
		}else if(rank.equals("L1")) {
			basePay = (Pay.getBasePay())*3;
		}else if(rank.equals("L2")) {
			basePay = (Pay.getBasePay())*4;
		}
		return total = basePay+(rankPay*workYear)+(overtimePay*overtime);
	}
	
	public void printPay() {
		if(contractWoker.equals("N")) {
			Pay();
		}else {
			total = Pay.getContractPay();
		}
		System.out.println("당신의 월급은 : "+total);
	}
	
	

}
