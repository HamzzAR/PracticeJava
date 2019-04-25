public class NumberToText {

    public static void main(String[] args){
    	numberToText2(10);
    	numberToText2(0);
    	numberToText2(1011);
    	numberToText2(3510);
    	numberToText2(2200);
    	numberToText2(1111);
        
    }
    
    public static void numberToText2(int num){
        String no = Integer.toString(num);
        String result = "";
        int n = no.length();
        if(no.length() == 1 && num == 0){
        	result = "Zero";
        }
        loop: for(int x=0; x<no.length(); x++){
        	String cvalue = no.substring(x,x+1);
        	switch (n) {
			case 1:
				result+=getUnitText(cvalue)+" ";
				break;
			case 2:
				if(cvalue.equals("0")){
					result+=getUnitText(no.substring(x+1,x+2))+" ";
					break loop;
				}else if(cvalue.equals("1")){
					result+=getTen2Text(no.substring(x+1,x+2))+" ";
					break loop;
				}
				
				else{
					result+=getTenText(cvalue)+" ";
					break;
				}
				
			case 3:
				if(!getUnitText(cvalue).equals("")){
					result+=getUnitText(cvalue)+" Hundred ";
				}
				break;
			case 4:
				result+=getUnitText(cvalue)+" Thousand ";
				break;
			}
        	n--;
 
        }
        System.out.println(result);
        
        
    
    }
    
    public static String getTen2Text(String num) {
    	int no = Integer.parseInt(num);
        switch (no){
            case 1: return "Eleven";
            case 2: return "Twelve";
            case 3: return "Thirteen";
            case 4: return "Forteen";
            case 5: return "Fifteen";
            case 6: return "Sixteen";
            case 7: return "Seventeen";
            case 8: return "Eighteen";
            case 9: return "Nineteen";
            default: return "ten";
        }
	}
   

    public static String getTenText(String num) {
    	int no = Integer.parseInt(num);
        
        switch (no){
            case 1: return "Ten";
            case 2: return "Twenty";
            case 3: return "Thirty";
            case 4: return "Forty";
            case 5: return "Fifty";
            case 6: return "Sixty";
            case 7: return "Seventy";
            case 8: return "Eighty";
            case 9: return "Ninety";
            default: return "";
        }
	}
    
    
    public static String getUnitText(String num){
    
        int no = Integer.parseInt(num);
    
        switch (no){
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "";
        }
    }
}

