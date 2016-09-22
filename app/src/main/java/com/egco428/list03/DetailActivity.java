package com.egco428.list03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String courseTitle = getIntent().getStringExtra(MainActivity.Course_Title);
        TextView titleText = (TextView)findViewById(R.id.TitleText) ;
        titleText.setText(courseTitle);

        String courseDesc = getIntent().getStringExtra(MainActivity.Course_Desc);
        TextView descText = (TextView)findViewById(R.id.descriptionText);
        descText.setText(courseDesc);

        //int courseNumber = getIntent().getIntExtra(MainActivity.Course_Num,0);
        //String courseNumber1 = "CourseNumber : "+courseNumber + "\n";

        //double courseCre = getIntent().getDoubleExtra(MainActivity.Course_Credits,0);
        //String courseCre1 = "Credits : "+courseCre;

        //TextView textView = (TextView)findViewById(R.id.textView);
        //textView.setText(courseNumber1+courseCre1);

        //int resId = getResources().getIdentifier("images"+courseNumber, "drawable", getPackageName());
        //ImageView courseImage = (ImageView)findViewById(R.id.imageView2);
        //courseImage.setImageResource(resId);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if(id == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}

