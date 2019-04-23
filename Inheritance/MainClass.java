public class MainClass{
	
	 public static void main(String[] args) {
		HSBC hsbc = new HSBC();
		hsbc.deposite(100);
		hsbc.showBalance();
		hsbc.withdraw(50);
		hsbc.showBalance();
	}
}

abstract class Banks{
	int amount;
	public void showBalance() {
		System.out.println("Your current balacne is "+amount);
	}
	
	abstract void deposite(int a);
	abstract void withdraw(int a);
	
}

class HSBC extends Banks{
	
	public void deposite(int a){
		amount+=a;
	}
	
	public void withdraw(int a){
		if(a<=amount){
			amount-=a;
		} else{
			System.out.println("You dont have enough balance my friend!!");
		}
	}
}


class Maths {
	public void addition(int a, int b){
		System.out.println(a+b);
	}
	
	public void substraction(int x, int y) {
		int r = x-y;
		System.out.println("Result: "+r);
	}
}

class Maths3 extends MainClass{
	
	
	public void addition(int a, int b){
		int result = a +b;
		System.out.println("Result: "+result);
	}
}


class Maths2 extends MainClass{
	private void multi(int x, int y) {
		System.out.println("Result: "+(x*y));
	}
}

