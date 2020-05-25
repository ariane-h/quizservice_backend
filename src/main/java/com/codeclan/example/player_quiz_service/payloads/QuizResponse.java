package com.codeclan.example.player_quiz_service.payloads;

import com.codeclan.example.player_quiz_service.models.Round;

import java.util.List;

public class QuizResponse {

    private Long id;

    private String quizName;

    private List<RoundResponse> rounds;

    public QuizResponse(Long id, String quizName, List<RoundResponse> rounds) {
        this.id = id;
        this.quizName = quizName;
        this.rounds = rounds;
    }

    public QuizResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public List<RoundResponse> getRounds() {
        return rounds;
    }

    public void setRounds(List<RoundResponse> rounds) {
        this.rounds = rounds;
    }
}
