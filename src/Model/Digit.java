package Model;

import java.util.ArrayList;

/**
 * Created by alexe on 15.05.2016.
 */
public class Digit extends Text {
	private ArrayList<Text> links;
	private String text;
	public Digit(ArrayList<Text> links, String text) {
		super();
		this.links = links;
		this.text = text;
	}
	public ArrayList<Text> getLinks() {
		return links;
	}
	public void setLinks(ArrayList<Text> links) {
		this.links = links;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	
}
