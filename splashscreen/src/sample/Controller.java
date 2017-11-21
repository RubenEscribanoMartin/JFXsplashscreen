package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Controller implements Initializable {
//troll
	@FXML
	private Label logoLabel;
	//troll
	@FXML
	private Pane spinnerPane;
	//troll
	@FXML
	private AnchorPane rootPane;
	//troll
	@FXML
	private Label helloLabel;
	//troll
	@FXML
	private Label nameLabel;
	//troll
	Main main;
	Stage stage;
	//troll
	public void main(Stage stage, Main main) {
		this.main = main;
		this.stage = stage;
	}
	//troll
	public void showMenu() {
		try {
			// Load the fxml file and create a new stage for the popup.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("menu.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage sendStage = new Stage();
			sendStage.setTitle("Main Menu");
			Scene scene=new Scene(page);
			sendStage.setScene(scene);
//			sendStage.setMaximized(true);
			sendStage.show();
			System.out.println("second stage ok");
			//troll
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//troll
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//troll
		TranslateTransition translateTransition = new TranslateTransition(
				Duration.seconds(0.5), logoLabel);
		translateTransition.setByY(700);
		translateTransition.play();
		//troll
		TranslateTransition translateTransition0 = new TranslateTransition(
				Duration.seconds(0.5), nameLabel);
		translateTransition0.setByY(700);
		translateTransition0.play();
		//troll
		TranslateTransition translateTransition00 = new TranslateTransition(
				Duration.seconds(0.5), helloLabel);
		translateTransition00.setByY(700);
		translateTransition00.play();
		//troll
		translateTransition
				.setOnFinished(event -> {
					TranslateTransition translateTransition1 = new TranslateTransition(
							Duration.seconds(1), logoLabel);
					translateTransition1.setByY(-700);
					translateTransition1.play();
					//troll
					translateTransition1.setOnFinished(event1 -> {
						//troll
						nameLabel.setVisible(true);
						//troll
						TranslateTransition translateTransition11 = new TranslateTransition(
								Duration.seconds(1), nameLabel);
						translateTransition11.setByY(-700);
						translateTransition11.play();
						//troll
						translateTransition11.setOnFinished(event2 -> {
							//troll
							helloLabel.setVisible(true);
							TranslateTransition translateTransition111 = new TranslateTransition(
									Duration.seconds(1), helloLabel);
							translateTransition111.setByY(-700);
							translateTransition111.play();
							//troll
							translateTransition111.setOnFinished(event3 -> {
								spinnerPane.setVisible(true);
								//troll
								FadeTransition fadeTransition = new FadeTransition(
										Duration.seconds(1), spinnerPane);
								fadeTransition.setFromValue(0);
								fadeTransition.setToValue(1);
								fadeTransition.play();
								//troll
								fadeTransition.setOnFinished(event4 -> {
									//troll
									FadeTransition fadeTransition1 = new FadeTransition(
											Duration.seconds(1), rootPane);
									fadeTransition1.setFromValue(1);
									fadeTransition1.setToValue(0.1);
									fadeTransition1.play();
									//troll
									fadeTransition1.setOnFinished(event5 -> {
										main.closeStage();
										showMenu();
										System.out
												.println("------- splash screen is closed --------");
									});
									//troll
								});
								//troll
							});
							//troll
						});
					});
					//troll
				});
		//troll
	}
}
