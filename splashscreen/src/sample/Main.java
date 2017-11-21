package sample;
//troll
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
//troll
public class Main extends Application {
	//troll
    Stage stage;
  //troll
    @Override
    public void start(Stage primaryStage) throws Exception{
    	//troll
        this.stage=primaryStage;
      //troll
        MainWindow();
      //troll
    }
  //troll
    private void MainWindow() {
    	//troll
        try {
        	//troll
        	FXMLLoader loader=new FXMLLoader(getClass().getResource("sample.fxml"));
            AnchorPane pane=loader.load();
            Controller controller=loader.getController();
            controller.main(stage,this);
            Scene scene=new Scene(pane);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
          //troll
        }catch (Exception e){
            e.printStackTrace();
        }
      //troll
    }
  //troll
    public void closeStage(){
        stage.close();
    }
  //troll
  //troll
    public static void main(String[] args) {
        launch(args);
    }
}
