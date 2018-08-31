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
        	Character c = skus.charAt(i);
        	switch (c) {
        	case 1: c.equals(cA);
        		numA +=1;
        		break;
        		
        	case 2: c.equals(cB);
    			numB +=1;
    			break;
    		
        	case 3: c.equals(cC);
    			numC +=1;
    			break;
    		
        	case 4: c.equals(cD);
    			numD +=1;
    			break;
    			
//        	case 5: c.equals(c); //support for ""?
       // 		break;
        		
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
