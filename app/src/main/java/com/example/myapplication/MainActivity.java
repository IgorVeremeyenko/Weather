package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ToggleButton toggleButton = null;
        ImageView imageView = null;


        imageView.findViewById(R.id.ImageView);
        toggleButton.findViewById(R.id.toggle);

        setContentView(R.layout.activity_main);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.light));


        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(toggleButton.isChecked()){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.light));
                }else{
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.dark));
                }
            }
        });
    }
}