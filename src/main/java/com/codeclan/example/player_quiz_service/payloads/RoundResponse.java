package com.codeclan.example.player_quiz_service.payloads;

import com.codeclan.example.player_quiz_service.models.Quiz;
import com.codeclan.example.player_quiz_service.models.QuizQuestion;

import java.util.List;

public class RoundResponse {

    private Long id;

    private Quiz quiz;

    private List<QuizQuestionResponse> quizQuestions;

    public RoundResponse(Long id, Quiz quiz, List<QuizQuestionResponse> quizQuestions) {
        this.id = id;
        this.quiz = quiz;
        this.quizQuestions = quizQuestions;
    }

    public RoundResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public List<QuizQuestionResponse> getQuizQuestions() {
        return quizQuestions;
    }

    public void setQuizQuestions(List<QuizQuestionResponse> quizQuestions) {
        this.quizQuestions = quizQuestions;
    }
}
