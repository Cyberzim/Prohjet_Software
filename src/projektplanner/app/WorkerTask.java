package projektplanner.app;

public class WorkerTask 
{	
	// Fields
	User user;
	int hours;
	
	// Constructor
	public WorkerTask (User user, int hours){
		this.user = user;
		this.hours = hours;
	}
	
	public User getUser() { return user; }
	
	public int getHours() { return hours; }
}