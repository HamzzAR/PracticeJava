import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RealCalculator implements ActionListener {
	Button bplus,bminus,btimes,bdivide,bcancel,bequal;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	TextField  screen;
	String num = "";
	String num2 = "";
	String operation = "";
	String v1,v2 = "0";
	
	
	public RealCalculator() {
		Frame f = new Frame("Real Calculator");
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(4,4));

		bplus = new Button("+");
		bminus = new Button("-");
		btimes = new Button("x");
		bdivide = new Button("/");
		bcancel = new Button("C");
		bequal = new Button("=");
		bequal.setForeground(Color.GREEN);
		bcancel.setForeground(Color.RED);
		
		b0 = new Button("0"); b4 = new Button("4"); b7 = new Button("7");
		b1 = new Button("1"); b5 = new Button("5"); b9 = new Button("9");
		b2 = new Button("2"); b6 = new Button("6"); b8 = new Button("8");
		b3 = new Button("3"); 

		screen = new TextField(30);
		screen.setBackground(Color.GREEN);;

		bplus.addActionListener(this);
		bminus.addActionListener(this);
		btimes.addActionListener(this);
		bdivide.addActionListener(this);
		bcancel.addActionListener(this);
		bequal.addActionListener(this);
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		
		
		p1.add(screen);
		p2.add(b1); p2.add(b2); p2.add(b3); p2.add(bplus); 
		p2.add(b4); p2.add(b5); p2.add(b6); p2.add(bminus);
		p2.add(b7); p2.add(b8); p2.add(b9); p2.add(btimes);
		p2.add(b0); p2.add(bcancel); p2.add(bequal); p2.add(bdivide);
		
		f.add(p1,BorderLayout.NORTH);
		f.add(p2,BorderLayout.CENTER);
		
		
		
		f.setSize(400,400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new RealCalculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button) e.getSource();
		
		
		
		if(btn == bplus){
			operation = "+";
			if(!num.equals("")) {
				v1 = num;
			}else {
				v1 = v2;
			}
			
			num = "";
			screen.setText("");
		}
		else if(btn == bminus){
			operation = "-";
			if(!num.equals("")) {
				v1 = num;
			}else {
				v1 = v2;
			}
			num = "";
			screen.setText("");
		}
		else if(btn == btimes){
			operation = "*";
			if(!num.equals("")) {
				v1 = num;
			}else {
				v1 = v2;
			}
			num = "";
			screen.setText("");
		}
		else if(btn == bdivide){
			operation = "/";
			if(!num.equals("")) {
				v1 = num;
			}else {
				v1 = v2;
			}
			num = "";
			screen.setText("");
		}
		else if(btn == bcancel){
			num = "";
			v1 = "";
			v2 = "";
			operation = "";
			screen.setText(num);
		}
		
		else if(btn == bequal){
			if(!operation.equals("")){
				String res = "";
				if(!num.equals("")) {
					v2 = num;
				}
				
				switch (operation) {
				case "+":
					res = Double.toString((Double.parseDouble(v1)  + Double.parseDouble(v2)));
					break;
				case "-":
					res = Double.toString((Double.parseDouble(v1)  - Double.parseDouble(v2)));
					break;
				case "*":
					res = Double.toString((Double.parseDouble(v1)  * Double.parseDouble(v2)));
					break;
				case "/":
					res = Double.toString((Double.parseDouble(v1)  / Double.parseDouble(v2)));
					break;
				}
				
				screen.setText(res);
				v2 = screen.getText();
				v1 = "";
				num = "";
				operation = "";
			}
			
			
		}
		else{
			if(!operation.equals("")) {
				num+=btn.getLabel();
				screen.setText(screen.getText()+btn.getLabel());
			}else {
				screen.setText("");
				num+=btn.getLabel();
				screen.setText(screen.getText()+btn.getLabel());
			}
			
		}
		
		
		
	}

}
