package befaster.solutions.CHK;

//import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        
    	//all declarations are 0;
        int sum = 0, numA = 0, numB = 0, numC = 0, numD = 0, numE = 0, numF = 0;
        
        //iterate over elements
        for (int i=0; i<skus.length(); i++) {
        	boolean inOK = false;
        	if (skus.charAt(i) == new Character('A')) {
        		numA++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('B')) {
        		numB++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('C')) {
        		numC++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('D')) {
        		numD++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('E')) {
        		numE++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('F')) {
        		numF++;
        		inOK = true;
        	}
        	if (inOK == false ) {	
        		return -1; //invalid input in given string	
        	}
        }//for
        //calculate discounts
        //this is first to give the best deal to customers
        while (numA >=5) {
        	numA -= 5;
        	sum += 200;
        }
        
        while (numA >=3) {
        	numA -= 3;
        	sum += 130;
        }
        //infinite loop...
        //need a copy of count of E's
        int cpyNumE = numE;
        //similarly, E before B
        //ensure numB not less than 0;
        while (cpyNumE >=2) {
        	if (numB >= 1) {
        		numB -= 1;
        	}
        	cpyNumE -=2;
        	//no sum increase; decrease chargeable B's by 1 for every 2 E's
        }
        
        while (numB >=2) {
        	numB -= 2;
        	sum += 45;
        }
        
        //code applies discount in same way as for A, B etc despite rewording for customers
        while (numF >= 3) {
        	numF -= 3;
        	sum += 10*2;
        }
        
        //calculate remaining sum
        sum += numA * 50;
        sum += numB * 30;
        sum += numC * 20;
        sum += numD * 15;
        sum += numE * 40;
        sum += numF * 10;
        
    	return sum;

    }
}
