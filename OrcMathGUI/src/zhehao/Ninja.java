package zhehao;

import java.awt.Color;

import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Ninja extends AnimatedComponent {
	String name;
	String description;
	int age;
	
	public Ninja(String name,String description,int age ) {
		super(100, 100, 100, 200);
		//addSequence("resources/myspritesheet.png", 150, 50, 31, 100, 200, 5);
		//Thread animation = new Thread(this);
		//animation.start();
		this.name=name;
		this.description=description;
		this.age=age;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		//g.setColor(Color.BLUE);
		//g.fillRect(0, 0, getWidth(), getHeight());
		
		super.update(g);
	}
	public String toString() {
		return this.name+","+this.description+","+this.age;
	}

}
