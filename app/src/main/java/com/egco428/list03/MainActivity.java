package com.egco428.list03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Course> data = DataProvider.getData();
        Iterator<Course> iterator = data.iterator();

        StringBuilder builder = new StringBuilder();
        while (iterator.hasNext()){
            Course course = iterator.next();
            builder.append(course.getTitle()).append("\n");
        }
        TextView courseTextView = (TextView)findViewById(R.id.courseListview);
        courseTextView.setText(builder.toString());
    }
}
