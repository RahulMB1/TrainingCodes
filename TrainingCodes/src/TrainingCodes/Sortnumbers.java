package TrainingCodes;

public class Sortnumbers {

	public static void main(int[] nums) {
		// TODO Auto-generated method stub
		int lo=0;
		int mid=0;
		int high=nums.length-1;
		int temp;
		while(mid<=high) {
			switch(nums[mid]) {
			case 0: {
				temp=nums[lo];
				nums[lo]=nums[mid];
				nums[mid]=temp;
				lo++;
				mid++;
				break;
			}
			
			case 1: {
				mid++;
				break;
			}
			
			case 2: {
				temp=nums[mid];
				nums[mid]=nums[high];
				nums[high]=temp;
				high--;
				break;
			}
			}
		}
	}

}
