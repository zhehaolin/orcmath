package zhehao;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class books extends Component {

	public books() {
		super(50, 50, 200, 200);
		
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.BLUE);
		g.drawRect(0, 0, getWidth(), getHeight());
	}

}
