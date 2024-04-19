package org.kazino.language_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LanguageSelect extends AppCompatActivity {

    private void clearOrangeColor(Button button) {
        button.setSelected(false);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_select);

        Button russianButton = findViewById(R.id.russian_button);
        russianButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the orange color from all buttons
                clearOrangeColor(findViewById(R.id.english_button));
                clearOrangeColor(findViewById(R.id.chinese_button));
                clearOrangeColor(findViewById(R.id.spanish_button));
                clearOrangeColor(findViewById(R.id.danish_button));

                // Set the orange color to the pressed button
                russianButton.setSelected(true);
            }
        });

        Button englishButton = findViewById(R.id.english_button);
        englishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the orange color from all buttons
                clearOrangeColor(findViewById(R.id.russian_button));
                clearOrangeColor(findViewById(R.id.chinese_button));
                clearOrangeColor(findViewById(R.id.spanish_button));
                clearOrangeColor(findViewById(R.id.danish_button));

                // Set the orange color to the pressed button
                englishButton.setSelected(true);
            }
        });

        Button chineseButton = findViewById(R.id.chinese_button);
        chineseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the orange color from all buttons
                clearOrangeColor(findViewById(R.id.russian_button));
                clearOrangeColor(findViewById(R.id.english_button));
                clearOrangeColor(findViewById(R.id.spanish_button));
                clearOrangeColor(findViewById(R.id.danish_button));

                // Set the orange color to the pressed button
                chineseButton.setSelected(true);
            }
        });

        Button spanishButton = findViewById(R.id.spanish_button);
        spanishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the orange color from all buttons
                clearOrangeColor(findViewById(R.id.russian_button));
                clearOrangeColor(findViewById(R.id.chinese_button));
                clearOrangeColor(findViewById(R.id.english_button));
                clearOrangeColor(findViewById(R.id.danish_button));

                // Set the orange color to the pressed button
                spanishButton.setSelected(true);
            }
        });

        Button danishButton = findViewById(R.id.danish_button);
        danishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the orange color from all buttons
                clearOrangeColor(findViewById(R.id.russian_button));
                clearOrangeColor(findViewById(R.id.chinese_button));
                clearOrangeColor(findViewById(R.id.spanish_button));
                clearOrangeColor(findViewById(R.id.english_button));

                // Set the orange color to the pressed button
                danishButton.setSelected(true);
            }
        });

        Button chooseButton = findViewById(R.id.choose_button);
        chooseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LanguageSelect.this, Login.class));
            }
        });
    }
}