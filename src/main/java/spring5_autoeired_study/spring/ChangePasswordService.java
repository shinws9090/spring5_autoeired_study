package spring5_autoeired_study.spring;

import org.springframework.beans.factory.annotation.Autowired;

import spring5_autoeired_study.exception.MemberNotFoundException;

public class ChangePasswordService {
	
	@Autowired
	private MemberDao memberDao; //연관관계 ,메소드에 매계변수로만 있으면 의존관계

	
	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selectByEmail(email);
		if(member == null) {
			throw new MemberNotFoundException();
		}
		
		member.changePassword(oldPwd, newPwd);
		memberDao.update(member);
	}
	
	
}
