package org.kazino.language_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WordPractice extends AppCompatActivity {
    private void clearOrangeColor(Button button) {
        button.setSelected(false);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_practice);

        Button guess_1 = findViewById(R.id.buttonGuess2);
        guess_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the orange color from all buttons
                clearOrangeColor(findViewById(R.id.buttonGuess3));
                clearOrangeColor(findViewById(R.id.buttonGuess4));
                clearOrangeColor(findViewById(R.id.buttonGuess5));
                // Set the orange color to the pressed button
                guess_1.setSelected(true);
            }
        });

        Button guess_2 = findViewById(R.id.buttonGuess3);
        guess_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the orange color from all buttons
                clearOrangeColor(findViewById(R.id.buttonGuess2));
                clearOrangeColor(findViewById(R.id.buttonGuess4));
                clearOrangeColor(findViewById(R.id.buttonGuess5));
                // Set the orange color to the pressed button
                guess_2.setSelected(true);
            }
        });

        Button guess_3 = findViewById(R.id.buttonGuess4);
        guess_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the orange color from all buttons
                clearOrangeColor(findViewById(R.id.buttonGuess3));
                clearOrangeColor(findViewById(R.id.buttonGuess2));
                clearOrangeColor(findViewById(R.id.buttonGuess5));
                // Set the orange color to the pressed button
                guess_3.setSelected(true);
            }
        });

        Button guess_4 = findViewById(R.id.buttonGuess5);
        guess_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the orange color from all buttons
                clearOrangeColor(findViewById(R.id.buttonGuess3));
                clearOrangeColor(findViewById(R.id.buttonGuess4));
                clearOrangeColor(findViewById(R.id.buttonGuess2));
                // Set the orange color to the pressed button
                guess_4.setSelected(true);
            }
        });

        Button chooseButton = findViewById(R.id.buttonGuess6);
        chooseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(guess_2.isSelected()){
                    startActivity(new Intent(WordPractice.this, WordSuccess.class));
                } else{
                    startActivity(new Intent(WordPractice.this, WordError.class));
                }
            }
        });

    }
}