class Collage{
	private int phy,che;

	public void physics(int a){
		if (a>=0 && a<=150) {
			phy =a;
		} else {
			phy = -1;
			System.out.println("Invalid physics marks");
		}
	}

	public void chemistry(int a){
		if (a>=0 && a<=150) {
			che =a;
		} else {
			che = -1;
			System.out.println("Invalid chemisty marks");
		}
	}

	public void showresult(){
		if (phy >=0 && che >=0) {
			System.out.println("physics: "+phy);
			System.out.println("chemisty: "+che);
		}
		
	}
}