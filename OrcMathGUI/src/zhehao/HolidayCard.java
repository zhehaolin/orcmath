package zhehao;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class HolidayCard extends FullFunctionScreen {
	
	private Button button;

	public HolidayCard(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		button = new Button(220,600,30,30,"click",Color.darkGray,new Action() {
			
			@Override
			public void act() {
				HolidayCardGUI.test.setScreen(HolidayCardGUI.front);
			}
		});
		viewObjects.add(button);

	}

}
