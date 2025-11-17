package examples;

public class Disease {

	private String name;
	private boolean curable;
	
	Disease(String title, boolean isCurable) {
		this.curable = isCurable;
		this.name = title;
	}

	/* SETTERS */

	public void setName(String name) {
		this.name = name;
	}

	public void setCurable(boolean curable) {
		this.curable = curable;
	}
	
	/* GETTERS 
	 * - Used when we want to access private member variables from outside the class
	*/
	
	public boolean isCurable() {
		return this.curable;
	}
	
	public String getName() {
		return this.name;
	}
	
}
