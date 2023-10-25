/**
 * Author: Jimmy
 * Assignment: I am Poor Part 5
 * Date: 10/25/23
 */
package com.example.iampoorpart5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button poor; //initializing poor button
    Button rich; //initializing rich button
    TextView text; //initializing text

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        poor = findViewById(R.id.button); //declaring poor button
        rich = findViewById(R.id.button2); //declaring rich button
        text = findViewById(R.id.textView); //declaring text
        poor.setOnClickListener(new View.OnClickListener() { //when poor button is clicked
            @Override
            public void onClick(View view) {
                verifyRichness(poor);
            }
        });
        rich.setOnClickListener(new View.OnClickListener() { //when rich button is clicked
            @Override
            public void onClick(View view) {
                verifyRichness(rich);
            }
        });
    }

    /**
     * Changes text based on the button given
     * @param button -Button button
     */
    @SuppressLint("SetTextI18n")
    public void verifyRichness(Button button) {
        text.setText("I AM " + button.getText());
    }
}