package socket_ex;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {

        try{
            //로컬 컴퓨터의 InetAddress 얻기
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("내 컴퓨터 IP 주소 : " + local.getHostAddress());
            //하나의 도메인 이름에 여러 개의 컴퓨터 IP가 등록되어 운영될 때,
            //getAllByname()를 이용해 모든 IP 주소를 얻는다.
            InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
            for(InetAddress remote : iaArr){
                //InetAddress 객체에서 IP 주소를 얻기 위해서는 getHostAddress()를 사용한다.
                System.out.println("www.naver.com IP주소 : " + remote.getHostAddress());
            }
        }catch(UnknownHostException e){
            e.printStackTrace();
        }


    }
}
