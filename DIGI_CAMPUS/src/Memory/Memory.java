package Memory;

abstract class Memory {
	private int number[] = new int[5];
	
	private int num = -1;
	
	public void push(int a) {
		num++;
		number[num] = a;
	};

	public abstract int pop();

	public int[] getNumber() {
		return number;
	}

	public void setNumber(int[] number) {
		this.number = number;
	}

	public int getNum() {
		return num;
	}

	public void setNum() {
		num--;
	}
	
}

class MyStack extends Memory{//스택
	int[] number = super.getNumber();
	@Override
	public int pop() {
		// TODO Auto-generated method stub
		int a = number[super.getNum()];
		number[super.getNum()] = 0;
		super.setNum(); //num--;
		return a;
	}
}

class MyQueue extends Memory{ //큐
	int[] number = super.getNumber();
	@Override
	public int pop() {
		// TODO Auto-generated method stub
		int a = number[0];
		for (int i=0; i<4 ; i++) {
			number[i] = number[i+1] ;
		}
		return a;
	}
	
}
