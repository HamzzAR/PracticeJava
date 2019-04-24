import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyEvent2 implements ActionListener{
	TextField v1,v2;
	TextField txt,txt1,txt2;
	
	public MyEvent2(TextField t, TextField t1, TextField t2) {
		v1 = t1;
		v2 = t2;
		txt = t;
	}
		
	@Override
	public void actionPerformed(ActionEvent arg0) {
		double r = Integer.parseInt(v1.getText()) - Integer.parseInt(v2.getText());
		String res = String.valueOf(r);
		txt.setText(res);
		System.out.println(res);
	}
}
