package Model;

import java.util.ArrayList;

/**
 * Created by alexe on 15.05.2016.
 */
public class Indent extends Text{
	private ArrayList<Digit> items;
	private ArrayList<Text> links;
	private String text;
	public Indent(ArrayList<Digit> items, ArrayList<Text> links, String text) {
		super();
		this.items = items;
		this.links = links;
		this.text=text;
	}
	public ArrayList<Digit> getItems() {
		return items;
	}
	public void setItems(ArrayList<Digit> items) {
		this.items = items;
	}
	public ArrayList<Text> getLinks() {
		return links;
	}
	public void setLinks(ArrayList<Text> links) {
		this.links = links;
	}
	public String getText(){
		return text;
	}
	public void setText(String text){
		this.text=text;
	}

	
}
