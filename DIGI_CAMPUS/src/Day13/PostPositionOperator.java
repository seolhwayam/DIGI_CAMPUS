package Day13;

import java.util.ArrayList;

public class PostPositionOperator {
	ArrayList<Character> arr = new ArrayList<Character>();
	
	
	public void push(Character a) {
		arr.add(a);
	}
	
	public void pop() {
		System.out.print(arr.get(arr.size()-1));
		arr.remove(arr.size()-1);
		
	}
	
	
	
	public static void main(String[] args) {
		PostPositionOperator p = new PostPositionOperator();
		//113+11-(32-(9-2+6))
		//11311+32926+-
		System.out.print(113+" ");
		p.push('+');
		System.out.print(11+" ");
		p.push('-');
		p.push('(');
		System.out.print(9+" ");
		p.push('-');
		System.out.print(2+" ");
		p.push('+');
		System.out.print(6+" ");
		p.push(')');
		p.pop();
		System.out.print(" ");
		p.pop();
		System.out.print(" ");
		p.pop();
		System.out.print(" ");
		p.pop();
		System.out.print(" ");
		p.pop();
		System.out.print(" ");
		p.pop();
		System.out.print(" ");
		p.push(')');
		System.out.print(" ");
		p.pop();
		
		
		
		
	}

}
