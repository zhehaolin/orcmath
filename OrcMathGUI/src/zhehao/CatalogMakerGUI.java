package zhehao;

import guiTeacher.GUIApplication;

public class CatalogMakerGUI extends GUIApplication {

	public CatalogMakerGUI(int width, int height) {
		super(width, height);
		setVisible(true);
		
	}

	@Override
	public void initScreen() {
		CatalogScreen screens = new CatalogScreen(getWidth(),getHeight());
		setScreen(screens);

	}

	public static void main(String[] args) {
		CatalogMakerGUI sample = new CatalogMakerGUI(800, 550);
		Thread go = new Thread(sample);
		go.start();

	}

}
