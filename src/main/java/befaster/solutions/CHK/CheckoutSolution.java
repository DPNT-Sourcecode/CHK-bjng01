package befaster.solutions.CHK;

//import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int sum = 0;
        int numA = 0;
        int numB = 0;
        int numC = 0;
        int numD = 0;
        int numE = 0;
        
        Character cA = new Character('A');
        Character cB = new Character('B');
        Character cC = new Character('C');
        Character cD = new Character('D');
        Character cE = new Character('E');
        
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
        	if (skus.charAt(i) == cE) {
        		numE++;
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
        //need a count of E's
        int cpyNumE = numE;
        //similarly, E before B
        while (cpyNumE >=2) {
        	numB -= 1;
        	cpyNumE -=2;
        	//no sum increase; decrease chargeable B's by 1 for every 2 E's
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
        sum += numE * 40;
        
    	return sum;

    }
}
