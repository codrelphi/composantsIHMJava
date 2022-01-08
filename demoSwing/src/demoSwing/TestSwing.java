package demoSwing;

import javax.swing.*;

public class TestSwing extends JFrame {

	public TestSwing() {
		setTitle("Window Main"); //titre //super("Main windows");
		setSize(500, 500); // dimension
		pack(); // show()
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		TestSwing ts = new TestSwing();
	}
}

