//I worked on the homework assignment alone, using only course materials.
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import java.util.ArrayList;
import java.util.Collections;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.io.File;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.shape.Circle;


/**
 * Class to build a GUI using JAVAFX
 * @author Jeet Tushar Bhatkar
 * @version 1.0
 */
public class StarterUpper extends Application {

    private TextField textbutton1;
    private TextField textbutton2;
    private TextField textbutton3;
    private TextField textbutton4;
    private TextField textbutton5;
    private TextField textbutton6;
    private TextField textbutton7;
    private Label l1;
    private Label l2;
    private Label l3;
    private Label l4;
    private Label l5;
    private Label l6;
    private Label l7;
    private ArrayList<StartUpIdea> l = new ArrayList<>();
    private File f = new File("ideas.txt");
    //private GridPane root;

/**
 * Main method
 * @param args  line input
 */
    public static void main(String[] args) {
        launch(args);
    }

/**
 * Start
 * @param mainStage stage
 */
    public void start(Stage mainStage) throws FileNotFoundException {
        mainStage.setTitle("Problem Ideation Form");
        Label name = new Label("Jeet Bhatkar");
        name.setTextFill(Color.BLUE);
              //Drawing a Circle
        Circle circle = new Circle();

      //Setting the properties of the circle
        circle.setCenterX(300.0f);
        circle.setCenterY(180.0f);
        circle.setRadius(90.0f);

      //Setting color to the circle
        circle.setFill(Color.DARKRED);

        textbutton1 = new TextField();
        textbutton2 = new TextField();
        textbutton3 = new TextField();
        textbutton4 = new TextField();
        textbutton5 = new TextField();
        textbutton6 = new TextField();
        textbutton7 = new TextField();
        l1 = new Label("What is the probem?");
        l2 = new Label("Who is the target customer?");
        l3 = new Label("How badly does the customer NEED this problem fixed (1-10)?");
        l4 = new Label("How many people do you know who might experience this problem?");
        l5 = new Label("How big is the target market?");
        l6 = new Label("Who are the competitors/existing solutions?");
        l7 = new Label("How effective do you think this idea is? (1-10)?");


        Image image = new Image(new FileInputStream("Start-Up.jpeg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(150);
        imageView.setFitWidth(150);

        Button bt1 = new Button();
        bt1.setText("Add Start up Idea");
        bt1.setOnAction(new EventHandler<ActionEvent>() {
            /**
             * @param event event
             * @throws IllegalArgumentException for illegal inputs
             */
            public void handle(ActionEvent event) throws IllegalArgumentException {
                try {
                    if (textbutton1.getText() == null || textbutton2.getText() == null
                        || textbutton3.getText() == null || textbutton4.getText() == null
                            || textbutton5.getText() == null || textbutton6.getText() == null
                            || textbutton7.getText() == null) {
                        throw new IllegalArgumentException("No null fields are permitted");
                    }
                    String problem = textbutton1.getText();
                    String target = textbutton2.getText();
                    int need = Integer.parseInt(textbutton3.getText());
                    if (need > 10 || need < 0) {
                        throw new IllegalArgumentException("Customer need should be within 1-10");
                    }
                    int numPeople = Integer.parseInt(textbutton4.getText());
                    int marketSize = Integer.parseInt(textbutton5.getText());
                    String comp = textbutton6.getText();
                    int effect = Integer.parseInt(textbutton7.getText());
                    if (effect > 10 || effect < 0) {
                        throw new IllegalArgumentException("Effectiveness rating should be within 1-10");
                    }
                    if ((numPeople < 0 || marketSize < 0)) {
                        throw new IllegalArgumentException("No negative inputs available");
                    }
                    StartUpIdea s1 = new StartUpIdea(problem, target, need, numPeople, marketSize, comp, effect);
                    l.add(s1);
                } catch (IllegalArgumentException e) {
                    Alert a = new Alert(AlertType.ERROR);
                    a.setContentText(e.getMessage());
                    a.show();
                } finally {
                    textbutton1.clear();
                    textbutton2.clear();
                    textbutton3.clear();
                    textbutton4.clear();
                    textbutton5.clear();
                    textbutton6.clear();
                    textbutton7.clear();
                }
            }
        });

        Button bt2 = new Button();
        bt2.setText("Sort Ideas");
        bt2.setOnAction((ActionEvent e) -> {
                Collections.sort(l);
            });

        Button bt3 = new Button();
        bt3.setText("Reset");
        bt3.setOnAction(new EventHandler<ActionEvent>() {
            /**
             * handle event
             * @param event event
             */
            public void handle(ActionEvent event) {
                Alert a = new Alert(AlertType.CONFIRMATION, "Are you sure?");
                a.show();
                l.clear();
                textbutton1.clear();
                textbutton2.clear();
                textbutton3.clear();
                textbutton4.clear();
                textbutton5.clear();
                textbutton6.clear();
                textbutton7.clear();
                if (f != null) {
                    f.delete();
                }
            }
        });

        Button bt4 = new Button();
        bt4.setText("Save to file");
        bt4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                FileUtil.saveIdeasToFile(l, f);
            }
        });


        GridPane root = new GridPane();
        root.add(name, 75, 0);
        root.add(textbutton1, 1, 1);
        root.add(textbutton2, 1, 2);
        root.add(textbutton3, 1, 3);
        root.add(textbutton4, 1, 4);
        root.add(textbutton5, 1, 5);
        root.add(textbutton6, 1, 6);
        root.add(textbutton7, 1, 7);
        root.add(l1, 0, 1);
        root.add(l2, 0, 2);
        root.add(l3, 0, 3);
        root.add(l4, 0, 4);
        root.add(l5, 0, 5);
        root.add(l6, 0, 6);
        root.add(l7, 0, 7);
        root.add(bt1, 1, 9);
        root.add(bt2, 1, 10);
        root.add(bt3, 1, 11);
        root.add(bt4, 1, 12);
        root.add(imageView, 1, 15);

        Scene scene = new Scene(root, 1000, 500);
        mainStage.setScene(scene);
        mainStage.show();
    }

}