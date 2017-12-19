package zhehao;

import java.util.List;

import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {
	private TextField TitleBox;
	private TextField DescriptionBox;
	public CatalogScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		TitleBox = new TextField(40, 40, 200, 30, "enter name","Name");
		viewObjects.add(TitleBox);
		DescriptionBox= new TextField(40,90,200,30, "enter desciption","Description");
		viewObjects.add(DescriptionBox);
	}

}
