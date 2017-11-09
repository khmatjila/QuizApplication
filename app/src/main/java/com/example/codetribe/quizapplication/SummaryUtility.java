package com.example.codetribe.quizapplication;

import java.util.ArrayList;

/**
 * Created by KHM on 22-Jun-17.
 */

public class SummaryUtility {
    private int results;
    private ArrayList<String> answerSummary;
    private ArrayList<String> questionsSummary;
    private ArrayList<String> correctAnsers;

    public SummaryUtility(int results, ArrayList<String> answerSummary, ArrayList<String> questionsSummary, ArrayList<String> correctAnsers) {
        this.results = results;
        this.answerSummary = answerSummary;
        this.questionsSummary = questionsSummary;
        this.correctAnsers = correctAnsers;
    }

    public SummaryUtility(ArrayList<String> answerSummary, ArrayList<String> questionsSummary, ArrayList<String> correctAnsers) {
        this.answerSummary = answerSummary;
        this.questionsSummary = questionsSummary;
        this.correctAnsers = correctAnsers;
    }

    public int getResults() {
        return results;
    }

    public ArrayList<String> getAnswerSummary() {
        return answerSummary;
    }

    public ArrayList<String> getQuestionsSummary() {
        return questionsSummary;
    }

    public ArrayList<String> getCorrectAnsers() {
        return correctAnsers;
    }
}
