package Day6;

import java.util.*;

import Day5.StudentScoreHasA;

public class ScoreSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		
		
		StudentScoreHasA []stu = new StudentScoreHasA[100];
		
		System.out.println("학생 성적 관리 시스템 (1. 학생성적 수정 | 2. 학생성적 수정 | 3. 학생성적 검색 | 4. 학생성적 출력");
		int select = sc.nextInt();
		switch(select) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("잘못입력하였습니다 . ")
		}
				
		
		
		
		
		
	
			stu[k] = new StudentScoreHasA();
			System.out.println("이름을 입력해 주세요: ");
			name = sc.next();
			stu[k].setName(name);
			System.out.println("국,수,영 순서대로 점수을 입력해 주세요: ");
			stu[k].setKor(sc.nextInt());
			stu[k].setMath(sc.nextInt());
			stu[k].setEng(sc.nextInt());
			
			
			
			
		

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

	
}
