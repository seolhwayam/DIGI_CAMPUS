
import java.util.*;

import Day5.StudentScoreHasA;

public class AllStudent {
	Scanner sc= new Scanner(System.in);
	static StudentScoreHasA []stu = new StudentScoreHasA[100];
	int num = 0;
	public void addStudent() {
			stu[num] = new StudentScoreHasA();
			System.out.println("이름을 입력해 주세요: ");
			stu[num].setName(sc.next());
			System.out.println("국,수,영 순서대로 점수을 입력해 주세요: ");
			stu[num].setKor(sc.nextInt());
			stu[num].setMath(sc.nextInt());
			stu[num].setEng(sc.nextInt());
			num++;
					
	}
	public void setStudent() {
		int select;
		boolean is = true;
		do {
		System.out.println("수정할 학생의 이름을 입력해 주세요: ");
		String name = sc.next();
		int number=0;
		for(int i=0; i<100; i++) {
			if(stu[i].getName().equals(name)) {
				number = i;
				break;
			}
		}
		System.out.println("무엇을 수정할까요? (1.국어 2.영어 3.수학 4.다시 ");
		select = sc.nextInt();
			switch(select) {
				case 1 :
					System.out.println(" 수정할 국어 점수를 입력해주세요 : ");
					stu[number].setKor(sc.nextInt());
					break;
				case 2 :
					System.out.println(" 수정할 영어 점수를 입력해주세요 : ");
					stu[number].setEng(sc.nextInt());
					break;
				case 3 :
					System.out.println(" 수정할 수학 점수를 입력해주세요 : ");
					stu[number].setMath(sc.nextInt());
					break;
				case 4 :
					is=false;
					break;
			}
		
			
		}while(is==false);
	}
	
	
	public void searchStudent() {
	    System.out.println("무엇을 검색할까요? (1.이름검색 2.평균검색) ");
	    int select;
	    select = sc.nextInt();
	    if (select == 1) {
	        System.out.println("검색할 학생의 이름을 입력해 주세요: ");
	        String name = sc.next();
	        for (int i = 0; i < num; i++) {
	            if (stu[i] != null && stu[i].getName().equals(name)) {
	                printAllStudent(i);
	            }
	        }
	    } else if (select == 2) {
	        System.out.println("조회할 평균 점수를 입력해주세요(입력한 평균의 이상만 조회합니다) : ");
	        float avg = sc.nextFloat();
	        for (int i = 0; i < num; i++) {
	            if (stu[i] != null && stu[i].getAvg() >= avg) {
	                printAllStudent(i);
	            }
	        }
	    }
	}

	public void printAllStudent() {
		for(int j=0; j<num; j++) {
			System.out.println("이름 : "+ stu[j].getName());
			System.out.println("국어 점수 : "+stu[j].getKor());
			System.out.println("수학 점수 : "+stu[j].getMath());
			System.out.println("영어 점수 : "+stu[j].getEng());
			System.out.println("총 점수 : "+stu[j].getTotal());
		    System.out.println("평균 점수 : "+stu[j].getAvg());
		}
	}
	public void printAllStudent(int i) {
			System.out.println("이름 : "+ stu[i].getName());
			System.out.println("국어 점수 : "+stu[i].getKor());
			System.out.println("수학 점수 : "+stu[i].getMath());
			System.out.println("영어 점수 : "+stu[i].getEng());
			System.out.println("총 점수 : "+stu[i].getTotal());
		    System.out.println("평균 점수 : "+stu[i].getAvg());
	}


		


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		AllStudent all = new AllStudent();
		boolean is = true;
		do{
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1.성적입력 2.수정 3.검색 4.출력 5.종료");
			int select = sc.nextInt();
			switch(select) {
				case 1 :
					all.addStudent();
					
					break;
				case 2 :
					all.setStudent();
					break;
				case 3 :
					all.searchStudent();
					break;
				case 4 :
					all.printAllStudent();
					break;
				case 5 :
					is = false;
					System.out.println("시스템을 종료하겠습니다. ");
					break;
				default:
					System.out.println("잘못입력하였습니다. ");
			}
		}while(is!=false); 	
	}
	
}
		
		
		
		
		


	

