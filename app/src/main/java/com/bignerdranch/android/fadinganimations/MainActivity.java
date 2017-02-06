package com.bignerdranch.android.fadinganimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        ImageView star1= (ImageView) findViewById(R.id.star1);
        //This fades image out
        //star1.animate().alpha(0f).setDuration(2000);
        //this drops image down, use negative num to go up
        //star1.animate().translationYBy(2000f).setDuration(2000);
        //this drops right down, use negative num to go left
        //star1.animate().translationXBy(1000f).setDuration(2000);
        //rotates pic
        //star1.animate().rotation(180f).setDuration(2000);
        //reduces size of image
        //star1.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.5f).setDuration(2000);
        star1.animate().scaleX(1f).scaleY(1f).rotation(360).alpha(1f).setDuration(2000);

        //ImageView star2 = (ImageView) findViewById(R.id.star2);

        //star2.animate().alpha(1f).setDuration(2000);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        ImageView star1= (ImageView) findViewById(R.id.star1);
        star1.setTranslationX(-1000f);
        */
        ImageView star1= (ImageView) findViewById(R.id.star1);

        star1.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.5f).setDuration(2000);

    }
}
