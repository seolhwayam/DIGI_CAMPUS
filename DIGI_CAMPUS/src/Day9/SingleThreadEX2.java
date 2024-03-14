package Day9;
/* thread
 * 멀티 스레드
 * : 프로세스 내에서 실행되는 세부 작업 단위
 * 
 * 
 * 동시에 하는 것처럼 보이지만 동시에는 아니다!!
 * 
 * 생명주기
 * : thread 객체가 생성되면 생성주기를 가지게 된다.
 * new -> 스레드가 만들어진 상태 [new Thread() ] 
 * runnable -> 스레드객체가 생성된 후에 "start()"메서드를 호출 -> runnable 상태로 이동 [start()]
 * running - runnable상태에서 스레드 스케줄러에 의해 running 상태로 이동 [run()]
 * blocked -> 스레드가 다른 특정한 이유로 running상태에서 blocked로 이동
 * dead -> 스레드가 종료되면 그 스레드는 다시 시작할수 없다.
 * 
 * 스레드의 생성방법
 * 1. Thread 클래스를 상속받는 방법 (extends Thread)
 * 2. Runnable 인터페이스 구현하는 방법 (implements Runnable)
 * 
 * 동기화
 * - 임계영역이란 멀티스레드에 의해 공유자원
 * 
 * 
 * */
class SingleThreadEX1 extends Thread{
	private int [] temp;
	public SingleThreadEX1 (String threadname) {
		super.setName(threadname);
		temp = new int[10];
		for(int start=0; start<temp.length; start++) {
			temp[start] = start;
		}
	}
	public void run() {
		for(int start : temp) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
			System.out.printf("현재 쓰레드이름 : "+ currentThread().getName() );
			System.out.printf("temp value : %d %n", start);
		}
		
	}
}


public class SingleThreadEX2 implements Runnable{
	private int [] temp;
	public SingleThreadEX2 () {
		temp = new int[10];
		for(int start=0; start<temp.length; start++) {
			temp[start] = start;
		}
	}
	public void run() {
		for(int start : temp) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
			System.out.printf("현재 쓰레드이름 : "+ Thread.currentThread().getName());
			System.out.printf("temp value : %d %n", start);
		}
		
	}
	public static void main(String[] args) {
		Runnable r = new SingleThreadEX2();
		Thread si = new Thread(r);
		si.setName("superman2");
		si.start();
		
		SingleThreadEX1 st = new SingleThreadEX1("superman1");
		st.start();
	}

}
