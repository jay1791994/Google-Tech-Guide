
public class SumNumbers {
	
	
	public static void main(String args[]) {
		
		System.out.println(sumNumbers("asd123ab2"));
		
		
	}
	
	
	
	public static int sumNumbers(String str) {
		
		int i = str.length() ;
		int j = 0 ;
        String num = "";
        int p = 0;
        int sum = 0 ;
		
		while( j < i) {
			
			if( Character.isDigit(str.charAt(j))) {
				//System.out.println("Entered ");
				p = 1 ;
				num= num + str.charAt(j);
			}
			else {
			    if(p == 1) {
			    	//System.out.println(num);
			    	sum = sum + Integer.valueOf(num);
			    	p = 0 ;
			    	num="";
			    }
			}
			
			j++;
			
		}
		if(p == 1) {
			sum = sum + Integer.valueOf(num);
		}
		
		
		  return sum;
	}


}
