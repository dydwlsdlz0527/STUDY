package socket_ex;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try{
            //포트 번호 : 5001 서버 소켓 객체 생성
            //ServerSocket serverSocket = new ServerSocket(5001);
            serverSocket = new ServerSocket();
            //특정 IP로 접속할 때
            serverSocket.bind(new InetSocketAddress("localHost",5001));
            while(true){
                System.out.println("연결 기다림");
                //연결 요청을 수락하면 소켓 생성
                Socket socket = serverSocket.accept();
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("연결 수락함 : " + isa.getHostName());

                byte[] bytes = null;
                String message = null;
                //Client -> Server 로 보낸 데이터 받기
                InputStream is = socket.getInputStream();
                bytes = new byte[100];
                int readByteCount = is.read(bytes);
                message = new String(bytes, 0, readByteCount, "UTF-8");
                System.out.println("데이터 받기 성공 : " + message);
                //Server -> Client 데이터 보내기
                OutputStream os = socket.getOutputStream();
                message = "Hello Client";
                bytes = message.getBytes("UTF-8");
                os.write(bytes);
                os.flush();
                System.out.println("데이터 보내기 성공");

                is.close();
                os.close();
                socket.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        if(!serverSocket.isClosed()){
            try{
                serverSocket.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
