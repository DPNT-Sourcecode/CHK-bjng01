package befaster.solutions.CHK;

//import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int sum = 0;
        int numA = 0;
        int numB = 0;
        int numC = 0;
        int numD = 0;
    	
        //parse SKU string
        char[] items = skus.toCharArray();
        
        //iterate over elements
        for (int i=0; i<items.length; i++) {
        	switch (items[i]) {
        	case 1: items[i] = "A".charAt(0);
        		numA +=1;
        		break;
        		
        	case 2: items[i] = "B".charAt(0);
    			numB +=1;
    			break;
    		
        	case 3: items[i] = "C".charAt(0);
    			numC +=1;
    			break;
    		
        	case 4: items[i] = "D".charAt(0);
    			numD +=1;
    			break;
        		
        	default:
        		return -1; //invalid input in given string
        		
        	}
        }
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
