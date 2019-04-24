
public class Duplicate {


	public static void main(String[] args) {
		//message("hell hell is this too");
		
		//System.out.println(findAndReplace("Hello this is Hello and Hello","He",""));
		
		duplicate("hi i am hi hamza");
	}
	
	
	public static void duplicate(String msg){
		String letter = "";
		String word = "";
		String newMsg = "";
		for(int x=0; x<msg.length(); x++){
			letter = msg.substring(x, x+1);
			if(letter.equals(" ") || x+1 == msg.length()){
				if(x+1 == msg.length()){ //to print the last letter
					word+=letter;		 //of the sentence
				}
				//System.out.println(word);
				String sstring = msg.substring(x,msg.length()-1);
				String word2 = "";
				String letter2 = "";
				for(int i=x; i<sstring.length(); i++){
					letter2 = sstring.substring(i, i+1);
					if (sstring.substring(i,i+1).equals(word.substring(0,1))) {
						if ((sstring.length() - i) >= word.length()
								&& sstring.substring(i-1,i).equals(" ")
								&& sstring.substring(i,i+word.length()+1).equals(" ")) {
							word2+=letter2;
						} else{
							
							newMsg+=word;
						}
					}else{
						word2+=letter2;
						newMsg+=word2;
					}
				}
				word2 = "";

				word="";
			}else{
				word+=letter;
			}

		}
		
		System.out.println(newMsg);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void message(String msg) {
		String letter = "";
		String word = "";
		String word2 = "";
		String newMsg = "";
		String newMsg2 = "";
		for(int x=0; x<msg.length(); x++){
			letter = msg.substring(x,x+1);
			System.out.println("-----------------------------------------");
			System.out.println("Letter: "+letter);
			if(letter.equals(" ")){
				System.out.println("in if: "+x);
				System.out.println("Word: "+word);
				System.out.println("Msg before sent: "+msg.substring(x+1, msg.length()));
				msg = findAndReplace(msg.substring(x+1, msg.length()),word,"");
				msg = word + " " + msg.substring(1,msg.length());
				System.out.println("Msg after: "+msg);
				word2 = word2 + word;
				word = "";
			}else{
				word+=letter;
				System.out.println("Word in else: "+word+" "+x);
			}
			
			System.out.println("Word outside else: "+word+" "+x);
			

		}
		
		System.out.println(msg);

	}
	
	
	public static String findAndReplace(String msg, String lookfor, String replace) {
		int i;
		i = 0;
		String newmsg = "";
		for (; i < msg.length(); i++) {
			if (msg.substring(i, i + 1).equals(lookfor.substring(0, 1))) {
				if ((msg.length() - i) >= lookfor.length()) {
					if (msg.substring(i, i + lookfor.length()).equals(lookfor)) {
						try{
						if(!msg.substring(i-1).equals(" ") && !msg.substring(i,i+lookfor.length()).equals(" ")){
//							newmsg = newmsg + replace;
//							i = i + lookfor.length() - 1;

						}
						}catch(Exception e){
							newmsg = newmsg + replace;
							i = i + lookfor.length() - 1;
						}
						
					} else {
						newmsg = newmsg + msg.substring(i, i + 1);
					}
				}else{
					newmsg = newmsg + msg.substring(i, i + 1);
				}
			} else {
				newmsg = newmsg + msg.substring(i, i + 1);
			}

		}

		return newmsg;
	}
	
//	
//	public static String removeDuplicate(String word, String msg){
//	
//		
//	}

}
