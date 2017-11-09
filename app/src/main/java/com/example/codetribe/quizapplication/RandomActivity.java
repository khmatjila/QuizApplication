package com.example.codetribe.quizapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import static com.example.codetribe.quizapplication.MainActivity.ids;

public class RandomActivity extends AppCompatActivity {
    TextView txtView;
    RadioGroup radGroup;
    RadioButton radButton1, radButton2, radButton3, radButton4;
    LinearLayout layoutQA;
    int questionNumber = 0, score = 0;
    boolean valid = false;
    String answer;
    double percentage = 0;
    Data data;
    Politics politics;
    Technology technology;
    Random ranGen;
    static String ARRAY_ANSWERS;
    static String ARRAY_QUESTIONS;

    ArrayList<String> answerSummary = new ArrayList<String>();
    ArrayList<String> questionsSummary= new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        txtView = (TextView) findViewById(R.id.displayquestion);
        radGroup = (RadioGroup) findViewById(R.id.raddGroup);
        radButton1 = (RadioButton) findViewById(R.id.possibleAnswer1RadB);
        radButton2 = (RadioButton) findViewById(R.id.possibleAnswer2RadB);
        radButton3 = (RadioButton) findViewById(R.id.possibleAnswer3RadB);
        radButton4 = (RadioButton) findViewById(R.id.possibleAnswer4RadB);
        layoutQA = (LinearLayout) findViewById(R.id.linearQuesioNAnswers);
        ranGen = new Random();

        updateQuestions();
        radGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.possibleAnswer1RadB) {
                    String option1 = radButton1.getText().toString();
                    String quetionOtion1 = txtView.getText().toString();
                    if (option1 == answer) {
                        Toast.makeText(RandomActivity.this, "Correct ", Toast.LENGTH_SHORT).show();
                        updateScore();
                    } else {
                        Toast.makeText(RandomActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                    }
                    answerSummary.add(option1);
                    questionsSummary.add(quetionOtion1);
                } else if (i == R.id.possibleAnswer2RadB) {
                    String option2 = radButton2.getText().toString();
                    String quetionOtion2 = txtView.getText().toString();
                    if (option2 == answer) {
                        Toast.makeText(RandomActivity.this, "Correct ", Toast.LENGTH_SHORT).show();
                        updateScore();
                    } else {
                        Toast.makeText(RandomActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                    }
                    answerSummary.add(option2);
                    questionsSummary.add(quetionOtion2);
                } else if (i == R.id.possibleAnswer3RadB) {
                    String option3 = radButton3.getText().toString();
                    String quetionOtion3 = txtView.getText().toString();
                    if (option3 == answer) {
                        Toast.makeText(RandomActivity.this, "Correct ", Toast.LENGTH_SHORT).show();
                        updateScore();
                    } else {
                        Toast.makeText(RandomActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                    }
                    answerSummary.add(option3);
                    questionsSummary.add(quetionOtion3);
                } else if (i == R.id.possibleAnswer4RadB) {
                    String option4 = radButton4.getText().toString();
                    String quetionOtion4 = txtView.getText().toString();
                    if (option4 == answer) {
                        Toast.makeText(RandomActivity.this, "Correct ", Toast.LENGTH_SHORT).show();
                        updateScore();
                    } else {
                        Toast.makeText(RandomActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                    }
                    answerSummary.add(option4);
                    questionsSummary.add(quetionOtion4);
                }
                updateQuestions();

            }
        });
    }

    public void updateScore() {
        score += 1;
    }

    public double calcPercentage() {
        return percentage = (score / data.getLengeth()) * 100;
    }

    public void updateQuestions() {
        data = new Data();
        politics = new Politics();
        technology = new Technology();
        Intent intent = getIntent();

        int id = intent.getIntExtra(ids, 0);

        if (questionNumber < data.getLengeth() || questionNumber < technology.getTechLengeth() || questionNumber < politics.getPolLengeth()) {


            if (id == 1) {
                layoutQA.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorBlue));
                txtView.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.colorBlue));
                txtView.setText(politics.getPolQuestion(questionNumber));
                radButton1.setText(politics.getPolChoice(questionNumber, 1));
                radButton2.setText(politics.getPolChoice(questionNumber, 2));
                radButton3.setText(politics.getPolChoice(questionNumber, 3));
                radButton4.setText(politics.getPolChoice(questionNumber, 4));
                answer = politics.getPolCorrectAnswer(questionNumber);
                questionNumber++;
            } else if (id == 2) {
                layoutQA.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorGrey));
                txtView.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.colorGrey));
                txtView.setText(data.getQuestion(questionNumber));
                radButton1.setText(data.getChoice(questionNumber, 1));
                radButton2.setText(data.getChoice(questionNumber, 2));
                radButton3.setText(data.getChoice(questionNumber, 3));
                radButton4.setText(data.getChoice(questionNumber, 4));
                answer = data.getCorrectAnswer(questionNumber);
                questionNumber++;
            } else if (id == 3) {
                layoutQA.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPurple));
                txtView.setText(technology.getTechQuestion(questionNumber));
                txtView.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPurple));
                radButton1.setText(technology.getTechChoice(questionNumber, 1));
                radButton2.setText(technology.getTechChoice(questionNumber, 2));
                radButton3.setText(technology.getTechChoice(questionNumber, 3));
                radButton4.setText(technology.getTechChoice(questionNumber, 4));
                answer = technology.getTechCorrectAnswer(questionNumber);
                questionNumber++;
            }

        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(RandomActivity.this);
            builder.setTitle("Score Board");
            builder.setMessage("You've scored " + score + "/" + data.getLengeth());
            builder.getContext().setTheme(R.style.myTheme);
            builder.setPositiveButton("Summary",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,
                                            int which) {
                            Intent intent = new Intent(RandomActivity.this, ResultsActivity.class);
                            Bundle b = new Bundle();
                            b.putStringArrayList(RandomActivity.ARRAY_ANSWERS, answerSummary);
                            b.putStringArrayList(RandomActivity.ARRAY_QUESTIONS, questionsSummary);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
            builder.setNegativeButton("Categories",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,
                                            int which) {
                            Intent intent = new Intent(RandomActivity.this, MainActivity.class);
                            startActivity(intent);
                        }
                    });
            builder.show();
        }
    }

}
