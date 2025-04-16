package chapter00.basic;

public class Basic_Example03 {

	public static void main(String[] args) {
		int x = 100, y = 200;
		System.out.println("교환전");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		int z;
		z = x;
		x = y;
		y = z;
		
		System.out.println("교환후");
		System.out.println("x = " + z);
		System.out.println("y = " + x);
	}

}
