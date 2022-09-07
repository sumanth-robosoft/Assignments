package sep2.p1;

public class IntArrayManager {

	/**
	 * get the element which is smallest in the array
	 * 
	 * @param array
	 * @return
	 */
	public static int findMinElement(int[] array) {
		int min = array[0];
		for (int index = 1; index < array.length; index++) {
			if (array[index] < min) {
				min = array[index];
			}
		}
		return min;
	}

	/**
	 * scale the array using the scale factor passed to the function
	 * 
	 * @param array
	 * @param scaleFactor
	 */
	public static void scaleArray(int[] array, int scaleFactor) {
		for (int index = 0; index < array.length; index++)
			array[index] *= scaleFactor;

	}

}
