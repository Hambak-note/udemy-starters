package week4.day5.question3;

public class DeleteCharRunner {

    public static void main(String[] args) {

        String data = "지금 저는 ㅋㅋㅋ 수업중입니다. 정말요? 과제물도 ㅎㅎㅎ 하고 있구요.";
        String delResult2 = deleteChar(data, new String[]{".", "ㅋ", "ㅎ","?", " "});
        System.out.println(delResult2);
    }

    private static String deleteChar(String data, String[] strings) {


        String regex = makeRegex(strings);

        return data.replaceAll(regex, "");
    }

    private static String makeRegex(String[] strings){
        StringBuilder returnString = new StringBuilder("[");
        for(String s : strings){
            returnString.append(s);
        }
        returnString.append("]");
        return String.valueOf(returnString);
    }
}
