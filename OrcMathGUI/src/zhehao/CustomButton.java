package zhehao;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class CustomButton extends Button {
	private String string1;
	private String string2;
	private Color hi;

	public CustomButton(int x, int y) {
		super(x, y, 500, 500, "bott", null, null);
		// TODO Auto-generated constructor stub
	}

	public CustomButton(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, text, action);
		// TODO Auto-generated constructor stub
	}
	public void drawButton(Graphics2D g, boolean hover) {
		g.setColor(Color.black);
		g.drawString(string1, 30, 50);
		g.drawString(string2, 70, 90);
		g.drawRect(10, 10, 200, 200);
	}
	void updatestring1(String string) {
		
	}
	void updateString2(String string) {
		
	}
	void setIconColor(Color color) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
