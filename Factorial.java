public class Factorial { 
        public int getFactorial(int number) {
	
	int factorial = 1;
	for(int counter =1; counter<=number; ++counter){

		factorial *= counter;}
	
		return factorial;
	
	}
}