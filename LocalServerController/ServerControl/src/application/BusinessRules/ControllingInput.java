package application.BusinessRules;

import javafx.scene.control.TextField;

public class ControllingInput {
	private static final int MINCAP=0;
	//private Label serverName,serverCapacity, serverOS, server account;
	public ControllingInput() {
		
	}
	public static void ValidateServerName(TextField serverName) {
		if(serverName.getText()==null || serverName.getText().isEmpty())
			throw new IllegalArgumentException("Error!ServerName");
	}
	public static void ValidateServerCapacity(int serverCapacity) {
		if(serverCapacity<MINCAP)
			throw new IllegalArgumentException("Error!Server Capacity must larger than 0");
	}
	public static void ValidateServerOS(TextField serverOS) {
		if(serverOS.getText()==null || serverOS.getText().isEmpty())
			throw new IllegalArgumentException("Error!Server OS");
	}
	public static void ValidateServerAccount(TextField serverAccount) {
		if(serverAccount.getText()==null || serverAccount.getText().isEmpty())
			throw new IllegalArgumentException("Error!Server Account");
	}
}
