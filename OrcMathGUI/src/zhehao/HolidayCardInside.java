package zhehao;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class HolidayCardInside extends FullFunctionScreen {
	
	private Graphic background;
	private TextArea text;
	private Button button;
	private Graphic logo;
	private Graphic commApp;
	private Graphic accepted;
	private Graphic denied;
	
	public HolidayCardInside(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		setCustomFont();
		//background.drawRect(0,0,getWidth(),getHeight());
		viewObjects.add(background);
		logo = new Graphic(30, 0, getWidth(), 140, "resources/asdw.png");
		viewObjects.add(logo);
		commApp = new Graphic(150,150,350,100, "resources/commapplogo.png");
		viewObjects.add(commApp);
		accepted = new Graphic(0,260, getWidth()/2-10,100,"resources/accept.jpg");
		viewObjects.add(accepted);
		denied = new Graphic(getWidth()/2+40,260, getWidth()/2-10,100,"resources/deny1.jpg");
		viewObjects.add(denied);
		text = new TextArea(150, 400, getWidth(), 200,"Good Luck");
		viewObjects.add(text);
	}
	private void setCustomFont(){
		InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("Miraculous&Christmas.ttf");
		try {
			Font font = Font.createFont(Font.TRUETYPE_FONT, stream).deriveFont(90f);
			StyledComponent.setBaseFont(font);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
