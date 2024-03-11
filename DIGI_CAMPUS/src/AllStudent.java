
import java.util.*;

public class AllStudent {
	Scanner sc= new Scanner(System.in);
	StudentScoreHasA []stu = new StudentScoreHasA[100];
	int num = 0;
	public void addStudent {
			stu[num] = new StudentScoreHasA();
			System.out.println("이름을 입력해 주세요: ");
			stu[num].setName(sc.next());
			System.out.println("국,수,영 순서대로 점수을 입력해 주세요: ");
			stu[num].setKor(sc.nextInt());
			stu[num].setMath(sc.nextInt());
			stu[num].setEng(sc.nextInt());
			num++;
					
	}
	public void setStucent {
		int select = sc.nextInt();
		int subject;
		boolean is = true;
		do {
		System.out.println("수정할 학생의 이름을 입력해 주세요: ");
		String name = sc.next();
		int num;
		for(int i=0; i<100; i++) {
			if(stu[i].getName().equals(name)) {
				num = i;
				break;
			}
		}
		System.out.println("무엇을 수정할까요? (1.국어 2.영어 3.수학 4.다시 ");
			switch(select) {
				case 1 :
					System.out.println(" 수정할 국어 점수를 입력해주세요 : ");
					stu[num].setKor(sc.nextInt());
					break;
				case 2 :
					System.out.println(" 수정할 영어 점수를 입력해주세요 : ");
					stu[num].setEng(sc.nextInt());
					break;
				case 3 :
					System.out.println(" 수정할 수학 점수를 입력해주세요 : ");
					stu[num].setMath(sc.nextInt());
					break;
				case 4 :
					is=false;
					break;
				default:
					System.out.println("잘못입력하였습니다. ");
					is=false;
			}
		
			
		}while(is==false);
	}
	
	public void searchStudent() {
		System.out.println("무엇을 검색할까요? (1.이름검색 2.평균검색) ");
		int select;
		select = sc.nextInt();
		if(select==1) {
			System.out.println("검색할 학생의 이름을 입력해 주세요: ");
			String name = sc.next();
			int num;
			for(int i=0; i<100; i++) {
				if(stu[i].getName().equals(name)) {
					num = i;
					break;
				}
			}
		}
		
		

	}
	public void printAllStudent() {
		for(int j=0; j<num; j++) {
			System.out.println((j+1)+"번째 학생 ");
			System.out.println("이름 : "+ stu[j].getName());
			System.out.println("국어 점수 : "+stu[j].getKor());
			System.out.println("수학 점수 : "+stu[j].getMath());
			System.out.println("영어 점수 : "+stu[j].getEng());
			System.out.println("총 점수 : "+stu[j].getTotal());
		    System.out.println("평균 점수 : "+stu[j].getAvg());
		}
	}

		


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇명의 학생을 관리하시겠습니까? : ");
		int num = sc.nextInt();
		String name;
		boolean is = true;
		
		

		
		do{
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1.수정 2.검색 3.검색 4.출력 5.종료");
			int select = sc.nextInt();
			switch(select) {
				case 1 :
					break;
				case 2 :
					break;
				case 3 :
					break;
				case 4 :
					break;
				case 5 :
					is = false;
					break;
				default:
					System.out.println("잘못입력하였습니다. ");
		}while(is!=false); 
	}
}
		
		
		
		
		


	

