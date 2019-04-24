import java.awt.*;
public class Windows {

	public static void main(String[] args) {
		Frame f = new Frame("QA Cunsulting");
		Button b1,b2,b3,b4,b5;
		b1 = new Button("Click 1");
		b2 = new Button("Click 2");
		b3 = new Button("Click 3");
		b4 = new Button("Click 4");
		b5 = new Button("Click 5");
		MyEvent action = new MyEvent();
		b1.addActionListener(action);
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
		f.setSize(500,500);
		f.setVisible(true);
	}

} 
