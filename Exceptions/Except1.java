
public class Except1 {

	public static void main(String[] args) {
		
		try{
			int r = 4/0;
			System.out.println(r);
		} catch(ArithmeticException a){
			System.out.println("Do not devide by 0 my friend");
		}
	}

}
