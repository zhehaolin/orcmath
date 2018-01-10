package mystuff;

import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class ProgressGarrett extends Component implements ProgressInterfaceZhehao {
	
	private boolean inPlay = false;
	private int sequenceSize;
	private int roundNumber;

	public ProgressGarrett(int x, int y, int w, int h) {
		super(x, y, w, h);
		update();
	}

	@Override
	public void gameOver() {
		SimonScreenZhehao.getLabel().setText("You have lost the game");
		update();

	}

	@Override
	public void setSequenceSize(int size) {
		SimonScreenZhehao.getLabel().setText(SimonScreenZhehao.getLabel().getText() + "n/The sequence is of length " + size);
		update();
	}

	@Override
	public void setRound(int roundnumber) {
		SimonScreenZhehao.getLabel().setText("This is round " + roundnumber);
		update();
	}

	@Override
	public void update(Graphics2D g) {
		g.drawRect(this.getX(),this.getY(),this.getWidth(),this.getHeight());
		
	}

}
