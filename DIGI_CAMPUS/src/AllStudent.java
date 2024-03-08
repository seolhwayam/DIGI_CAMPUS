
import java.util.*;

public class AllStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇명의 학생을 관리하시겠습니까? : ");
		int num = sc.nextInt();
		String name;
		
		StudentScoreHasA []stu = new StudentScoreHasA[num];
		
		for(int k=0; k<num ; k++) {
			stu[k] = new StudentScoreHasA();
		}
	
		for(int i=0; i<num; i++) {
			System.out.println("이름을 입력해 주세요: ");
			name = sc.next();
			stu[i].setName(name);
			System.out.println("국,수,영 순서대로 점수을 입력해 주세요: ");
			stu[i].setKor(sc.nextInt());
			stu[i].setMath(sc.nextInt());
			stu[i].setEng(sc.nextInt());
		}
		
		for(int j=0; j<num; j++) {
			System.out.println((j+1)+"번째 학생 ");
			System.out.println(stu[j].getName());
			System.out.println(stu[j].getKor());
			System.out.println(stu[j].getMath());
			System.out.println(stu[j].getEng());
			System.out.println(stu[j].getTotal());
		    System.out.println(stu[j].getAvg());
			
		}

		
	}

	
}
