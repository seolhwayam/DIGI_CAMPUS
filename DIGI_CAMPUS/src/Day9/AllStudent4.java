package Day9;

import java.util.*;

import Day5.StudentScoreHasA;

//Map
public class AllStudent4 {
	Scanner sc= new Scanner(System.in);
	HashMap<Integer, StudentScoreHasA> stu = new HashMap<Integer, StudentScoreHasA>();
	int num = 0;
	public void addStudent() {
		StudentScoreHasA student = new StudentScoreHasA(); //중복불가 
		System.out.println("이름을 입력해 주세요: ");
		student.setName(sc.next());
		System.out.println("국,수,영 순서대로 점수을 입력해 주세요: ");
		student.setKor(sc.nextInt());
		student.setMath(sc.nextInt());
		student.setEng(sc.nextInt());
		stu.put(num,student);
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
			if(stu.get(i).getName().equals(name)) {
				number = i;
				break;
			}
		}
		System.out.println("무엇을 수정할까요? (1.국어 2.영어 3.수학 4.다시 ");
		select = sc.nextInt();
			switch(select) {
				case 1 :
					System.out.println(" 수정할 국어 점수를 입력해주세요 : ");
					stu.get(number).setKor(sc.nextInt());
					break;
				case 2 :
					System.out.println(" 수정할 영어 점수를 입력해주세요 : ");
					stu.get(number).setEng(sc.nextInt());
					break;
				case 3 :
					System.out.println(" 수정할 수학 점수를 입력해주세요 : ");
					stu.get(number).setMath(sc.nextInt());
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
	            if (stu.get(i) != null && stu.get(i).getName().equals(name)) {
	                printAllStudent(i);
	            }
	        }
	    } else if (select == 2) {
	        System.out.println("조회할 평균 점수를 입력해주세요(입력한 평균의 이상만 조회합니다) : ");
	        float avg = sc.nextFloat();
	        for (int i = 0; i < num; i++) {
	            if (stu.get(i) != null &&  stu.get(i).getAvg() >= avg) {
	                printAllStudent(i);
	            }
	        }
	    }
	}

	public void printAllStudent() {
		for(int j=0; j<num; j++) {
			System.out.println("이름 : "+ stu.get(j).getName());
			System.out.println("국어 점수 : "+( stu.get(j)).getKor());
			System.out.println("수학 점수 : "+ stu.get(j).getMath());
			System.out.println("영어 점수 : "+ stu.get(j).getEng());
			System.out.println("총 점수 : "+ stu.get(j).getTotal());
		    System.out.println("평균 점수 : "+ stu.get(j).getAvg());
		}
	}
	public void printAllStudent(int i) {
			System.out.println("이름 : "+  stu.get(i).getName());
			System.out.println("국어 점수 : "+ stu.get(i).getKor());
			System.out.println("수학 점수 : "+ stu.get(i).getMath());
			System.out.println("영어 점수 : "+ stu.get(i).getEng());
			System.out.println("총 점수 : "+stu.get(i).getTotal());
		    System.out.println("평균 점수 : "+ stu.get(i).getAvg());
	}


		


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		AllStudent4 all = new AllStudent4();
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
		
		
		
		
		


	

