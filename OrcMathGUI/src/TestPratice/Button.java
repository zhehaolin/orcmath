package TestPratice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;


import guiTeacher.components.Action;

public class Button extends guiTeacher.components.Button {

	private String field;
	public Button(int x, int y) {
		super(x, y, 100,100, "",null, null);
		field="";
	}
	

	public void updateString(String x) {
		field=x;
		update();
	}
	
	public void drawButton(Graphics2D g,boolean hover) {
		g.setColor(Color.blue);
		Rectangle rect=new Rectangle(0,0,300,300);
		g.draw(rect);
		g.fill(rect);
		g.setColor(Color.white);
		if(field != null) {
			g.drawString(field, 20, 100);
		}
		
	}

}
