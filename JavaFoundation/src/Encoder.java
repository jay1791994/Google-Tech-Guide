import java.util.HashMap;
import java.util.Map;

/*
 * 
Write a function that replaces the words in `raw` with the words in `code_words` such that the first occurrence of each word in `raw` is assigned the first unassigned word in `code_words`.


encoder(["a"], ["1", "2", "3", "4"]) → ["1"]
encoder(["a", "b"], ["1", "2", "3", "4"]) → ["1", "2"]
encoder(["a", "b", "a"], ["1", "2", "3", "4"]) → ["1", "2", "1"]
 * 
 */
public class Encoder {
	
	
	public String[] encoder(String[] raw, String[] code_words) {
	      
	    String[] returnArray =  new String[raw.length];
	    int j = 0 ;
	    int k = 0;
	    Map<String , String> map = new HashMap<String, String>();
	    
	    for(String str: raw){
	      
	      if(!map.containsKey(str)){
	        map.put(str, String.valueOf(code_words[j]));
	        j++;
	        returnArray[k] =  map.get(str);
	        k++;
	      }  else{
	        returnArray[k] = map.get(str);
	        k++;
	      }
	        
	      
	      
	    }
	   
	  return returnArray;
	  
	}


}
