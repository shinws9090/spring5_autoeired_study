package spring5_autoeired_study.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring5_autoeired_study.exception.MemberNotFoundException;

public class MemberInfoPrint {
	
	private MemberDao memberDao;
	private MemberPrint print;
	
	public void printMemberInfo(String email) {
		Member member =memberDao.selectByEmail(email);
		if(member == null) {
			throw new MemberNotFoundException("없다");
		}
		print.print(member);
		System.out.println();
	}
	
	@Autowired //메서드에도 사용가능
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Autowired
	@Qualifier("printer1") // 타입말고 설정파일에서 식별자 지정 해 노은걸로 확인함
	public void setPrint(MemberPrint print) {
		this.print = print;
	}
	
}
