package com.example.android.cookingquiz;


import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //Track of user's score
    int score = 0;
//    score converted to a percent
    int percent = (score/5)*10;
    //@count used for case statement to switch ImageViews and TextViews
    int count = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void onClick(View view) {

//        Find All Relevant Views
        ImageView burgerImageView = findViewById(R.id.burger);
        ImageView quizBanner = findViewById(R.id.banner);
        TextView setTextHeader = findViewById(R.id.quizHeader);
        TextView setTextQuestion = findViewById(R.id.quizQuestion);
        RadioGroup radioGroup = findViewById(R.id.quizRadioGroup);
        RadioButton radioButton1 = findViewById(R.id.radio1);
        RadioButton radioButton2 = findViewById(R.id.radio2);
        RadioButton radioButton3 = findViewById(R.id.radio3);
        RadioButton radioButton4 = findViewById(R.id.radio4);
        Button button = findViewById(R.id.quizButton);
        TextView displayScore = findViewById(R.id.score_textView);
        View scoreView = findViewById(R.id.score_view);
        TextView commentTextView = findViewById(R.id.commentTextView);



//        find case #. for each case, replace text each time quiz button is clicked
        switch (count) {


//                where case = 0, display quiz 1



            case 0:
//                Hide the burger picture
                burgerImageView.setVisibility(View.GONE);
//        Quiz 1 Banner replacement. Change image to default
                quizBanner.setImageResource(R.mipmap.pasta_2);
//        Quiz 1 Header text replacement
                setTextHeader.setText(R.string.quiz_1_header);

//        Quiz 1 Question text Replacement
                setTextQuestion.setVisibility(View.VISIBLE);
                setTextQuestion.setText(R.string.quiz_1_question);

//        Quiz 1 Radio Group
                radioGroup.setVisibility(View.VISIBLE);

//        Quiz 1 Radio Buttons
                radioButton1.setText(R.string.quiz_1_radio_1);
                radioButton2.setText(R.string.quiz_1_radio_2);
                radioButton3.setText(R.string.quiz_1_radio_3);
                radioButton4.setText(R.string.quiz_1_radio_4);

//        Quiz 1 Button. Change text to submit
                button.setText(R.string.submitButton);


//                Add one to count to keep track of page
                count += 1;
                break;




 //----------------------------------------------------------------------------------------------------//



            //                where case = 1, check answer 1 & display quiz 2



            case 1:

                //                Add one to score if correct radio button has been clicked!
                boolean checked1 = radioButton2.isChecked(); //radioButton2 is the correct answer for this question
                if (checked1) {
                    score = score + 1;

                }
                Log.i("string", "Your Score: " + score);

                //        Quiz 2 Banner replacement. Change image to default
                quizBanner.setImageResource(R.mipmap.bread);

                //        Quiz 2 Header text replacement
                setTextHeader.setText(R.string.quiz_2_header);

                //        Quiz 2 Question text Replacement
                setTextQuestion.setText(R.string.quiz_2_question);


                //        Quiz 2 Radio Buttons
                radioButton1.setText(R.string.quiz_2_radio_1);
                radioButton2.setText(R.string.quiz_2_radio_2);
                radioButton3.setText(R.string.quiz_2_radio_3);
                radioButton4.setText(R.string.quiz_2_radio_4);


                //                Add one to count to keep track of page
                count += 1;
                break;



            //----------------------------------------------------------------------------------------------------//



            //                where case = 2, check answer 2 & display quiz 3



            case 2:

                //                Add one to score if correct radio button has been clicked!

                boolean checked2 = radioButton3.isChecked(); //radioButton3 is the correct answer for this question
                if (checked2) {
                    score = score + 1;

                }
                Log.i("string", "Your Score: " + score);

                //        Quiz 3 Banner replacement. Change image to default
                quizBanner.setImageResource(R.mipmap.julienned);

                //        Quiz 3 Header text replacement
                setTextHeader.setText(R.string.quiz_3_header);

                //        Quiz 3 Question text Replacement

                setTextQuestion.setText(R.string.quiz_3_question);


                //        Quiz 3 Radio Buttons
                radioButton1.setText(R.string.quiz_3_radio_1);
                radioButton2.setText(R.string.quiz_3_radio_2);
                radioButton3.setText(R.string.quiz_3_radio_3);
                radioButton4.setText(R.string.quiz_3_radio_4);


                //                Add one to count to keep track of page
                count += 1;
                break;



            //----------------------------------------------------------------------------------------------------//



            //                where case = 3, check answer 3 & display quiz 4



            case 3:

                //                Add one to score if correct radio button has been clicked!

                boolean checked3 = radioButton2.isChecked(); //radioButton3 is the correct answer for this question
                if (checked3) {
                    score = score + 1;

                }
                Log.i("string", "Your Score: " + score);

                //        Quiz 4 Banner replacement. Change image to default
                quizBanner.setImageResource(R.mipmap.tomatoes);

                //        Quiz 4 Header text replacement
                setTextHeader.setText(R.string.quiz_4_header);

                //        Quiz 4 Question text Replacement

                setTextQuestion.setText(R.string.quiz_4_question);


                //        Quiz 4 Radio Buttons
                radioButton1.setText(R.string.quiz_4_radio_1);
                radioButton2.setText(R.string.quiz_4_radio_2);
                radioButton3.setText(R.string.quiz_4_radio_3);
                radioButton4.setText(R.string.quiz_4_radio_4);

                //                Add one to count to keep track of page
                count += 1;
                break;


            //----------------------------------------------------------------------------------------------------//



            //                where case = 4,  check answer 4 & display quiz 5



            case 4:

                //                Add one to score if correct radio button has been clicked!

                boolean checked4 = radioButton1.isChecked(); //radioButton3 is the correct answer for this question
                if (checked4) {
                    score = score + 1;

                }
                Log.i("string", "Your Score: " + score);

                //        Quiz 5 Banner replacement. Change image to default
                quizBanner.setImageResource(R.mipmap.baking);

                //        Quiz 5 Header text replacement
                setTextHeader.setText(R.string.quiz_5_header);

                //        Quiz 5 Question text Replacement
                setTextQuestion.setText(R.string.quiz_5_question);


                //        Quiz 5 Radio Buttons
                radioButton1.setText(R.string.quiz_5_radio_1);
                radioButton2.setText(R.string.quiz_5_radio_2);
                radioButton3.setText(R.string.quiz_5_radio_3);
                radioButton4.setText(R.string.quiz_5_radio_4);


                //                Add one to count to keep track of page
                count += 1;
                break;




            //                where case = 5, check answer 5 & display results page



            case 5:

                //                Add one to score if correct radio button has been clicked!

                boolean checked5 = radioButton3.isChecked(); //radioButton3 is the correct answer for this question
                if (checked5) {
                    score = score + 1;

                }
//        results Banner replacement. Change image to default
                quizBanner.setImageResource(R.mipmap.gordon);
//        results quote Header text replacement
                setTextHeader.setText(R.string.results_header);
                setTextHeader.setTextSize(24);
                setTextHeader.setPadding(0,36,0,0);

//        results quote author text Replacement
                setTextQuestion.setText(R.string.results_quote);

//        Quiz 1 Radio Group
                radioGroup.setVisibility(View.GONE);

//        results text view. used to display score of the user
                scoreView.setVisibility(View.VISIBLE);
                String scoreToText = Integer.toString(score);
                displayScore.setText(scoreToText);
//                Score Response! places text under the score depending on the user's final score
                switch (score)    {
                    case 0:
                        commentTextView.setText(R.string.zeroOfFive);
                        break;

                    case 1:
                        commentTextView.setText(R.string.oneOfFive);
                        break;

                    case 2:
                        commentTextView.setText(R.string.twoOfFive);
                        break;

                    case 3:
                        commentTextView.setText(R.string.threeOfFive);
                        break;
                    case 4:
                        commentTextView.setText(R.string.fourOfFive);
                        break;
                    case 5:
                        commentTextView.setText(R.string.fiveOfFive);
                        break;





                }

//        Quiz 5 Button. Change text to submit
                button.setText(R.string.reset_button);


//                Add one to count to keep track of page
                count += 1;
                break;


//                Reset the App
            case 6:
                Intent i = getBaseContext().getPackageManager()
                        .getLaunchIntentForPackage(getBaseContext().getPackageName());
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);

                break;

        }
    }

}
