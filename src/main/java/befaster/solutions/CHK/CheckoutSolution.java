package befaster.solutions.CHK;

//import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int sum = 0;
        int numA = 0;
        int numB = 0;
        int numC = 0;
        int numD = 0;
        
        //iterate over elements
        for (int i=0; i<skus.length(); i++) {
        	char c = skus.charAt(i);
        	switch (c) {
        	case 1: c = "A".charAt(0);
        		numA +=1;
        		break;
        		
        	case 2: c = "B".charAt(0);
    			numB +=1;
    			break;
    		
        	case 3: c = "C".charAt(0);
    			numC +=1;
    			break;
    		
        	case 4: c = "D".charAt(0);
    			numD +=1;
    			break;
    			
        	case 5: c = "".charAt(0);
        		break;
        		
        	default:
        		return -1; //invalid input in given string
        		
        	}//switch
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
