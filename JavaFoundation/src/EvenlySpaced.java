
public class EvenlySpaced {
	
	public boolean EvenSum(int a, int b, int c) {
		
		 if( a == b && b == c){
			    return true;
			  }
			  
			  int ad = Math.abs(a-b);
			  int bd = Math.abs(b-c);
			  int cd = Math.abs(a-c);
			  
			  if( ad == 0 || bd ==0 || cd ==0 ){
			    return false;
			  } 
			 
			  if(ad == bd)
			  return true;
			  if(bd == cd)
			  return true;
			  if(cd == ad)
			  return true;
			  
			  
			  return false;
		
		
	}

}
