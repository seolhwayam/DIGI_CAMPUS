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
	
	public int getSize() {
		return arr.size();
	}

	
	public static void main(String[] args) {
		PostPositionOperator p = new PostPositionOperator();
		ArrayList<Integer> number = new ArrayList<Integer>();
		//113+11-(32-(9-2+6))
		//11311+32926+-
		String test = "113+11-(32-(9-2+6))";
		String num;
		for(int i=0; i<test.length(); i++) {

			if(test.charAt(i)=='+'||test.charAt(i)=='-'){
				
			}
			if(test.charAt(i)=='('||test.charAt(i)==')') {
				if(test.charAt(i)=='(') {
					p.push('(');
				}else {
					for(int k=0; k<p.getSize(); k++) {
						
					}
				}
			}
		}
		
		
		
		
	}

}
