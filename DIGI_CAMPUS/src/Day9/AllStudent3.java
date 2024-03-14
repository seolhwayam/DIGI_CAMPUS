package Day9;

import java.util.*;

import Day5.StudentScoreHasA;

//Set
public class AllStudent3 {
	Scanner sc= new Scanner(System.in);
	HashSet<StudentScoreHasA> stu = new HashSet<StudentScoreHasA>();
	StudentScoreHasA aa;

	public StudentScoreHasA getAa() {
		return aa;
	}

	public void setAa(StudentScoreHasA aa) {
		this.aa = aa;
	}

	public void addStudent() {
		StudentScoreHasA student = new StudentScoreHasA();
		System.out.println("이름을 입력해 주세요: ");
		student.setName(sc.next());
		System.out.println("국,수,영 순서대로 점수을 입력해 주세요: ");
		student.setKor(sc.nextInt());
		student.setMath(sc.nextInt());
		student.setEng(sc.nextInt());
		stu.add(student);
	}
	
	public void setStudent() {
		Iterator<StudentScoreHasA> iter = stu.iterator();
		int select;
		boolean is = true;
		System.out.println("수정할 학생의 이름을 입력해 주세요: ");
		String name = sc.next();
		while(iter.hasNext() && is==true) {
			aa = iter.next();
			if(aa.getName().equals(name)) {
				System.out.println("무엇을 수정할까요? (1.국어 2.영어 3.수학 4.종료 ");
				select = sc.nextInt();
				switch(select) {
					case 1 :
						System.out.println("수정할 국어 점수를 입력해주세요 : ");
						getAa().setKor(sc.nextInt());
						break;
					case 2 :
						System.out.println("수정할 영어 점수를 입력해주세요 : ");
						getAa().setEng(sc.nextInt());
						break;
					case 3 :
						System.out.println("수정할 수학 점수를 입력해주세요 : ");
						getAa().setMath(sc.nextInt());
						break;
					case 4 :
						is=false;
						break;
				}
			}
		}
	
}
	
	
	public void searchStudent() {
		Iterator<StudentScoreHasA> iter = stu.iterator();
	    System.out.println("무엇을 검색할까요? (1.이름검색 2.평균검색) ");
	    int select;
	    select = sc.nextInt();
	    if (select == 1) {
	        System.out.println("검색할 학생의 이름을 입력해 주세요: ");
	        String name = sc.next();
	    	while(iter.hasNext()) {//값이 있으면 true 없으면 false
	    		StudentScoreHasA aa = iter.next();
				if(aa.getName().equals(name)) {
					printAllStudent(aa);
				}
	    	}
	    } else if (select == 2) {
	        System.out.println("조회할 평균 점수를 입력해주세요(입력한 평균의 이상만 조회합니다) : ");
	        float avg = sc.nextFloat();
	        StudentScoreHasA aa = iter.next();
	        while(iter.hasNext()) {//값이 있으면 true 없으면 false
				if(aa != null && aa.getAvg() >= avg) {
					printAllStudent(aa);
				}
	    	}
	     }
	    
	}

	public void printAllStudent() {
		Iterator<StudentScoreHasA> iter = stu.iterator();
		while(iter.hasNext()) {//값이 있으면 true 없으면 false
			aa = iter.next();
			System.out.println("이름 : "+ aa.getName());
			System.out.println("국어 점수 : "+aa.getKor());
			System.out.println("수학 점수 : "+aa.getMath());
			System.out.println("영어 점수 : "+aa.getEng());
			System.out.println("총 점수 : "+aa.getTotal());
		    System.out.println("평균 점수 : "+aa.getAvg());
		}
	}
	public void printAllStudent(StudentScoreHasA i) {
			System.out.println("이름 : "+ i.getName());
			System.out.println("국어 점수 : "+i.getKor());
			System.out.println("수학 점수 : "+i.getMath());
			System.out.println("영어 점수 : "+i.getEng());
			System.out.println("총 점수 : "+i.getTotal());
		    System.out.println("평균 점수 : "+i.getAvg());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		AllStudent3 all = new AllStudent3();
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
		
		
		
		
		


	

