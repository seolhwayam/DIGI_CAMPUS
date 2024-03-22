package Day14;

import java.util.Scanner;

public class Pibonach {
	int count = 1;
	
	public int pibo(int n) {
		if(n<=1) {
			return n;
		}
		return pibo(n-1)+pibo(n-2);
	}

	public static void main(String[] args) {
		Pibonach p = new Pibonach();
		Scanner sc = new Scanner(System.in);
		System.out.println("피보나치 숫자 입력 : ");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			System.out.print(p.pibo(i)+" ");
		}
		
	}

}
