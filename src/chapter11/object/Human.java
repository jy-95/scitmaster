package chapter11.object;

public class Human implements Cloneable {

	int age;
	String name;
	
	int[] score = new int[] {1,2,3};
	
	Human(int age, String name){
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return age + "살 " + name + "이야.";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Human) {
			Human other = (Human) obj;
			return (this.age == other.age && this.name.equals(other.name));
		}else
			return false;
	}

	@Override
	protected Object clone() {
		try {
			Human other = (Human) super.clone();
			other.score = this.score.clone();
			return other;
		} catch (CloneNotSupportedException e) {
			return null;
		}
		
	}
	
}
