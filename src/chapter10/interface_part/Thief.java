package chapter10.interface_part;

public class Thief extends Novice implements Skill{
	private String name;
	private int strength;
	private int dexterity;
	private int intelligence;
	public Thief(){}
	
	public Thief(String name, int strength, int dexterity, int intelligence) {
		super(name, strength, dexterity, intelligence);
	}
	
	@Override
	public void skill() {
		System.out.println("은신");
	}
	
}
