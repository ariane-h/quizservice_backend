package com.codeclan.example.player_quiz_service.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
//@JsonSerialize(using = QuizQuestionSerializer.class)
@Entity
@Table(name="quiz_questions")
public class QuizQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String category;

    @Column
    private String question;

    @Column(name="correct_answer")
    private String correctAnswer;

    @Column
    private String type;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="round_id", nullable=false)
    private Round round;

    @OneToMany(mappedBy = "quizQuestion", fetch = FetchType.LAZY)
    private List<IncorrectAnswer> incorrectAnswers;

    public QuizQuestion(String category, String question, String correctAnswer, String type, Round round) {
        this.category = category;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.type = type;
        this.round = round;
        this.incorrectAnswers = new ArrayList<>();
    }

    public QuizQuestion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Round getRound() {
        return round;
    }

    public void setRound(Round round) {
        this.round = round;
    }

    public List<IncorrectAnswer> getIncorrectAnswers() {
        return incorrectAnswers;
    }

    public void setIncorrectAnswers(List<IncorrectAnswer> incorrectAnswers) {
        this.incorrectAnswers = incorrectAnswers;
    }
}
