package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Article;

public interface IArticleService {
	
	List<Article> getAllArticles();
    Article getArticleById(long articleId);
    boolean addArticle(Article article);
    boolean addAllArticles(List<Article> listArticle);
    void updateArticle(Article article);
    void deleteArticle(Article article);
}
