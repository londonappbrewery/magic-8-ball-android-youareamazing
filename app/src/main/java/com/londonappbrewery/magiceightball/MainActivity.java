package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

import static com.londonappbrewery.magiceightball.R.id.image_ball;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton;
        askButton = (Button) findViewById(R.id.askButton);

        final ImageView image_ball = (ImageView) findViewById(R.id.image_ball);

        final int [] displayArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("magic-8-ball", "This number is pressed");

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(4);
                Log.d("magic-8-ball", "This is the number: "+ number);
                image_ball.setImageResource(displayArray[number]);
            }
        });


    }
}
