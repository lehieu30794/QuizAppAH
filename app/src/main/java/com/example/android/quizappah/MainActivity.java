package com.example.android.quizappah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    Display score
    public void displayScore(int score) {
        TextView scoreTextView = (TextView) findViewById(R.id.score_text_view);
        scoreTextView.setText("" + score);
    }
//    Display score when hit submit
    public void submit (View view){
        RadioButton isCheck
        displayScore(10);
    }
//    Will need method calculating the number of correct answer
}
