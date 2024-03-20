package Day12;

import java.util.Random;


public class BabyGin {
	int [] score= {0,0,0,0,0,0,0,0,0,0};
	int num;
	int triple;
	int run;
	String input;
	Random random;
	
	public BabyGin() {
		this.triple=0;
		this.run=0;
		this.random = new Random();
	}
	

	
	public void scoreUp() {
		for(int i=0; i<6; i++) {
			num = random.nextInt(10);
			score[num]++;
		}
	}
	
	public void triplete() {
		for(int i=0; i<score.length ; i++) {
			if(score[i]>=3) {
				triple++;
				score[i]-=3;
			}
		}
	}
	
	public void runResult() {
		for(int i=0; i<=7; i++) {
			if(score[i]>=1 && score[i+1]>=1 && score[i+2]>=1) {
				run++;
				score[i]--;
				score[i+1]--;
				score[i+2]--;
			}
		}
	}
	
	public void result() {
		if(triple>=1 && run>=1) {
			System.out.println("Baby Gin 완성~~");
		}else {
			System.out.println("아쉽게 Baby Gin이 아니네요~");
			System.out.println("트리플 : "+triple+" / 런 : "+run);
		}
	}

	public static void main(String[] args) {
		BabyGin b = new BabyGin();
		b.scoreUp();
		b.triplete();
		b.runResult();
		b.result();

		
		
	}

}
