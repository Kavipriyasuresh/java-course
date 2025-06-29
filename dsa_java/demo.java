package dsa_java;

public class demo {
	public class ReverseArray {
	    public static void reverse(int[] nums) {
	        int left = 0;
	        int right = nums.length - 1;

	        while (left < right) {
	         
	            int temp = nums[left];
	            nums[left] = nums[right];
	            nums[right] = temp;

	            
	            left++;
	            right--;
	        }
	    }

	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};

	        reverse(numbers);

	       
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }

	    }
	}

}
