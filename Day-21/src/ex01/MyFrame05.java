package ex01;

import java.awt.*;

public class MyFrame05 extends Frame {
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	
	//ÀÌ ¾Æ·¡·Î ÄÄÆ÷³ÍÆ® °´Ã¼ Á¤ÀÇ
	private Button bt1 = new Button("±è");
	private Button bt2 = new Button("´ö");
	private Button bt3 = new Button("¹è");
	private Button bt4 = new Button("´ö");
	private Button bt5 = new Button("¹è");
	private Panel pn1 = new Panel();
	private Panel pn2 = new Panel();
	private void init() {
		//ÄÄÆ÷³ÍÆ® µî·Ï 
		pn1.setLayout(new GridLayout(2,1));
		pn1.add(bt1);
		pn1.add(bt2);
		
		pn2.add(bt3);
		pn2.setLayout(new GridLayout(1,2));
		pn2.add(pn1);
		
		//PanelÀÇ default ·¹ÀÌ¾Æ¿ôÀº FlowLayoutÀÌ´Ù.
		this.add(pn2,BorderLayout.SOUTH);
		
	}
	private void eventInit() {
		//ÀÌº¥Æ® µî·Ï
	}
	
	public MyFrame05(String t, int w, int h) {
		super(t);
		size.width = w;
		size.height = h;
		setSize(size);
		loc.x = (screenSize.width/2) - (getWidth()/2);
		loc.y = (screenSize.height/2) - (getHeight()/2);
		setLocation(loc);
		setResizable(false);
		
		init();
		eventInit();
	}
	public static void main(String[] args) {
		MyFrame05 f = new MyFrame05("±è´ö¹è",400,500);
		f.setVisible(true);
	}
}
