package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        TextField tf = new TextField();
        Button btn = new Button("OK");
        btn.setLayoutX(150);
        Label l = new Label();
        l.setLayoutY(50);
        l.setFont(Font.font("Arial", 30));
        String text = tf.getText();
        l.setText(text);
        Scene scene = new Scene(root,300,300);
        btn.setOnAction(e -> {
            String text2 = tf.getText();
            int dlzka = text2.length();
            int pocetsamo = 0;
            int pocetspolu = 0;
            for(int i = 0 ; i < dlzka; i++){
                if(text2.charAt(i)=='a'||text2.charAt(i)=='e'||text2.charAt(i)=='i'||text2.charAt(i)=='o'||text2.charAt(i)=='u'||text2.charAt(i)=='y'){
                    pocetsamo++;
                } else pocetspolu++;
            }
            int r = pocetsamo*16;
            int g = pocetspolu*24;
            int b = (dlzka%25)*10;
            Color c = Color.rgb(r,g,b);
            scene.setFill(c);
            l.setText(tf.getText());
        });
        root.getChildren().addAll(tf,btn,l);
        primaryStage.setTitle("Text Color");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
