package com.saneth.saneth.services;

import com.saneth.saneth.model.NewsModel;
import com.saneth.saneth.repositories.NewsRepositorie;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class NewsService {

    private final NewsRepositorie repositorie;

    public List<NewsModel> getAllNews() {
        return repositorie.findAll();
    }

    public List<NewsModel> getbyTitle(String titre){
        return repositorie.findByTitleContainingIgnoreCase(titre);
    }

    public NewsModel getbyId(Integer id){return repositorie.findById(id);}

    public List<NewsModel> getbyText(String text){return repositorie.findByTextContainingIgnoreCase(text);}

    public List<NewsModel> getbyDate(Date date){return repositorie.findByDate(date);}

}
