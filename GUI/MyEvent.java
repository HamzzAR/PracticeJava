import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyEvent implements ActionListener{
	TextField t;
	
	public MyEvent(TextField t) {
		this.t = t;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		t.setText("Hello My Friends");
		
	}
}
