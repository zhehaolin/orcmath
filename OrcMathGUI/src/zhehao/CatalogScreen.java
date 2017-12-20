package zhehao;

import java.awt.Color;
import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.*;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen implements FileRequester {
	private TextField TitleBox;
	private TextField DescriptionBox;
	private TextField age;
	private TextArea Text;
	private Button addbutton;
	private Button savebutton;
	private Button deletebutton;
	private FileOpenButton fileopenbutton;
	private CatalogMaker catalog;
	public CatalogScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		TitleBox = new TextField(40, 40, 200, 30, "  enter name","Name");
		viewObjects.add(TitleBox);
		DescriptionBox= new TextField(40,90,200,30, "  enter desciption","Description");
		viewObjects.add(DescriptionBox);
		age= new TextField(40,150,200,30," age","age");
		age.setInputType(age.INPUT_TYPE_NUMERIC);
		viewObjects.add(age);
		
		Text = new TextArea(400,130,200,30,"Text area");
		viewObjects.add(Text);
		addbutton = new Button(300,120,30,30,"add",new Action() {
			
			@Override
			public void act() {
				addClicked();
				
			}
		});
		viewObjects.add(addbutton);
		savebutton= new Button(300,160,30,30,"save", new Action() {
			
			@Override
			public void act() {
				save();
				
			}

		
		});
		viewObjects.add(savebutton);
		deletebutton= new Button(300,200,30,33,"delete", new Action() {
			
			@Override
			public void act() {
				delete();
				
			}
		});
		viewObjects.add(deletebutton);
		
		fileopenbutton = new FileOpenButton(400, 160, 60, 60, null, this);
		viewObjects.add(fileopenbutton);
		catalog = new CatalogMaker();
		
		
		
		
	}

	protected void save() {
		// TODO Auto-generated method stub
		
	}

	protected void delete() {
		// TODO Auto-generated method stub
		
	}

	protected void addClicked() {
		Ninja N= new Ninja(TitleBox.getText(),DescriptionBox.getText(),Integer.parseInt(age.getText()));
		Text.setText("Ninja added");
		TitleBox.setText("");
		DescriptionBox.setText("");
		age.setText("");
		
	}

	@Override
	public void setFile(File f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JFrame getWindow() {
		// TODO Auto-generated method stub
		return null;
	}

}
