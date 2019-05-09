package ex01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import java.awt.*;

public class MyFrame01 extends Frame{
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	GridLayout g1 = new GridLayout(12,1);
	
	
	//이 아래로 컴포넌트 객체 정의
	
	public class WindowExit extends WindowAdapter { //종료 
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
	}
	
	class ButtonListener implements ActionListener{
		Frame frame;
		public ButtonListener(Frame f) {
			frame=f;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			System.out.println(command+"버튼을 눌렀다.");
			
			if(command.equals("파랑")){
				frame.setBackground(Color.blue);
				JOptionPane.showMessageDialog(frame, "파랑색 입니다.");
			}else if(command.equals("빨강")){
				frame.setBackground(Color.red);
				JOptionPane.showMessageDialog(frame, "빨강색 입니다.");
			}else if(command.equals("초록")){
				frame.setBackground(Color.green);
				JOptionPane.showMessageDialog(frame, "초록색 입니다.");
			}else if(command.equals("노랑")){
				frame.setBackground(Color.yellow);
				JOptionPane.showMessageDialog(frame, "노랑색 입니다.");
			}else if(command.equals("검정")){
				frame.setBackground(Color.black);
				JOptionPane.showMessageDialog(frame, "검정색 입니다.");
			}else if(command.equals("하늘")){
				frame.setBackground(Color.cyan);
				JOptionPane.showMessageDialog(frame, "하늘색 입니다.");
			}
		}
	}
	ButtonListener btnListener = new ButtonListener(this);
	private void init() {
		Button bt1 = new Button("파랑");
		Button bt2 = new Button("빨강");
		Button bt3 = new Button("초록");
		Button bt4 = new Button("노랑");
		Button bt5 = new Button("검정");
		Button bt6 = new Button("하늘");
		//컴포넌트 등록 
		setLayout(g1);
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		this.add(bt6);
		this.addWindowListener(new WindowExit()); //종료
		bt1.addActionListener(btnListener);
		bt2.addActionListener(btnListener);
		bt3.addActionListener(btnListener);
		bt4.addActionListener(btnListener);
		bt5.addActionListener(btnListener);
		bt6.addActionListener(btnListener);
	}
	private void eventInit() {
		
		
		//이벤트 등록
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
		MyFrame01 f = new MyFrame01("김덕배",400,500);
		f.setVisible(true);
		
	}
	
}
