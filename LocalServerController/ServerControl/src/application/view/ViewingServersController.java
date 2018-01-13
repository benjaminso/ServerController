package application.view;

import application.BusinessRules.ServerController;
import application.VirtualStorage.RetrievingandStoring;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewingServersController implements Initializable {

	@FXML 	private TableView<ServerController> tbView;
	@FXML	private TableColumn<ServerController, String>colType;
	@FXML	private TableColumn<ServerController, String>colCapacity;
	@FXML	private TableColumn<ServerController, String>colServerOS;
	@FXML	private TableColumn<ServerController, String>colServerAccount;
	@FXML 	private Label lbAccount,lbAlert;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1)  {
		colType.setCellValueFactory(new PropertyValueFactory<ServerController, String>("serverName"));
		colCapacity.setCellValueFactory(new PropertyValueFactory<ServerController, String>("serverCapacity"));
		colServerOS.setCellValueFactory(new PropertyValueFactory<ServerController, String>("serverOS"));
		colServerAccount.setCellValueFactory(new PropertyValueFactory<ServerController, String>("serverAccount"));
		tbView.setItems(returnObjects());
	}

	public void invisibleAccount() {
		lbAccount.setVisible(false);
	}
	
	public ObservableList<ServerController> returnObjects(){
		ServerController[]controlArray=new ServerController[RetrievingandStoring.getNumberOfServers()];
		for(int i=0;i<RetrievingandStoring.getNumberOfServers();i++) 
			controlArray[i]=new ServerController(RetrievingandStoring.returnArray()[i].getServerAccount(),RetrievingandStoring.returnArray()[i].getServerCapacity(),RetrievingandStoring.returnArray()[i].getServerOS(),RetrievingandStoring.returnArray()[i].getServerAccount());
		final ObservableList<ServerController> data2=FXCollections.observableArrayList(controlArray);
		return data2;
	}
}
