package com.csc205.project1;

import java.lang.Math;

public class Point{

    private double xCoordinate;
    private double yCoordinate;

    //--------------------------------------------------------------
    // Sets up the point
    //--------------------------------------------------------------
    public Point(){
        xCoordinate = 0.0;
        yCoordinate = 0.0;
    }

    //--------------------------------------------------------------
    // Constructor
    //--------------------------------------------------------------
    public Point(double x, double y){
        xCoordinate = x;
        yCoordinate = y;
    }

    //--------------------------------------------------------------
    // Finds the distance of the two points
    //--------------------------------------------------------------
    public double distance(Point p2){
        double distance = Math.sqrt(((p2.getX()-getX())*(p2.getX()-getX()))+((p2.getY()-getY())*(p2.getY()-getY())));
        return distance;
    }

    //--------------------------------------------------------------
    // Returns the x-coordinate
    //--------------------------------------------------------------
    public double getX(){
        return xCoordinate;
    }

    //--------------------------------------------------------------
    // Sets up the value for the x-coordinate
    //--------------------------------------------------------------
    public void setX(double x){
        xCoordinate = x;
    }

    //--------------------------------------------------------------
    // Returns the y-coordinate
    //--------------------------------------------------------------
    public double getY(){
        return yCoordinate;
    }

    //--------------------------------------------------------------
    // Sets up the value for the y-coordinate
    //--------------------------------------------------------------
    public void setY(double y){
        yCoordinate = y;
    }


    //--------------------------------------------------------------
    // Sets up the value of the x-coordinate and the y-coordinate
    //--------------------------------------------------------------
    public void setPoint(double x, double y){
        xCoordinate = x;
        yCoordinate = y;
    }

    //--------------------------------------------------------------
    // Shifts the x-coordinate by n amount
    //--------------------------------------------------------------
    public void shiftX(double n){
        xCoordinate = xCoordinate + n;
    }

    //--------------------------------------------------------------
    // Shifts the y-coordinate by n amount
    //--------------------------------------------------------------
    public void shiftY(double n){
        yCoordinate = yCoordinate + n;
    }

    //--------------------------------------------------------------
    // Rotates the point by a specified angle around the origin
    //--------------------------------------------------------------
    public void rotate(double angle){
        xCoordinate = ((xCoordinate * Math.cos(angle)) - (yCoordinate * Math.sin(angle)));
        yCoordinate = ((xCoordinate * Math.sin(angle)) - (yCoordinate * Math.cos(angle)));
    }

    //--------------------------------------------------------------
    // Returns a description of the point
    //--------------------------------------------------------------
    public String toString(){
        return "Point{x = " + xCoordinate + ", y = " + yCoordinate + "}";
    }


}
