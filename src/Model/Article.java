package Model;

import java.util.ArrayList;
import java.util.Date;

public class Article extends Text {
	private ArrayList<Text> items;
	private String name;

	protected Article(){}

	public Article(Date date, String number, ArrayList<Text> items, String name) {
		super(date, number);
		this.items = items;
		this.name = name;
	}

	public ArrayList<Text> getItems() {
		return items;
	}
	public void setItems(ArrayList<Text> items) {
		this.items = items;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}