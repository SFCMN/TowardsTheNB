import java.util.HashMap;

public class SumOfTwoNumbers {
  public int[] twoSum(int[] nums, int target) {
    final HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if(map.containsKey(target - nums[i])) {
        return new int[] {map.get(target - nums[i]), i};
      }
      map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
  }

  public static void main(String[] args) {
    final SumOfTwoNumbers sumOfTwoNumbers = new SumOfTwoNumbers();
    final int[] indexesOf9 = sumOfTwoNumbers.twoSum(new int[]{2, 7, 11, 15}, 9);
    for (int index: indexesOf9) {
      System.out.println(index);
    }

    System.out.println("------------------------");

    final int[] indexesOf6 = sumOfTwoNumbers.twoSum(new int[]{3, 2, 4}, 6);
    for (int index: indexesOf6) {
      System.out.println(index);
    }
  }
}
