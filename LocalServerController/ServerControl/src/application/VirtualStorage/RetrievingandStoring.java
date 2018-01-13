package application.VirtualStorage;
import application.BusinessRules.*;
import application.view.*;
public class RetrievingandStoring {
	public static final ServerController[] servers=new ServerController[ServerController.MAXSERVERS];
	public static int numberOfServers=0;
	
	public static void assignValues(String value1, String value2, String value3, String value4) {
		//int k=ServerController.getNumberOfServers();
		if(numberOfServers<ServerController.MAXSERVERS) {
			servers[numberOfServers]=new ServerController(value1, value2, value3, value4);
			numberOfServers++;
		}else
			ViewErrorWindow.display(ServerController.MESSAGE);
	}
	public static int getNumberOfServers() {
		return numberOfServers;
	}
	public static void setNumberOfServers(int numberOfServers) {
		RetrievingandStoring.numberOfServers = numberOfServers;
	}
	public static ServerController[] returnArray()
	{
		return servers;
	}
	public static String returnName() {
		return servers[0].getServerAccount();
	}
}
