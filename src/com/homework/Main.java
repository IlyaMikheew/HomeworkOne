package com.homework;

import com.homework.ball.Ball;
import com.homework.ball.Container;
import com.homework.books.Author;
import com.homework.books.Book;
import com.homework.figures.Circle;
import com.homework.figures.MyPoint;
import com.homework.figures.MyTriangle;
import com.homework.figures.Rectangle;
import com.homework.mymath.MyComplex;
import com.homework.mymath.MyPolynomial;
import com.homework.work.Employee;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------Circle----------");
        Circle circle = new Circle(6, "blue");
        System.out.println("Circle area = " + circle.getArea());

        System.out.println("----------Rectangle----------");
        Rectangle rectangle = new Rectangle(3.0f, 5.0f);
        System.out.println("Area = " + rectangle.getArea() + ", Perimeter = " + rectangle.getPerimeter());

        System.out.println("----------Employee----------");
        Employee employee = new Employee(1, "Ivan", "Smirnov", 100);
        System.out.println("New salary = "+ employee.raiseSalary(10));
        System.out.println(employee);

        System.out.println("----------Book----------");
        Author[] authors = {new Author("Ivan", "example@mail", 'm'),
                            new Author("Yana", "example2@mail", 'f')};
        Book book = new Book("Book", authors, 150.0, 3);
        System.out.println("Authors = " + book.getAuthorNames());

        System.out.println("----------MyPoint----------");
        MyPoint point1 = new MyPoint(-1,0);
        MyPoint point2 = new MyPoint(0,2);
        MyPoint point3 = new MyPoint(1,0);
        System.out.println("Distance from point1 to point2 = " + point1.distance(point2));

        System.out.println("----------MyTriangle----------");
        MyTriangle triangle = new MyTriangle(point1, point2, point3);
        System.out.println("Perimeter = " + triangle.getPerimeter() + " type = " + triangle.getType());

        System.out.println("----------MyComplex----------");
        MyComplex c1 = new MyComplex(1, 3);
        MyComplex c2 = new MyComplex(-2, 1);
        MyComplex c3;

        c3 = c1.addNew(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
        c3 = c1.subtractNew(c2);
        System.out.println(c1 + " - " + c2 + " = " + c3);
        System.out.println(c1 + " * " + c2 + " = " + c1.multiply(c2));
        System.out.println(c1 + " / " + c2 + " = " + c1.divide(c2));
        System.out.println("Argument " + c1 + "=" + c1.argument());
        System.out.println("Magnitude " + c1 + "=" + c1.magnitude());

        System.out.println("----------MyPolynomial----------");
        MyPolynomial polynomial1 = new MyPolynomial(1, 4, 5, 9);
        MyPolynomial polynomial2 = new MyPolynomial(0, 1, 3);
        System.out.println(polynomial1 + " for x = 2 is " + polynomial1.evaluate(2));
        System.out.println("( " + polynomial1 + " ) + ( " + polynomial2 + " ) = " + polynomial1.add(polynomial2));
        System.out.println("( " + polynomial1 + " ) * ( " + polynomial2 + " ) = " + polynomial1.multiply(polynomial2));

        System.out.println("----------Ball----------");
        Ball ball = new Ball(5,5,1,3,180);
        Container container = new Container(0, 0, 10, 10);
        System.out.println("Ball coords = " + ball);
        System.out.println("is the ball in container? - " + container.collider(ball));
        ball.move();
        System.out.println("Ball coords = " + ball);
        System.out.println("is the ball in container? - " + container.collider(ball));
        ball.move();
        System.out.println("Ball coords = " + ball);
        System.out.println("is the ball in container? - " + container.collider(ball));
    }
}
