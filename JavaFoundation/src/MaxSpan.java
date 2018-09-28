import java.util.HashSet;

public class MaxSpan {

	
	
	
	public static void main(String args[]) {
		
		int[] arr = {1,1};
		
		System.out.println(maxSpan(arr));
		
		
		
	}
	
	
	
	
	public static int maxSpan(int[] nums) {
		
	int maxSpan = 0 ;

	int j = nums.length-1 ;
	
	if(nums.length == 1) {
		return 1 ;
	}
	 
	HashSet<Integer> set = new HashSet();
	
	for(int i =0 ; i < nums.length; i++) {
		
		if(! set.contains(nums[i])) {
			set.add(nums[i]);
			j =  nums.length-1;
			while(j>i) {
				if(nums[j] == nums[i]) {
					int span = j-i +1 ;
					if( span> maxSpan) {
						maxSpan = span ;
						
					}
					break ;
				}
				j--;
			}
		}
		
	}
	
	 return maxSpan ;
	}
	
	
	
	
	
	
}
