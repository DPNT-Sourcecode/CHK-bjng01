package befaster.solutions.CHK;

//import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int sum = 0;
        int numA = 0;
        int numB = 0;
        int numC = 0;
        int numD = 0;
        
        Character cA = new Character('A');
        Character cB = new Character('B');
        Character cC = new Character('C');
        Character cD = new Character('D');
        
        //iterate over elements
        for (int i=0; i<skus.length(); i++) {
        	boolean inOK = false;
        	if (skus.charAt(i) == cA) {
        		numA++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == cB) {
        		numB++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == cC) {
        		numC++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == cD) {
        		numD++;
        		inOK = true;
        	}
        	if (inOK == false ) {	
        		return -1; //invalid input in given string	
        	}
        }//for
        //calculate discounts
        while (numA >=3) {
        	numA -= 3;
        	sum += 130;
        }
        
        while (numB >=2) {
        	numB -= 2;
        	sum += 45;
        }
        
        //calculate remaining sum
        sum += numA * 50;
        sum += numB * 30;
        sum += numC * 20;
        sum += numD * 15;
        
    	return sum;

    }
}
