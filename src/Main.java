public class Main {
    public static void main(String[] args) {
        Integer[] nums = {2, 0, 343, 646, 43424};

        // Convert Integer[] to int[] for the method
        int[] intNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            intNums[i] = nums[i];
        }

        Integer secondLargest = findSecondLargest(intNums);
        System.out.println("Second Largest Number: " + secondLargest);
    }

    public static Integer findSecondLargest(int[] nums) {
        if (nums == null || nums.length < 2) return null;

        Integer first = null;
        Integer second = null;

        for (int num : nums) {
            if (first == null || num > first) {
                second = first;
                first = num;
            } else if (num < first && (second == null || num > second)) {
                second = num;
            }
        }

        return second;
    }
}
