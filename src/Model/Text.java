package Model;

import java.util.Date;

/**
 * Created by alexe on 15.05.2016.
 */
public abstract class Text {
	private Date date;
	private String number;
	
	public Text() {}
	public Text (Date date, String number){
		this.date=date;
		this.number=number;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
