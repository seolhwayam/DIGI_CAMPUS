package multi;

import java.net.*;
class ServerExample4 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null; // 서버 소켓 초기화 (초기화는 필수는 아니지만, 명시적으로 해주는 것이 좋다!)
        try {
            serverSocket = new ServerSocket(9002); //serverSocket 객체 생성(포트)/메소드 오버로딩으로 포트를 안넣어줘도 나중에 설정 가능!
            while (true) { // 서버 종료까지 반복문 실행 
                Socket socket = serverSocket.accept(); //클라이언트로부터 소켓을 받아 Socket레퍼런스 변수에 저장.accept -> 소켓 받을 준비하는 메소드
                Thread thread = new PerClinetThread(socket); //PerClinetThread(socket) 객체생성하여 thread 객체 생성
                											 //PerClinetThread는 thread를 상속받은 class -> thread 객체 초기화
                											 //부모 = 자식으로 동적바인딩
                											
                thread.start(); //thread start!!!
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage()); // 예외처리 구문. 모든 예외시 예외구문 출력
        }
    }
}
