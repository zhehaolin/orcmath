package zhehao;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class HolidayCard extends FullFunctionScreen {
	
	private Button button;
	private Graphic background;

	public HolidayCard(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		button = new Button(200,560,200,60,"click",Color.red,new Action() {
			
			@Override
			public void act() {
				HolidayCardGUI.test.setScreen(HolidayCardGUI.inside);
			}
		});
		background= new Graphic(0, 0, 600, 650, "resources/holidaycard.jpg");
		viewObjects.add(background);
		viewObjects.add(button);

	}

}
