package qz02;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public  class MyFrame0x extends Frame {
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	
	//ÀÌ ¾Æ·¡·Î ÄÄÆ÷³ÍÆ® °´Ã¼ Á¤ÀÇ
	private Font font = new Font("¸¼Àº°íµñ", Font.BOLD, 35);
	private Font font2 = new Font("¸¼Àº°íµñ", Font.LAYOUT_RIGHT_TO_LEFT, 105);
	private Font font1 = new Font("¸¼Àº°íµñ",0,18);
	private Color Red = new Color(255,0,0);
	private Button bt1 = new Button("¡¾");
	private Button bt2 = new Button("0");
	private Button bt3 = new Button(".");
	private Button bt4 = new Button("=");
	private Button bt5 = new Button("1");
	private Button bt6 = new Button("2");
	private Button bt7 = new Button("3");
	private Button bt8 = new Button("+");
	private Button bt9 = new Button("4");
	private Button bt10 = new Button("5");
	private Button bt11 = new Button("6");
	private Button bt12 = new Button("-");
	private Button bt13 = new Button("7");
	private Button bt14 = new Button("8");
	private Button bt15 = new Button("9");
	private Button bt16 = new Button("x");
	private Button bt17 = new Button("CE");
	private Button bt18 = new Button("C");
	private Button bt19 = new Button("<=");
	private Button bt20 = new Button("+");
	private Button bt21 = new Button("%");
	private Button bt22 = new Button("¡î");
	private Button bt23 = new Button("X©÷");
	private Button bt24 = new Button("©ö/X");
	private Button bt25 = new Button("MC");
	private Button bt26 = new Button("MR");
	private Button bt27 = new Button("M+");
	private Button bt28 = new Button("M-");
	private Button bt29 = new Button("MS");
	private Button bt30 = new Button("M©ú");
	private Label lb = new Label("0",Label.RIGHT);
	private TextField tf = new TextField();
	private Panel p = new Panel();
	private Panel p1 = new Panel();
	private BorderLayout bl = new BorderLayout();
	private BorderLayout b2 = new BorderLayout();
	private GridLayout gl = new GridLayout(6,5);
	private GridLayout gl1 = new GridLayout(1,6);
	 
	public class WindowExit extends WindowAdapter {
	        public void windowClosing(WindowEvent e) {
	            System.exit(0);
	        }
	    }
	
	private void init() {			
		
		this.setLayout(bl);
		p.setLayout(gl);
		p.add(bt21);		p.add(bt22);		p.add(bt23);		p.add(bt24);		p.add(bt17);		p.add(bt18);		p.add(bt19);		p.add(bt20);		p.add(bt13);		p.add(bt14);		p.add(bt15);		p.add(bt16);		p.add(bt9);		p.add(bt10);		p.add(bt11);		p.add(bt12);		p.add(bt5);		p.add(bt6);		p.add(bt7);		p.add(bt8);		p.add(bt1);		p.add(bt2);		p.add(bt3);		p.add(bt4);
		bt2.setFont(font);		bt5.setFont(font);		bt6.setFont(font);		bt7.setFont(font);		bt9.setFont(font);		bt10.setFont(font);		bt11.setFont(font);		bt13.setFont(font);		bt14.setFont(font);		bt15.setFont(font);		bt2.setForeground(Red);
		bt5.setForeground(Red);		bt6.setForeground(Red);		bt7.setForeground(Red);		bt9.setForeground(Red);		bt10.setForeground(Red);		bt11.setForeground(Red);		bt13.setForeground(Red);		bt14.setForeground(Red);		bt15.setForeground(Red);
		
		lb.setFont(font2);
		this.add("South",p);
		this.add("Center",p1);
		this.add("North",lb);
		
		p1.setLayout(b2);
		p1.setLayout(gl1);
		
		p1.add(bt25);	p1.add(bt26);	p1.add(bt27);	p1.add(bt28);	p1.add(bt29);	p1.add(bt30);
		bt25.setForeground(Red);	bt26.setForeground(Red);	bt27.setForeground(Red);	bt28.setForeground(Red);	bt29.setForeground(Red);	bt30.setForeground(Red);
		this.addWindowListener(new WindowExit());
		
		
		//ÄÄÆ÷³ÍÆ® µî·Ï 
	}
	private void eventInit() {
		//ÀÌº¥Æ® µî·Ï
	}
	
	public MyFrame0x(String t, int w, int h) {
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
		MyFrame0x f = new MyFrame0x("°è¼¡±â",400,500);
		f.setVisible(true);
		
		
	}
}
