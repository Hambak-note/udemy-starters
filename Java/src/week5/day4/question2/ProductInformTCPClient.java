package week5.day4.question2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class ProductInformTCPClient {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket datagramSocket = new DatagramSocket();

        System.out.print("조회할 상품명을 입력하세요 => ");
        String itemName = br.readLine();

        //서버로 전송
        System.out.println("[발신자 : 발신시작]");

        byte[] by = itemName.getBytes();

        DatagramPacket sendDatagramPacket = new DatagramPacket(
                by, by.length, new InetSocketAddress("127.0.0.1", 15000)
        );
        datagramSocket.send(sendDatagramPacket);
        System.out.println("[발신자 : 발신처리]");



        //서버로부터 받은 응답 출력
        System.out.println();
        System.out.println("[발신자 : 응답 수신 중]");

        byte[] byteArr = new byte[1000];
        DatagramPacket receiveDatagramPacket = new DatagramPacket(byteArr, byteArr.length);
        datagramSocket.receive(receiveDatagramPacket);
        String receiveStr = new String(byteArr);

        System.out.println(receiveDatagramPacket.getAddress() + " 주소의 "
        + receiveDatagramPacket.getPort() + " 포트에서 [" + receiveStr.trim() + "] 응답을 받았습니다.");

        System.out.println("[발신자 : 응답 수신 완료]");

        datagramSocket.close();
    }
}
