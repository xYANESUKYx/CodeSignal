package dad.codesignal;

public class MakeArrayConsecutive2 {

	int solution(int[] statues) {
	    int aux, cont = 0;
	    
	    for (int i = 0; i < statues.length - 1; i++){
	        if (statues[i] > statues[i + 1]){
	            aux = statues[i];
	            statues[i] = statues[i + 1];
	            statues[i + 1] = aux;
	            i = -1;
	        }
	    }
	    
	    for (int i = 0; i < statues.length - 1; i++){
	        cont = cont +  (statues[i + 1] - (statues[i] + 1));
	    }
	    
	    return(cont);
	}

}
