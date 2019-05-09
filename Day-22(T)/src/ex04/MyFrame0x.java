package ex04;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import ex01.MyFrame0x.WindowExit;

/*
 * 익명(중첩)클래스를 구현하여 이벤트를 등록하는 방법
 */

class MyActionListener implements ActionListener{
	private Label lb = null;
	
	public MyActionListener(Label lb) {
		this.lb = lb;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		Button bt = (Button)arg0.getSource();
		//arg0.getSource() 이벤트가 발생된 컴포넌트 참조를 반환하는 메서드
		//다운캐스팅해서 해당 컴포넌트의 멤버를 활용할 수 있다.
		System.out.println(bt.getLabel());
		if(bt.getLabel().equals("apple")) {
			lb.setText("사과");
		}else if(bt.getLabel().equals("banana")) {
			lb.setText("바나나");
		}else if(bt.getLabel().equals("bea")) {
			lb.setText("배");
		}
	}
	
}
public class MyFrame0x extends Frame{
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	
	
	//이 아래로 컴포넌트 객체 정의
	
	private Button bt = new Button("선택완료");
	private Label lb = new Label("선택 후 버튼 클릭",Label.CENTER);
	 
    Checkbox apple = new Checkbox("사과"); 
    Checkbox bea = new Checkbox("배");
    Checkbox banana = new Checkbox("바나나");
	
	private Panel p = new Panel();
	private GridLayout gl1 = new GridLayout();
	
	private void init() {
		//컴포넌트 등록
		
		
		this.add(bt);
		this.add(lb, BorderLayout.SOUTH);
		p.add(apple); p.add(bea); p.add(banana);
		this.add(p, BorderLayout.NORTH);
		
	}
	private void eventInit() {
		
		bt.addActionListener(new MyActionListener(lb));//버튼에 이벤트를 등록!
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
		
		init();	//컴포넌트를 초기화 하는 메서드
		eventInit();	//이벤트를 등록하는 메서드
	}
	
	public static void main(String[] args) {
		MyFrame0x f = new MyFrame0x("제목", 400, 250);
		f.setVisible(true);
	}
}
