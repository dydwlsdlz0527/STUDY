package com.hello.core.order;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.hello.core.AppConfig;
import com.hello.core.member.Grade;
import com.hello.core.member.Member;
import com.hello.core.member.MemberService;
import com.hello.core.member.MemberServiceImpl;

public class OrderServiceTest {
	
	AppConfig appConfig = new AppConfig();
	MemberService memberService = appConfig.memberService();
	OrderService orderService = appConfig.orderService();
	
	@Test
	void createOrder() {
		Long memberId = 1L;
		Member member = new Member(memberId,"memberA",Grade.VIP);
		memberService.join(member);
		
		Order order = orderService.createOrder(memberId, "itemA", 10000);
		assertThat(order.getDiscountPrice()).isEqualTo(1000);
	}

}
