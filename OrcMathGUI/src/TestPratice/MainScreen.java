package TestPratice;

import java.awt.Color;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class MainScreen extends FullFunctionScreen {
	
	private Button test;
	private int score;
	private int countdown;
	private int starttime;
	private TextLabel scoreboard;
	private TextLabel clock;
	public MainScreen(int width, int height) {
		super(width, height);
		update();
		score=0;
		countdown=5;
		starttime=3;
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		scoreboard= new TextLabel(100, 400, 200, 100, "Score");
		clock=new TextLabel(100,40,100,100, "Timer");
		
		Button test = new Button(200,200);
		
		viewObjects.add(scoreboard);
		viewObjects.add(clock);
		
		
		Timer t= new Timer();
		t.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				clock.setText(Integer.toString(starttime));
				if(starttime<=0) {
					Timer t2= new Timer();
					t2.scheduleAtFixedRate(new TimerTask() {
						
						@Override
						public void run() {
							clock.setText("Go! Time left: " +Integer.toString(countdown));
							test.updateString("Click me!");
							test.setAction(new Action() {
								
								@Override
								public void act() {
									score++;
									scoreboard.setText(Integer.toString(score));
									
								}
								
							});
							if(countdown<=0) {
								gameover();
								t2.cancel();
							}
							countdown--;
							
						}

						private void gameover() {
							test.setEnabled(false);
							test.updateString("Done");
							scoreboard.setText("Game Over! you scored "+ Integer.toString(score));
							
						}
					}, 0, 1000);
					t.cancel();
				}
				starttime--;
			}
		}, 1000, 1000); {
			
			
		}
		
		viewObjects.add(test);
	
		
		

	}

}
