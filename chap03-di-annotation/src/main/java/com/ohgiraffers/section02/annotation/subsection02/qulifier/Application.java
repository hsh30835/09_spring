package com.ohgiraffers.section02.annotation.subsection02.qulifier;

import org.springframework.context.ApplicationContext;
//내가볼때 primary와 qulifier의 이름이 같아 같은거라고 착각할 수 있는데
//자바는 임포트 경로로 구별하기 때문에 다른거임
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section02");
        String[] beanNames = context.getBeanDefinitionNames();

        for (String bean:beanNames){
            System.out.println(bean);
        }
        PokemonService pokemonService = context.getBean("pokemonServiceQulifier", PokemonService.class);

        pokemonService.pokemonAttack();
    }
}
