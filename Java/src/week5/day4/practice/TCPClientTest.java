package week5.day4.practice;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientTest {


    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1", 10000);
        System.out.println("== 클라이언트가 서버로 접속했습니다. ==");
        String serverIp = socket.getInetAddress().getHostAddress();
        System.out.println("==클라이언트가 " + serverIp + " 서버로 접속했습니다.==");

        //클라이언트가 먼저 1번 게시물 주세요 요청
        OutputStream outputStream = socket.getOutputStream();

        String request = "1번게시물\n";
        byte[] by = request.getBytes();
        outputStream.write(by);

        //서버로부터 응답 = 입력스트림
        InputStream inputStream = socket.getInputStream();
//        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
//            //방법 1
//            String request = br.readLine();
//            System.out.println("[서버는 클라이언트로부터 " + request + " 요청을 전달받았습니다.]");

        //방법 2
        Scanner scanner = new Scanner(inputStream);
        String requestByScanner = scanner.nextLine();
        System.out.println("[클라이언트가 서버로부터 " + requestByScanner + " 응답을 전달받았습니다.]");

        socket.close();
        System.out.println("== 클라이언트가 서버의 접속을 해제했습니다. ==");
    }
}
