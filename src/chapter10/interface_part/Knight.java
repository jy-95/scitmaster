package chapter10.interface_part;

// 기사
public class Knight extends Novice implements Skill {
	private String name;
	private int strength;
	private int dexterity;
	private int intelligence;
	public Knight(){}
	
	public Knight(String name, int strength, int dexterity, int intelligence) {
		this.name = name;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
	}
	
	@Override
	public void skill() {
		System.out.println("강력한 배쉬");
	}
	
}
