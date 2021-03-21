package com.homework.ball;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x1 + width;
        this.y2 = y1 + height;
    }

    public float getX() {
        return x1;
    }
    public float getY() {
        return y1;
    }
    public int getWidth(){
        return x2 - x1;
    }
    public int getHeight(){
        return y2 - y1;
    }

    public boolean collider(Ball ball){
        boolean result;
        result = ball.getX() - ball.getRadius() >= this.x1 && ball.getX() + ball.getRadius() <= this.x2 &&
                 ball.getY() - ball.getRadius() >= this.y1 && ball.getY() + ball.getRadius() <= this.y2;
        return result;
    }
}
