package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Square puzzle game
 *
 * @author Jason Katayama
 * @version
 */
/**
 External Citation
 Date: September 30 2021
 Problem: Didn't know if textViews could be used similar to button for when
 it is clicked it could do an action
 Resource:
 https://stackoverflow.com/questions/3328757/how-to-click-or-tap-on-a-textview-text
 Solution: I used some of the code but mostly just if textViews could be used
 with onclicks and how to set them up
 */
public class MainActivity extends AppCompatActivity {
    //Make check method
    //call check at the end of each onclick
    //check for background color change
    PuzzleView puzzleView;
    LinearLayout linearLayout;
    boolean equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Declaring the button and linearlayouts
        Button resetButton = (Button) findViewById(R.id.resetButton);
        puzzleView = new PuzzleView(this);
        resetButton.setOnClickListener(puzzleView);
        linearLayout = (LinearLayout) findViewById(R.id.LinearLayout);

        //Onclick listeners and onClicks for each of the textViews
        //The onClick checks to see if the textView next to the one clicked
        //is empty and if it is empty it will move the number over
        puzzleView.textViewArray[0].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                switch (view.getId())
                {
                    case R.id.textView1:
                        //Checking all adjacent squares for a blank or ""
                        if (puzzleView.textViewArray[1].getText().equals("")) {
                            puzzleView.textViewArray[1].setText(puzzleView.textViewArray[0].getText());
                            puzzleView.textViewArray[0].setText("");
                        }
                        if (puzzleView.textViewArray[4].getText().equals("")) {
                            puzzleView.textViewArray[4].setText(puzzleView.textViewArray[0].getText());
                            puzzleView.textViewArray[0].setText("");
                        }
                        check();
                }
            }
        });
        puzzleView.textViewArray[1].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                switch (view.getId())
                {
                    case R.id.textView2:
                        if (puzzleView.textViewArray[0].getText().equals(""))
                        {
                            puzzleView.textViewArray[0].setText(puzzleView.textViewArray[1].getText());
                            puzzleView.textViewArray[1].setText("");
                        }
                        if (puzzleView.textViewArray[2].getText().equals(""))
                        {
                            puzzleView.textViewArray[2].setText(puzzleView.textViewArray[1].getText());
                            puzzleView.textViewArray[1].setText("");
                        }
                        if (puzzleView.textViewArray[5].getText().equals(""))
                        {
                            puzzleView.textViewArray[5].setText(puzzleView.textViewArray[1].getText());
                            puzzleView.textViewArray[1].setText("");
                        }
                        check();
                }
            }
        });
        puzzleView.textViewArray[2].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                switch (view.getId())
                {
                    case R.id.textView3:
                        if (puzzleView.textViewArray[1].getText().equals(""))
                        {
                            puzzleView.textViewArray[1].setText(puzzleView.textViewArray[2].getText());
                            puzzleView.textViewArray[2].setText("");
                        }
                        if (puzzleView.textViewArray[3].getText().equals(""))
                        {
                            puzzleView.textViewArray[3].setText(puzzleView.textViewArray[2].getText());
                            puzzleView.textViewArray[2].setText("");
                        }
                        if (puzzleView.textViewArray[6].getText().equals(""))
                        {
                            puzzleView.textViewArray[6].setText(puzzleView.textViewArray[2].getText());
                            puzzleView.textViewArray[2].setText("");
                        }
                        check();
                }
            }
        });
        puzzleView.textViewArray[3].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                switch (view.getId())
                {
                    case R.id.textView4:
                        if (puzzleView.textViewArray[2].getText().equals(""))
                        {
                            puzzleView.textViewArray[2].setText(puzzleView.textViewArray[3].getText());
                            puzzleView.textViewArray[3].setText("");
                        }
                        if (puzzleView.textViewArray[7].getText().equals(""))
                        {
                            puzzleView.textViewArray[7].setText(puzzleView.textViewArray[3].getText());
                            puzzleView.textViewArray[3].setText("");
                        }
                        check();
                }
            }
        });
        puzzleView.textViewArray[4].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                switch (view.getId())
                {
                    case R.id.textView5:
                        if (puzzleView.textViewArray[0].getText().equals(""))
                        {
                            puzzleView.textViewArray[0].setText(puzzleView.textViewArray[4].getText());
                            puzzleView.textViewArray[4].setText("");
                        }
                        if (puzzleView.textViewArray[8].getText().equals(""))
                        {
                            puzzleView.textViewArray[8].setText(puzzleView.textViewArray[4].getText());
                            puzzleView.textViewArray[4].setText("");
                        }
                        if (puzzleView.textViewArray[5].getText().equals(""))
                        {
                            puzzleView.textViewArray[5].setText(puzzleView.textViewArray[4].getText());
                            puzzleView.textViewArray[4].setText("");
                        }
                        check();
                }
            }
        });
        puzzleView.textViewArray[5].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                switch (view.getId())
                {
                    case R.id.textView6:
                        if (puzzleView.textViewArray[1].getText().equals(""))
                        {
                            puzzleView.textViewArray[1].setText(puzzleView.textViewArray[5].getText());
                            puzzleView.textViewArray[5].setText("");
                        }
                        if (puzzleView.textViewArray[4].getText().equals(""))
                        {
                            puzzleView.textViewArray[4].setText(puzzleView.textViewArray[5].getText());
                            puzzleView.textViewArray[5].setText("");
                        }
                        if (puzzleView.textViewArray[6].getText().equals(""))
                        {
                            puzzleView.textViewArray[6].setText(puzzleView.textViewArray[5].getText());
                            puzzleView.textViewArray[5].setText("");
                        }
                        if (puzzleView.textViewArray[9].getText().equals(""))
                        {
                            puzzleView.textViewArray[9].setText(puzzleView.textViewArray[5].getText());
                            puzzleView.textViewArray[5].setText("");
                        }
                        check();
                }
            }
        });
        puzzleView.textViewArray[6].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                switch (view.getId())
                {
                    case R.id.textView7:
                        if (puzzleView.textViewArray[2].getText().equals(""))
                        {
                            puzzleView.textViewArray[2].setText(puzzleView.textViewArray[6].getText());
                            puzzleView.textViewArray[6].setText("");
                        }
                        if (puzzleView.textViewArray[5].getText().equals(""))
                        {
                            puzzleView.textViewArray[5].setText(puzzleView.textViewArray[6].getText());
                            puzzleView.textViewArray[6].setText("");
                        }
                        if (puzzleView.textViewArray[7].getText().equals(""))
                        {
                            puzzleView.textViewArray[7].setText(puzzleView.textViewArray[6].getText());
                            puzzleView.textViewArray[6].setText("");
                        }
                        if (puzzleView.textViewArray[10].getText().equals(""))
                        {
                            puzzleView.textViewArray[10].setText(puzzleView.textViewArray[6].getText());
                            puzzleView.textViewArray[6].setText("");
                        }
                        check();
                }
            }
        });
        puzzleView.textViewArray[7].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                switch (view.getId())
                {
                    case R.id.textView8:
                        if (puzzleView.textViewArray[3].getText().equals(""))
                        {
                            puzzleView.textViewArray[3].setText(puzzleView.textViewArray[7].getText());
                            puzzleView.textViewArray[7].setText("");
                        }
                        if (puzzleView.textViewArray[6].getText().equals(""))
                        {
                            puzzleView.textViewArray[6].setText(puzzleView.textViewArray[7].getText());
                            puzzleView.textViewArray[7].setText("");
                        }
                        if (puzzleView.textViewArray[11].getText().equals(""))
                        {
                            puzzleView.textViewArray[11].setText(puzzleView.textViewArray[7].getText());
                            puzzleView.textViewArray[7].setText("");
                        }
                        check();
                }
            }
        });
        puzzleView.textViewArray[8].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                switch (view.getId())
                {
                    case R.id.textView9:
                        if (puzzleView.textViewArray[4].getText().equals(""))
                        {
                            puzzleView.textViewArray[4].setText(puzzleView.textViewArray[8].getText());
                            puzzleView.textViewArray[8].setText("");
                        }
                        if (puzzleView.textViewArray[9].getText().equals(""))
                        {
                            puzzleView.textViewArray[9].setText(puzzleView.textViewArray[8].getText());
                            puzzleView.textViewArray[8].setText("");
                        }
                        if (puzzleView.textViewArray[12].getText().equals(""))
                        {
                            puzzleView.textViewArray[12].setText(puzzleView.textViewArray[8].getText());
                            puzzleView.textViewArray[8].setText("");
                        }
                        check();
                }
            }
        });
        puzzleView.textViewArray[9].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                switch (view.getId())
                {
                    case R.id.textView10:
                        if (puzzleView.textViewArray[5].getText().equals(""))
                        {
                            puzzleView.textViewArray[5].setText(puzzleView.textViewArray[9].getText());
                            puzzleView.textViewArray[9].setText("");
                        }
                        if (puzzleView.textViewArray[8].getText().equals(""))
                        {
                            puzzleView.textViewArray[8].setText(puzzleView.textViewArray[9].getText());
                            puzzleView.textViewArray[9].setText("");
                        }
                        if (puzzleView.textViewArray[10].getText().equals(""))
                        {
                            puzzleView.textViewArray[10].setText(puzzleView.textViewArray[9].getText());
                            puzzleView.textViewArray[9].setText("");
                        }
                        if (puzzleView.textViewArray[13].getText().equals(""))
                        {
                            puzzleView.textViewArray[13].setText(puzzleView.textViewArray[9].getText());
                            puzzleView.textViewArray[9].setText("");
                        }
                        check();
                }
            }
        });
        puzzleView.textViewArray[10].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                switch (view.getId())
                {
                    case R.id.textView11:
                        if (puzzleView.textViewArray[6].getText().equals(""))
                        {
                            puzzleView.textViewArray[6].setText(puzzleView.textViewArray[10].getText());
                            puzzleView.textViewArray[10].setText("");
                        }
                        if (puzzleView.textViewArray[9].getText().equals(""))
                        {
                            puzzleView.textViewArray[9].setText(puzzleView.textViewArray[10].getText());
                            puzzleView.textViewArray[10].setText("");
                        }
                        if (puzzleView.textViewArray[11].getText().equals(""))
                        {
                            puzzleView.textViewArray[11].setText(puzzleView.textViewArray[10].getText());
                            puzzleView.textViewArray[10].setText("");
                        }
                        if (puzzleView.textViewArray[14].getText().equals(""))
                        {
                            puzzleView.textViewArray[14].setText(puzzleView.textViewArray[10].getText());
                            puzzleView.textViewArray[10].setText("");
                        }
                        check();
                }
            }
        });
        puzzleView.textViewArray[11].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                switch (view.getId())
                {
                    case R.id.textView12:
                        if(puzzleView.textViewArray[7].getText().equals(""))
                        {
                            puzzleView.textViewArray[7].setText(puzzleView.textViewArray[11].getText());
                            puzzleView.textViewArray[11].setText("");
                        }
                        if(puzzleView.textViewArray[10].getText().equals(""))
                        {
                            puzzleView.textViewArray[10].setText(puzzleView.textViewArray[11].getText());
                            puzzleView.textViewArray[11].setText("");
                        }
                        if(puzzleView.textViewArray[15].getText().equals(""))
                        {
                            puzzleView.textViewArray[15].setText(puzzleView.textViewArray[11].getText());
                            puzzleView.textViewArray[11].setText("");
                        }
                        check();
                }
            }
        });
        puzzleView.textViewArray[12].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                switch (view.getId())
                {
                    case R.id.textView13:
                        if(puzzleView.textViewArray[8].getText().equals(""))
                        {
                            puzzleView.textViewArray[8].setText(puzzleView.textViewArray[12].getText());
                            puzzleView.textViewArray[12].setText("");
                        }
                        if(puzzleView.textViewArray[13].getText().equals(""))
                        {
                            puzzleView.textViewArray[13].setText(puzzleView.textViewArray[12].getText());
                            puzzleView.textViewArray[12].setText("");
                        }
                        check();
                }
            }
        });
        puzzleView.textViewArray[13].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                switch (view.getId())
                {
                    case R.id.textView14:
                        if(puzzleView.textViewArray[9].getText().equals(""))
                        {
                            puzzleView.textViewArray[9].setText(puzzleView.textViewArray[13].getText());
                            puzzleView.textViewArray[13].setText("");
                        }
                        if(puzzleView.textViewArray[12].getText().equals(""))
                        {
                            puzzleView.textViewArray[12].setText(puzzleView.textViewArray[13].getText());
                            puzzleView.textViewArray[13].setText("");
                        }
                        if(puzzleView.textViewArray[14].getText().equals(""))
                        {
                            puzzleView.textViewArray[14].setText(puzzleView.textViewArray[13].getText());
                            puzzleView.textViewArray[13].setText("");
                        }
                        check();
                }
            }
        });
        puzzleView.textViewArray[14].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                switch (view.getId())
                {
                    case R.id.textView15:
                        if(puzzleView.textViewArray[10].getText().equals(""))
                        {
                            puzzleView.textViewArray[10].setText(puzzleView.textViewArray[14].getText());
                            puzzleView.textViewArray[14].setText("");
                        }
                        if(puzzleView.textViewArray[13].getText().equals(""))
                        {
                            puzzleView.textViewArray[13].setText(puzzleView.textViewArray[14].getText());
                            puzzleView.textViewArray[14].setText("");
                        }
                        if(puzzleView.textViewArray[15].getText().equals(""))
                        {
                            puzzleView.textViewArray[15].setText(puzzleView.textViewArray[14].getText());
                            puzzleView.textViewArray[14].setText("");
                        }
                        check();
                }
            }
        });
        puzzleView.textViewArray[15].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                switch (view.getId())
                {
                    case R.id.textView16:
                        if(puzzleView.textViewArray[11].getText().equals(""))
                        {
                            puzzleView.textViewArray[11].setText(puzzleView.textViewArray[15].getText());
                            puzzleView.textViewArray[15].setText("");
                        }
                        if(puzzleView.textViewArray[14].getText().equals(""))
                        {
                            puzzleView.textViewArray[14].setText(puzzleView.textViewArray[15].getText());
                            puzzleView.textViewArray[15].setText("");
                        }
                        check();
                }
            }
        });
    }
    //Check method to see if all the numbers are in the right order
    public void check()
    {
        equal = false;
        int amTrue = 0;
        for(int i = 0; i < puzzleView.textViewArray.length;i++)
        {
            if(puzzleView.textViewArray[i].getText().equals(puzzleView.puzzelInfo.match[i]))
            {
                equal = true;
                amTrue++;
                //If no match is found set the layout to white
                linearLayout.setBackgroundColor(Color.WHITE);
            }else{
                equal = false;
            }
        }
        //to check if textView array and the match checker are the same
        //if both the arrays are the same it would change the linearLayout background
        //to Green
        //Also using a int to count the number of true's because without it
        //I noticed if the "" or blank space was in the right space it would change the background to green
        if(equal = true)
        {
            if(amTrue == 16)
            {
                linearLayout.setBackgroundColor(Color.GREEN);
            }
        }
    }
}

