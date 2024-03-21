package Day14;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("팩토리얼 수를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int check = num;
		for(int i=num-1; i>0; i--) {
			num*=i;
		}
		
		for(int i=check; i>0; i--) {
			if(i!=1) {
				System.out.print(i+"*");
			}else {
				System.out.print(i+"=");
			}
			
		}
		System.out.println(num);
		
		
	}

}
