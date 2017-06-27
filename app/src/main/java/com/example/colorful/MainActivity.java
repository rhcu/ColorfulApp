package com.example.colorful;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private AbsoluteLayout mAbsoluteLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAbsoluteLayout = (AbsoluteLayout) findViewById(R.id.absoluteLayout);


        Button yellowButton = (Button) findViewById(R.id.yellow);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   mAbsoluteLayout.setBackgroundColor(ContextCompat
                        .getColor(MainActivity.this, R.color.yellow));


        }});
    }
 public void onRedButtonClick(View view) {
        mAbsoluteLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
    }
    public void onGreenButtonClick(View view) {
        mAbsoluteLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
    }
    public void onWhiteButtonClick(View view) {
        mAbsoluteLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
    }
    public void onBlueButtonClick(View view) {
        mAbsoluteLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
    }
    public void onDarkBlueButtonClick(View view) {
        mAbsoluteLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
    }
    public void onPinkButtonClick(View view) {
        mAbsoluteLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.colorAccent));
    }
    public void onForestGreenButtonClick(View view){
        mAbsoluteLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.lightGreen));
    }
    public void onSpringGreenButtonClick(View view){
        mAbsoluteLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.lasur));
    }
    public void onVioletButtonClick(View view){
        mAbsoluteLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.violet));
    }
}
