package spring5_autoeired_study.spring;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

public class SelectService {
	
	private MemberDao memberDao; //연관관계 ,메소드에 매계변수로만 있으면 의존관계
	private MemberPrint print;
	
	@Autowired	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Autowired
	public void setPrint(MemberPrint getMemberPrint) {
		this.print = getMemberPrint;
	}

	public void selectAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m->print.print(m));
	}
	
}
