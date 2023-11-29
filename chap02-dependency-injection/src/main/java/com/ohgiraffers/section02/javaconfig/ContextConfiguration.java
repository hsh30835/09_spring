package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {
    @Bean
    public Account accountGenerator(){
        return new PersonalAccount(20,"110-233-2222");
    }

    @Bean
    public MemberDTO memberGenerator(){
        MemberDTO member = MemberDTO.builder()
                .seq(30)
                .email("hong23@gmail.com")
                .name("홍석천")
                .personalAccount(accountGenerator())
                //public Account accountGenerator() 얘를 참조함
                .phone("010-2323-3333").build();
//        member.builder().email("email"); //이러면 문제가 email 하나만 생성되고 나머지가 초기화됨
        return member;
    }
}
