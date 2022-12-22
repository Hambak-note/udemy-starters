package week5.day4.question2;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ProductInformTCPServer {

    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(15000);
        System.out.println("[수신자 : 수신시작]");

        byte[] byteArr = new byte[1000];
        DatagramPacket receiveDatagramPacket = new DatagramPacket(byteArr, byteArr.length);
        datagramSocket.receive(receiveDatagramPacket);
        String receiveStr = new String(byteArr);

        System.out.println(receiveDatagramPacket.getAddress() + " 주소의 "
                + receiveDatagramPacket.getPort() + " 포트에서 [" + receiveStr.trim() +  "] 요청 받았습니다.");
        System.out.println("[수신자 : 수신종료]");
        System.out.println();


        System.out.println("[수신자 : 응답시작]");
        String searchStr = readAndSearchFile(receiveStr.trim());
        byte[] sendBytes = searchStr.getBytes();
        DatagramPacket sendDatagramPacket = new DatagramPacket(
                sendBytes, sendBytes.length,
                receiveDatagramPacket.getAddress(), receiveDatagramPacket.getPort()
        );

        datagramSocket.send(sendDatagramPacket);
        System.out.println("[수신자 : 응답종료]");
        datagramSocket.close();

        //product.txt
        //name - price - balance

        //클라이언트 상품명 동일 가격 수량 클라이언트로 전송

    }

    static private String readAndSearchFile(String itemName) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader("C:\\Study\\udemy_starters\\udemy-starters\\Java\\src\\week5\\day4\\question2\\product.txt")
        );

        String currentStr;
        while((currentStr = reader.readLine()) != null){
            if(currentStr.contains(itemName)){
                return splitAndConcatString(currentStr, "-");
            }
        }
        return "찾는 물건이 없습니다.";
    }

    static private String splitAndConcatString(String str, String regex){
        String[] splitStr = str.split(regex);
        return "가격 = "+ splitStr[1] + " 수량 = " + splitStr[2];
    }

}
