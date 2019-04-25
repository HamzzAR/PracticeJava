public class NumberToText {

    public static void main(String[] args){
    
        //numberToText(56599910);
    	numberToText2(623);
        
    }
    
    public static void numberToText2(int num){
        String no = Integer.toString(num);
        int n = 1;
        for(int x=no.length()-1; x>=0; x--){
        	System.out.println(no.substring(x,x+1));
        	
        	switch (n) {
			case 1:
				
				break;

			default:
				break;
			}
        		
        	n++;
        }
        
        
    
    }
   

    
    
    
    public static void numberToText(int num){
    
        String no = Integer.toString(num);
        String result = "";
        
        for(int x=0; x<no.length(); x++){
        
            int i = Integer.parseInt(no.substring(x, x+1));
            switch (i){
            
                case 0: result+=" Zero";
                    break;
                case 1: result+=" One";
                    break;
                case 2: result+=" Two";
                    break;
                case 3: result+=" Three";
                    break;
                case 4: result+=" Four";
                    break;
                case 5: result+=" Five";
                    break;
                case 6: result+=" Six";
                    break;
                case 7: result+=" Seven";
                    break;
                case 8: result+=" Eight";
                    break;
                case 9: result+=" Nine";
                    break;
            }
        }
        
        System.out.println(result);
       
        
    }
}

