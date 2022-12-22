package week5.day4.question1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ProductTCPServer {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(10001);
        System.out.println("[서버는 10001 포트에서 대기중입니다.]");

        int clientCount = 0;
        while(clientCount < 3){
            Socket socket = serverSocket.accept();
            String clientIp = socket.getInetAddress().getHostName();
            System.out.println();
            System.out.println("[서버는 " + clientIp + " 클라이언트 접속 허용합니다.]");

            InputStream inputStream = socket.getInputStream();
            Scanner scanner = new Scanner(inputStream);
            String request = scanner.nextLine();
            System.out.println("[서버는 클라이언트로부터 " + request + " 요청을 전달받았습니다.]");

            writeProductInfo(request);

            OutputStream outputStream = socket.getOutputStream();
            String response = "추가 완료했습니다.";
            byte[] by = response.getBytes();
            outputStream.write(by);
            System.out.println("서버는 클라이언트로 응답을 전달합니다");
            socket.close();
            System.out.println("[서버는 " + clientIp +" 클라이언트 접속 해제합니다.]");
            clientCount++;

            socket.close();
        }

    }

    private static void writeProductInfo(String productInfo) throws IOException {
        File file = new File("C:\\Study\\udemy_starters\\udemy-starters\\Java\\src\\week5\\day4\\question1\\productInfo.txt");

        if(!file.exists()){
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file, true);
        BufferedWriter writer = new BufferedWriter(fw);

        writer.write(productInfo+"\n");
        System.out.println("파일 입력이 완료되었습니다.");

        writer.close();
    }
}
