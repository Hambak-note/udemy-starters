package week5.day4.question2;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader("C:\\Study\\udemy_starters\\udemy-starters\\Java\\src\\week5\\day4\\question2\\product.txt")
        );

        String str;
        while((str = reader.readLine()) != null){
            System.out.println(str);
        }

        reader.close();
    }

}
