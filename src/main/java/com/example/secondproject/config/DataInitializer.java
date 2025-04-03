package com.example.secondproject.config;

import com.example.secondproject.entity.Article;
import com.example.secondproject.repository.ArticleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {
    private ArticleRepository articleRepository;

    public DataInitializer(ArticleRepository articleRepository){
        this.articleRepository=articleRepository;
    }


    public void run(String... args){
        articleRepository.deleteAll();

        //articleRepository.save(new Article(null,"가가가가","1111"));
        articleRepository.saveAll(List.of(
            new Article(null,"가가가가","1111"),
            new Article(null,"나나나나","2222"),
            new Article(null,"다다다다","3333")
        ));
        System.out.println("더미 데이터 완료");
    }
}
