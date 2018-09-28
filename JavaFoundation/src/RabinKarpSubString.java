
public class RabinKarpSubString {
	
public static void main(String args[]) {
		
		String str ="aabbccedfgbbcsdkn" ;
		String pattern = "dfg";

	System.out.println("index is" + RabinKarpSubStribg(pattern, str));
	
}
private static int RabinKarpSubStribg(String pattern, String str) {
	
	int hash = 0 ;
	int len = pattern.length();
	int power = (int)Math.pow(3, (len-1));
	int hashpat = 0 ;
	for(int i = 0 ; i < pattern.length() ; ) {
		
	   hash = hash + ((int)str.charAt(i))*(int)(Math.pow(3, i));
	   hashpat = hashpat + ((int)pattern.charAt(i))*(int)(Math.pow(3, i));
	   System.out.println(hash);
	   i++;
		
	}
	if(hash == hashpat) {
		return  0 ;
	}
	int j = 0 ;
	for(int k = len ; k < str.length() ; k++ ) {
		
	 hash = hash - ((int)str.charAt(j));
	 hash =  hash/3 ;
	 hash = hash + ((int)str.charAt(k))*power ;
	 
	 if(hashpat == hash) {
		
		 return j+1 ;
	 }
	 j++;
	 
	}
	
	return -1;
	
	
}
private static int hashOfPattern(String p) {
	
	
	int hash = 0 ;
	
	for(int i = 0 ; i < p.length() ; ) {
		
	   hash = hash + ((int)p.charAt(i))*(int)(Math.pow(3, i));
	   System.out.println(hash);
	   i++;
		
	}
	
	return hash ;
}	
	

}
