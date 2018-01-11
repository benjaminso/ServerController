package application.view;

import java.io.IOException;

import application.Main;

public class LeftMenuController {

	//private Button btnAdd;
	private Main main;
	@SuppressWarnings("static-access")
	public void btnAddFunction() throws IOException {
		main.ShowCenterMenu();
	}
	@SuppressWarnings("static-access")
	public void btnViewFunction() throws IOException{
		main.ShowViewingCenter();
	}
}
