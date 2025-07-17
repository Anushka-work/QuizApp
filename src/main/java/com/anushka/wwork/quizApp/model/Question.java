package com.anushka.wwork.quizApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.Data;

@Data   //lombok(creates getter , setter)
@Entity //marks this as db table
@Table(name = "questions")
public class Question {

    @Id  //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
    private Integer id;

    @Column(name = "category")
    private String category;

    @Column(name = "difficulty")
    private String difficulty;

    @Column(name = "question", columnDefinition = "TEXT")
    private String question;

    @Column(name = "option_a")
    private String optionA;

    @Column(name = "option_b")
    private String optionB;

    @Column(name = "option_c")
    private String optionC;

    @Column(name = "option_d")
    private String optionD;

    @Column(name = "correct_answer")
    private String correctAnswer;
}