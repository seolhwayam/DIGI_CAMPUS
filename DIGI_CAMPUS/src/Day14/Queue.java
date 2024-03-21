package Day14;

public class Queue {
	static int near;
	static int front;
	static int queue[];
	
	public Queue() {
		this.near = 0;
		this.front =0;
		queue = new int[5];
	}
	
	public void shift() {
		int i;
		int num = near - front;
		for(i=0); i<num i++){
			data[i] = data[front];
			data[front++]=0;
		}
		front =0;
		near=i;
	}
	
	
	public static void main(String[] args) {
		
	}

}
