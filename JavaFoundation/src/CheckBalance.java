
public class CheckBalance {
	
	
	public static void main(String args[]) {
	
	int[] arr = {1,2,1,2,1,1,1};
		
		System.out.println(canBalance(arr));
		
		
		
	}

	public static boolean canBalance(int[] nums) {
		
		
		int i = 1 ;
		int j = nums.length-2 ;
		
		int sumFront =  nums[0];
		int sumBack = nums[nums.length-1];
		
		
		while (i <= j) {
			
			System.out.println(sumFront +"   " + sumBack);
		//	System.out.println("looping continus");
			
			if(nums[i] < 0 ) {
				if(sumFront > sumBack) {
					sumFront = sumFront + nums[i];
					i++;
					continue ;
				}
			}else if(nums[j] < 0) {
				if(sumBack > sumFront) {
					sumBack = sumBack + nums[j];
					j--;
					continue;
				}
			}else if (sumFront < sumBack) {
			
				sumFront = sumFront + nums[i];
				i++;
				continue;
			} else if (sumFront > sumBack) {
				
				sumBack = sumBack + nums[j];
				j--;
				continue;
				
			} 
			if(sumFront == sumBack){
				
				
				if (nums[i] < nums[j]) {
					sumFront = sumFront + nums[i];
					i++;
				} else if (nums[i] > nums[j]) {
					sumBack = sumBack + nums[j];
					j--;
				} else {
					sumFront = sumFront + nums[i];
					i++;
					sumBack = sumBack + nums[j];
					j--;
					if (i == j) {
						return false;
					}

				}
				
				

			}
			
			
		}
		
		if(sumBack == sumFront) {
			return true;
		}
		
		
		
		
		
		return false;
		
		
		
	}

}
