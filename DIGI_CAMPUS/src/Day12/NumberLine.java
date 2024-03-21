package Day12;

public class NumberLine {
	int[] arrComputer;
	int a = 0;
	
	public NumberLine() {
		this.arrComputer = new int[4];
		this.a =0;
	}
	public void inputComputer(int k) {
		for (int i = 0; i < arrComputer.length; i++) {
			arrComputer[i] = k % 10;
            k /= 10; 
        }
	}
	public static void main(String[] args) {
		NumberLine n = new NumberLine();
		for(int i=100; i<120; i++) {
			n.inputComputer(i);
			
		}
	}

}
