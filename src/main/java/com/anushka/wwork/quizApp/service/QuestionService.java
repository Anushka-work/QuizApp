package com.anushka.wwork.quizApp.service;

import com.anushka.wwork.quizApp.Dao.QuestionDao;
import com.anushka.wwork.quizApp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//This is the middle layer (called Service Layer).
//Right now it's just forwarding the call — no logic added yet.
//You’ll usually add a DAO here to fetch from DB
//not doing any process its just fetching data from dow layer

public class QuestionService {
    @Autowired
    QuestionDao questionsDao;//added dao

    //get all questions
    public List<Question> getAllQuestions() {
        return questionsDao.findAll();
    }

    public List<Question> getAllQuestionsByCategory(String category) {
        return questionsDao.findByCategory(category);
    }
}
