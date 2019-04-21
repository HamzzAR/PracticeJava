class Message{
	public void printMessage(String n){
		System.out.println(n);
		System.out.println(n.length());
		System.out.println(n.substring(3,7));
	}

	public void wordCount(String x){
		int count = 0;
		if (x.length()==1) {
			count =1;
		}
		else{ 
			for (int a=0;a<x.length();a++) {
			if (x.substring(a,a+1).equals(" ")) {
				count++;
			}
		}
		count++;
		}
		
		System.out.println(x + "\nWords: "+count);

	}

	public String printMessage2(String x){

		String sub = "";
		for (int a=0;a<x.length();a++) {
			if (x.substring(a,a+1).equals(" ")) {
				System.out.println(sub);
				sub = "";
			}
			else{
				sub+=x.substring(a,a+1);
			}


	}
	return sub;
}

	public void printMessage3a(String x){
		String sub = "";
		String back = "";
		for (int a=x.length()-1;a>=0;a--) {
			if (x.substring(a,a+1).equals(" ")) {
				System.out.println(sub);
				sub="";
			}
			else{
				sub=x.substring(a,a+1)+sub;
			}
	}
	System.out.println(sub);


	}

	

	public void printMessage3(String x){
		String sub = "";
		String back = "";
		for (int a=0;a<x.length();a++) {
			if (x.substring(a,a+1).equals(" ")) {
				back = sub + " "+back;
				sub = "";
			}
			else{
				sub+=x.substring(a,a+1);
			}

			if (a == x.length()-1) {
				back = sub+" "+back;
			}


	}
	//System.out.println(sub);
	back = printMessage2(back);
	System.out.println(back);


	}


}