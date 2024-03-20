package Day13;

public class SortExam {
	public static void main(String[] args) {

		int data [] = {98,78,100,30,55};
		bubbleSort(data);
		for(int i:data) {
			System.out.print(i+"\t");
		}
	}

	private static int[] bubbleSort(int[] data) {
		// TODO Auto-generated method stub
		int count =0;
		int turn =0;
		int index = 0;
		while(index < data.length) {
			for(int i=0; i<data.length-index-1 ; i++) {
				turn++;
				if(data[i]>data[i+1]) {
					count++;
					int c = data[i];
					data[i]=data[i+1];
					data[i+1]=c;
				}
			}
			index++;
		}
		System.out.println("총 바꾼 횟수 : "+count);
		System.out.println("총 반복문이 돈 횟수 : "+turn);
		return data;
		
	}

}
