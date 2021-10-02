package com.example.homework2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PuzzleView implements View.OnClickListener {
    private Activity activity;
    public PuzzleModel puzzelInfo;
    public TextView[] textViewArray;


    public PuzzleView(Activity mainActivity){
        this.activity = mainActivity;
        puzzelInfo = new PuzzleModel();
        //Make a array full of textViews so changing the text can be a bit more simpler
        textViewArray = new TextView[16];
        //Declaring all the textViews into the array
        textViewArray[0] = (TextView) activity.findViewById(R.id.textView1);
        textViewArray[1] = (TextView) activity.findViewById(R.id.textView2);
        textViewArray[2] = (TextView) activity.findViewById(R.id.textView3);
        textViewArray[3] = (TextView) activity.findViewById(R.id.textView4);
        textViewArray[4] = (TextView) activity.findViewById(R.id.textView5);
        textViewArray[5] = (TextView) activity.findViewById(R.id.textView6);
        textViewArray[6] = (TextView) activity.findViewById(R.id.textView7);
        textViewArray[7] = (TextView) activity.findViewById(R.id.textView8);
        textViewArray[8] = (TextView) activity.findViewById(R.id.textView9);
        textViewArray[9] = (TextView) activity.findViewById(R.id.textView10);
        textViewArray[10] = (TextView) activity.findViewById(R.id.textView11);
        textViewArray[11] = (TextView) activity.findViewById(R.id.textView12);
        textViewArray[12] = (TextView) activity.findViewById(R.id.textView13);
        textViewArray[13] = (TextView) activity.findViewById(R.id.textView14);
        textViewArray[14] = (TextView) activity.findViewById(R.id.textView15);
        textViewArray[15] = (TextView) activity.findViewById(R.id.textView16);

        List<String> numbers = Arrays.asList("","1","2","3","4","5","6","7",
                "8","9","10","11","12","13","14","15");
        /**
         External Citation
         Date: September 30 2021
         Problem: Finding a different way to shuffle arrays that was more simpler
         Resource:
         https://stackoverflow.com/questions/16724084/shuffling-an-array-in-android
         Solution: I used some the example of Collection.shuffle
         */
        Collections.shuffle(numbers);
        //Getting the appropriate numbers from the puzzlemodel array
        //Then editing to the textView as well as changing the size
        //This is to set the initial numbers in the textView
        for(int i = 0; i < numbers.size();i++){
            puzzelInfo.tileNum[i] = numbers.get(i);
        }
        for(int i = 0; i < numbers.size();i++){
            textViewArray[i].setTextSize(50);
            textViewArray[i].setText(puzzelInfo.tileNum[i]);
        }
    }
    //getter for the puzzleInfo from the cake project
    public PuzzleModel getPuzzleModel(){
        return puzzelInfo;
    }
    //Onclick for the reset button to reshuffle the array and edit the
    //textView to show the updated numbers
    public void onClick(View view) {
        List<String> numbers = Arrays.asList("", "1", "2", "3", "4", "5", "6", "7",
                "8", "9", "10", "11", "12", "13", "14", "15");

        Collections.shuffle(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            puzzelInfo.tileNum[i] = numbers.get(i);
        }
        //Setting the numbers for the textViews
        for (int i = 0; i < numbers.size(); i++) {
            textViewArray[i].setTextSize(50);
            textViewArray[i].setText(puzzelInfo.tileNum[i]);
        }
    }
}
