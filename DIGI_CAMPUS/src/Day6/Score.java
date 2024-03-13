/*시험의 성적처리 프로그램
 * 입력 : 이름,국,영,수
 * 연산 : 총점,평균
 * 출력 : 이름,국,영,수,총,평
 * */
package Day6;


import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		String name;
		int score[] = new int[4]; //국,영,수,총
		float avg;
		
		//이름 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("이름를 입력해 주세요");
		name = sc.next();
		//점수 입력
		for(int i=0; i<(score.length)-1; i++) {
			System.out.println("국,영,수 순서대로 점수를 입력해 주세요");
			score[i] = sc.nextInt();
			score[3]+=score[i];
		}
		

		avg=score[3]/3;
		//출력
		System.out.print(name+",");
		for(int i:score) {
			System.out.print(i+",");
		}
		System.out.print(avg);
		
		
		
		
		
		
		
	}

}
