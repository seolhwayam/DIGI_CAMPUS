package Day12;

import java.util.Random;

public class SmallNumber {
	
	int[] arrComputer;
	int a = 0;
	
	public SmallNumber() {
		this.arrComputer = new int[4];
		this.a =0;
	}
	public void inputComputer(int k) {
		for (int i = 0; i < arrComputer.length; i++) {
			arrComputer[i] = k % 10;
            k /= 10; 
        }
	}
	
	public void numberSort() {
		while(a==0) {
			for(int i=0; i<3 ; i++) {
				if(arrComputer[i]>arrComputer[i+1]) {
					int c = arrComputer[i];
					arrComputer[i]=arrComputer[i+1];
					arrComputer[i+1]=c;
					a++;
				}
			}
			if(a==0) {
				break;
			}
			a=0;
		}
		for(int i=1; i<4; i++) {
			if(arrComputer[0]==0) {
				if(arrComputer[i]!=0) {
					int j= arrComputer[0];
					arrComputer[0] = arrComputer[i];
					arrComputer[i] = j;
				}
			}else {
				break;
			}
				
		}
		
	}
	
	public void print() {
		for(int i=0; i<4; i++) {
			System.out.print(arrComputer[i]);
		}
	}
	

	
	public static void main(String[] args) {
		SmallNumber m = new SmallNumber();
		
		for(int i=1000; i<10000; i++ ) {
			m.inputComputer(i);
			System.out.print("출력:"+i+'\t');
			m.numberSort();
			m.print();
			System.out.println();
			
		}
		
		
		
		

	}
	
}


