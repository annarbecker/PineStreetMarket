package com.epicodus.pinestreetmarket;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Bind(R.id.viewEateries) TextView mViewEateries;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mViewEateries.setOnClickListener(this);


        Typeface myCustomFont = Typeface.createFromAsset(getAssets(), "fonts/bebasneue.ttf");
        mViewEateries.setTypeface(myCustomFont);

    }

    @Override
    public void onClick(View v) {
        if (v == mViewEateries) {
            Intent intent = new Intent(MainActivity.this, EateriesActivity.class);
            startActivity(intent);
        }
    }
}