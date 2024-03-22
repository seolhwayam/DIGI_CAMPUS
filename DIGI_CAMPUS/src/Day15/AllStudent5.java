package Day15;

import java.util.*;

import Day5.StudentScoreHasA;

//ArrayListList
public class AllStudent5 {
	Scanner sc= new Scanner(System.in);
	LnikedExam2 stu = new  LnikedExam2 ();
	
	int num = 0;
	public void addStudent() {
		System.out.println("이름/국/수/영 점수 순서대로 입력해주세요 ");
		stu.add(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
	}
	public void setStudent() {
		int select;
		boolean is = true;
		do {
		System.out.println("수정할 학생의 이름을 입력해 주세요: ");
		String name = sc.next();
		System.out.println("무엇을 수정할까요? (1.국어 2.영어 3.수학 4.종료) ");
		select = sc.nextInt();
			switch(select) {
				case 1 :
					System.out.println("수정할 국어 점수를 입력해주세요 : ");
					stu.get(name).setKor(sc.nextInt());
					stu.setSort(stu.get(name));
					break;
				case 2 :
					System.out.println("수정할 영어 점수를 입력해주세요 : ");
					stu.get(name).setEng(sc.nextInt());
					stu.setSort(stu.get(name));
					break;
				case 3 :
					System.out.println("수정할 수학 점수를 입력해주세요 : ");
					stu.get(name).setMath(sc.nextInt());
					stu.setSort(stu.get(name));
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
	        printAllStudent(stu.get(name));
	    } else if (select == 2) {
	        System.out.println("조회할 평균 점수를 입력해주세요(입력한 평균의 이상만 조회합니다) : ");
	        float avg = sc.nextFloat();
	        stu.allPrint(avg);
	    }
	}
	public void removeStudent() {
	    System.out.println("삭제할 학생의 이름을 입력해주세요 : ");
	    String name = sc.next();
	    stu.remove(stu.getPrev(name));
	    
	}

	public void printAllStudent() {
		stu.allPrint();
	}

	public void printAllStudent(StudentScoreHasA2 cur) {
			System.out.println("이름 : "+ cur.getName());
			System.out.println("국어 점수 : "+cur.getKor());
			System.out.println("수학 점수 : "+cur.getMath());
			System.out.println("영어 점수 : "+cur.getEng());
			System.out.println("총 점수 : "+cur.getTotal());
		    System.out.println("평균 점수 : "+cur.getAvg());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		AllStudent5 all = new AllStudent5();
		boolean is = true;
		do{
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1.성적입력 2.수정 3.검색 4.출력 5.학생삭제 6.종료");
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
					all.removeStudent();
					break;
				case 6 :
					is = false;
					System.out.println("시스템을 종료하겠습니다. ");
					break;
				default:
					System.out.println("잘못입력하였습니다. ");
			}
		}while(is!=false); 	
	}
	
}
		
		
		
		
		


	

