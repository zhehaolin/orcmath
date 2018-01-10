package mystuff;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenZhehao extends ClickableScreen implements Runnable {
	
	private static TextLabel board;
	private ProgressInterfaceZhehao progress;
	private ArrayList<MoveInterfaceZhehao> arrlist;
	private ButtonInterfaceZhehao[] buttons;
	private int roundnumber;
	private boolean validinput;
	private int sequenceidx;
	private int lastselectedbutton;
	private Color[] colors;
	
	public SimonScreenZhehao(int width, int height) {
		super(width, height);
		Thread app= new Thread(this);
		app.start();
	}
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
				b = arrlist.get(i).getButton();
				b.highlight();
				
				try {
	                Thread.sleep((int)(1000*roundnumber));
	            } catch (InterruptedException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
				b.dim();
			}
		}
		
		
		
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
		for(int i = 0; i < sequenceidx; i++) {
			arrlist.add(randomMove());
		}
		roundnumber=0;
		progress.setRound(roundnumber);
		viewObjects.add(progress);
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
		return new MoveGarrett(buttons[randomidx]);
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	*/

	private ProgressInterfaceZhehao getProgress() {
		return new ProgressGarrett(100, 100, 200, 200);
	}

	private void addButtons() {
		
		colors = new Color[4];
		colors[0] = Color.BLUE;
		colors[1] = Color.YELLOW;
		colors[2] = Color.RED;
		colors[3] = Color.GREEN;
		buttons= new ButtonInterfaceZhehao[4];
		
		for(int i=0;i<buttons.length;i++) {
			final ButtonInterfaceZhehao b=getAButton(100,i*100+50,50,50);
			b.setColor(colors[i]);
		//	b.setX(100);
			//b.setY((i*100)+100);
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
			buttons[i]=b;
		}
	}
	/**
	Placeholder until partner finishes implementation of ButtonInterface
	 * @param j 
	 * @param i 
	*/

	private ButtonInterfaceZhehao getAButton(int x, int y,int w,int h) {
		return new ButtonGarrett(x, y, w, h, "",null);	
	}

	

	
	public static TextLabel getLabel() {
		return board;
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
