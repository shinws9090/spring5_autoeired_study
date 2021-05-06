package spring5_autoeired_study.spring;

import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

public class MemberPrint {
	private DateTimeFormatter dateTimeFormatter;
	
	
	
	public MemberPrint() {
		dateTimeFormatter= DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
	}
	public void print(Member member) {
		if(dateTimeFormatter == null) {
			System.out.printf("회원정보: 아이디=%s , 이메일=%s , 이름=%s , 등록일=%tF %n",
					member.getId(),member.getEmail(),member.getName(),member.getRegisterDateTime());
		}else {
			System.out.printf("회원정보: 아이디=%s , 이메일=%s , 이름=%s , 등록일=%s %n",
					member.getId(),member.getEmail(),member.getName(),dateTimeFormatter.format(member.getRegisterDateTime()));
		}
	}
	
//	@Autowired(required = false) //자동주입 필수요소 해지 , 매서드 실행이안됨
//	public void setDateTimeFormatter(DateTimeFormatter dateTimeFormatter) {
//		this.dateTimeFormatter = dateTimeFormatter;
//	}
	
	@Autowired 
	public void setDateTimeFormatter(@Nullable DateTimeFormatter dateTimeFormatter) {//자동주입 필수요소 해지 , 변수에 null을 넣어줌
		this.dateTimeFormatter = dateTimeFormatter;
	}
	
}
