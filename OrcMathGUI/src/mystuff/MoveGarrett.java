package mystuff;

public class MoveGarrett implements MoveInterfaceZhehao {
	
	ButtonInterfaceZhehao button;
	public MoveGarrett(ButtonInterfaceZhehao button) {
		this.button=button;
	}

	@Override
	public ButtonInterfaceZhehao getButton() {
		return button;
	}

}
