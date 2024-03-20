package Day12;

import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc= new Scanner(System.in);
	
		
		int arrPlayer [] = new int[3]; // player 공격 배열
		int arrComputer[]=new int[3];  // computer 랜덤 배열
		int ball =0;
		int strike =0;
		int count =0;
		int sum=0;
		
		System.out.println("몇 번 게임을 진행하시겠습니까? : ");
		int num = sc.nextInt();

		int a =0;
		while(a<num) {
			for (int i = 0; i < arrComputer.length; i++) {
				arrComputer[i] = random.nextInt(10);
				for (int j = 0; j < i; j++) {
					if (arrComputer[i] == arrComputer[j]) {
						i--;
					}
				}
			}
			for(int k=0; k<3; k++) {
				System.out.print(arrComputer[k]);
			}
			System.out.println();
			while(true) {
				for(int i=0; i<arrPlayer.length; i++) {
					System.out.println("============예상되는 숫자를 입력해주세요===========");
					System.out.println("0-9사이의 "+(i+1)+"번째 숫자를 입력해 주세요 : ");
					arrPlayer[i]=sc.nextInt();
				}
				ball=0;
				strike=0;
				for(int i=0; i<arrPlayer.length; i++) {
					for(int j=0; j<arrComputer.length; j++) {
						if(arrPlayer[i]==arrComputer[j]) {
							if(i==j) {
								strike++;
							}else {
								ball++;
							}
						}
					}
				}
				count++;
				if(strike==3) {
					System.out.println("================정답======================");
					System.out.println("당신은 "+count+"번 만에 맞췄습니다!");
					sum+=count;
					break;
				}else if(ball==0 && strike==0){
					System.out.println("out 입니다!");
				}else {
					System.out.println("ball : "+ball+" / strike : "+strike);
				}
				
			
			}
			ball=0;
			strike=0;
			a++;
			if(a==num) {
				System.out.println("==============게임이 종료되었습니다=============");
				System.out.println("당신은 평균적으로 "+sum/num+"번 만에 맞췄습니다.");
			}
		}
	}


}
