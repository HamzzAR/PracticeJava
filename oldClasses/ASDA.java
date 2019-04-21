public class ASDA{
	public static void main(String[] args){

		Shop asda = new Shop();
		asda.message();
		asda.quantity = 2;
		asda.price = 1.25f;
		System.out.println("Total Price: "+asda.quantity * asda.price);
	}
}