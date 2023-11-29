package com.ohgiraffers.section01.subsection01.field;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceField") //서비스어노테이션은 비지니스역할이 수행되는 공간
public class BookService {

    @Autowired //Autowired는 1대1 대응 의존성만 주입
    //final이 아니라서 setter 방식됨
    private BookDAO bookDAO;

    public List<BookDTO> selectAllBooks(){

        return bookDAO.selectBookList();
    }
    public BookDTO selectOneBook(int seq){
        return bookDAO.selectOneBook(seq);
    }
    //BookDAOImpl은 BookDAO를 정형화?구현화?한 객체 Autowired는 자동적으로 의존성 주입을 넣어줌
    //지금은 DAO가 한개라서 자동으로 가져올수밖에없지만 여러개 있으면 알파벳순으로 가져옴
}
