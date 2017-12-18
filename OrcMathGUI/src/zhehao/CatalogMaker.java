package zhehao;

import java.util.ArrayList;
import java.util.Scanner;


public class CatalogMaker {

	private static ArrayList<Ninja> ninjaarray=new ArrayList<Ninja>(); 
	
	
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		CatalogMaker cm= new CatalogMaker();
		//System.out.println(cm.getCSVcontent());
		
		String s=in.nextLine();
		boolean adding=true;
		while(adding) {
			ninjaarray.add(new Ninja(ninjaname(),ninjaDesc(),ninjaAge()));
			System.out.println("Would you like to add another ninja to ur village?");
			s=in.nextLine();
			if(s.equalsIgnoreCase("no")) {
				adding= false;
			}
		}
		
		
		
	}
	public static String ninjaname() {
		Scanner in= new Scanner(System.in);
		System.out.println("would would is your ninja's name?");
		String s=in.nextLine();
		while(invalidresponse(s)) {
			System.out.println("please enter a valid response.");
		}
			return s;
		
	}
	public static String ninjaDesc() {
		Scanner in= new Scanner(System.in);
		System.out.println("what makes your ninja stands out?");
		String s=in.nextLine();
		while(invalidresponse(s)) {
			System.out.println("please enter a valid response.");
		}
			return s;
	}
	public static int ninjaAge() {
		Scanner in= new Scanner(System.in);
		System.out.println("would would is your ninja's age");
		String s=in.nextLine();
		while(invalidresponse(s)   ) {
			System.out.println("please enter a valid response.");
		}
			return Integer.parseInt(s);
		
	}
	public static boolean invalidresponse(String x) {
		if(x=="") {
			return true;
		}
		return false;
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
