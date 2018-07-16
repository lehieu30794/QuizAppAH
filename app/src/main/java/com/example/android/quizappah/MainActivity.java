package com.example.android.quizappah;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int score = 0;

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
        boolean isChina = chinaRadioButton.isChecked();

        CheckBox obamaCheckBox = findViewById(R.id.obama_check_box);
        boolean isObama = obamaCheckBox.isChecked();

        CheckBox hieuCheckBox = findViewById(R.id.hieu_check_box);
        boolean isHieu = hieuCheckBox.isChecked();

        CheckBox georgeoCheckBox = findViewById(R.id.george_check_box);
        boolean isGergeo = georgeoCheckBox.isChecked();

        CheckBox ronaldCheckBox = findViewById(R.id.ronald_check_box);
        boolean isRonald = ronaldCheckBox.isChecked();

        RadioButton brazilRadioButton = findViewById(R.id.brazil_radio_button);
        boolean isBrazil = brazilRadioButton.isChecked();

        RadioButton canadaRadioButton = findViewById(R.id.canada_radio_button);
        boolean isCanada = canadaRadioButton.isChecked();

        RadioButton nigeriaRadioButton = findViewById(R.id.nigeria_radio_button);
        boolean isNigeria = nigeriaRadioButton.isChecked();

        EditText germanyEditText = findViewById(R.id.germany_edit_text);
        String germanyInput = germanyEditText.getText().toString();

        EditText usaEditText = findViewById(R.id.usa_edit_text);
        String usaInput = usaEditText.getText().toString();


        int score_get_displayed = calculateScore(isIndia, isVietnam, isChina, isObama, isHieu, isGergeo, isRonald,
                isBrazil, isCanada, isNigeria, germanyInput, usaInput);
        displayScore(score_get_displayed);

        score = 0;
    }
//    Calculating the number of correct answer

    public int calculateScore(boolean hasIndia, boolean hasVietnam, boolean hasChina,
                              boolean hasObama, boolean hasHieu, boolean hasGeorge, boolean hasRonald,
                              boolean hasBrazil, boolean hasCanada, boolean hasNigeria,
                              String germanyInput, String usaInput) {
        if (hasIndia) {
            score = score + 1;
        }
        if (hasVietnam) {
            score = score + 0;
        }
        if (hasChina) {
            score = score + 0;
        }

        if (hasObama && hasGeorge && hasRonald != hasHieu) {
            score = score + 1;
        } else {
            score = score + 0;
        }

        if (hasBrazil) {
            score = score;
        }

        if (hasCanada) {
            score += 1;
        }

        if (hasNigeria) {
            score = score;
        }
//Very interesting comparison; can't use ==
        if (germanyInput.matches("Germany|germany")) {
            score += 1;
        } else {
            score = score;
        }

        if (usaInput.matches("USA|usa|United States|United States of America|The United States|The United States of America")) {
            score += 1;
        } else {
            score = score;
        }

        return score;
    }


    // Display Toast messages
    public void vietnamRadioButton(View view) {
        Toast.makeText(this, "Search GOOGLE for the correct answer", Toast.LENGTH_SHORT).show();
    }

    public void chinaRadioButton(View view) {
        Toast.makeText(this, "Search GOOGLE for the correct answer", Toast.LENGTH_SHORT).show();
    }

    public void hieuCheckBox(View view) {
        Toast.makeText(this, "Search GOOGLE for the correct answer", Toast.LENGTH_SHORT).show();
    }

    public void brazilRadioButton(View view) {
        Toast.makeText(this, "Search GOOGLE for the correct answer", Toast.LENGTH_SHORT).show();
    }

    public void nigeriaRadioButton(View view) {
        Toast.makeText(this, "Search GOOGLE for the correct answer", Toast.LENGTH_SHORT).show();
    }

//    Reset score
    public void resetScore (View view){
        score = 0;
        displayScore(score);
    }
}
