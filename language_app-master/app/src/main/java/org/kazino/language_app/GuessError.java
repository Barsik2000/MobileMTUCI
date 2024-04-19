package org.kazino.language_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuessError extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_error);

        Button nextButton = findViewById(R.id.nextButton_w);
        Button tryAgainButton = findViewById(R.id.tryAgainButton_w);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GuessError.this, MainActivity.class));
            }
        });

        tryAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GuessError.this, GuessTheAnimal.class));
            }
        });
    }
}