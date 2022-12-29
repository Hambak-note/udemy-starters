package week5.day4.practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UDPReceiver {


    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(15000);
        System.out.println("[수신자 : 수신시작]");

        byte[] byteArr = new byte[1000]; //수신 받은 내용 저장 배열
        DatagramPacket receiveDatagramPacket = new DatagramPacket(byteArr, byteArr.length);
        datagramSocket.receive(receiveDatagramPacket);
        String receiveStr = new String(byteArr);

        System.out.println(receiveDatagramPacket.getAddress() + " 주소의 "
                + receiveDatagramPacket.getPort() + " 포트에서" + receiveStr.trim() +  "받았습니다.");
        System.out.println("[수신자 : 수신종료]");
        System.out.println();

        //응답 send
        System.out.println("[수신자 : 응답시작]");
        String time = new SimpleDateFormat("HH시 mm분 ss초").format(new Date());
        DatagramPacket sendDatagramPacket = new DatagramPacket
                (time.getBytes(), time.getBytes().length,
                        receiveDatagramPacket.getAddress(), receiveDatagramPacket.getPort());

        datagramSocket.send(sendDatagramPacket);
        System.out.println("[수신자 : 응답종료]");
        datagramSocket.close();

    }
}
