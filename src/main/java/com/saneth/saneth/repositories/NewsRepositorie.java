package com.saneth.saneth.repositories;

import com.saneth.saneth.model.NewsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface NewsRepositorie extends JpaRepository<NewsModel, Long> {

    List<NewsModel> findAll();

    NewsModel findById(Integer id);

    NewsModel findByText(String text);

    NewsModel findByTitle(String title);



    List<NewsModel> findByTitleContainingIgnoreCase(String title);



    List<NewsModel>findByTextContainingIgnoreCase(String text);

    List<NewsModel>findByDate(Date date);
}
