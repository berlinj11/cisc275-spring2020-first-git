package pacc;

public class Dog extends Animal {
	
	public Dog(String n, int l) {
		super(n,l);
	}
		
	public String toString() {
		return name + ", " + legs;
	}
	
		
}
