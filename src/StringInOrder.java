
public class StringInOrder {

	public static void main(String[] args) {
		
		StringAssenOrder("testing test and not test");

	}
	
	public static void StringAssenOrder(String msg){
		
		String letter = "";
		String word = "";
		String old = "";
		String newMsg = "";
		for(int x=0; x<msg.length(); x++){
			letter = msg.substring(x, x+1);
			if(letter.equals(" ") || msg){
				if(word.length() > old.length()){
					newMsg = newMsg +" "+ word;
				} else{
					newMsg = word +" "+ newMsg;
				}
				
				old = word;
				word = "";
			} else{
				word+=letter;
			}
			
		}
		
		System.out.println(newMsg);
	}

}
