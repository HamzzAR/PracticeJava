class Timetable{
	
	public void timeTable(int a){
		System.out.println("Timetable of "+a+"\n---------------");
		for (int x=1; x<=10; x++) {
			System.out.println(a+" x "+x+" = "+a*x);
		}
	}

	public void timeTable2(int a,int b){
		System.out.println("Timetable of "+a+"\n---------------");
		for (int x=1; x<=b; x++) {
			System.out.println(a+" x "+x+" = "+a*x);
		}
	}

	public void timeTable3(int a, int b){
		for (int i=a; i<=b; i++) {
			System.out.println("Timetable of "+i+"\n---------------");
			for (int x=1; x<=10; x++) {
			System.out.println(i+" x "+x+" = "+i*x);
			}
			System.out.println();	
		}
	}
}