

package multi;

import java.io.*;
import java.net.*;
import java.util.*;
class PerClinetThread extends Thread { //Thread를 상속 받음
    static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
    //PrintWriter 출력class
    //ArrayList는 동기화 지원을 하지 않음. 그러나 Collections.synchronizedList기능을 사용하면 동기화가 된다.
    //클라이언트로부터 받은 메세지 띄워주기위해 list보관
    //List <PrintWriter>에 ArrayList 객체생성 초기화
    
    Socket socket; //클라이언트 socket을 받기 위한 필드
    PrintWriter writer; // 클라이언트가 작성한 메세지를 받기 위한 필드
    
    
    PerClinetThread(Socket socket) {
        this.socket= socket; //클라이언트의 socket를 매개변수로 받아 객체생성 초기화
        try {
            writer = new PrintWriter(socket.getOutputStream());
            									// getOutputStream() : sokect의 출력 스트림 반환
            									// PrintWriter은 sokect의 출력 스트림을 텍스트 형식으로 추출
            
            list.add(writer); // list에 writer에 추가
        }
        catch (Exception e) {//예외처리
            System.out.println(e.getMessage());
        }
    }
    public void run() { //thread 작동
        String name = null; //초기화
        try {
            BufferedReader reader = new BufferedReader( //BufferedReader 입력스트림을 문자로 변환
                new InputStreamReader(socket.getInputStream())); //socket.getInputStream 클라이언트가 입력한 입력스트림반환
	    
            name = reader.readLine(); //readLine() : 한 줄씩 출력   
            						  // 클라이언트 sokect으로부터 넘겨받은 문자를 name에 초기화
            sendAll("#" + name + "���� �����̽��ϴ�"); //"#" + name + "���� �����̽��ϴ�" 출력 후 BufferedReader비움
            while (true) {
                String str = reader.readLine(); //한쭐씩 받아서 문자열 str에 초기화
                if (str == null) //str에 null이라면 종료
                    break;
                sendAll(name + ">" + str);  //name > 입력한 내용 출력
                							//name은 클라이언트 이름
            }
        }
        catch (Exception e) {//예외처리
            System.out.println(e.getMessage());
        }
        finally {
            list.remove(writer); //list에서 해당 soket 삭제
            sendAll("#" + name + "���� �����̽��ϴ�"); //"#" + name + "���� �����̽��ϴ�" 출력
            try {
                socket.close(); //소켓 연결을 닫음
            }
            catch (Exception ignored) {
            }
        }
    }
	
    //출력 
    private void sendAll(String str) {  
        for (PrintWriter writer : list) {
            writer.println(str); //list에 있는 데이터 전체 출력
            writer.flush(); //BufferedReader의 출력 대상물 다 강제 출력(비운다)
        }
    }
}
