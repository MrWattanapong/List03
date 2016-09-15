package com.egco428.list03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String Course_Title = "Course Title";
    public static final String Course_Desc = "Course Description";
    public static final int DETAIL_REQ_CODE = 1001;
    protected List<Course> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = DataProvider.getData();
        ListView listView = (ListView)findViewById(R.id.list);
        ArrayAdapter<Course> courseArrayAdapter = new ArrayAdapter<Course>(this,android.R.layout.simple_list_item_1,data);
        listView.setAdapter(courseArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Course course = data.get(position);
                displayDetail(course);
            }
        });

//        List<Course> data = DataProvider.getData();
//        Iterator<Course> iterator = data.iterator();
//
//        StringBuilder builder = new StringBuilder();
//        while (iterator.hasNext()){
//            Course course = iterator.next();
//            builder.append(course.getTitle()).append("\n");
//        }
//        TextView courseTextView = (TextView)findViewById(R.id.courseListview);
//        courseTextView.setText(builder.toString());
    }

    private void displayDetail(Course course){
        Log.d("MainActivity","Displaying Course: "+course.getTitle());
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra(Course_Title, course.getTitle());
        intent.putExtra(Course_Desc, course.getDescription());
        startActivityForResult(intent, DETAIL_REQ_CODE);
    }
}
