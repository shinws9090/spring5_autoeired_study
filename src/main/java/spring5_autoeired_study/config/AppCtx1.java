package spring5_autoeired_study.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring5_autoeired_study.spring.MemberDao;
import spring5_autoeired_study.spring.MemberPrint;

@Configuration
public class AppCtx1 {
	
	@Bean
	public MemberDao getMemberDao() {
		return new MemberDao();
	}

	@Bean
	public MemberPrint getMemberPrint() {
		return new MemberPrint();
	}
	
//	@Bean
//	@Qualifier("printer") //타입말고 다른 식별자로 명시하는 방법
//	public MemberPrint getMemberPrint1() {
//		return new MemberPrint();
//	}

}
