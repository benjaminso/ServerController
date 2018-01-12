package application.VirtualStorage;
import application.BusinessRules.*;
import application.view.*;
public class RetrievingandStoring {
	public static final ServerController[] servers=new ServerController[ServerController.MAXSERVERS];
	public static void assignValues(String value1, String value2, String value3, String value4) {
		//int k=ServerController.getNumberOfServers();
		if(ServerController.getNumberOfServers()<ServerController.MAXSERVERS)
			servers[ServerController.getNumberOfServers()]=new ServerController(value1, value2, value3, value4);
		else
			ViewErrorWindow.display(ServerController.MESSAGE);
	}
	public static ServerController[] returnArray()
	{
		return servers;
	}
	public static String returnName() {
		return servers[0].getServerAccount();
	}
}
