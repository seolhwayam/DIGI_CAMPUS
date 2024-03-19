package multi;

import java.net.*;

//클라이언트 입력 받기
import java.io.*;
class SenderThread extends Thread { //Thread 상속
    Socket socket; //클라이언트 sokect
    String name; //이름 필트
    SenderThread(Socket socket, String name) { //클라이언트 sokect과 닉네임 매개변수 초기화
        this.socket = socket;
        this.name = name;
    }
    public void run() { 
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //입력
            
            PrintWriter writer = new PrintWriter(socket.getOutputStream());//출력
            
        //제일 먼저 서버로 대화명 송신
	    writer.println(name); //이름 출력 후 삭제 , 서버 전송함
        writer.flush();
           
	    while (true) {
                String str = reader.readLine(); //한줄 씩 입력한 내용 문자열 초기화
                if (str.equals("bye")) //bye면 종료
                    break;
                writer.println(str);//서버 전송 후 삭제
                writer.flush();
            }
        }
        catch (Exception e) {//예외처리
            System.out.println(e.getMessage());
        }
        finally {
            try { 
                socket.close(); //bye시 소켓연결 해제
            } 
            catch (Exception ignored) {
            }
        }
    }
}
