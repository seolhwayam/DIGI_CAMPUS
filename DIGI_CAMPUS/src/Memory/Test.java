package Memory;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyQueue mq = new MyQueue();
		MyStack ms = new MyStack();
		boolean a = true;
		System.out.println("어떤 메모리를 선택하겠습니까? (1. stack 2.queue)");
		if(sc.nextInt()==1) {
			while(a==true) {
				System.out.println("stack 메뉴 (1. push 2.pop 3.종료)");
				switch(sc.nextInt()) {
					case 1:
						System.out.println("push할 숫자를 입력해주세요 : ");
						ms.push(sc.nextInt());
						break;
					case 2:
						System.out.println(ms.pop());
						break;
					case 3:
						System.out.println("메모리 프로그램 종료합니다.");
						a=false;
						break;
				}
			}

		}else{
			while(a==true) {
				System.out.println("queue 메뉴 (1. push 2.pop 3.종료)");
				switch(sc.nextInt()) {
					case 1:
						System.out.println("push할 숫자를 입력해주세요 : ");
						mq.push(sc.nextInt());
						break;
					case 2:
						System.out.println(mq.pop());
						break;
					case 3:
						System.out.println("메모리 프로그램 종료합니다.");
						a=false;
						break;
				}
			}
			
		}

		
	}
}

