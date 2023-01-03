package jdbc.member_crud;

import java.util.Scanner;

public class MemberUpdateView implements View{
    @Override
    public void input() {
        Scanner key = new Scanner(System.in);
        System.out.print("아이디 입력 : ");
        String id = key.next();
        System.out.print("암호 입력 : ");
        String pw = key.next();
        key.nextLine();

        MemberDAO dao = new MemberDAO();
        MemberDTO dto = dao.getMember(id, pw);

        if(dto != null && dto.getPw() != null) {
            System.out.println(dto.getId() + " 회원님 수정할 항목을 입력하세요");
            System.out.println("입력 양식: 암호-이름-이메일-폰-주소");
            System.out.println("(수정항목이 아닌 경우 공백 입력)");
            System.out.print("입력 >>> ");
            String updateContent = key.nextLine();
            System.out.println(updateContent);
            //dao의 updateMember 호출
            dao.updateMember(dto, updateContent);
        }
    }
}
