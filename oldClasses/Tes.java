public class Tes{
	public static void main(String[] args){

		Tesco shop1,shop2;
		shop1 = new Tesco();
		shop1.qty =2;
		shop1.price = 1.2f;
		shop1.calculate();
		shop1.showdetails();

		shop2 = new Tesco();
		shop2.qty =3;
		shop2.price = 1.2f;
		shop2.calculate();
		shop2.showdetails();
}

}