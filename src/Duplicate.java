
public class Duplicate {


	public static void main(String[] args) {
		message("hell hell hell is this is too");
		

	}
	
	public static void message(String msg) {
		String word = "";
		for(int x=0; x<msg.length(); x++){
			String letter = msg.substring(x,x+1);
			if(letter.equals(" ")){
				String r = removeDuplicate(word,msg);
				System.out.println(r);
				word = "";
			}
			word+=letter;
		}
		
		

	}
	
	public static String removeDuplicate(String word, String newMsg){
		String msg = "";
		String word2 = "";
		boolean firttime = true;
		for(int x=0; x<newMsg.length(); x++){
			String letter = newMsg.substring(x,x+1);
			if(letter.equals(" ")){
				if(!word2.equals(word)){
					msg+=word2;
					word2 = "";
					firttime = false;
				}else{
					if(firttime){
						msg+=word2;
						word2="";
						firttime = false;
					}else{
						word2="";
					}
				}
				word2+=letter;
			}else{
				word2+=letter;
			}
		}
		
		return msg;
		
	}

}
