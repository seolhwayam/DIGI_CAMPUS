package Day12;

import java.util.Random;
import java.util.Scanner;

public class BaseBallGame2 {

	Random random;
	int arrPlayer [];
	int arrComputer[];
	
	int ball;
	int strike;
	int count;
	int sum;
	
	public BaseBallGame2() {
		this.arrComputer = new int[3];
		this.arrPlayer = new int[3];
		this.random = new Random();
		
		this.ball =0;
		this.strike =0;
		this.count =0;
		this.sum =0;
	}
	
	public void randaomCamputerNumber() {
		for (int i = 0; i < arrComputer.length; i++) {
			arrComputer[i] = random.nextInt(10);
			for (int j = 0; j < i; j++) {
				if (arrComputer[i] == arrComputer[j]) {
					i--;
				}
			}
		}
		for(int j=0; j<3; j++) {
			System.out.print(arrComputer[j]);
		}
		System.out.println();
	}
	
	
	public void playerNumber(int i, int num) {
		arrPlayer[i]= num;
	}
	
	public void resetNumber() {
		ball=0;
		strike =0;
	}
	
	public void game() {
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
	}
	
	
	public int getBall() {
		return ball;
	}


	public void setBall(int ball) {
		this.ball = ball;
	}


	public int getStrike() {
		return strike;
	}


	public void setStrike(int strike) {
		this.strike = strike;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		BaseBallGame2 b= new BaseBallGame2();
		
		System.out.println("몇 번 게임을 진행하시겠습니까? : ");
		int num = sc.nextInt();

		int a =0;
		while(a<num) {
			b.randaomCamputerNumber();
			while(true) {
				for(int i=0; i<3; i++) {
					System.out.println("============예상되는 숫자를 입력해주세요===========");
					System.out.println("0-9사이의 "+(i+1)+"번째 숫자를 입력해 주세요 : ");
					b.playerNumber(i,sc.nextInt());
				}
				b.resetNumber();
				b.game();
				if(b.getStrike()==3) {
					System.out.println("================정답======================");
					System.out.println("당신은 "+b.getCount()+"번 만에 맞췄습니다!");
					b.setSum(b.getSum()+b.getCount());
					break;
				}else if(b.getBall()==0 && b.getStrike()==0){
					System.out.println("out 입니다!");
				}else {
					System.out.println("ball : "+b.getBall()+" / strike : "+b.getStrike());
				}
			}
			b.resetNumber();
			a++;
			if(a==num) {
				System.out.println("==============게임이 종료되었습니다==============");
				System.out.println("당신은 평균적으로 "+b.getSum()/num+"번 만에 맞췄습니다.");
			}
		}
	}
}
