package zhehao;

import java.awt.Color;

import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Ninja extends AnimatedComponent {
	String name;
	String description;
	int attack;
	int speed;
	int hp;
	int defense;
	
	public Ninja(String name,String description,int attack,int hp, int speed, int defense ) {
		super(100, 100, 100, 200);
		//addSequence("resources/myspritesheet.png", 150, 50, 31, 100, 200, 5);
		//Thread animation = new Thread(this);
		//animation.start();
		this.name=name;
		this.description=description;
		this.attack=attack;
		this.hp=hp;
		this.speed=speed;
		this.defense=defense;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		//g.setColor(Color.BLUE);
		//g.fillRect(0, 0, getWidth(), getHeight());
		
		super.update(g);
	}
	public String toString() {
		return this.name+",is "+this.description+", and here is the random stats";
	}

}
