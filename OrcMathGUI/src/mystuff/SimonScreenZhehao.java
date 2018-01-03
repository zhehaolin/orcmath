package mystuff;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	

}
