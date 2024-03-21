package multi;

import java.net.*;
class ClientExample4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println(
                "Usage: java ClientExample4 <user-name>"); //이름이 미입력시 출력
            return;
        }
        try {
            Socket socket = new Socket("192.168.0.83", 9002); //소켓 객체 생성 초기화, Socket(ip주소,포트) , 서버 소켓
            Thread thread1 = new SenderThread(socket, args[0]); //sokect과 이름 SenderThread로 송신하여 thream객체에 초기화
            Thread thread2 = new ReceiverThread(socket); // ReceiverThread 객체 생성하여 초기화

            thread1.start();//thread 시작
            thread2.start();//thread 시작
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
