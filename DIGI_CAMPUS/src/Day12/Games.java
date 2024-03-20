package Day12;

import java.util.ArrayList;
import java.util.Scanner;

public class Games {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BaseBallGame2 game1 = new BaseBallGame2();
		MinNumber game2 = new MinNumber();
		CleanNumber game3 = new CleanNumber();
		BabyGin game4 = new BabyGin();
		boolean stop = true;
		while(true==stop) {
			System.out.println("어떤 게임을 시작할까요? (1.숫자야구 2.적은 숫자조합 찾기 3.정돈된 수 4.BabyGin 5.종료");
			switch(sc.nextInt()) {
				case 1:
					System.out.println("=============================");
					System.out.println("몇 번 게임을 진행하시겠습니까? : ");
					int num = sc.nextInt();
					int a =0;
					while(a<num) {
						game1.randaomCamputerNumber();
						while(true) {
							for(int i=0; i<3; i++) {
								System.out.println("============예상되는 숫자를 입력해주세요===========");
								System.out.println("0-9사이의 "+(i+1)+"번째 숫자를 입력해 주세요 : ");
								game1.playerNumber(i,sc.nextInt());
							}
							game1.resetNumber();
							game1.game();
							if(game1.getStrike()==3) {
								System.out.println("================정답======================");
								System.out.println("당신은 "+game1.getCount()+"번 만에 맞췄습니다!");
								game1.setSum(game1.getSum()+game1.getCount());
								break;
							}else if(game1.getBall()==0 && game1.getStrike()==0){
								System.out.println("out 입니다!");
							}else {
								System.out.println("ball : "+game1.getBall()+" / strike : "+game1.getStrike());
							}
						}
						game1.resetNumber();
						a++;
						if(a==num) {
							System.out.println("==============게임이 종료되었습니다==============");
							System.out.println("당신은 평균적으로 "+game1.getSum()/num+"번 만에 맞췄습니다.");
						}
					}
					break;
				case 2:
					System.out.println("=============================");
					for(int i=1000; i<10000; i++ ) {
						game2.inputComputer(i);
						System.out.print("출력:"+i+'\t');
						game2.numberSort();
						game2.print();
						System.out.println();
						
					}
					break;
				case 3:
					System.out.println("=============================");
					ArrayList<Integer> read  = new ArrayList<Integer>();
					System.out.println("최소 범위를 입력해주세요 : ");
					int min=sc.nextInt();
					System.out.println("최대 범위를 입력해주세요 : ");
					int max=sc.nextInt();
					
					for(int i=min; i<max; i++) {
						if(game3.isRead(i)) {
							read.add(i);				
						}

					}
					
					for(Integer s:read) {
						System.out.println(s);
					}
					System.out.println("전체 갯수는 : "+read.size());
					break;
				case 4:
					System.out.println("=============================");
					game4.scoreUp();
					game4.triplete();
					game4.runResult();
					game4.result();
					break;
				case 5:
					System.out.println("==============종료=============");
					stop =false;	
					break;
			}
		}
	}

}
