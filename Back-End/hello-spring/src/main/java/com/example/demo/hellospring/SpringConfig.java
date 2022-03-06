package com.example.demo.hellospring;

import com.example.demo.hellospring.repository.MemberRepository;
import com.example.demo.hellospring.repository.MemoryMemberRepository;
import com.example.demo.hellospring.service.MemberService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
