import java.util.HashMap;
import java.util.Map;

public class MapShare {
	
	
	public static void main(String args[]) {
		
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("a", "aaa");
		map.put("b","bbb");
		map.put("c", "ccc");
		
		
		
	}
	
	
	
	
	public static  Map<String, String> mapShare(Map<String, String> map) {
		  
		 
		if(map.containsKey("a")) {
			map.put("b", map.get("a"));
		}
		if(map.containsKey("c")) {
			map.remove("c");
		}
        
		return map ;
		  
		  
	}

}
