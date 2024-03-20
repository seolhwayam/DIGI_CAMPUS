package Day12;

import java.util.ArrayList;

public class CleanNumber{
	public boolean isRead(int a) {
		ArrayList<Integer> check  = new ArrayList<Integer>();
		boolean result = false;
		boolean step = true;
		
		
		String str = String.valueOf(a);

		for(int i=0; i<str.length(); i++) {
			check.add(Character.getNumericValue(str.charAt(i)));
		}
		
		for(int i=0; i<check.size()-1; i++) {
			if(check.get(i) < check.get(i+1) && step==true) {
				step =true;
				result= true;
			} else {
				step =false;
				result= false;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		CleanNumber n = new CleanNumber();
		ArrayList<Integer> read  = new ArrayList<Integer>();
		int a=5000;
		int b=6000;
		
		for(int i=a; i<b; i++) {
			if(n.isRead(i)) {
				read.add(i);				
			}

		}
		
		for(Integer s:read) {
			System.out.println(s);
		}
		System.out.println("전체 갯수는 : "+read.size());
		
	}

}
