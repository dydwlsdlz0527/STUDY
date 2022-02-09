package socket_ex;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
    public static void main(String[] args) {
        //소켓 생성
        Socket socket = null;
        try{
            //socket = new Socket(5001)
            socket = new Socket();
            System.out.println("연결 요청");
            //IP주소 대신 도메인 이름을 알고 있다면, InetSocketAddress() 사용
            socket.connect(new InetSocketAddress("localhost",5001));
            System.out.println("연결 성공");
            //상대방에게 보낼 데이터 byte[]로 생성
            byte[] bytes = null;
            String message = null;
            //Client -> Server 데이터 보내기
            OutputStream os = socket.getOutputStream();
            message = "Hello Server";
            bytes = message.getBytes("UTF-8");
            os.write(bytes);
            os.flush();
            System.out.println("데이터 보내기 성공");
            //Server -> Client 로 보낸 데이터 받기
            InputStream is = socket.getInputStream();
            bytes = new byte[100];
            int readByteCount = is.read(bytes);
            message = new String(bytes, 0, readByteCount, "UTF-8");
            System.out.println("데이터 받기 성공 : " + message);
            //상대방이 정상적으로 Socekt의 close()를 호출했을 경우
            if(readByteCount==-1){
                throw new IOException();
            }
            os.close();
            is.close();
        }catch(IOException e){
            e.printStackTrace();
            try{
                socket.close();
            }catch(IOException e2){
                e2.printStackTrace();
            }
        }
        if(!socket.isClosed()){
            try{
                socket.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
