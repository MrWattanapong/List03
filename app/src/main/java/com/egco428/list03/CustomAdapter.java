package com.egco428.list03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class CustomAdapter extends ArrayAdapter<Course> {

    List<Course> course;
    int[] images;
    final Context c;
    LayoutInflater inflater;

    public CustomAdapter(Context context, List<Course> list, int[] images) {
        super(context, 0, list);
        this.c = context;
        this.images = images;
        this.course = list;
        inflater = LayoutInflater.from(this.c);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Course courseItem = course.get(position);
        convertView = inflater.inflate(R.layout.item, null);

        TextView listText = (TextView) convertView.findViewById(R.id.titleText);
        String title = courseItem.getTitle();
        listText.setText(title);

        ImageView imageList = (ImageView) convertView.findViewById(R.id.ImageCouse);
        int image = images[position];
        imageList.setImageResource(image);

        return convertView;
    }


}
