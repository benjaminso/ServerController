package application.VirtualStorage;
import application.BusinessRules.*;
import application.view.*;

public class RetrievingandStoring {
	public static final ServerController[] servers=new ServerController[ServerController.MAXSERVERS];
	public static void assignValues(String value1, String value2, String value3, String value4) {
		if(ServerController.getNumberOfServers()<ServerController.MAXSERVERS)
			servers[ServerController.getNumberOfServers()-1]=new ServerController(value1, value2, value3, value4);
		else
			ViewErrorWindow.display(ServerController.MESSAGE);
	}
	/*public static String toString() {
		return servers[0].getServerName();
	} */
}
