package application.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;

import java.awt.TextField;
import java.awt.event.ActionListener;
import application.BusinessRules.ControllingInput;;

public class CenterMenuController {
	@FXML
	private MenuItem item1;
	private MenuItem item2;
	private TextField txtServername;
	private Button btnSubmit;
	private Label lbText;
	ControllingInput validation=new ControllingInput();

	public void item1Action() {
			System.out.println("asdasdasds");
	}
	public void item2Action() {
		System.out.println("mothaiba");
	}
	public void submitAction() {
		System.out.println("submit");
		validation.printDemo();
	}
}
