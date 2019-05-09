package ex01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.*;

public class MyFrame12 extends Frame {
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	
	//이 아래로 컴포넌트 객체 정의
	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("FILE");
	private MenuItem fnew = new MenuItem("NEW");
	private MenuItem fopen = new MenuItem("OPEN");
	private MenuItem fsave = new MenuItem("SAVE");
	private MenuItem fexit = new MenuItem("EXIT");
	
	private Menu edit = new Menu("EDIT");
	private Menu ecolor = new Menu("COLOR");
	private CheckboxMenuItem red_cb = new CheckboxMenuItem("RED");
	private CheckboxMenuItem green_cb = new CheckboxMenuItem("GREEN");
	private CheckboxMenuItem blue_cb = new CheckboxMenuItem("BLUE");
	private Menu esize = new Menu("SIZE");
	
	private Menu help = new Menu("HELP");
	private MenuItem hver = new MenuItem("VERSION");
	
	private void init() {
		//컴포넌트 등록 
		file.add(fnew);		
		file.addSeparator();//메뉴사이의 분할선		
		file.add(fopen);
		file.add(fsave);	
		file.addSeparator();
		file.add(fexit);
		mb.add(file);
		
		ecolor.add(red_cb);
		ecolor.add(green_cb);
		ecolor.add(blue_cb);
		edit.add(ecolor);
		edit.addSeparator();
		edit.add(esize);
		mb.add(edit);
		
		help.add(hver);
		mb.add(help);
		this.setMenuBar(mb);
	}
	private void eventInit() {
		//이벤트 등록
	}
	
	public MyFrame12(String t, int w, int h) {
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
		MyFrame12 f = new MyFrame12("김덕배",400,500);
		f.setVisible(true);
	}
}
