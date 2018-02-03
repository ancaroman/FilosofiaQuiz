package com.example.anca.filosofiaquiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    double finalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClickQ1(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_button_q1a1:
                if (checked)
                    break;
            case R.id.radio_button_q1a2:
                if (checked)
                    break;
            case R.id.radio_button_q1a3:
                if (checked)
                    break;
            case R.id.radio_button_q1a4:
                if (checked)
                    break;
        }
    }

    public void onClickQ2(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_button_q2a1:
                if (checked)
                    break;
            case R.id.radio_button_q2a2:
                if (checked)
                    break;
            case R.id.radio_button_q2a3:
                if (checked)
                    break;
            case R.id.radio_button_q2a4:
                if (checked)
                    break;
        }
    }

    public void onClickQ4(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_button_q4a1:
                if (checked)
                    break;
            case R.id.radio_button_q4a2:
                if (checked)
                    break;
            case R.id.radio_button_q4a3:
                if (checked)
                    break;
            case R.id.radio_button_q4a4:
                if (checked)
                    break;
        }
    }

    public void onClickQ5(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_button_q5a1:
                if (checked)
                    break;
            case R.id.radio_button_q5a2:
                if (checked)
                    break;
            case R.id.radio_button_q5a3:
                if (checked)
                    break;
            case R.id.radio_button_q5a4:
                if (checked)
                    break;
        }
    }

    public void onClickQ6(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_button_q6a1:
                if (checked)
                    break;
            case R.id.radio_button_q6a2:
                if (checked)
                    break;
            case R.id.radio_button_q6a3:
                if (checked)
                    break;
            case R.id.radio_button_q6a4:
                if (checked)
                    break;
        }
    }

    public void onClickQ8(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_button_q8a1:
                if (checked)
                    break;
            case R.id.radio_button_q8a2:
                if (checked)
                    break;
            case R.id.radio_button_q8a3:
                if (checked)
                    break;
        }
    }

    public void onClickQ9(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_button_q9a1:
                if (checked)
                    break;
            case R.id.radio_button_q9a2:
                if (checked)
                    break;
        }
    }

    public void onClickQ10(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_button_q10a1:
                if (checked)
                    break;
            case R.id.radio_button_q10a2:
                if (checked)
                    break;
            case R.id.radio_button_q10a3:
                if (checked)
                    break;
            case R.id.radio_button_q10a4:
                if (checked)
                    break;
        }
    }

    /**
     * This method is called when the submit button is clicked.
     */
    public void seeScore(View view) {
        EditText nameText = (EditText) findViewById(R.id.name_field);
        Editable user = nameText.getText();

        /**
         * 1st question (RadioButton)
         */
        RadioButton q1a1 = (RadioButton) findViewById(R.id.radio_button_q1a1);
        boolean q1a1Checked = q1a1.isChecked();
        if (q1a1Checked) {
            finalScore += 1;
        }

        /**
         * 2nd question (RadioButton)
         */
        RadioButton q2a2 = (RadioButton) findViewById(R.id.radio_button_q2a2);
        boolean q2a2Checked = q2a2.isChecked();
        if (q2a2Checked) {
            finalScore += 1;
        }

        /**
         * 3rd question (EditText)
         */
        EditText author;
        author = (EditText) findViewById(R.id.edit_text_q3);
        String authorBook = author.getText().toString();
        if (authorBook.equals("Karl Marx")) {
            finalScore += 1;
        }

        /**
         * 4th question (RadioButton)
         */
        RadioButton q4a2 = (RadioButton) findViewById(R.id.radio_button_q4a2);
        boolean q4a2Checked = q4a2.isChecked();
        if (q4a2Checked) {
            finalScore += 1;
        }

        /**
         * 5th question (RadioButton)
         */
        RadioButton q5a3 = (RadioButton) findViewById(R.id.radio_button_q5a3);
        boolean q5a3Checked = q5a3.isChecked();
        if (q5a3Checked) {
            finalScore += 1;
        }

        /**
         * 6th question (RadioButton)
         */
        RadioButton q6a4 = (RadioButton) findViewById(R.id.radio_button_q6a4);
        boolean q6a4Checked = q6a4.isChecked();
        if (q6a4Checked) {
            finalScore += 1;
        }

        /**
         * 7th question (CheckBox)
         */
        CheckBox q7a1 = (CheckBox) findViewById(R.id.check_box_q7a1);
        boolean q7a1Checked = q7a1.isChecked();
        if (q7a1Checked) {
            finalScore += 0.5;
        }

        CheckBox q7a2 = (CheckBox) findViewById(R.id.check_box_q7a2);
        boolean q7a2Checked = q7a2.isChecked();
        if (q7a2Checked) {
            finalScore += 0.5;
        }

        /**
         * 8th question (RadioButton)
         */
        RadioButton q8a2 = (RadioButton) findViewById(R.id.radio_button_q8a2);
        boolean q8a2Checked = q8a2.isChecked();
        if (q8a2Checked) {
            finalScore += 1;
        }

        /**
         * 9th question (RadioButton)
         */
        RadioButton q9a2 = (RadioButton) findViewById(R.id.radio_button_q9a2);
        boolean q9a2Checked = q9a2.isChecked();
        if (q9a2Checked) {
            finalScore += 1;
        }

        /**
         * 10th question (RadioButton)
         */
        RadioButton q10a1 = (RadioButton) findViewById(R.id.radio_button_q10a1);
        boolean q10a1Checked = q10a1.isChecked();
        if (q10a1Checked) {
            finalScore += 1;
        }

        /**
         * Displays score on a toast button
         */
        String text = user + ", your score is " + finalScore + "/10 !";
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}


