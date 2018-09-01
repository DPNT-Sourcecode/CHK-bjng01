package befaster.solutions.CHK;

//import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        
    	//all declarations are 0;
        int sum = 0;
        int[] alphabet = new int[26];
        int numGrp = 0;
        
        //iterate over elements:
        
        for (int i=0; i<skus.length(); i++) {
        	boolean inOK = false;
        	if (skus.charAt(i) == new Character('A')) {
        		alphabet[0]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('B')) {
        		alphabet[1]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('C')) {
        		alphabet[2]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('D')) {
        		alphabet[3]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('E')) {
        		alphabet[4]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('F')) {
        		alphabet[5]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('G')) {
        		alphabet[6]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('H')) {
        		alphabet[7]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('I')) {
        		alphabet[8]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('J')) {
        		alphabet[9]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('K')) {
        		alphabet[10]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('L')) {
        		alphabet[11]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('M')) {
        		alphabet[12]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('N')) {
        		alphabet[13]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('O')) {
        		alphabet[14]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('P')) {
        		alphabet[15]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('Q')) {
        		alphabet[16]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('R')) {
        		alphabet[17]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('S')) {
        		alphabet[18]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('T')) {
        		alphabet[19]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('U')) {
        		alphabet[20]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('V')) {
        		alphabet[21]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('W')) {
        		alphabet[22]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('X')) {
        		alphabet[23]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('Y')) {
        		alphabet[24]++;
        		inOK = true;
        	}
        	if (skus.charAt(i) == new Character('Z')) {
        		alphabet[25]++;
        		inOK = true;
        	}
        	if (inOK == false ) {	
        		return -1; //invalid input in given string	
        	}
        }//for
        
        // will allow a later check to see if applying offer gives the best deal
        numGrp = alphabet[18] + alphabet[19] + alphabet[23] + alphabet[24] + alphabet[25];
        
        //calculate discounts:
        
        //this is first to give the best deal to customers
        // A
        while (alphabet[0] >=5) {
        	alphabet[0] -= 5;
        	sum += 200;
        }
        
        while (alphabet[0] >=3) {
        	alphabet[0] -= 3;
        	sum += 130;
        }
        
        // E
        //infinite loop...
        //need a copy of count of E's
        int cpyNumE = alphabet[4];
        //similarly, E before B
        //ensure numB not less than 0;
        while (cpyNumE >=2) {
        	if (alphabet[1] >= 1) {
        		alphabet[1] -= 1;
        	}
        	cpyNumE -=2;
        	//no sum increase; decrease chargeable B's by 1 for every 2 E's
        }
        
        // B
        while (alphabet[1] >=2) {
        	alphabet[1] -= 2;
        	sum += 45;
        }
        
        // F
        //code applies discount in same way as for A, B etc despite rewording for customers
        while (alphabet[5] >= 3) {
        	alphabet[5] -= 3;
        	sum += (20);
        }
        
        //again, apply better discount first
        // H
        while (alphabet[7] >=10) {
        	alphabet[7] -= 10;
        	sum += 80;
        }
        
        while (alphabet[7] >=5) {
        	alphabet[7] -= 5;
        	sum += 45;
        }
        
        // K // indv and discount prices changes since last part
        while (alphabet[10] >=2) {
        	alphabet[10] -= 2;
        	sum += 120;
        }
        
        // N
        int cpyNumN = alphabet[13];
        //ensure not less than 0;
        while (cpyNumN >=3) {
        	if (alphabet[12] >= 1) {
        		alphabet[12] -= 1;
        	}
        	cpyNumN -=3;
        }
        
        // P
        while (alphabet[15] >=5) {
        	alphabet[15] -= 5;
        	sum += 200;
        }
        
        // R – order changed to ensure best discount provided
        int cpyNumR = alphabet[17];
        //ensure not less than 0;
        while (cpyNumR >=3) {
        	if (alphabet[16] >= 1) {
        		alphabet[16] -= 1;
        	}
        	cpyNumR -=3;
        }
        
        // Q
        while (alphabet[16] >=3) {
        	alphabet[16] -= 3;
        	sum += 80;
        }
        
        // U
        while (alphabet[20] >= 4) {
        	alphabet[20] -= 4;
        	sum += (3 * 40);
        }
        
        // V
        while (alphabet[21] >=3) {
        	alphabet[21] -= 3;
        	sum += 130;
        }
        
        while (alphabet[21] >=2) {
        	alphabet[21] -= 2;
        	sum += 90;
        }
        
        //calculate remaining sum:
        
        sum += alphabet[0] * 50;
        sum += alphabet[1] * 30;
        sum += alphabet[2] * 20;
        sum += alphabet[3] * 15;
        sum += alphabet[4] * 40;
        sum += alphabet[5] * 10;   
        sum += alphabet[6] * 20;
        sum += alphabet[7] * 10;
        sum += alphabet[8] * 35;
        sum += alphabet[9] * 60;
        sum += alphabet[10] * 70;
        sum += alphabet[11] * 90;
        sum += alphabet[12] * 15;
        sum += alphabet[13] * 40;
        sum += alphabet[14] * 10;
        sum += alphabet[15] * 50;
        sum += alphabet[16] * 30;
        sum += alphabet[17] * 50;
        
        sum += alphabet[20] * 40;
        sum += alphabet[21] * 50;
        sum += alphabet[22] * 20;
        
        //group items
        int indvSum = 0;
        indvSum += alphabet[18] * 20; //s
        indvSum += alphabet[19] * 20; //t
        indvSum += alphabet[23] * 17; //x
        indvSum += alphabet[24] * 20; //y
        indvSum += alphabet[25] * 21; //z
        
        int grpSum = 0;
        boolean grpDiscountActive = false;
        if (numGrp >= 3) {
        	grpDiscountActive = true;
        }
        
        while (numGrp >= 3) {
        	grpSum += 45;
        	numGrp -= 3;
        }
        
        //apply best offer
        if (grpSum <= indvSum && grpDiscountActive) { //need this or we use grpSum = 0
        	sum += grpSum;
        } else {
        	sum += indvSum;
        }
        
    	return sum;

    }
}
