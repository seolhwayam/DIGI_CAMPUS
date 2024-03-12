package Memory;

abstract class Memory {
	private int number[] = new int[5];
	
	private int num = -1;
	
	public void push(int a) {
		if(num>=4) {
			System.out.println("꽉 찼습니다. 더 이상 넣을 수 없습니다.");
		}else {
			num++;
			number[num] = a;
		}
	};

	public abstract void pop();

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
	public void pop() {
		// TODO Auto-generated method stub
		if(super.getNum()<0) {
			System.out.println("배열에 들어있는 것이 없습니다. ");
		}else {
			System.out.println(number[super.getNum()]);
			number[super.getNum()] = 0;
			super.setNum(); //num--;
		}
		
	}
}

class MyQueue extends Memory{ //큐
	int[] number = super.getNumber();
	int frount =0;
	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if(super.getNum()<0) {
			System.out.println("배열에 들어있는 것이 없습니다. ");
		}else{
		System.out.println(number[0]);
		for (int i=0; i<4 ; i++) {
			number[i] = number[i+1] ;
		}
		number[4]=0;
		super.setNum();
		}
	
	}
}
