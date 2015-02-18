import java.util.Scanner;

public class tetrahedron {

	private static double fill_tetrahedron(int num) {
		double capacity;
		capacity = ((Math.sqrt(2)) * (num * num * num)) / 12;
		double liters = capacity / 1000;
		liters = Math.floor(liters * 100) / 100;
		return liters;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter santimetres: ");
		int santimetres = input.nextInt();
		input.close();
		System.out.println(fill_tetrahedron(santimetres));
		double liters = (fill_tetrahedron(santimetres));
		System.out.printf(
				"You can fill Regular tetrahedron with edge of %d cm with %f liters of water.",
						santimetres, liters);
	}
}
