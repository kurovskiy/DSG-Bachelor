package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by alexe on 15.05.2016.
 */
public class Document {
	private Date date;
	private Document instance;
	private ArrayList<Article> items;
	
	public Document(){}
	public Document(ArrayList<Article> items){
		this.items=items;
	}
	public Document(Date date, Document instance, ArrayList<Article> items){
		this.date=date;
		this.instance=instance;
		this.items=items;
	}
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Document getInstance() {
		return instance;
	}
	public void setInstance(Document instance) {
		this.instance = instance;
	}
	public ArrayList<Article> getItems() {
		return items;
	}
	public void setItems(ArrayList<Article> items) {
		this.items = items;
	}
	public static void main (String[] args){
		
		
		
		System.out.println("Willkommen");
	}
}
