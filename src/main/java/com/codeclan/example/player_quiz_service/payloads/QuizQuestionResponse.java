package com.codeclan.example.player_quiz_service.payloads;

import com.codeclan.example.player_quiz_service.models.IncorrectAnswer;
import com.codeclan.example.player_quiz_service.models.Round;

import java.util.List;

public class QuizQuestionResponse {

    private Long id;
    private String category;
    private String question;
    private String correctAnswer;
    private String type;
    private Round round;
    private List<String> incorrectAnswers;

    public QuizQuestionResponse(Long id, String category, String question, String correctAnswer, String type, Round round, List<String> incorrectAnswers) {
        this.id = id;
        this.category = category;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.type = type;
        this.round = round;
        this.incorrectAnswers = incorrectAnswers;
    }

    public QuizQuestionResponse() {
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

    public List<String> getIncorrectAnswers() {
        return incorrectAnswers;
    }

    public void setIncorrectAnswers(List<String> incorrectAnswers) {
        this.incorrectAnswers = incorrectAnswers;
    }
}
