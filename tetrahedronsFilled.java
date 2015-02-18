import java.util.Arrays;

public class tetrahedronsFilled {

	private static double fill_tetrahedron(int num) {
		double capacity;
		capacity = ((Math.sqrt(2)) * (num * num * num)) / 12;
		double liters = capacity / 1000;
		liters = Math.floor(liters * 100) / 100;
		return liters;
	}

	private static int tetrahedron_filled(int[] tetrahedrons, int water) {
		double sumOfLiters = 0;
		int counter = 0;
		int len = tetrahedrons.length;
		double[] liters = new double[len];

		for (int i = 0; i < len; i++) {
			liters[i] = fill_tetrahedron(tetrahedrons[i]);

		}
		Arrays.sort(liters);
		for (int i = 0; i < len; i++) {

			if (sumOfLiters < water && (liters[i] < (water - sumOfLiters))) {
				sumOfLiters += liters[i];
				counter += 1;
			}

		}
		return counter;
	}

	public static void main(String[] args) {
		int[] tetrahedrons = new int[]{100,100,100};
		System.out.println(tetrahedron_filled(tetrahedrons, 10));
	}
}
