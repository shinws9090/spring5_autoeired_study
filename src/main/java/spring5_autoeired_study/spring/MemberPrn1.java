package spring5_autoeired_study.spring;

public class MemberPrn1 extends MemberPrint {

	@Override
	public void print(Member member) {
		System.out.printf("회원정보: 아이디=%s , 이메일=%s",
				member.getId(),member.getEmail());
	}
 
}
