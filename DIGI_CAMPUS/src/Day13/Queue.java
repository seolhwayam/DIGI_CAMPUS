package Day13;

public class Queue {
	static int front;
	static int end;
	static int queue[];
	
	public Queue() {
		queue = new int[5];
		this.front=0;
		this.end = -1;
	}
	
	public void enqueue(int a) {
		if(front==0 && end>=4 ) {
			System.out.println("더 이상 넣을 수 없습니다.");
		}else {
			shift();
			end++;
			queue[end] = a;
			System.out.println("숫자를 넣었습니다 : "+a);
			System.out.print("넣고나면 : ");
			print();
		}
	}
	
	public void dqueue() {
		if(front==end&& front==0) {
			System.out.println("더 이상 뺄 숫자가 없습니다.");
		}else {
		System.out.println("숫자를 빼내옵니다 : " + queue[front]);
		queue[front]=0;
		front++;
		System.out.print("빼고나면 : ");
		print();
		}
		
	}
	
	public void print() {
		for(int a:queue) {
			System.out.print(a+" ");
		}
		System.out.println();

	}
	
	public void shift() {
	    if (end >= queue.length-1 && front != 0) {
	    	int a = front;
	    	int b = front;
	    	for(int i=0; i<a-1; i++ ) {
	    		System.out.println(i);
	    		queue[i] = queue[b+i];
	    		queue[b+i] =0;
	    		front--;
	    		end--;
	    		if(end==front) {
	    			front=1;
	    			end=1;
	    			break;
	    		}
	    		
	        }
	    	front--;
    		end--;
	    }
	}

	
	public static void main(String[] args) {
		Queue a = new Queue();
		a.enqueue(0);
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		a.enqueue(4);
		a.enqueue(5);
		a.dqueue();
		a.dqueue();
		a.dqueue();
		a.enqueue(5);
     	a.enqueue(3);
     	a.enqueue(7);
     	a.enqueue(6);
     	a.dqueue();
		a.dqueue();
		a.dqueue();
		a.dqueue();
		a.enqueue(3);
		a.enqueue(4);
		a.enqueue(5);
		a.dqueue();
		a.dqueue();
		a.dqueue();
		a.dqueue();
		a.enqueue(4);
		a.enqueue(5);
		
	
	
		
	}
	
	

}
