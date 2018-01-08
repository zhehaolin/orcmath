package mystuff;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenZhehao extends ClickableScreen implements Runnable {
	
	private TextLabel board;
	private ProgressInterfaceZhehao progress;
	private ArrayList<MoveInterfaceZhehao> arrlist;
	private ButtonInterfaceZhehao[] buttons;
	private int roundnumber;
	private boolean validinput;
	private int sequenceidx;
	private int lastselectedbutton;

	public SimonScreenZhehao(int width, int height) {
		super(width, height);
		Thread app= new Thread(this);
		app.start();
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		for(ButtonInterfaceZhehao b:buttons) {
			viewObjects.add(b);
		}
		progress = getProgress();
		board= new TextLabel(10,10,200,200,"testing");
		arrlist= new ArrayList<MoveInterfaceZhehao>();
		lastselectedbutton=-1;
		arrlist.add(randomMove());
		arrlist.add(randomMove());
		roundnumber=0;
		viewObjects.add((Visible) progress);
		viewObjects.add(board);
	

	}
	private MoveInterfaceZhehao randomMove() {
		int randomidx= (int)(Math.random()*buttons.length);
		while(randomidx==lastselectedbutton) {
			randomidx=(int)(Math.random()*buttons.length);
		}
		return getMove(randomidx);
	}
	/**
	Placeholder until partner finishes implementation of MoveInterface
	*/
	private MoveInterfaceZhehao getMove(int randomidx) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	*/

	private ProgressInterfaceZhehao getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		int numofbuttons=4;
		Color[] mycolor= {Color.blue,Color.red,Color.green,Color.yellow};
		buttons= new ButtonInterfaceZhehao[numofbuttons];
		
		for(int i=0;i<buttons.length;i++) {
			final ButtonInterfaceZhehao b=getAButton();
			buttons[i]=b;
			b.setColor(mycolor[i]);
			b.setX(100);
			b.setY((i*100)+100);
			b.setAction(new Action() {
				
				@Override
				public void act() {
					if(validinput) {
						Thread blink= new Thread(new Runnable() {
							
							@Override
							public void run() {
								b.highlight();
								try{
									Thread.sleep(800);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								b.dim();
							}
						});
						blink.start();
						if(b == arrlist.get(sequenceidx).getButton()) {
		    		    	sequenceidx++;
		    		    }
		    		    else {
		    		    	progress.gameOver();
		    		    }
		    		    if(sequenceidx == arrlist.size()){
		    		        Thread nextRound = new Thread(SimonScreenZhehao.this);
		    		        nextRound.start();
		    		    }
							
					}
				}
			});
		}
	}
	/**
	Placeholder until partner finishes implementation of ButtonInterface
	*/

	private ButtonInterfaceZhehao getAButton() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() {
		 board.setText("");
	     nextRound();
		
	}

	private void nextRound() {
		validinput = false;
		roundnumber++;
		arrlist.add(randomMove());
		progress.setRound(roundnumber);
		progress.setSequenceSize(arrlist.size());
		changeText("Simon's Turn");
		board.setText("");
		playSequence();
		changeText("Your Turn");
		validinput = true;
		sequenceidx = 0;
		
	}

	private void playSequence() {
		ButtonInterfaceZhehao b = null;
		for(int i = 0; i < arrlist.size(); i++) {
			if(b != null) {
				b.dim();
				b = arrlist.get(sequenceidx).getButton();
				b.highlight();
				int sleepTime = (10000 - (roundnumber * 100)) + 1000;
				try {
	                Thread.sleep(sleepTime);
	            } catch (InterruptedException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
			}
		}
		b.dim();
		
	}

	private void changeText(String string) {
		board.setText(string);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
	}
	}

	

}
