package projektplanner.app;

public class SuperUser extends User {

	public SuperUser(String ID, String name) {
		super(ID, name);
	}

	public boolean isSuperUser() { return true; }
}
