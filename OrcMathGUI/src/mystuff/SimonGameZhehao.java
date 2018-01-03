package mystuff;

import guiTeacher.GUIApplication;

public class SimonGameZhehao extends GUIApplication {
	
	static SimonGameZhehao game= new SimonGameZhehao(500,500);

	public SimonGameZhehao(int width, int height) {
		super(width, height);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		SimonScreenZhehao screen = new SimonScreenZhehao(400,400);
		setScreen(screen);

	}

	public static void main(String[] args) {
		Thread go= new Thread(game);
		go.start();
	}

}
