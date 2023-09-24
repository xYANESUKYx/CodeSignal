package dad.codesignal;

public class ShapeArea {

	int solution(int n) {
	    int aux = 1;
	    
	    for (int i = 1; i < n + 1; i++){
	            aux = aux + ((i * 2) + (i - 2) *2);
	    }
	    
	    return(aux);
	}
	
}
