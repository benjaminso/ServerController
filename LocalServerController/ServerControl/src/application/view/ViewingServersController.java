package application.view;

import application.BusinessRules.ServerController;
import application.VirtualStorage.RetrievingandStoring;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewingServersController implements Initializable {

	@FXML 	private TableView<RetrievingandStoring> tbView;
	@FXML	private TableColumn<RetrievingandStoring, String>colType;
	@FXML	private TableColumn<RetrievingandStoring, String>colName;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		/*final ObservableList<RetrievingandStoring> data=FXCollections.observableArrayList(RetrievingandStoring.returnArray());
		colType.setCellValueFactory(new PropertyValueFactory<RetrievingandStoring, String>("value1"));
		colName.setCellValueFactory(new PropertyValueFactory<RetrievingandStoring, String>("value2"));
		tbView.setItems(data);*/
		System.out.println(RetrievingandStoring.servers[0].getServerAccount());
	}

}
