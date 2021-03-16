package hero;

public class Hero {
	private String username;
	private int level;
	public Hero(String username, int level) {
		super();
		this.username = username;
		this.level = level;
	}
	public String getUsername() {
		return username;
	}
	
	public int getLevel() {
		return level;
	}
	
	public String toString() {
	    return String.format("Type: %s Username: %s Level: %s",
	            this.getClass().getName(),
	            this.getUsername(),
	            this.getLevel());
	}

}
