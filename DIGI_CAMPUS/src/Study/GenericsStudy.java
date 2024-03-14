package Study;

public class GenericsStudy<T> {
	
	private T[] arr;
	
	public void add(T[] arr2) {
		this.arr = arr2;
	}
	
	public void print() {
		for(T s:arr) {
			System.out.println(s);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		GenericsStudy<Integer> gn = new GenericsStudy<Integer>();
		Integer[] arr = new Integer[5];
		for(int i=0; i<5; i++) {
			arr[i] = i;
		}
		gn.add(arr);
		gn.print();
		
	}
}
