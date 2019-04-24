import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;


public class Maths66 {

	public static void main(String[] args) {
		
		Frame f = new Frame("Calculator");
		Button b1,b2,b3,b4;
		TextField  t1,t2,t3;

		b1 = new Button("+");
		b2 = new Button("-");
		b3 = new Button("x");
		b4 = new Button("/");
		
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField(10);
		
		MyEvent plus = new MyEvent(t3,t1,t2);
		MyEvent2 minus = new MyEvent2(t3,t1,t2);
		MyEvent3 times = new MyEvent3(t3,t1,t2);
		MyEvent4 divide = new MyEvent4(t3,t1,t2);
		
		b1.addActionListener(plus);
		b2.addActionListener(minus);
		b3.addActionListener(times);
		b4.addActionListener(divide);
		
		FlowLayout fl = new FlowLayout();
		f.setLayout(fl);
		
		f.add(t1);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(t3);
		
		f.setSize(600,200);
		f.setVisible(true);
	}

}
