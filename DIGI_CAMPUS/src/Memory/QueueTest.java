package Memory;




	

public class QueueTest {
	int arr[] = new int[5];
	
	int top=0;
	int front =0;
	

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public void push(int data) {
		arr[top++] = data;
	}
	
	public int pop() {
		return arr[--top];
	}
	
	public static void main(String[] args) {
		QueueTest a = new QueueTest();
		a.push(1);
		a.push(2);
		a.push(3);
		
		a.pop();
		a.pop();
		
		if(a.getFront() !=0 && (a.getFront() + a.getTop())==5 ) {
			for(int i=0; i<5 ; i++) {
				a.arr[i]= a.arr[i+1];
			}
		}
		for(int i=0; i<5; i++) {
			System.out.println(a.arr[i]);
			
		}
		
	}
}
