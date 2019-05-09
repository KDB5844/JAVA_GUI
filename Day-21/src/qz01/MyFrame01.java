package qz01;

import javax.swing.border.Border;

import java.awt.*;

public class MyFrame01 extends Frame {
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	
	//ÀÌ ¾Æ·¡·Î ÄÄÆ÷³ÍÆ® °´Ã¼ Á¤ÀÇ
	private Font font = new Font("¸¼Àº°íµñ", Font.BOLD, 30);
	private Color Red = new Color(255,0,0);
	private Color Blue = new Color(0,0,255);
	private Color Black = new Color(0,0,0);
	private Color Yellow = new Color(255,255,0);
	private Color Green = new Color(128,255,0);
	private Color Orange = new Color(255,128,0);
	private Color Pink = new Color(255,128,255);
	private Color Mint = new Color(0,255,255);
	private Color White = new Color(255,255,255);
	
	private BorderLayout bl1 = new BorderLayout();
	private Button bt1 = new Button("bt1");
	private Button bt2 = new Button("bt2");
	private Button bt3 = new Button("bt3");
	private Button bt4 = new Button("bt4");
	private Button bt5 = new Button("bt5");
	private Button bt6 = new Button("bt6");
	private Button bt7 = new Button("bt7");
	private Button bt8 = new Button("bt8");
	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	private Panel p3 = new Panel();
	private Panel p4 = new Panel();
	
	private BorderLayout bl2 = new BorderLayout();
	private Panel p5 = new Panel();
	private Button bt9 = new Button("bt9");
	private Button bt10 = new Button("bt10");
	private Button bt11 = new Button("bt11");
	private Button bt12 = new Button("bt12");
	private Button bt13 = new Button("bt13");
	
	
	private BorderLayout bl3 = new BorderLayout();
	private Panel p6 = new Panel();
	private Button bt14 = new Button("Quiz!!");
	
	private void init() {
		
		p1.setLayout(new GridLayout(1,2));
		bt1.setBackground(White);
		p1.add(bt1);
		bt2.setBackground(Black);
		p1.add(bt2);
		
		p2.setLayout(new GridLayout(1,2));
		bt3.setBackground(Black);
		p2.add(bt3);
		bt4.setBackground(White);
		p2.add(bt4);
		
		p3.setLayout(new GridLayout(2,1));
		bt5.setBackground(Red);
		p3.add(bt5);
		bt6.setBackground(Yellow);
		p3.add(bt6);
		
		p4.setLayout(new GridLayout(2,1));
		bt7.setBackground(Yellow);
		p4.add(bt7);
		bt8.setBackground(Blue);
		p4.add(bt8);
		
		bt9.setBackground(Red);
		bt10.setBackground(Pink);
		bt11.setBackground(Green);
		bt12.setBackground(Orange);
		
		p5.setLayout(new BorderLayout());
		p5.add(bt9,BorderLayout.SOUTH);
		p5.add(bt10,BorderLayout.NORTH);
		p5.add(bt11,BorderLayout.WEST);
		p5.add(bt12,BorderLayout.EAST);
		p5.add(bt13,BorderLayout.CENTER);
		
		
		
		p5.add(p6);
		p6.setLayout(null);
		p6.add(bt14);
		bt14.setBackground(Mint);
		bt14.setFont(font);
		bt14.setBounds(65,10,130,70);
		
		
		
		
		this.setLayout(bl1);
		this.add(p1,BorderLayout.SOUTH);
		this.add(p2,BorderLayout.NORTH);
		this.add(p3,BorderLayout.EAST);
		this.add(p4,BorderLayout.WEST);
		this.add(p5,BorderLayout.CENTER);
		
		
		
		//ÄÄÆ÷³ÍÆ® µî·Ï 
	}
	private void eventInit() {
		//ÀÌº¥Æ® µî·Ï
	}
	
	public MyFrame01(String t, int w, int h) {
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
		MyFrame01 f = new MyFrame01("±è´ö¹è",400,500);
		f.setVisible(true);
	}
}
