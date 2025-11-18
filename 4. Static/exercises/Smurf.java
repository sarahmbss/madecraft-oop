package exercises;

import java.util.HashSet;
import java.util.Set;

public class Smurf {

	private String name;
	private static Set<String> usedNames = new HashSet<>();

	public static Smurf createSmurf(String name) {
		if (usedNames.contains(name)) {
			System.out.println("Smurf with name " + name + " already exists! Choose a different name.");
			return null;
		}
		System.out.println("Creating " + name + " Smurf");
		usedNames.add(name);
		return new Smurf(name);
	}

	private Smurf(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

}
