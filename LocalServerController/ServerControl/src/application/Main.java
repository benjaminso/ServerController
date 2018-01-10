package application;

import application.view.ViewErrorWindow;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	private Stage  window;
	private static BorderPane mainLayout;
	@Override
	public void start(Stage primaryStage) {
		this.window=primaryStage;
		this.window.setTitle("Server Controller_Demo_Version");
		ShowMainView();
		ShowLeftMenu();
	}

	private void ShowMainView() {
		try {
			mainLayout  = (BorderPane)FXMLLoader.load(getClass().getResource("./view/Sample.fxml"));
			Scene scene = new Scene(mainLayout,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//mainLayout.setRight(null);
			this.window.setScene(scene);
			this.window.show();
		} catch(Exception e) {
			ViewErrorWindow.display("Loading Process Error!! (main-line 24)");
		}
	}

	private void ShowLeftMenu() {
		try {
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation(Main.class.getResource("./view/LeftMenu.fxml"));
			AnchorPane mainMenu;
			mainMenu = loader.load();
			mainLayout.setLeft(mainMenu);
		}catch(Exception e) {
			ViewErrorWindow.display("Loading Process Error!! (main-line 37)");
		}
	}

	public static void ShowCenterMenu() {
		try {
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation(Main.class.getResource("./view/CenterMenu.fxml"));
			AnchorPane mainMenu;
			mainMenu = loader.load();
			mainLayout.setCenter(mainMenu);
		}catch(Exception e) {
			ViewErrorWindow.display("Loading Process Error!! (main-line 50)");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
