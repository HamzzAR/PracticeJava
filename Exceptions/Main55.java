public class Main55{
	public static void main(String[] args) {
		Accounts3 QA = new Accounts3();
		try {
			QA.tax(9500,4);
		} catch (AbsentException e) {
			// TODO Auto-generated catch block
			System.out.println("You you can go back home my friend!");
		}
	}
}


class Accounts3 {
	
	public void tax(int salary, int absenties) throws AbsentException{
		float t =0;
		if(absenties>=5){
			AbsentException e = new AbsentException();
			throw e;
		} else{
			t = (float)salary*15/100;
			System.out.println(t);
		}
	}
}
