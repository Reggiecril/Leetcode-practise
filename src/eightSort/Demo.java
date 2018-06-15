package eightSort;

/**
 * Date:2018-6-13
 * 
 * @author reggie
 *
 */
// 八大基本排序算法
public class Demo {
	// 冒泡排序
	private void bubbleSort() {
		// set array
		int[] num = { 123, 23, 12, 32, 43, 12, 5, 4, 67, 678, 945, 623, 46754, 57, 656, 3, 32 };
		// loop array.length-1,when loop to last,it will stop
		for (int i = 0; i < num.length - 1; i++) {
			// find max num and move to next index
			for (int j = 0; j < num.length - i - 1; j++) {
				// compare this number and next number
				if (num[j] > num[j + 1]) {
					// put num[j+1]value to temp
					int temp = num[j + 1]; // or int temp=num[j];
					// move num[j]
					num[j + 1] = num[j]; // or num[j]=num[j+1];
					num[j] = temp; // or num[j+1]=temp;
				}
			}

		}
		System.out.println("************************************************");
		System.out.println("******************Bubble Sort*******************");
		System.out.print("[");
		for (int i : num) {
			System.out.print(i + ",");
		}
		System.out.println("]");
	}

	// 选择排序
	private void selectionSort() {
		// set array
		int[] num = { 123, 23, 12, 32, 43, 12, 5, 4, 67, 678, 945, 623, 46754, 57, 656, 3, 32 };
		// loop array.length-1,when loop to last,it will stop
		for (int i = 0; i < num.length - 1; i++) {
			int max = 0;
			// find max index
			for (int j = 0; j < num.length - i - 1; j++) {
				// get max number's index
				if (num[j + 1] > num[max]) {
					max = j + 1;
				}
			}
			// move the max number of the loop to the last index of this loop.
			// put num[num.length-i-1]value to temp
			int temp = num[num.length - i - 1]; // or int temp=num[max];
			// move num[max]
			num[num.length - i - 1] = num[max]; // or num[max]=num[num.length-i-1];
			num[max] = temp; // or num[num.length-i-1]=temp;

		}
		// test
		System.out.println();
		System.out.println("************************************************");
		System.out.println("******************Selection Sort*******************");
		System.out.print("[");
		for (int i : num) {
			System.out.print(i + ",");
		}
		System.out.println("]");
	}

	// 插入排序
	private void insertSort() {
		// set array
		int[] num = { 123, 23, 12, 32, 43, 12, 5, 4, 67, 678, 945, 623, 46754, 57, 656, 3, 32 };
		//loop without first index
		for (int i = 1; i < num.length; i++) {
			//keep num[i]'s value
			int temp = num[i];
			//loop to get index 
			while (i >= 1 && num[i - 1] > temp) {
				//move 
				num[i] = num[i - 1];
				i--;
			}
			num[i] = temp;
		}
		// test
		System.out.println();
		System.out.println("************************************************");
		System.out.println("******************Insert Sort*******************");
		System.out.print("[");
		for (int i : num) {
			System.out.print(i + ",");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {

		Demo demo = new Demo();
		demo.bubbleSort();
		demo.selectionSort();
		demo.insertSort();

	}
}
