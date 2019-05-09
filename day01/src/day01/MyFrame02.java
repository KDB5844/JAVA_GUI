package day01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;

public class MyFrame02 extends Frame{
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	
	//이 아래로 컴포넌트 객체 정의
	private Button bt1 = new Button("bt1");
	private Button bt2 = new Button("bt2");
	private Button bt3 = new Button("bt3");
	private Button bt4 = new Button("bt4");
	private Button bt5 = new Button("bt5");
	
	private void init() {
		//컴포넌트 등록 
		//Frame은 default로 BorderLayout이다.
		this.add(bt1, BorderLayout.NORTH);
		this.add(bt2, "South");
		this.add(bt3, BorderLayout.EAST);
		this.add(bt4, BorderLayout.WEST);
		this.add(bt5, "Center");
	}
	private void eventInit() {
		//이벤트 등록
	}
	
	public MyFrame02(String t, int w, int h) {
		super(t);
		size.width = w;
		size.height = h;
		setSize(size);
		loc.x = (screenSize.width/2) - (getWidth()/2);
		loc.y = (screenSize.height/2) - (getHeight()/2);
		setLocation(loc);
		setResizable(false);
		
		init();	//컴포넌트를 초기화 하는 메서드
		eventInit();	//이벤트를 등록하는 메서드
	}
	
	public static void main(String[] args) {
		MyFrame02 f = new MyFrame02("제목", 400, 500);
		f.setVisible(true);
	}
}
