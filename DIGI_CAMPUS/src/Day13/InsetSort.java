package Day13;

import java.util.Random;

public class InsetSort {
	public static void main(String[] args) {
//		int data[] = new int[1000];
//		Random random = new Random();
//		
//		for(int i=0; i<1000; i++) {
//			data[i] = random.nextInt(1000);
//		}
		int data[] = {1,2,5,4};
		
		insertionSort(data);
		
//		for(int i=0; i<=998; i++) {
//			if(data[i]>data[i+1]) {
//				System.out.println("Error");
//			}
//			System.out.println(data[i]);
//		}
		for(int a:data) {
			System.out.print(a+" ");
		}
	}

	private static void insertionSort(int[] data) {
		// TODO Auto-generated method stub
		for(int i=1; i<data.length; i++) {
			int j;  //정렬된 수
			int temp = data[i];//현재 비교할 수
			for(j=i; j>0 && data[j-1]>temp; j--) {
				data[j] = data[j-1]; 
			}
			data[j] = temp;
		}
		
		
	}

}
