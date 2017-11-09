package com.example.codetribe.quizapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Codetribe on 21-Jun-17.
 */

public class SummaryAdapter extends ArrayAdapter<String> {
    private int id;
    public SummaryAdapter(Activity context, ArrayList<String> words, int id) {
        super(context, 0, words);
        this.id = id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView =  convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.summary_summary, parent, false);
        }
        String currentString = getItem(position);
        String currentAnswer = getItem(position);
        TextView questionTextView = (TextView) listItemView.findViewById(R.id.question_text_view);
        questionTextView.setText(currentString);
        //questionTextView.setText(currentString.getSomething());

        TextView answerTextView = (TextView) listItemView.findViewById(R.id.answer_text_view);
        answerTextView.setText("Answer here");
        View textContainer = listItemView.findViewById(R.id.textContainer);
        return listItemView;
    }
}
