package chapter10.interface_part;

public class Magician extends Novice implements Skill{
	private String name;
	private int strength;
	private int dexterity;
	private int intelligence;
	public Magician(){}
	
	public Magician(String name, int strength, int dexterity, int intelligence) {
		this.name = name;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
	}
	
	@Override
	public void skill() {
		System.out.println("파이어볼");
	}
	
}
