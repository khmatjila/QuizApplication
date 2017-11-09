package com.example.codetribe.quizapplication;

/**
 * Created by Codetribe on 14-Jun-17.
 */

public class Politics {
    private String[] polQuestions = {"Which is the oldest democracy / parliamentary in the world? ",
            "What was the last item shown on British TV before WW2",
            "Who said Politics is the art of the possible 11 Aug 1867",
            "How many state capitals are there in South Africa?",
            "Which among these members was not a South African president?"};

    private String[] polAnswers = {"Britain",
            "Mickey Mouse",
            "Otto Von Bismarck",
            "3 - Three",
            "Shaka Zulu"};

    private String[][] polPossibleAnsers = {{"Kingdom of the Netherlands", "India", "Britain", "Pakistan"},
            {"Smith Show", "Mickey Mouse", "Parliament", "BBC News"},
            {"Albert Einstein", "Mickey Rooney", "Jan Van Riebeck", "Otto Von Bismarck"},
            {"3 - Three", "2 - Two", "1 - One", "4 - Four"},
            {"Pieter Botha", "Nelson Mandela", "Shaka Zulu", "Thabo Mbeki"}};

    public int getPolLengeth() {
        return polQuestions.length;
    }

    public String getPolQuestion(int i) {
        String question = polQuestions[i];
        return question;
    }

    public String getPolChoice(int i, int number) {
        String choice = polPossibleAnsers[i][number - 1];
        return choice;
    }

    public String getPolCorrectAnswer(int i) {
        String answer = polAnswers[i];
        return answer;
    }
}
