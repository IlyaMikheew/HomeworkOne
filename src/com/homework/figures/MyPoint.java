package com.homework.figures;

public class MyPoint {
    private double x = 0.0;
    private double y = 0.0;

    public MyPoint() {
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public double[] getXY(){
        return new double[]{x, y};
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ',' + y + ")";
    }

    public double distance(double x, double y){
        return Math.sqrt(Math.pow(x - this.x, 2) +
                         Math.pow(y - this.y, 2));
    }

    public double distance(MyPoint point){
        double x = point.getX();
        double y = point.getY();
        return distance(x, y);
    }

    public double distance() {
        return Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2) );
    }
}
