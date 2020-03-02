package hero;

import java.util.Collection;
import java.util.Stack;

public class EngGame {

	public static void main(String[] args) {

//		Hero hero = new Hero();
		
		
		Powers ironMan = new IronMan();
		Powers test = new Hulk();
		Hero test1 = new Hulk();
		Hulk test2 = new Hulk();
		Hero hulk  = new Hulk();
		Villain dokOck = new DocOck();
		Hulk greyHulk = new Hulk();
		Collection c = new Stack(); 
		
		
		
		Collection<Powers> people = new Stack<>();
		
		people.add(ironMan);
		people.add(hulk);
		people.add(dokOck);
		people.add(greyHulk);
		
		System.out.println(whosStrongest(people));
			
	}
	
	
	public static String whosStrongest(Collection<Powers> powers) {
		
		Powers strongest = null;
		for (Powers power: powers) {
			if (strongest == null) {
				strongest = power;
			}
			if (power.getStrength() > strongest.getStrength()) {
				strongest = power;
			}
		}
		
		return strongest.realName();
		
		
		
	}

}
