package dad.codesignal;

public class CheckPalindrome {

	boolean solution(String inputString) {
	    
	    int j = inputString.length() - 1;
	    boolean x = true;
	    
	    for (int i = 0; i < inputString.length(); i++){
	        if (inputString.charAt(i) == inputString.charAt(j)){
	            j = j - 1;
	        } 
	        else {
	            x = false;
	            i = inputString.length();
	        }
	    }
    
	    return(x);
	}

}
