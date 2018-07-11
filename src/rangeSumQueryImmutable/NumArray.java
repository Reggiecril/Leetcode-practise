package rangeSumQueryImmutable;

public class NumArray {
	int[] nums;

	public NumArray(int[] nums) {
		this.nums = nums;
	}

	public int sumRange(int i, int j) {
		int total = 0;
		for (int x = i; x <= j; x++) {
			total += nums[x];
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
