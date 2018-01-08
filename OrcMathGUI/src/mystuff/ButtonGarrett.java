package mystuff;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonGarrett extends Button implements ButtonInterfaceZhehao {
	
	private boolean buttonOn = false;
	private Color color;
	private Color hColor;

	public ButtonGarrett(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text, color, action);
		// TODO Auto-generated constructor stub
	}

	public ButtonGarrett(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, "", null);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
		this.hColor = color;
	}

	@Override
	public void highlight() {
		color = Color.WHITE;
	}

	@Override
	public void dim() {
		color = hColor;
	}
	
	public void drawButton(Graphics2D g, boolean hover) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g.drawOval(this.getX(),this.getY(),this.getWidth(),this.getHeight());
		if(buttonOn) {
			highlight();
		}
		else {
			dim();
		}
	}

}
