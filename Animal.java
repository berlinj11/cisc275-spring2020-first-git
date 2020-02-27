package pacc;

import java.util.*;

public class Animal extends MyCompare3{
	
	public String name;
	
	public int legs;
	
	public Animal(String n, int l) {
		name = n; legs = l;
	}

	public int getLegs() {
		
		return this.legs;
	}
}
	
	