package com.example.demo.hellospring;

import javax.sql.DataSource;

import com.example.demo.hellospring.repository.JdbcMemberRepository;
import com.example.demo.hellospring.repository.MemberRepository;
import com.example.demo.hellospring.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    
    private DataSource dataSource;

    /**
     * 스프링이 자체적으로 application.properties 설정 파일을 보고 Bean 객체를 생성해준다.
     * @param dataSource
     */
    @Autowired
    public SpringConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        //return new MemoryMemberRepository();
        return new JdbcMemberRepository(dataSource);
    }
}
