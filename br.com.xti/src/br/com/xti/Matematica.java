package br.com.xti;

public class Matematica {
	
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return o maior dos dois
	 */
	int maior(int um, int dois){
		if( um>dois){
			return um;
		}else{
			return dois;
		}
	}
	double soma(double um, double dois){
		return um + dois;
	}
	int raiz(int um) {
		int i=1;
		int x= um;
		int square=0;
		while (x > 2){
			x = x-i;
			i = i+2;
			square +=1;			
		}
		return square;
	}
	double media (int x, int y){
		System.out.print("media (int x, int y) ");
		return (x+y)/2;
	}

}
