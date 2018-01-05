package mystuff;

import java.awt.Color;

import guiTeacher.interfaces.Clickable;

public interface ButtonInterfaceZhehao extends Clickable {

	void setColor(Color color);
	void setAction(Action a);
	void highlight();
}
