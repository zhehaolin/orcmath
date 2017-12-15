package zhehao;

import java.util.ArrayList;

public class CatalogMaker {

	private ArrayList<Ninja> ninjaarray=new ArrayList<Ninja>(); 
	
	
	public static void main(String[] args) {
		CatalogMaker cm= new CatalogMaker();
		System.out.println(cm.getCSVcontent());
	}
	public CatalogMaker() {
		ninjaarray.add(new Ninja("ho","hoho",13));
		ninjaarray.add(new Ninja("ho2","hoho2",14));
	}
	public String getCSVcontent() {
		String data="";
		for(Ninja x: ninjaarray) {
			data+= x+"\n";
		}
		return data;
	}

}
