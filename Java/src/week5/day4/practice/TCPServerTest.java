package week5.day4.practice;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServerTest {

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(10000);
        System.out.println("[서버는 10000 포트에서 대기중입니다.]");

        while(true){
            Socket socket = ss.accept();
            String clientIp = socket.getInetAddress().getHostAddress();
            System.out.println("[서버는 " + clientIp + " 클라이언트 접속 허용합니다.]");


            //클라이언트 요청받는다 = 입력스트림
            InputStream inputStream = socket.getInputStream();
//            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
//            //방법 1
//            String request = br.readLine();
//            System.out.println("[서버는 클라이언트로부터 " + request + " 요청을 전달받았습니다.]");

            //방법 2
            Scanner scanner = new Scanner(inputStream);
            String requestByScanner = scanner.nextLine();
            System.out.println("[서버는 클라이언트로부터 " + requestByScanner + " 요청을 전달받았습니다.]");

            //출력
            OutputStream outputStream = socket.getOutputStream();
            String response = "1번 제목1  내용1 작성자1";
            byte[] by = response.getBytes();
            outputStream.write(by);
            System.out.println("[서버는 클라이언트로 " + " 응답을 전달합니다.]");

            socket.close();
            System.out.println("[서버는 클라이언트 접속 해제합니다.]");
        }
    }



}
