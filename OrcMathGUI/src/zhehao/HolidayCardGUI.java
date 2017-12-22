package zhehao;

import guiTeacher.GUIApplication;

public class HolidayCardGUI extends GUIApplication {
	
	static HolidayCardGUI test = new HolidayCardGUI(600,650);
	static HolidayCard front = new HolidayCard(500,700);
	static HolidayCardInside inside = new HolidayCardInside(500,700);

	public HolidayCardGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		
		HolidayCard front = new HolidayCard(500,700);
		setScreen(front);
		
		

	}
	public static void main(String[] args) {
		//HolidayCardGUI test= new HolidayCardGUI(600,650);
		Thread go= new Thread(test);
		go.start();
		
	}

}
