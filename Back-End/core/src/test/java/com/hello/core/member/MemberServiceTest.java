package com.hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hello.core.AppConfig;

public class MemberServiceTest {
	
	private MemberService memberService;

	@BeforeEach
	public void beforeEach() {
		AppConfig appConfig = new AppConfig();
		memberService = appConfig.memberService();
	}

	@Test
	void join() {
		//given
		Member member = new Member(1L,"memberA",Grade.VIP);
		
		//when
		memberService.join(member);
		Member findMember = memberService.findMember(1L);
		
		//then
		Assertions.assertThat(member).isEqualTo(findMember);
		
	}
}