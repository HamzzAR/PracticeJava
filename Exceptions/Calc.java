public class Calc{
	public static void main(String[] args){
		int a,b,c;
		a=b=c=0;
		try{
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = a/b;
			System.out.println("The result is "+c);

		}
		catch(ArithmeticException e){
			System.out.println("You can't devide a number by zero");
		}
		catch(ArrayIndexOutOfBoundsException e2){
			System.out.println("Please send two nmumbers");
		}
		catch(NumberFormatException e3){
			System.out.println("Digits only please");
		} 
		catch(Exception e4){
			System.out.println("Oh boy, something went really wrong");
		}
	}
}