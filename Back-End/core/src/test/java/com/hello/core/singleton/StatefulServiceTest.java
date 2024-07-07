package com.hello.core.singleton;

import static org.assertj.core.api.Assertions.assertThat;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.hello.core.AppConfig;
import com.hello.core.member.MemberService;

public class StatefulServiceTest {
	@Test
	void statefulServiceSingleton() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
		StatefulService statefulService1 = ac.getBean("statefulService", StatefulService.class);
		StatefulService statefulService2 = ac.getBean("statefulService", StatefulService.class);
		// ThreadA: A사용자 10000원 주문
		statefulService1.order("userA", 10000);
		// ThreadB: B사용자 20000원 주문
		statefulService2.order("userB", 20000);
		// ThreadA: 사용자A 주문 금액 조회
		int price = statefulService1.getPrice();
		// ThreadA: 사용자A는 10000원을 기대했지만, 기대와 다르게 20000원 출력
		System.out.println("price = " + price);
		Assertions.assertThat(statefulService1.getPrice()).isEqualTo(20000);
	}

	@Test
	@DisplayName("스프링 컨테이너와 싱글톤")
	void springContainer() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		// 1. 조회: 호출할 때 마다 같은 객체를 반환
		MemberService memberService1 = ac.getBean("memberService", MemberService.class);
		// 2. 조회: 호출할 때 마다 같은 객체를 반환
		MemberService memberService2 = ac.getBean("memberService", MemberService.class);
		// 참조값이 같은 것을 확인
		System.out.println("memberService1 = " + memberService1);
		System.out.println("memberService2 = " + memberService2);
		// memberService1 == memberService2
		assertThat(memberService1).isSameAs(memberService2);
	}

	static class TestConfig {
		@Bean
		public StatefulService statefulService() {
			return new StatefulService();
		}
	}
}