package com.example.codetribe.quizapplication;

/**
 * Created by Codetribe on 5/29/2017.
 */

public class Data {

    private String[] questions = {"The wizard of Oz, what did the Scarecrow want from the wizard?",
            "In what year was the original \"Jurassic Park\" film released?",
            "In 1984, ___________ appeared in James Cameron's science-fiction thriller film \"The Terminator\"",
            "In 1997 James Cameron won an Oscar for which blockbuster?",
            "What martial artist warbles the theme song for walker, Texas Ranger?"};

    private String[] answers = {"Brain",
            "1993",
            "Arnold Schwazineggar",
            "Titanic",
            "Chuck Norris"};

    private String[][] possibleAnsers = {{"Heart", "Finger", "Hair", "Brain"},
            {"1993", "2000", "1999", "1996"},
            {"Jason Statham", "Vin Diesel", "Arnold Schwazineggar", "Sylvester Stallone"},
            {"Piranha II: The Spawaning", "Titanic", "The Lord of the Rings", "The Terminator 2: Judgement Day"},
            {"Chuck Norris", "Jet Lee", "Jackie Chan", "Arnold Schwazineggar"}};

    public int getLengeth() {
        return questions.length;
    }

    public String getQuestion(int i) {
        String question = questions[i];
        return question;
    }

    public String getChoice(int i, int number) {
        String choice = possibleAnsers[i][number - 1];
        return choice;
    }

    public String getCorrectAnswer(int i) {
        String answer = answers[i];
        return answer;
    }
}
