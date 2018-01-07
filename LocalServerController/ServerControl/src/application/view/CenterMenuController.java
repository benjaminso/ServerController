package application.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import application.BusinessRules.ControllingInput;;

public class CenterMenuController {

	@FXML private MenuItem item1;
	@FXML private MenuItem item2;
	@FXML private TextField txtServername,txtServerCapacity,txtServerOS,txtServerAccounts;
	@FXML private Button btnSubmit,btnClear;
	//@FXML private Label lbServerCapacity,lbAccount,lbOS,lbServerName;
	@FXML private Label lbAlertServer,lbAlertCapacity,lbAlertOS,lbAlertAccount;
	private static final String NASSIGN=null;
	ControllingInput validation=new ControllingInput();

	public void item1Action() {
		System.out.println("asdasdasds");
	}
	public void item2Action() {
		System.out.println("mothaiba");
	}
	public void submitAction() {
		// Server Name validation
		try {
			ControllingInput.ValidateServerName(txtServername.getText());
		}catch(IllegalArgumentException e) {
			if(e!=null) {
				//System.out.println("asdasdasd");
				lbAlertServer.setText("*");
			}
		}
		// ValidateServerCapacity
		try {
			ControllingInput.ValidateServerCapacity(txtServerCapacity.getText());
		}catch(IllegalArgumentException e) {
			if(e!=null) {
				//System.out.println("ValidateServerCapacity");
				lbAlertCapacity.setText("*");
			}
		}
		//	ValidateServerOS
		try {
			ControllingInput.ValidateServerOS(txtServerOS.getText());
		}catch(IllegalArgumentException e) {
			if(e!=null) {
				//System.out.println("ValidateServerOS");
				lbAlertOS.setText("*");
			}
		}
		//ValidateServerAccount
		try {
			ControllingInput.ValidateServerAccount(txtServerAccounts.getText());
		}catch(IllegalArgumentException e) {
			if(e!=null) {
				//System.out.println("ValidateServerAccount");
				lbAlertAccount.setText("*");
			}
		}
	}
	public void ClearAction() {
		lbAlertServer.setText(NASSIGN);
		lbAlertCapacity.setText(NASSIGN);
		lbAlertOS.setText(NASSIGN);
		lbAlertAccount.setText(NASSIGN);

		txtServername.setText(NASSIGN);
		txtServerCapacity.setText(NASSIGN);
		txtServerOS.setText(NASSIGN);
		txtServerAccounts.setText(NASSIGN);
	}
}
