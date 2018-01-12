package application.view;
import application.VirtualStorage.RetrievingandStoring;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import application.BusinessRules.ControllingInput;
import application.BusinessRules.ServerController;

public class CenterMenuController  implements Initializable {

	@FXML private MenuItem item1;
	@FXML private MenuItem item2;
	@FXML private TextField txtServername,txtServerCapacity,txtServerOS,txtServerAccounts;
	@FXML private Button btnSubmit,btnClear;
	@FXML private ChoiceBox<String> choiceBox,CBox;
	@FXML private Label lbServerCapacity,lbAccount,lbOS,lbServerName,lbLanguage;
	@FXML private Label lbAlertServer,lbAlertCapacity,lbAlertOS,lbAlertAccount,lbAlertLanguage,lbPrintError,lbTotalErrors;
	// for reseting all values.
	private static final String NASSIGN=null;

	// calling validation class.
	ControllingInput validation=new ControllingInput();

	/*
	 * Submit Button action
	 * */
	public void submitAction() {
		if(validateServerName() && validateServerCapacity() && validateServerOS() && validateServerAccount() ) {
			if(ServerController.getNumberOfServers()<ServerController.MAXSERVERS) {
					RetrievingandStoring.assignValues(txtServername.getText(), txtServerCapacity.getText(), txtServerOS.getText(), txtServerAccounts.getText());
					ClearAction();
				}else 
					ViewErrorWindow.display(ServerController.MESSAGE);
		}
	}
	public boolean validateServerName() {
		boolean passAllValidation=true;
		try {
			ControllingInput.ValidateServerName(txtServername);
			lbAlertServer.setText(NASSIGN);
		}catch(IllegalArgumentException e) {
			if(e!=null) {
				lbAlertServer.setText("*");
				passAllValidation=false;
			}
		}
		return passAllValidation;
	}
	public boolean validateServerCapacity() {
		boolean passAllValidation=true;
		try {
			ControllingInput.ValidateServerCapacity(Integer.parseInt(txtServerCapacity.getText()));
			lbAlertCapacity.setText(NASSIGN);
		}catch(NumberFormatException e) {
			lbAlertCapacity.setText("*");
			passAllValidation=false;
		}
		catch(IllegalArgumentException e) {
			if(e!=null) {
				lbAlertCapacity.setText("*");
				passAllValidation=false;
			}
		}
		return passAllValidation;
	}
	public boolean validateServerOS() {
		boolean passAllValidation=true;
		try {
			ControllingInput.ValidateServerOS(txtServerOS);
			lbAlertOS.setText(NASSIGN); 
		}catch(IllegalArgumentException e) {
			if(e!=null) {
				lbAlertOS.setText("*");
				passAllValidation=false;
			}
		}
		return passAllValidation;
	}
	public boolean validateServerAccount() {
		boolean passAllValidation=true;
		try {
			ControllingInput.ValidateServerAccount(txtServerAccounts);
			lbAlertAccount.setText(NASSIGN);
		}catch(IllegalArgumentException e) {
			if(e!=null) {
				lbAlertAccount.setText("*");
				passAllValidation=false;
			}
		}
		return passAllValidation;
	}

	public void checkingAction() {
		System.out.println(RetrievingandStoring.servers[0].getServerName());
	}
	@Override
	/*
	 * Auto load the javafx
	 */
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.print("asdfasdf");
		ClearAction();
		Number value=0;
		choiceBox.setValue("File Server");
		SetInVisibleWebServer();
		choiceBox.getItems().addAll("File Server","Web Server");
		loadCheckbox(value);
		choiceBox.getSelectionModel().selectedIndexProperty().addListener((v, oldValue, newValue)->
		loadCheckbox(newValue));

	}
	public void loadCheckbox(Number newValue) {
		if(newValue.intValue()==1) {
			SetInVisibleFileServer();
			SetVisibleWebServer();
		}
		else {
			SetInVisibleWebServer();
			SetVisibleFileServer();
		}
	}

	/*
	 * set invisible for Account Server
	 */
	public void SetInVisibleFileServer() {
		lbAccount.setVisible(false);
		txtServerAccounts.setVisible(false);
		lbAlertAccount.setVisible(false);
	}
	/*
	 * set visible for Account Servers
	 */
	public void SetVisibleFileServer() {
		lbAccount.setVisible(true);
		txtServerAccounts.setVisible(true);
		lbAlertAccount.setVisible(true);
	}
	/*
	 * set invisible for Account Server
	 */
	public void SetInVisibleWebServer() {
		lbLanguage.setVisible(false);
		CBox.setVisible(false);
	}
	/*
	 * set visible for Account Servers
	 */
	public void SetVisibleWebServer() {
		lbLanguage.setVisible(true);
		CBox.setVisible(true);
	}

	/*
	 * Whenever hit the clear button, all textboxes and alert message will be cleared
	 */

	public void ClearAction() {
		lbAlertServer.setText(NASSIGN);
		lbAlertCapacity.setText(NASSIGN);
		lbAlertOS.setText(NASSIGN);
		lbAlertAccount.setText(NASSIGN);
		lbAlertLanguage.setText(NASSIGN);
		lbPrintError.setText(NASSIGN);
		lbTotalErrors.setText(NASSIGN);

		txtServername.setText(NASSIGN);
		txtServerCapacity.setText(NASSIGN);
		txtServerOS.setText(NASSIGN);
		txtServerAccounts.setText(NASSIGN);
	}

}
