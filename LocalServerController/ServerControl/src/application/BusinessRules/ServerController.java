package application.BusinessRules;

public class ServerController {
	private String serverName;
	private String serverCapacity;
	private String serverOS;
	private String serverAccount;
	public static final int MAXSERVERS=10;
	public static final String MESSAGE="Error! Allow to add up to 10 servers! Thank You";
	public ServerController(String serverName, String serverCapacity, String serverOS,String serverAccount) {
		this.serverName=serverName;
		this.serverCapacity=serverCapacity;
		this.serverOS=serverOS;
		this.serverAccount=serverAccount;
	}
	public String getServerCapacity() {
		return this.serverCapacity;
	}
	public void setServerCapacity(String serverCapacity) {
		this.serverCapacity = serverCapacity;
	}
	public String getServerOS() {
		return this.serverOS;
	}
	public void setServerOS(String serverOS) {
		this.serverOS = serverOS;
	}
	public String getServerAccount() {
		return this.serverAccount;
	}
	public void setServerAccount(String serverAccount) {
		this.serverAccount = serverAccount;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getServerName() {
		return this.serverName;
	}
}