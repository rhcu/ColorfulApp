package com.example.colorful;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
                Toast toast = Toast.makeText(getApplicationContext(),
                        "You've chosen yellow",
                        Toast.LENGTH_SHORT);
                toast.show();

        }});
    }
 public void onRedButtonClick(View view) {
        mAbsoluteLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
     Toast toast = Toast.makeText(getApplicationContext(),
             "You've chosen red",
             Toast.LENGTH_SHORT);
          toast.show();
    }
    public void onGreenButtonClick(View view) {
        mAbsoluteLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        Toast toast = Toast.makeText(getApplicationContext(),
                "You've chosen green",
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void onWhiteButtonClick(View view) {
        mAbsoluteLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
        Toast toast = Toast.makeText(getApplicationContext(),
                "You've chosen white",
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void onBlueButtonClick(View view) {
        mAbsoluteLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
        Toast toast = Toast.makeText(getApplicationContext(),
                "You've chosen blue",
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void onDarkBlueButtonClick(View view) {
        mAbsoluteLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
        Toast toast = Toast.makeText(getApplicationContext(),
                "You've chosen dark blue",
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void onPinkButtonClick(View view) {
        mAbsoluteLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.colorAccent));
        Toast toast = Toast.makeText(getApplicationContext(),
                "You've chosen pink",
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void onForestGreenButtonClick(View view){
        mAbsoluteLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.lightGreen));
        Toast toast = Toast.makeText(getApplicationContext(),
                "You've chosen forest green",
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void onSpringGreenButtonClick(View view){
        mAbsoluteLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.lasur));
        Toast toast = Toast.makeText(getApplicationContext(),
                "You've chosen spring green",
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void onVioletButtonClick(View view){
        mAbsoluteLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.violet));
        Toast toast = Toast.makeText(getApplicationContext(),
                "You've chosen violet",
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void infoClick(View view){
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }
}
