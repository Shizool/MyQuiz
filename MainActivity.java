package com.example.android.myquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnwsers (View view)
    {
       Card1();
       Card2();
       Card3();
       Card4();
       Card5();
       findViewById(R.id.checkId).setVisibility(View.GONE);
       findViewById(R.id.resetId).setVisibility(View.VISIBLE);

       String message;
       if (score < 3 )
       {
           message = "You got " + score + "/5 points ! \nBetter pray to Jesus for some gains...";
       }
       else
       {
           message = "You got " + score + "/5 points ! \nYou are a true bro !!!";

       }

       Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    private void Card1 ()
    {
        RadioGroup group1 = findViewById(R.id.radio_group1);
        if (group1.indexOfChild(findViewById(group1.getCheckedRadioButtonId()))== 2)
        {
            score++;

        }
        findViewById(R.id.explanation1).setVisibility(View.VISIBLE);
        RadioButton r = findViewById(R.id.q1anwser3);
        r.setTextColor(getResources().getColor(R.color.colorPrimaryT));
        r.setButtonTintList(getResources().getColorStateList(R.color.colorPrimaryT));
    }

    private void Card2 ()
    {
        CheckBox c1 = findViewById(R.id.q2anwser1);
        CheckBox c2 = findViewById(R.id.q2anwser2);
        CheckBox c3 = findViewById(R.id.q2anwser3);
        if(c1.isChecked() && c2.isChecked() && c3.isChecked())
        {
            score++;
        }
        findViewById(R.id.explanation2).setVisibility(View.VISIBLE);
        c1.setTextColor(getResources().getColor(R.color.colorPrimaryT));
        c2.setTextColor(getResources().getColor(R.color.colorPrimaryT));
        c3.setTextColor(getResources().getColor(R.color.colorPrimaryT));
        c1.setButtonTintList(getResources().getColorStateList(R.color.colorPrimaryT));
        c2.setButtonTintList(getResources().getColorStateList(R.color.colorPrimaryT));
        c3.setButtonTintList(getResources().getColorStateList(R.color.colorPrimaryT));
    }

    private void Card3 ()
    {
        RadioGroup group2 = findViewById(R.id.radio_group2);
        if (group2.indexOfChild(findViewById(group2.getCheckedRadioButtonId()))== 2)
        {
            score++;

        }
        findViewById(R.id.explanation3).setVisibility(View.VISIBLE);
        RadioButton r = findViewById(R.id.q3anwser3);
        r.setTextColor(getResources().getColor(R.color.colorPrimaryT));
        r.setButtonTintList(getResources().getColorStateList(R.color.colorPrimaryT));
    }

    private void Card4 ()
    {
        EditText e = findViewById(R.id.q4anwser1);
        String movement = e.getText().toString();
        String compare1 = "compound";
        String compare2 = "Compound";

        if(movement.equals(compare1) || movement.equals(compare2))
        {
            score++;
            e.setTextColor(getResources().getColorStateList(R.color.colorPrimaryT));
        }
        findViewById(R.id.explanation4).setVisibility(View.VISIBLE);
    }

    private void Card5 ()
    {
        RatingBar r = findViewById(R.id.rating);
        int n = (int) r.getRating();
        if(n == 5)
        {
            score++;
        }
        findViewById(R.id.explanation5).setVisibility(View.VISIBLE);
    }

    public void reset (View view)
    {
        score = 0;
        findViewById(R.id.explanation1).setVisibility(View.INVISIBLE);
        findViewById(R.id.explanation2).setVisibility(View.INVISIBLE);
        findViewById(R.id.explanation3).setVisibility(View.INVISIBLE);
        findViewById(R.id.explanation4).setVisibility(View.INVISIBLE);
        findViewById(R.id.explanation5).setVisibility(View.INVISIBLE);
        RadioButton r = findViewById(R.id.q1anwser3);
        r.setTextColor(getResources().getColor(R.color.white));
        r.setButtonTintList(getResources().getColorStateList(R.color.white));
        RadioGroup rg1 = findViewById(R.id.radio_group1);
        rg1.clearCheck();
        CheckBox c1 = findViewById(R.id.q2anwser1);
        CheckBox c2 = findViewById(R.id.q2anwser2);
        CheckBox c3 = findViewById(R.id.q2anwser3);
        CheckBox c4 = findViewById(R.id.q2anwser4);
        c1.setTextColor(getResources().getColor(R.color.white));
        c2.setTextColor(getResources().getColor(R.color.white));
        c3.setTextColor(getResources().getColor(R.color.white));
        c1.setButtonTintList(getResources().getColorStateList(R.color.white));
        c2.setButtonTintList(getResources().getColorStateList(R.color.white));
        c3.setButtonTintList(getResources().getColorStateList(R.color.white));
        c1.setChecked(false);
        c2.setChecked(false);
        c3.setChecked(false);
        c4.setChecked(false);
        RadioButton r1 = findViewById(R.id.q3anwser3);
        r1.setTextColor(getResources().getColor(R.color.white));
        r1.setButtonTintList(getResources().getColorStateList(R.color.white));
        RadioGroup rg2 = findViewById(R.id.radio_group2);
        rg2.clearCheck();
        EditText e = findViewById(R.id.q4anwser1);
        e.setTextColor(getResources().getColorStateList(R.color.white));
        e.setText(" ");
        RatingBar rb = findViewById(R.id.rating);
        rb.setRating(0);
        findViewById(R.id.checkId).setVisibility(View.VISIBLE);
        findViewById(R.id.resetId).setVisibility(View.GONE);
    }

}
