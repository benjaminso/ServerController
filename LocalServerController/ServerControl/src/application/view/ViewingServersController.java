package application.view;

import application.VirtualStorage.RetrievingandStoring;;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewingServersController implements Initializable {

	@FXML 	private TableView<model> tbView;
	@FXML	private TableColumn<model, String>colServerName;
	@FXML	private TableColumn<model, String>colServerOS;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
