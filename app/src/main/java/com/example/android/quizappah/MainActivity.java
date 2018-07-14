package com.example.android.quizappah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;

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
    public void submit(View view) {
        RadioButton indiaRadioButton = findViewById(R.id.india_radio_button);
        boolean isIndia = indiaRadioButton.isChecked();

        RadioButton vietnamRadioButton = findViewById(R.id.vietnam_radio_button);
        boolean isVietnam = vietnamRadioButton.isChecked();

        RadioButton chinaRadioButton = findViewById(R.id.china_radio_button);
        boolean hasChina = chinaRadioButton.isChecked();


        int score_get_displayed = calculateScore(isIndia, isVietnam, hasChina);
        displayScore(score_get_displayed);
    }
//    Will need method calculating the number of correct answer

    public int calculateScore(boolean hasIndia, boolean hasVietnam, boolean hasChina) {
        if (hasIndia) {
            score = score + 1;
        }
        if (hasVietnam) {
            score = score + 0;
        }
        if (hasChina) {
            score = score + 0;
        }

        return score;
    }
}
