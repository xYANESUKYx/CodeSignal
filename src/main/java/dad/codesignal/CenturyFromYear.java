package dad.codesignal;

public class CenturyFromYear {

	int solution(int year) {
	    int aux = 0;
	    for (int i = 0; i < year; i = i + 100) {
	        aux++;
	    }
	    return(aux);
	}
}
