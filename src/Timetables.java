
public class Timetables {

	public static void main(String[] args) {
		int a = 1;
		while (a<=10){
			if (a % 2 == 0){
				int t = 1;
				while (t<=a){
					System.out.println("Timetable of: "+t);
					int b = 1;
					while (b<=10){
						System.out.println(t+" x "+b+" = "+t*b);
						b++;
					}
					t++;
				}
			} else{
				int t=a;
				while(t>0){
					System.out.println("Timetable of: "+t);
					int b = 1;
					while(b<=10){
						System.out.println(t+" x "+b+" = "+t*b);
						b++;
					}
					t--;
				}
			}
			a++;
		}

	}

}
