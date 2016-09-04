
public class BinarySearcher {

	private int[] nums;
	private int position;
	private boolean found = false;
	private int actualMid;
	
	public BinarySearcher(int[] a){
		nums = a;
		actualMid = (nums.length-1)/2;
	}
	
	/**
	Finds a value in a range of a sorted array, using the binary search algorithm.
	@param a the array in which to search
	@param low the low index of the range
	@param high the high index of the range
	@param value the value to find
	@return the index at which the value occurs, or -1 if it does not occur in the array
	*/
	public int searchList(int[] a, int low, int high, int value) {
		found = false;
		if (low <= high) {
			int mid = (low + high) / 2;
			//position+= mid;
			
			if(a[nums.length-1] < value){
				found = true;
				return nums.length*-1 -1;
			}
			
			if (a[mid] == value) {
				found = true;
				return mid; 
			}
			else if (a[mid] < value ) {
				position+= mid - actualMid;
				actualMid = mid;
				return searchList(a, mid + 1, high, value); 
			}
			else{
				position+= mid - actualMid;
				actualMid = mid;
				return searchList(a, low, mid - 1, value);
			} 
		}
		else {
			return -1;
		} 
	}
	
	public int search(int n){
		actualMid = (nums.length-1)/2;
		position = (nums.length-1)/2;
		searchList(nums, 0, nums.length-1, n);
		if(found){return searchList(nums, 0, nums.length-1, n);}
		else;
			return position*-1 - 1;
	}
}
