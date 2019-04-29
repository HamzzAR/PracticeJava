
public class Duplicate {


	public static void main(String[] args) {
		duplicate("hi i am hi hamza");
	}
	
	
	public static void duplicate(String msg){
		String letter = "";
		String word = "";
		String previous = "";
		String output = "";
		boolean first = true;
		for(int x=0; x<msg.length(); x++) {
			
			letter = msg.substring(x, x+1);
			word+=letter;
			if(letter.equals(" ") || x == msg.length()-1) {
				
				String subWord = "";
				String subLetter = "";
				String subMsg = msg.substring(x+1,msg.length());
				for(int i=0; i<subMsg.length(); i++) {
					
					subLetter = subMsg.substring(i, i+1);
					subWord+=subLetter;
				
					if(subLetter.equals(" ") || i == subMsg.length()-1) {
						System.out.println("word : "+word);
						System.out.println("subword: "+subWord);
						if(word.equals(subWord)) {
							
						}else {
							if(first) {
								output+=subWord;
							}
							
						}
						
						subWord = "";
					}

				}
				if(first) {
					first = false;
				}
				System.out.println("output: "+output);
				System.out.println("-------------"+x);
				

				word = "";
			}
			
		}
		
		output = word + " " + output;
		System.out.println(output);
		
	}
	

}
