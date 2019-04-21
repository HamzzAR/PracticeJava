class Accounts{
	public float tax(int Salary){
		float t;
		t = 0;
		if (Salary <1000) {
			t = (float) Salary*15/100;
		} if (Salary >=1000 && Salary<2000) {
			t = (float) Salary*20/100;
		} if (Salary >=2000) {
			t = (float) Salary*25/100;
		}

		return t;
	}
}