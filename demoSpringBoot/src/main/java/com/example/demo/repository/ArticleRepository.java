package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Article;

public interface ArticleRepository extends CrudRepository<Article, Long>  {
	Article findByArticleId(long articleId);
        List<Article> findByTitleAndCategory(String title, String category);
} 