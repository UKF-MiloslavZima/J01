package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.Glow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root,500,300);
        scene.setFill(Color.BLACK);

        Glow g = new Glow();
        g.setLevel(10);

        Line l1 = new Line(250,120,230,170);
        Line l2 = new Line(230,170,270,170);
        Line l3 = new Line(270,170,260,140);
        Line l4 = new Line(310,120,350,120);
        Line l5 = new Line(310,120,330,170);
        Line l6 = new Line(330,170,340,140);
        Line l7 = new Line(150,120,190,120);
        Line l8 = new Line(150,120,170,170);
        Line l9 = new Line(170,170,178,150);
        Line l10 = new Line(190,120,185,135);
        Line l11 = new Line(185,135,175,135);
        Line l12 = new Line(50,120,90,120);
        Line l13 = new Line(50,120,90,170);
        Line l14 = new Line(50,170,90,170);
        Line l15 = new Line(50,170,60,160);
        Line l16 = new Line(90,120,80,130);
        Line l17 = new Line(390,170,430,170);
        Line l18 = new Line(430,170,410,120);
        Line l19 = new Line(410,120,405,135);
        Line l20 = new Line(390,170,395,155);
        Line l21 = new Line(395,155,405,155);

        l1.setStroke(Color.RED);
        l1.setStrokeWidth(5);
        l1.setEffect(g);
        l2.setStroke(Color.RED);
        l2.setStrokeWidth(5);
        l2.setEffect(g);
        l3.setStroke(Color.RED);
        l3.setStrokeWidth(5);
        l3.setEffect(g);
        l4.setStroke(Color.GREEN);
        l4.setStrokeWidth(5);
        l4.setEffect(g);
        l5.setStroke(Color.GREEN);
        l5.setStrokeWidth(5);
        l5.setEffect(g);
        l6.setStroke(Color.GREEN);
        l6.setStrokeWidth(5);
        l6.setEffect(g);
        l7.setStroke(Color.YELLOW);
        l7.setStrokeWidth(5);
        l7.setEffect(g);
        l8.setStroke(Color.YELLOW);
        l8.setStrokeWidth(5);
        l8.setEffect(g);
        l9.setStroke(Color.YELLOW);
        l9.setStrokeWidth(5);
        l9.setEffect(g);
        l10.setStroke(Color.YELLOW);
        l10.setStrokeWidth(5);
        l10.setEffect(g);
        l11.setStroke(Color.YELLOW);
        l11.setStrokeWidth(5);
        l11.setEffect(g);
        l12.setStroke(Color.PURPLE);
        l12.setStrokeWidth(5);
        l12.setEffect(g);
        l13.setStroke(Color.PURPLE);
        l13.setStrokeWidth(5);
        l13.setEffect(g);
        l14.setStroke(Color.PURPLE);
        l14.setStrokeWidth(5);
        l14.setEffect(g);
        l15.setStroke(Color.PURPLE);
        l15.setStrokeWidth(5);
        l15.setEffect(g);
        l16.setStroke(Color.PURPLE);
        l16.setStrokeWidth(5);
        l16.setEffect(g);
        l17.setStroke(Color.AQUA);
        l17.setStrokeWidth(5);
        l17.setEffect(g);
        l18.setStroke(Color.AQUA);
        l18.setStrokeWidth(5);
        l18.setEffect(g);
        l19.setStroke(Color.AQUA);
        l19.setStrokeWidth(5);
        l19.setEffect(g);
        l20.setStroke(Color.AQUA);
        l20.setStrokeWidth(5);
        l20.setEffect(g);
        l21.setStroke(Color.AQUA);
        l21.setStrokeWidth(5);
        l21.setEffect(g);

        root.getChildren().addAll(l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21);

        primaryStage.setTitle("Witcher");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
