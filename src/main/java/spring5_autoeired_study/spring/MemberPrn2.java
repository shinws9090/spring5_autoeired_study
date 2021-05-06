package spring5_autoeired_study.spring;

public class MemberPrn2 extends MemberPrint {

	@Override
	public void print(Member member) {
		System.out.printf("이름=%s , 등록일=%tF %n"
				,member.getName(),member.getRegisterDateTime());
	}

}
