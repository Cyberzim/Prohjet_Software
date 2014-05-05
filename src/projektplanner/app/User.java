package projektplanner.app;
public class User 
{
	private String ID;
	private String name;
	private int nomHours;
	//private ArrayList<Project> lProjects;
	//private ArrayList<Event> lEvents;
	
	public User(String ID, String name)
	{
		this.ID = ID;
		this.name = name;
	}
	
	public String getID() { return ID; }
	
	public String getName() { return name; }
	
	public void setID(String ID) { this.ID = ID; }
	
	public int getNominatedHours() { return nomHours; }
	
	public void setNominatedHours(int nomHours) { this.nomHours = nomHours; }
	
	public boolean isSuperUser() { return false; }
}
