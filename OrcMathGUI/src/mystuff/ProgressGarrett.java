package mystuff;

import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class ProgressGarrett extends Component implements ProgressInterfaceZhehao {
	
	private boolean inPlay = false;
	private int sequenceSize;
	private int roundNumber;

	public ProgressGarrett(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gameOver() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSequenceSize(int size) {
		this.sequenceSize = size;
	}

	@Override
	public void setRound(int roundnumber) {
		this.roundNumber = roundnumber;
	}

	@Override
	public void update(Graphics2D g) {
		g.drawRect(this.getX(),this.getY(),this.getWidth(),this.getHeight());
		if(inPlay) {
			
		}
		else {
			
		}
	}

}
