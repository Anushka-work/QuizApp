package com.anushka.wwork.quizApp.Dao;
import com.anushka.wwork.quizApp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository <Question, Integer>{//this will handle fetching data from db, saving data
//jpa repo provides basic crud operations
    List<Question> findByCategory(String category );
}
