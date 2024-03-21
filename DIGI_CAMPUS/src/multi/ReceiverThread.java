package multi;

import java.io.*;

//다른 클라이언트가 입력한 내용 받는 class
import java.net.*;
class ReceiverThread extends Thread {//thread 상속
    Socket socket;
    ReceiverThread(Socket socket) { //넘겨받은 sokect 필드 초기화
        this.socket = socket;
    }
    //서버로 부터 수신된 메세지 출력
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //입력
            
            while (true) {
                String str = reader.readLine();//reader내용 한줄씩 초기화
                if (str == null) //null이면 종료
                    break;
                System.out.println(str); //str 출력
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
