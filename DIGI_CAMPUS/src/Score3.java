import java.util.Scanner;

public class Score3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 명의 성적을 관리할까요? : ");
		int people = Score3.inputNum(sc);
		
		String name[] = new String[people];//이름
		int score[][] = new int[people][4]; //국영수총
		float avg[] = new float[people]; // 평균
		
		Score3.scoreInput(people,sc,name,score,avg);
		Score3.sum(people, score);
		Score3.avg(people, avg, score);
		Score3.scoreOutput(people,name,score,avg);
		
	}
	public static int inputNum(Scanner sc){ // int 입력받는 함수
		return sc.nextInt();
	}
	
	public static String inputString(Scanner sc) {//String 타입 입력 함수
		return sc.next();	
	}
	
	//이름,국,영,수 입력받는 함수
	public static void scoreInput(int people,Scanner sc,String name[],int score[][],float avg[]){
		for (int i = 0; i < name.length; i++) {
			System.out.println("당신의 이름을 입력해주세요 : ");
			name[i] = Score3.inputString(sc);
			System.out.println("국,영,수 순서대로 점수를 입력해주세요 : ");
			for (int j = 0; j < 3; j++) {
				score[i][j] = sc.nextInt();
			}
		}
    }
	
	//총점 계산 함수
	public static void sum(int people,int score[][]) {
		for(int i=0; i<people; i++) {
			for (int j = 0; j < 3; j++) {
				score[i][3] += score[i][j]; 
			}
		}
	}
	
	//평균 구하기 함수
	public static void avg(int people,float avg[],int score[][]) {
		for(int i=0; i<people; i++) {
			avg[i] = score[i][3] / 3.f; 
		}
	
	}
	
	//출력 함수
	public static void scoreOutput(int people,String name[],int score[][],float avg[]) {
		int n=0;
		while(n<people) {
			System.out.print(name[n]+" ");
			for(int p=0; p<4; p++) {
				System.out.print(score[n][p]+" ");
			}
			System.out.print(avg[n]);
			System.out.println();
			n++;
		}
	}


		
}
	

