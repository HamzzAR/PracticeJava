
public class Main2 {

	public static void main(String[] args) {
		
		Line l = new Line();
		letsDraw(l);
		Circle c = new Circle();
		letsDraw(c);
	}
	
	private static void letsDraw(Drawing ref) {
		ref.drawSomething();
	}

}

abstract class Drawing{
	abstract void drawSomething();
}

class Line extends Drawing{
	 void drawSomething(){
		System.out.println("Drawing Line");
	}
}

class Circle extends Drawing{
	@Override
	void drawSomething() {
		System.out.println("Draw Circle");
		
	}
}
