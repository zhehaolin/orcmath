package TestPratice;

import guiTeacher.GUIApplication;

public class MainGUI extends GUIApplication {
	public static MainGUI test;
	public static MainScreen myscreen;
	
	public MainGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}
	

	@Override
	public void initScreen() {
		myscreen= new MainScreen(getWidth(),getHeight());
		setScreen(myscreen);

	}
	public static void main(String[] args) {
		test=new MainGUI(500,500);
		Thread go= new Thread(test);
		go.start();
	}

}
