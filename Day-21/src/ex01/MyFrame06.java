package ex01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.*;

public class MyFrame06 extends Frame {
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	
	//ÀÌ ¾Æ·¡·Î ÄÄÆ÷³ÍÆ® °´Ã¼ Á¤ÀÇ
	private Button bt1 = new Button("bt1");
	private Button bt2 = new Button("bt2");
	private Button bt3 = new Button("bt3");
	private Button bt4 = new Button("bt4");
	private Button bt5 = new Button("bt5");
	private Button bt6 = new Button("bt6");
	private Button bt7 = new Button("bt7");
	private Button bt8 = new Button("bt8");
	private Button bt9 = new Button("bt9");
	private Button bt10 = new Button("bt10");
	private Button bt11= new Button("bt11");
	private Button bt12 = new Button("bt12");
	private Button bt13 = new Button("bt1");
	private Button bt14 = new Button("bt2");
	private Button bt15 = new Button("bt3");
	private Button bt16 = new Button("bt4");
	private Button bt17 = new Button("bt5");
	private Button bt18 = new Button("bt6");
	private Button bt19 = new Button("bt7");
	private Button bt20 = new Button("bt8");
	private Button bt21 = new Button("bt9");
	private Button bt22 = new Button("bt10");
	private Button bt23= new Button("bt11");
	private Button bt24 = new Button("bt12");
	
	private void init() {
		//ÄÄÆ÷³ÍÆ® µî·Ï 
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		this.add(bt6);
		this.add(bt7);
		this.add(bt8);
		this.add(bt9);
		this.add(bt10);
		this.add(bt11);
		this.add(bt12);
		this.add(bt13);
		this.add(bt14);
		this.add(bt15);
		this.add(bt16);
		this.add(bt17);
		this.add(bt18);
		this.add(bt19);
		this.add(bt20);
		this.add(bt21);
		this.add(bt22);
		this.add(bt23);
		this.add(bt24);
		bt1.setBounds(1,30,100,40);
		bt2.setBounds(1,70,100,40);
		bt3.setBounds(1,110,100,40);
		bt4.setBounds(1,150,100,40);
		bt5.setBounds(1,190,100,40);
		bt6.setBounds(1,230,100,40);
		bt7.setBounds(1,270,100,40);
		bt8.setBounds(1,310,100,40);
		bt9.setBounds(1,350,100,40);
		bt10.setBounds(1,390,100,40);
		bt11.setBounds(1,430,100,40);
		bt12.setBounds(1,470,100,40);
		bt13.setBounds(100,30,100,40);
		bt14.setBounds(100,70,100,40);
		bt15.setBounds(100,110,100,40);
		bt16.setBounds(100,150,100,40);
		bt17.setBounds(100,190,100,40);
		bt18.setBounds(100,230,100,40);
		bt19.setBounds(100,270,100,40);
		bt20.setBounds(100,310,100,40);
		bt21.setBounds(100,350,100,40);
		bt22.setBounds(100,390,100,40);
		bt23.setBounds(100,430,100,40);
		bt24.setBounds(100,470,100,40);
		
		this.setLayout(null);
	}
	private void eventInit() {
		//ÀÌº¥Æ® µî·Ï
	}
	
	public MyFrame06(String t, int w, int h) {
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
		MyFrame06 f = new MyFrame06("±è´ö¹è",400,500);
		f.setVisible(true);
	}
}
