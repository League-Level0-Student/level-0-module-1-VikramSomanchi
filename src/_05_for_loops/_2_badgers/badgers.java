package _05_for_loops._2_badgers;

public class badgers {
	public static void main(String[] args) {

		for (int i = 0; i < 2; i = i + 1) {

			for (int badgers = 0; badgers < 12; badgers = badgers + 1) {
				System.out.print("Badgers");
				if (badgers < 11) {
					System.out.print(", ");
				}
			}
			System.out.println();
			for (int mushroom = 0; mushroom < 2; mushroom = mushroom + 1) {
				System.out.print("Mushroom");
				if (mushroom < 1) {
					System.out.print(", ");
				}

			}

			System.out.println();
			System.out.println();
			

		}
		
		System.out.println("A SNAKE!!!!!");
	}
}