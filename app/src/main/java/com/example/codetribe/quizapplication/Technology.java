package com.example.codetribe.quizapplication;

/**
 * Created by Codetribe on 14-Jun-17.
 */

public class Technology {
    private String[] techQuestions = {"Which company is owned by Bill Gates",
            "The first what was installed in Antarctica in 1997",
            "The electric light first available product what's second",
            "Which country set up the world’s first chemistry lab in 1650",
            "In which year was Android 5.0 Lollipop was released?"};

    private String[] techAnswers = {"Microsoft",
            "ATM cash point machine",
            "Electric Oven",
            "Netherlands ",
            "none"};

    private String[][] techPossibleAnsers = {{"Microsoft", "Oracle", "IBM", "Aaeon"},
            {"Thermometer", "Light Bulb", "ATM cash point machine", "Rail Line"},
            {"Relay", "Electric Oven", "Refridgerator", "Electric Blanket"},
            {"Netherlands", "England", "Egypt", "Germany"},
            {"2002", "2012", "2010", "none"}};

    public int getTechLengeth() {
        return techQuestions.length;
    }

    public String getTechQuestion(int i) {
        String question = techQuestions[i];
        return question;
    }

    public String getTechChoice(int i, int number) {
        String choice = techPossibleAnsers[i][number - 1];
        return choice;
    }

    public String getTechCorrectAnswer(int i) {
        String answer = techAnswers[i];
        return answer;
    }
}
