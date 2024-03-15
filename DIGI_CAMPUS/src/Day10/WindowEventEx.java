package Day10;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;

class Exit extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("종료"+a);
		System.exit(0);
		
	}
	
}

public class WindowEventEx extends Frame {
	Scanner sc= new Scanner(System.in);
	
	public WindowEventEx() {
		super("WindowEvent 테스트");
		
		Label exit = new Label("프로그램 종료");
		
		add(exit);
		
		
		setBounds(300,300,200,200);
		setVisible(true);
		

		addWindowListener(new Exit());
	}

	public static void main(String[] args) {
		new WindowEventEx();
		
	}




}
