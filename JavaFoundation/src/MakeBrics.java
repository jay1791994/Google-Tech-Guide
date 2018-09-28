
public class MakeBrics {
	
	
	
	public boolean makeBricks(int small, int big, int goal) {
		
	
		int maxBigBricks = goal / 5 ;
		
		goal = goal - (5)*Math.min(maxBigBricks, big);
		
		if( goal <= small) {
			return true;
		}
		return false;
		
	}

	

}
