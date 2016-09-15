package com.egco428.list03;

/**
 * Created by 6272user on 9/15/2016 AD.
 */
public class Course {
    private int courseNumber;
    private String title;
    private String description;
    private double credits;

    public Course(int courseNumber, String title, String description, double credits){
        this.courseNumber = courseNumber;
        this.title = title;
        this.description = description;
        this.credits =credits;
    }

    public int getCourseNumber(){ return courseNumber; }
    public String getTitle(){ return title; }
    public String getDescription(){ return description; }
    public double getCredits(){ return credits; }
}
