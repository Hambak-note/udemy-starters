package week5.day4.practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPSender {

    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(); //랜덤 포트
        System.out.println("[발신자 : 발신시작]");

        String data = "지금 몇시에요?";

        byte[] by = data.getBytes();

        //길이를 꼭 지정해줘야 한다.
        DatagramPacket sendDatagramPacket = new DatagramPacket
                (by, by.length,
                        new InetSocketAddress("127.0.0.1", 15000));

        datagramSocket.send(sendDatagramPacket);
        System.out.println("[발신자 : 발신처리]");

        System.out.println();
        System.out.println("[발신자 : 응답 수신 중]");

        byte[] byteArr = new byte[1000]; //수신 받은 내용 저장 배열
        DatagramPacket receiveDatagramPacket = new DatagramPacket(byteArr, byteArr.length);
        datagramSocket.receive(receiveDatagramPacket);
        String receiveStr = new String(byteArr);

        System.out.println(receiveDatagramPacket.getAddress() + " 주소의 "
                + receiveDatagramPacket.getPort() + " 포트에서" + receiveStr.trim() +  "받았습니다.");
        System.out.println("[발신자 : 응답 수신 완료]");


        datagramSocket.close();

    }
}
