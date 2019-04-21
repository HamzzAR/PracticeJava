public class Task2{
	public static void main(String[] args){
		

			Task2 x = new Task2();
			// x.decimalToBinary(65);
			// x.binaryToDecimal("010010");
			x.getPower(2,0);
		

		}

	public void decimalToBinary(int a){

			String binary = "";
			while(a>=2){
				binary = a % 2 + " " + binary;
				a/=2;
			}
			binary = a  + " " + binary;
			System.out.println(binary);
		}

	public void binaryToDecimal(String a){

		int decimal = 0;
		int c = 0;
		for (int x=a.length()-1; x>=0; x--) {
			decimal += Math.pow(2,c)*Integer.parseInt(a.substring(x,x+1));
			c++;
		}

		System.out.println(decimal);
	}

	public void getPower(int n, int power){
		int i = n;
		//if power=0
		for (int x=0; x< power -1; x++) {
			i = n * i;
		}

		System.out.println(i);

		
	}


}