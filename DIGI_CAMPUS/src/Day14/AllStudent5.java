package Day14;

import java.util.*;

import Day5.StudentScoreHasA;

//ArrayListList
public class AllStudent5 {
	Scanner sc= new Scanner(System.in);
	LnikedExam stu = new LnikedExam();
	
	int num = 0;
	public void addStudent() {
		StudentScoreHasA student = new StudentScoreHasA();
		System.out.println("몇 번째에 학생을 추가할까요?");
		int th = sc.nextInt();
		System.out.println("이름을 입력해 주세요: ");
		student.setName(sc.next());
		System.out.println("국,수,영 순서대로 점수을 입력해 주세요: ");
		student.setKor(sc.nextInt());
		student.setMath(sc.nextInt());
		student.setEng(sc.nextInt());
		stu.add(student,th);
	}
	public void setStudent() {
		int select;
		boolean is = true;
		do {
		System.out.println("수정할 학생의 이름을 입력해 주세요: ");
		String name = sc.next();
		StudentScoreHasA setData = stu.get(name);
		System.out.println("무엇을 수정할까요? (1.국어 2.영어 3.수학 4.다시 )");
		select = sc.nextInt();
			switch(select) {
				case 1 :
					System.out.println("수정할 국어 점수를 입력해주세요 : ");
					setData.setKor(sc.nextInt());
					break;
				case 2 :
					System.out.println("수정할 영어 점수를 입력해주세요 : ");
					setData.setEng(sc.nextInt());
					break;
				case 3 :
					System.out.println("수정할 수학 점수를 입력해주세요 : ");
					setData.setMath(sc.nextInt());
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
	        StudentScoreHasA getData = stu.get(name);
	   	    printAllStudent(getData);

	      
	    } else if (select == 2) {
	        System.out.println("조회할 평균 점수를 입력해주세요(입력한 평균의 이상만 조회합니다) : ");
	        float avg = sc.nextFloat();
	        stu.resetCur();
	        for (int i = 0; i <stu.getSize(); i++) {
	        	
	        	StudentScoreHasA getData = stu.get();
	            if (stu.get().getAvg() >= avg) {
	                printAllStudent(getData);
	            }
	            stu.moveCur();
	        }
	        stu.resetCur();
	       }
	}
	    
	
	public void remove() {
		System.out.println("정보 삭제할 학생이름을 입력해 주세요: ");
		String name = sc.next();
		LinkNode getData = stu.getNameCur(name);
		stu.remove(getData);
	}

	public void printAllStudent() {
		stu.resetCur();
		for(int i=0; i<stu.getSize(); i++) {
			System.out.println("이름 : "+ stu.get().getName());
			System.out.println("국어 점수 : "+stu.get().getKor());
			System.out.println("수학 점수 : "+stu.get().getMath());
			System.out.println("영어 점수 : "+stu.get().getEng());
			System.out.println("총 점수 : "+stu.get().getTotal());
		    System.out.println("평균 점수 : "+stu.get().getAvg());
		    stu.moveCur();
		}
		stu.resetCur();
		
	}
	public void printAllStudent(StudentScoreHasA getData) {
			System.out.println("이름 : "+  getData.getName());
			System.out.println("국어 점수 : "+ getData.getKor());
			System.out.println("수학 점수 : "+ getData.getMath());
			System.out.println("영어 점수 : "+ getData.getEng());
			System.out.println("총 점수 : "+ getData.getTotal());
		    System.out.println("평균 점수 : "+ getData.getAvg());
	}


		


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		AllStudent5 all = new AllStudent5();
		boolean is = true;
		do{
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1.학생입력 2.수정 3.검색 4.출력 5.학생삭제 6.종료");
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
					all.remove();
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
		
		
		
		
		


	

