import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class javaApplication extends Application {

    /*
    @Override
    public void init() throws Exception {
        System.out.println("Start");
        // Loading assets or pictures
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello World!");
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("End");
    }
    */

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    /*@Override
    public void start(Stage stage) throws Exception {
        Stage stage2 = new Stage();
        stage.setTitle("First Window");

        stage.show();



        stage2.setWidth(400);
        stage2.setHeight(300);


        //Allows for the window to be in the center of the screen
        int screenHalfWidth = 1920 / 2;
        int screenHalfHeight = 1080 / 2;
        int winHalfWidth = (int)(stage2.getWidth() / 2);
        int winHalfHeight = (int)(stage2.getHeight() / 2);



        stage2.setX(screenHalfWidth - winHalfWidth);
        stage2.setY(screenHalfHeight - winHalfHeight);


        stage2.setTitle("Second Window");
        stage2.show();

        //Modality
        //How they interact with each other

        Stage stage3 = new Stage();
        stage3.initStyle(StageStyle.UNIFIED);
        stage3.setTitle("Third Window");
        stage3.show();

        stage.toFront();
        */
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //@Override
    /*public void start(Stage stage) throws Exception {
        stage.setTitle("Window");
        stage.setHeight(500);
        stage.setWidth(500);

        VBox root = new VBox(); //parent node
        Scene scene1 = new Scene(root);
        Label label1 = new Label("This is a new label"); //child node in the chain
        Label label2 = new Label("And another label");
        //Labels
        //Buttons
        //Pictures
        root.getChildren().addAll(label1, label2);
        scene1.setCursor(Cursor.CROSSHAIR);
        stage.setScene(scene1);

        stage.show();
     }
     */

    //Playing around with different child nodes for the layout manager
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Window");
        stage.setWidth(500);
        stage.setHeight(500);

        VBox root = new VBox();
        Scene scene = new Scene(root);

        //Label labelOne = new Label("This is a text label");

        Image cat = new Image("/images/cool-cat.png");
        Image catTwo = new Image("/images/cool-cat-two.jpg");

        ImageView imageOne = new ImageView();
        imageOne.setFitHeight(200);
        imageOne.setFitWidth(200);

        ImageView imageTwo = new ImageView();
        imageTwo.setFitHeight(200);
        imageTwo.setFitWidth(200);

        imageOne.setImage(cat);
        imageTwo.setImage(catTwo);

        Label labelOne = new Label("This is a text label", imageOne);
        Label labelTwo = new Label("This is a cat!", imageTwo);
        labelOne.setTextFill(Color.web("#eb9e34"));
        labelTwo.setFont(new Font("Cambria", 35));
        labelTwo.setRotate(45);

        root.getChildren().addAll(labelTwo, labelOne);


        stage.setScene(scene);
        stage.show();
    }
}
