
public class StringInOrder {
	static int c =0;

	public static void main(String[] args) {
		
		StringAssenOrder("a aa");

	}
	
	public static void StringAssenOrder(String msg){
		
		String letter = "";
		String word = "";
		String old = "";
		String newMsg = "";
		for(int x=0; x<msg.length(); x++){
			letter = msg.substring(x, x+1);
			
			if(letter.equals(" ") || x==msg.length()-1){
				System.out.println("came in first if");
				if(newMsg.equals("")) {
					newMsg+=word;
				}else {
					System.out.println("came in first else");
					String letter2 ="";
					String word2 = "";
					for(int i=0; i<newMsg.length(); i++) {
						letter2 = newMsg.substring(i, i+1);
						if(letter2.equals(" ") || i==newMsg.length()-1) {
							if(word.length() > word2.length()) {
								System.out.println("did if");
								  continue;
							} else {
								System.out.println("did else");
								newMsg = newMsg.substring(0,i-word2.length()) + newMsg.substring(i-word2.length(),i) + newMsg.substring(i,newMsg.length());
								break;
							}
						}
						word2+=letter2;
					}
				}
			} else{ 
				word+=letter;
			}
			
		}
		
		System.out.println(newMsg);
	}

}
