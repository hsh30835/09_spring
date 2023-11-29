package com.ohgiraffers.section02.annotation.subsection03.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section02");
        String[] beanNames = context.getBeanDefinitionNames();

        for (String bean:beanNames){
            System.out.println(bean);
        }
        PokemonService pokemonService = context.getBean("pokemonServiceCollection", PokemonService.class);

        pokemonService.pokemonAttack();
    }
    //프라이머리가 빠지면 에러나는 이유는 뭘 주입해야할지 몰라서
    //나온 순서는 알파벳 순
}
