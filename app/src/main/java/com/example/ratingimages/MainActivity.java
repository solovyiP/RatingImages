package com.example.ratingimages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView like,unlike;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        like = findViewById(R.id.like);
        textView = findViewById(R.id.likecount);
        unlike = findViewById(R.id.unlike);
        unlike.setVisibility(View.GONE);
        textView.setText("0");
    }

    int counter;


    public void Unlike(View view) {

        like.setVisibility(View.VISIBLE);
        unlike.setVisibility(View.GONE);
        counter--;
        textView.setText(String.valueOf(counter));
    }

    public void Like(View view) {
        unlike.setVisibility(View.VISIBLE);
        like.setVisibility(View.GONE);
        counter++;
        textView.setText(String.valueOf(counter));
        counter = Integer.parseInt(textView.getText().toString());
    }
}