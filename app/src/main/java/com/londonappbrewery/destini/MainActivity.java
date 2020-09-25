package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
   TextView mT_Story;
   Button mButtonT_Ans1;
   Button mButtonT_Ans2;
   int mStoryIndex = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mT_Story = (TextView) findViewById(R.id.storyTextView);
        mButtonT_Ans1 = (Button) findViewById(R.id.buttonTop);
        mButtonT_Ans2 = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonT_Ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    mT_Story.setText(R.string.T3_Story);
                    mButtonT_Ans1.setText(R.string.T3_Ans1);
                    mButtonT_Ans2.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else{
                    mT_Story.setText(R.string.T6_End);
                    mButtonT_Ans2.setVisibility(View.GONE);
                    mButtonT_Ans1.setVisibility(View.GONE);
                }

            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonT_Ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1) {
                    mT_Story.setText(R.string.T2_Story);
                    mButtonT_Ans1.setText(R.string.T2_Ans1);
                    mButtonT_Ans2.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 3) {
                    mT_Story.setText(R.string.T5_End);
                    mButtonT_Ans2.setVisibility(View.GONE);
                    mButtonT_Ans1.setVisibility(View.GONE);
                } else {
                    mT_Story.setText(R.string.T4_End);
                    mButtonT_Ans2.setVisibility(View.GONE);
                    mButtonT_Ans1.setVisibility(View.GONE);
                }

            }
        });


    }
}
