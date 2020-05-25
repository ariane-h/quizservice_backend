//package com.codeclan.example.player_quiz_service.serializers;
//
//import com.codeclan.example.player_quiz_service.models.IncorrectAnswer;
//import com.codeclan.example.player_quiz_service.models.QuizQuestion;
//import com.fasterxml.jackson.core.JsonGenerator;
//import com.fasterxml.jackson.databind.JsonSerializer;
//import com.fasterxml.jackson.databind.SerializerProvider;
//import org.springframework.boot.jackson.JsonComponent;
//
//
//import java.io.IOException;
//import java.util.ArrayList;
//
//@JsonComponent
//public class QuizQuestionSerializer extends JsonSerializer<QuizQuestion> {
//
//
//    /*
//
//    private Long id;
//
//    private String category;
//
//    private String question;
//
//    private String correctAnswer;
//
//    private String type;
//
//    private Round round;
//
//    private List<IncorrectAnswer> incorrectAnswers;
//     */
//
//    @Override
//    public void serialize(QuizQuestion quizQuestion, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
////        jsonGenerator.writeStartObject();
//        jsonGenerator.writeNumber(quizQuestion.getId());
//        jsonGenerator.writeString(quizQuestion.getCategory());
//        jsonGenerator.writeString(quizQuestion.getQuestion());
//        jsonGenerator.writeString(quizQuestion.getCorrectAnswer());
//        jsonGenerator.writeString(quizQuestion.getType());
////        jsonGenerator.writeObject(quizQuestion.getRound());
//        // we want to grab all of the incorrect answers from quizQuestion.getIncorrectAnswers()
//        // we want to get each string from the list of incorrect answer objects
//
//        ArrayList<String> incorrectAnswers = new ArrayList<>();
//        for (IncorrectAnswer incorrectAnswer: quizQuestion.getIncorrectAnswers()){
//            incorrectAnswers.add(incorrectAnswer.getAnswer());
//        }
//
//        String[] incorrectAnswerArray = new String[incorrectAnswers.size()];
//
//        jsonGenerator.writeArray(incorrectAnswerArray, 0, incorrectAnswerArray.length);
//        jsonGenerator.writeEndObject();
//
//    }
//}
