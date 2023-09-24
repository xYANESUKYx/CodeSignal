package dad.codesignal;

public class AdjacentElementsProduct {
	int solution(int[] inputArray) {
	    int x;
	    int aux = inputArray[0] * inputArray[1];

	    for(int i = 0; i < (inputArray.length - 1); i++){
	        x = inputArray[i] * inputArray[i + 1];
	        if(x > aux){
	            aux = x;
	        }
	    }
	    
	    return(aux);
	}
}
