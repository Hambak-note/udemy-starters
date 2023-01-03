package jdbc.member_crud;

import java.util.Scanner;

public class MemberDeleteView implements View{

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
            dao.deleteMember(dto.getId());
            System.out.println(dto.getId() + " 회원님 탈퇴가 완료되었습니다.");
        }
    }
}
