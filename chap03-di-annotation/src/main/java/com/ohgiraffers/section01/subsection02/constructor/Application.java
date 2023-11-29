package com.ohgiraffers.section01.subsection02.constructor;

import com.ohgiraffers.section01.subsection01.field.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService = (BookService) context.getBean(BookService.class);

        /*전체 도서 목록 조회 후 출력 확인*/
//        bookService.selectAllBooks().forEach(bookDTO -> System.out.println(bookDTO)); //둘이 같음
        bookService.selectAllBooks().forEach(System.out::println);
        /*도서번호로 검색후 출력 확인*/
        System.out.println(bookService.selectOneBook(1));
        System.out.println(bookService.selectOneBook(2));
    }
}
