package zhehao;

import guiTeacher.GUIApplication;

public class HolidayCardGUI extends GUIApplication {
	
	static HolidayCardGUI test = new HolidayCardGUI(500,700);
	static HolidayCard front = new HolidayCard(500,700);
	static HolidayCard inside = new HolidayCard(500,700);

	public HolidayCardGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		HolidayCard card= new HolidayCard(getWidth(),getHeight());
		setScreen(card);

	}
	public static void main(String[] args) {
		HolidayCardGUI test= new HolidayCardGUI(500,700);
		Thread go= new Thread(test);
		go.start();
	}

}
