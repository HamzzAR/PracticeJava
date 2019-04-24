import java.awt.*;
public class Windows {
	static TextField t;

	public static void main(String[] args) {
		Frame f = new Frame("QA Cunsulting");
		Button b1,b2,b3,b4,b5;
		
		TextField t = new TextField();
		
		
		b1 = new Button("Click 1");
		b2 = new Button("Click 2");
		b3 = new Button("Click 3");
		b4 = new Button("Click 4");
		b5 = new Button("Click 5");
		
		MyEvent action = new MyEvent(2,2,t);
//		MyEvent2 action2 = new MyEvent2();
//		MyEvent3 action3 = new MyEvent3();
//		MyEvent4 action4 = new MyEvent4();
//		MyEvent5 action5 = new MyEvent5();
		
		b1.addActionListener(action);
//		b2.addActionListener(action2);
//		b3.addActionListener(action3);
//		b4.addActionListener(action4);
//		b5.addActionListener(action5);
		
		f.add(t,BorderLayout.NORTH);
		f.add(b1,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
		
		f.setSize(500,500);
		f.setVisible(true);
	}

} 
