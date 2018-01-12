package application.view;

import application.BusinessRules.ServerController;
import application.VirtualStorage.RetrievingandStoring;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewingServersController implements Initializable {

	@FXML 	private TableView<RetrievingandStoring> tbView;
	@FXML	private TableColumn<RetrievingandStoring, String>colType;
	@FXML	private TableColumn<RetrievingandStoring, String>colCapacity;
	@FXML	private TableColumn<RetrievingandStoring, String>colServerOS;
	@FXML	private TableColumn<RetrievingandStoring, String>colServerAccount;
	@FXML 	private Label lbAccount,lbAlert;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1)  {
		int counter=ServerController.getNumberOfServers();
		
		for(int i=0;i<ServerController.getNumberOfServers();i++) {
			colType.setCellValueFactory(new PropertyValueFactory<RetrievingandStoring, String>(RetrievingandStoring.servers[i].getServerAccount()));
		}
		/*colType.setCellValueFactory(new PropertyValueFactory<ServerController, String>("serverName"));
		colCapacity.setCellValueFactory(new PropertyValueFactory<ServerController, String>("serverCapacity"));
		colServerOS.setCellValueFactory(new PropertyValueFactory<ServerController, String>("serverOS"));
		colServerAccount.setCellValueFactory(new PropertyValueFactory<ServerController, String>("serverAccount"));
		tbView.setItems(returnObjects());*/
		//invisibleAccount();
	}

	public void invisibleAccount() {
		lbAccount.setVisible(false);
	}
	
	/*public ObservableList<ServerController> returnObjects(){
		ServerController[]controlArray=new ServerController[ServerController.getNumberOfServers()];
		for(int i=0;i<ServerController.getNumberOfServers();i++) {
			String t=RetrievingandStoring.returnArray()[i].getServerAccount();
			System.out.println(RetrievingandStoring.returnArray()[i].getServerAccount());
			//controlArray[i]=new ServerController(RetrievingandStoring.returnArray()[i].getServerAccount(),RetrievingandStoring.returnArray()[i].getServerCapacity(),RetrievingandStoring.returnArray()[i].getServerOS(),RetrievingandStoring.returnArray()[i].getServerAccount());
		}
		//System.out.println(ServerController.getNumberOfServers());
		controlArray[0]=new ServerController(RetrievingandStoring.returnArray()[1].getServerAccount(),RetrievingandStoring.returnArray()[1].getServerAccount(),RetrievingandStoring.returnArray()[1].getServerAccount(),RetrievingandStoring.returnArray()[1].getServerAccount());
		final ObservableList<ServerController> data2=FXCollections.observableArrayList(controlArray);
		return data2;
	}*/
}
