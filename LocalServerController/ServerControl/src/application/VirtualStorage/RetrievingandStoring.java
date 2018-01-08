package application.VirtualStorage;
import application.BusinessRules.ControllingInput;
import application.BusinessRules.ServerController;;

public class RetrievingandStoring {
	private static final ServerController[] servers=new ServerController[3];
	public static void assignValues(String value1, String value2, String value3, String value4) {
		servers[0]=new ServerController(value1, value2, value3, value4);
	}
	//public static void 
	
}
