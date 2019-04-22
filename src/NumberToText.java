public class NumberToText {

    public static void main(String[] args){
    
        //numberToText(56599910);
        
    }
    
    public static void numberToText2(int num){
        String no = Integer.toString(num);
        
        
        
        
    
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

