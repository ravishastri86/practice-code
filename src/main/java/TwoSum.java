import java.util.Arrays;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order. 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

*/

public class TwoSum {
	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		System.out.println(ts.twoSum(new int[] { 2, 7, 11, 15 }, 9));
		System.out.println(ts.twoSum(new int[] { 3, 2, 4 }, 6));
		System.out.println(ts.twoSum(new int[] { 3, 3 }, 6));

	}

	public String twoSum(int[] nums, int target) {
		for (int cnt1 = 0; cnt1 < nums.length; cnt1++) {
			for (int cnt2 = cnt1 + 1; cnt2 < nums.length; cnt2++) {
				if (nums[cnt1] + nums[cnt2] == target) {
					int[] arr = { cnt1, cnt2 };
					return Arrays.toString(arr);
				}
			}
		}
		return null;
	}
}
