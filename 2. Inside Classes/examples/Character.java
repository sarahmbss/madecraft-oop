package examples;

public class Character {

	private String name;
	private String species;

	public Character(String name, String species) {
		/* this.name = a member variable associated with the class
		   name = a parameter passed into the constructor, only lives for the life
				  of the constructor */
		this.name = name;
		this.species = species;
	}

	/* new calls the constructor to create an instance of Character */
	Character bilbo = new Character("Bilbo", "Hobbit"); 
	Character legolas = new Character("Legolas", "Elf");

}
