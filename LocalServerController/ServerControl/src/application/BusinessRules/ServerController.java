package application.BusinessRules;

public abstract class ServerController {
	private String serverName;
	private String serverCapacity;
	private String serverOS;
	private String serverAccount;
	public ServerController(String serverName, String serverCapacity, String serverOS,String serverAccount) {
		this.serverName=serverName;
		this.serverCapacity=serverCapacity;
		this.serverOS=serverOS;
		this.serverAccount=serverAccount;
	}
}