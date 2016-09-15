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
        TextView titleText = (TextView)findViewById(R.id.courseTitleText) ;
        titleText.setText(courseTitle);

        String courseDesc = getIntent().getStringExtra(MainActivity.Course_Desc);
        TextView descText = (TextView)findViewById(R.id.descriptionText);
        descText.setText(courseDesc);
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

