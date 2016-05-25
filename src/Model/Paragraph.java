package Model;

import java.util.ArrayList;

/**
 * Created by alexe on 15.05.2016.
 */
public class Paragraph extends Text{
	private ArrayList<Text> items;
	private  ArrayList<Text> links;
	private String name;
	private String text;
	//private SuffixTree suffixTree;
	public Paragraph(ArrayList<Text> items, ArrayList<Text> links, String name,
			String text) {
		super();
		this.items = items;
		this.links = links;
		this.name = name;
		this.text = text;
	}
	public ArrayList<Text> getItems() {
		return items;
	}
	public void setItems(ArrayList<Text> items) {
		this.items = items;
	}
	public ArrayList<Text> getLinks() {
		return links;
	}
	public void setLinks(ArrayList<Text> links) {
		this.links = links;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	
}
