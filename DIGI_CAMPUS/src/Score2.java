import java.util.Scanner;

public class Score2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];//이름
		int[][] score = new int[3][4]; //국영수총
		float []avg = new float[3]; // 평균
		
		//이름,국,영,수 입력받는 구간
		for(int i=0; i<name.length; i++) {
			System.out.println("당신의 이름을 입력해주세요 : ");
			name[i] = sc.next();
			System.out.println("국,영,수 순서대로 점수를 입력해주세요 : ");
			for(int j=0; j<(score.length); j++) {
				score[i][j] = sc.nextInt();
				score[i][3]+= score[i][j]; //총점계산
			}
		}
		
		for(int k=0; k<avg.length; k++) {
			avg[k] = score[k][3]/3.f; //평균 계산
		}
		
		//출력하기
		int n=0;
		while(n<3) {
			System.out.print(name[n]+" ");
			for(int p=0; p<(score.length)+1; p++) {
				System.out.print(score[n][p]+" ");
			}
			System.out.print(avg[n]);
			System.out.println();
			n++;
		}
		
	
	}
}
