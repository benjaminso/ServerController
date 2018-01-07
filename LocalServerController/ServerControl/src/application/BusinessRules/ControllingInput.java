package application.BusinessRules;

public class ControllingInput {


	public ControllingInput() {
		
	}
	public void printDemo() {
		System.out.println("asdsad");
	}
	public void printDemo2() {
		System.out.println("asdsad");
	}
	
	public static void ValidateServerName(String serverName) {
		if(serverName==null || serverName.equals(""))
			throw new IllegalArgumentException("Error!ServerName");
	}
	public static void ValidateServerCapacity(String serverCapacity) {
		if(serverCapacity==null || serverCapacity.equals(""))
			throw new IllegalArgumentException("Error!Server Capacity");
	}
	public static void ValidateServerOS(String serverOS) {
		if(serverOS==null || serverOS.equals(""))
			throw new IllegalArgumentException("Error!Server OS");
	}
	public static void ValidateServerAccount(String serverACcount) {
		if(serverACcount==null || serverACcount.equals(""))
			throw new IllegalArgumentException("Error!Server Account");
	}
}
