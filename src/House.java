/**
 * Created by surajpatel on 3/2/15.
 */


import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.*;


public class House extends Application {


    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        // Create a pane to hold the circle

        // Create a circle and set its properties
        Rectangle r = new Rectangle();
        r.setX(200);
        r.setY(200);
        r.setWidth(300);
        r.setHeight(300);

        pane.getChildren().add(r);
        r.setFill(Color.RED);
        r.setStroke(Color.BLACK);



        Rectangle r1 = new Rectangle();
        r1.setX(330);
        r1.setY(420);
        r1.setWidth(50);
        r1.setHeight(80);
        pane.getChildren().add(r1);
        r1.setFill(Color.BLACK);
        r1.setStroke(Color.BLACK);


        Circle circle1 = new Circle();
        circle1.setCenterX(335.0f);
        circle1.setCenterY(460.0f);
        circle1.setRadius(05.0f);
        pane.getChildren().add(circle1);
        circle1.setFill(Color.RED);
        circle1.setStroke(Color.RED);


        Rectangle r2 = new Rectangle();
        r2.setX(250);
        r2.setY(250);
        r2.setWidth(50);
        r2.setHeight(50);
        pane.getChildren().add(r2);
        r2.setFill(Color.BLACK);
        r2.setStroke(Color.BLACK);





        Polygon polygon = new Polygon();
        pane.getChildren().add(polygon);
        polygon.setFill(Color.YELLOW);
        polygon.setStroke(Color.BLUE);
        ObservableList<Double> list = polygon.getPoints();
        polygon.getPoints().addAll(new Double[]{
                200.0, 200.0, 500.0,
                    200.0, 350.0, 0.0

        });

        Circle circle = new Circle();
        circle.setCenterX(350.0f);
        circle.setCenterY(130.0f);
        circle.setRadius(40.0f);
        pane.getChildren().add(circle);
        circle.setFill(Color.ORANGE);
        circle.setStroke(Color.BLACK);


        Circle circle2 = new Circle();
        circle2.setCenterX(600.0f);
        circle2.setCenterY(100.0f);
        circle2.setRadius(30.0f);
        pane.getChildren().add(circle2);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.WHITE);

        Circle circle3 = new Circle();
        circle3.setCenterX(575.0f);
        circle3.setCenterY(100.0f);
        circle3.setRadius(30.0f);
        pane.getChildren().add(circle3);
        circle3.setFill(Color.WHITE);
        circle3.setStroke(Color.WHITE);

        Circle circle23 = new Circle();
        circle23.setCenterX(555.0f);
        circle23.setCenterY(100.0f);
        circle23.setRadius(30.0f);
        pane.getChildren().add(circle23);
        circle23.setFill(Color.WHITE);
        circle23.setStroke(Color.WHITE);



        Rectangle r3 = new Rectangle();
        r3.setX(0);
        r3.setY(500);
        r3.heightProperty().bind(pane.heightProperty());
        r3.widthProperty().bind(pane.widthProperty());
        pane.getChildren().add(r3);
        r3.setFill(Color.GREEN);
        r3.setStroke(Color.GREEN);



        Scene scene = new Scene(pane, 600, 600);
        scene.setFill(Color.SKYBLUE);
        primaryStage.setTitle("ShowRectangleCentered"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
