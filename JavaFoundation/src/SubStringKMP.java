
public class SubStringKMP {

	public static void main(String args[]) {

		String Str = "aaacdaabb";
	String pattern = "acde";

		char[] strArray = Str.toCharArray();
		char[] patternArray = pattern.toCharArray();

		System.out.println(findSubStrinf(strArray, patternArray));

	}

	private static int findSubStrinf(char[] text, char[] pattern) {
		
		
		int lps[] = findTheArray(pattern);
        int i=0;
        int j=0;
        while(i < text.length && j < pattern.length){
            if(text[i] == pattern[j]){
                i++;
                j++;
            }else{
                if(j!=0){
                    j = lps[j-1];
                }else{
                    i++;
                }
            }
        }
        System.out.println("the index is");
        if(j == pattern.length){
            return i - j  ;
        }
        return -1;
		
	}

	private static int[] findTheArray(char[] pattern) {

		int[] lps = new int[pattern.length];

		lps[0] = 0;
		int i = 1;
		int index = 0;
		while (i < pattern.length) {
		

			if (pattern[index] == pattern[i]) {
				lps[i] = index+1;
				index++;
				i++;
			} else {
				if (index != 0) {

					index = lps[index - 1];
             
				} else {
					lps[i] = 0;
					i++;
				}
			}
		}

		for(int k=0; k < lps.length ; k++) {
			System.out.print(lps[k]+"   ");
		}
		return lps;
	}
}
