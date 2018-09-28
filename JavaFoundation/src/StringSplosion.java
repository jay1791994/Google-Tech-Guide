
public class StringSplosion {

	public static void main(String args[]) {
		
   System.out.println(stringSplosion("code"));		
		
	}
	
	
	
	
	public static String stringSplosion(String str) {
		
		String toReturn = "";
		String temp ;
		
		for(int i=0 ; i <= str.length() ; i++) {
			
			toReturn = toReturn + str.substring(0,i);
			
			
			
		}
		
		return toReturn;
		
		   
		   
	    }

	
}
