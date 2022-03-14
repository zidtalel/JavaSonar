package main;

public class CalculatorImpl implements Calculator {
	
	public static void main(String[] args) {
		CalculatorImpl calc = new CalculatorImpl();
		int val = calc.add(2,4);
	}
	
	//Multiplication
	public int multiply(int a, int b) {
		int res = 0;
		if ((a > 0) && (b > 0)) {
			while(b-- > 0) {
				res = res + a; }  }
		else if ((a < 0) && (b < 0)) {
			b= -b;
			while(b-- > 0) {
			            res = res - a; }  }
		else if ((a < 0) && (b > 0)) {
			a = -a;
			while(a-- > 0) {
			            res = res + b; }
					res = -res;
				}
			else if ((a > 0) && (b < 0)) {
				b = -b;
				while(b-- > 0) {
					res = res + a; }
			res = -res; }
			return res;	
	}
	//Division
	public int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException();
	        }
		
		boolean resEstNegatif = false;
		int res = 0;
		if ( a < 0) {
			resEstNegatif = !resEstNegatif;
			a = -a;
		}
		if ( b < 0) {
			resEstNegatif = !resEstNegatif;
			b = -b;
		}
		while (a > 0) {
		        a = substract(a, b);
			res++;
		}
		if (resEstNegatif) {
			res = -res;
	        }
		return res;
	}
	//Addition
	public int add(int a, int b) {
		int res = a;
		//Incrémentation dans le cas ou b est positif
		if (b > 0) {
			while(b-- != 0) {
				res++;
	        	}
	        }
		//Décrémentation dans le cas ou b est négatif
		else if (b < 0) {
			while(b++ != 0) {
	            res--;
	            }
	        }
		return res;
	}
	//Soustraction
	public int substract(int a, int b) {
		int res = a;
		//Décrémentation dans le cas ou b est positif
		if (b > 0) {
			while(b-- != 0) {
				res--; 
			}
		}
		//Incrémentation dans le cas ou b est négatif
		else if (b < 0) {
			while(b++ != 0) {
				res++; 
			}
		}
		return res;
	}
	//Fusion de deux tableaux t1 et t2 dans t3
	public void Merge(int t1[], int[] t2, int[] t3) {
		  int i = 0, j = 0, k = 0 ;

		  while (i < 3 && j < 3) { // line 09
		    if (t1[i] < t2[j]) {   // line 10
		      t3[k] = t1[i];
		      i++;
		    }
		    else {
		      t3[k] = t2[j];
		      j++;
		    }
		    k++ ;
		  }
		  while (i < 3) {          // line 20
		    t3[k] = t1[i];
		    i++;
		    k++;
		  }
		  while (j < 3) {          // line 25
		    t3[k] = t2[j];
		    j++;
		    k++;
		  }
		}


}
