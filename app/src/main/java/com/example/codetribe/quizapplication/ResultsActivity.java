package com.example.codetribe.quizapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ResultsActivity extends AppCompatActivity {

    private ListView listView;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        listView = (ListView) findViewById(R.id.listView);
        Bundle extras = getIntent().getExtras();
        ArrayList<String> answers =  extras.getStringArrayList(RandomActivity.ARRAY_ANSWERS);
        ArrayList<String> questions = extras.getStringArrayList(RandomActivity.ARRAY_QUESTIONS);

        /**
         adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, questions);
         listView.clearTextFilter();
         listView.setAdapter(adapter);*/

        SummaryAdapter adapter = new SummaryAdapter(this, questions, R.layout.activity_random);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
