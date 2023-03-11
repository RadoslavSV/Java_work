package geometry;

import javafx.scene.Group;
import javafx.scene.paint.Color;

public class Rectangle {
    private Point uPoint; // upper left corner
    private double width;
    private double height;

    public Rectangle(Point uPoint, double width, double height) {
        setuPoint(uPoint);
        setWidth(width);
        setHeight(height);
    }

    public Rectangle() {
        this(new Point(), 10, 10);
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.getuPoint(), rectangle.getWidth(), rectangle.getHeight());
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public Point getuPoint() {
        return new Point(uPoint);
    }

    public void setuPoint(Point uPoint) {
        if(uPoint!=null) {
            this.uPoint = new Point(uPoint);
        } else {
            this.uPoint = new Point();
        }
    }

    public void setWidth(double width) {
        if(width>0) {
            this.width = width;
        } else {
            this.width = 10;
        }
    }

    public void setHeight(double height) {
        if(height>0) {
            this.height = height;
        } else {
            this.height = 10;
        }
    }

    public void draw(Group pane) {
        javafx.scene.shape.Rectangle rectangle = new javafx.scene.shape.Rectangle(uPoint.getCoords()[0], uPoint.getCoords()[1],
                width, height);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(3);
        rectangle.setFill(Color.TRANSPARENT);
        pane.getChildren().add(rectangle);
    }

    @Override
    public String toString() {
        return String.format("Rectangle with upper left point %s," +
                             " width: %.2f, height: %.2f", uPoint.toString(), width, height);
    }
}
