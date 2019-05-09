package ex01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;



import java.awt.*;


public class MyFrame0 extends Frame implements ActionListener{
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	
	//이 아래로 컴포넌트 객체 정의
	Button bt1 = new Button("선택 완료");
	Checkbox c1 = new Checkbox("사과");
	Checkbox c2 = new Checkbox("배");
	Checkbox c3 = new Checkbox("바나나");
	private Label lb = new Label("선택 후 버튼 클릭",Label.CENTER);
	private GridLayout gl1 = new GridLayout(3,1);
	Panel p = new Panel(); 
	public class WindowExit extends WindowAdapter { //종료 
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
	}
	private void init() {
		setLayout(gl1);
		p.add(c1);
		p.add(c2);
		p.add(c3);
		this.add(p,"North");
		this.add(bt1,"Center");
		this.add(lb,"South");
				
		//컴포넌트 등록 
		this.addWindowListener(new WindowExit()); //종료
	}
	private void eventInit() {
		//이벤트 등록
		bt1.addActionListener(this);
		
	}
	
	public MyFrame0(String t, int w, int h) {
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
		MyFrame0 f = new MyFrame0("김덕배",350,300);
		f.setVisible(true);
		
	}

		

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals("사과")) {
			JOptionPane.showMessageDialog(this, "사과");
		}else if(c2.equals("배")){
			JOptionPane.showMessageDialog(this, "배");
		}else if(c3.equals("바나나")){
			JOptionPane.showMessageDialog(this, "바나나");
		}else if(c1.equals("사과") && c2.equals("배")){
			JOptionPane.showMessageDialog(this, "사과  배");
		}else if(c1.equals("사과") && c3.equals("바나나")){
			JOptionPane.showMessageDialog(this, "사과  바나나");
		}else if(c2.equals("배") && c3.equals("바나나")){
			JOptionPane.showMessageDialog(this, "배  바나나");
		}else {
			JOptionPane.showMessageDialog(this, "아무것도");
		}
		
	}
}
