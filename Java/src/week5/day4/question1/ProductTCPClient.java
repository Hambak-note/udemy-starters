package week5.day4.question1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ProductTCPClient {


    public static void main(String[] args) throws IOException {

        for(int i = 1; i < 4; i++){
            Product product =printAddItemMenuAndReturnProduct();
            Socket socket = new Socket("127.0.0.1", 10001);
            System.out.println("== 클라이언트가 서버로 접속했습니다.==");
            String serverIp = socket.getInetAddress().getHostAddress();
            System.out.println("== 클라이언트가 " + serverIp + " 서버로 접속했습니다.==");

            OutputStream outputStream = socket.getOutputStream();

            String request = product.toString();
            byte[] by = request.getBytes();
            outputStream.write(by);

            InputStream inputStream = socket.getInputStream();
            Scanner scanner = new Scanner(inputStream);
            String response = scanner.nextLine();
            System.out.println("클라이언트가 서버로부터 [" + response + "] 응답을 전달 받았습니다.");

            socket.close();
            System.out.println("클라이언트가 서버의 접속을 해제 했습니다.");

        }

    }

    static private Product printAddItemMenuAndReturnProduct() throws IOException {

        String name;
        int price;
        int inventory;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("=== 상품 추가 ===");
        System.out.print("상품명: ");
        name = br.readLine();
        System.out.print("가격: ");
        price = Integer.parseInt(br.readLine());
        System.out.print("재고량: ");
        inventory = Integer.parseInt(br.readLine());

        return new Product(name, price, inventory);
    }
}
