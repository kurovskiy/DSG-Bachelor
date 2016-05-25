package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by alexe on 15.05.2016.
 */
public class Section extends Text{
	private ArrayList<Paragraph> items;
	private String name;
	
	public Section(Date date, String number, ArrayList<Paragraph> items, String name) {
		super(date, number);
		this.items = items;
		this.name = name;
	}
	public ArrayList<Paragraph> getItems() {
		return items;
	}
	public void setItems(ArrayList<Paragraph> items) {
		this.items = items;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
