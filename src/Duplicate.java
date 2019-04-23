
public class Duplicate {


	public static void main(String[] args) {
		message("hell hell is this is too");
		

	}
	
	public static void message(String msg) {
		String letter = "";
		String word = "";
		String newMsg = "";
		for(int x=0; x<msg.length(); x++){
			letter = msg.substring(x,x+1);
			if(letter.equals(" ")){
				msg = removeDuplicate(word,msg.substring(x+1,msg.length()));
				word+=letter;
				newMsg+=word;
			}
			else{
				word+=letter;
			}
		}

	}
	
	public static String removeDuplicate(String word, String msg){
	
		
	}

}
