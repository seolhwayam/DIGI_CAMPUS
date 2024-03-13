package Day1;
import java.util.Scanner;

public class StarMethod {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String answer;
	do {
		System.out.println("어떤 별을 만들어 볼까요? (1-6번 선택) : "); //별 종류 선택
		int star = StarMethod .inputNum(sc); // 별 종류 입력
		switch(star) { // 별 종류에 따른 switch문
			case 1:
				StarMethod.star1();
				break;
			case 2:
				StarMethod.star2();
				break;
			case 3:
				StarMethod.star3();
				break;
			case 4:
				StarMethod.star4();
				break;
			case 5:
				StarMethod.star5();
				break;
			case 6:
				System.out.println("홀수 숫자를 입력해주세요 : "); 
				int num = StarMethod .inputNum(sc); //홀수 숫자 입력
				StarMethod.star6(num);
				break;
				
		}
		System.out.println("계속하겠습니까? (y/Y) : ");
		answer = StarMethod.inputString(sc);
	}while(answer.equals("Y")||answer.equals("y"));
		System.out.println("계산기가 종료되었습니다.");
	
	}
	
	public static int inputNum(Scanner sc) {
		return sc.nextInt();
	}
	public static String inputString(Scanner sc) {
		return sc.next();	
	}
	
	public static void star1() {
	    for (int j=0;j<3;j++){  
	         for(int i =0;i<3;i++){
	            System.out.print("*");
	         }  
	         System.out.println(); 
	    }
	}
	public static void star2() {
		int z =1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<z; j++) {
				System.out.print("*");
			}
			System.out.println();
			z++;
		}
	}
	public static void star3() {
		int j =0;
		int z =0;
		for(int i=0; i<3; i++) {
			for(;j<(i+1);j++) {
				for(;z<(2-i); z++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			z=0;
			j=0;
			System.out.println();
		}
		
	}
	public static void star4() {
		for(int i=0;i<3;i++){
			for(int j=0;j<2-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		} 
		
	}
	public static void star5() {
		  for (int i = 0; i < 5; i++) {
              for (int j = 0; j < 5; j++) {
                 if (i <= 5 / 2) {
                    if (i + j <= 5 / 2 - 1)
                       System.out.print(" ");
                    else if (j - i >= 5 / 2 + 1)
                       System.out.print(" ");
                    else
                       System.out.print("*");
                 } else if (i > 5 / 2) {
                    if (i - j >= 5 / 2 + 1)
                       System.out.print(" ");
                    else if (i + j >= 5 / 2 * 3 + 1)
                       System.out.print(" ");
                    else
                       System.out.print("*");
                 }
              }
              System.out.println();
           }
		}
		
	
	public static void star6 (int num) {
         if ((num % 2) == 0) {
            System.out.println("홀수 숫자를 입력해주세요. 종료합니다.");
         } else {
            for (int i = 0; i < num; i++) {
               for (int j = 0; j < num; j++) {
                  if (i <= num / 2) {
                     if (i + j <= num / 2 - 1)
                        System.out.print(" ");
                     else if (j - i >= num / 2 + 1)
                        System.out.print(" ");
                     else
                        System.out.print("*");
                  } else if (i > num / 2) {
                     if (i - j >= num / 2 + 1)
                        System.out.print(" ");
                     else if (i + j >= num / 2 * 3 + 1)
                        System.out.print(" ");
                     else
                        System.out.print("*");
                  }
               }
               System.out.println();
            }
         }

	}
	
	
	
	
	
	
	
}
