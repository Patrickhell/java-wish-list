package org.lessons.java.christmas;

public class Wish implements Comparable<Wish>{
	
	private String wishName;
	private String recipient;
	
	public Wish(String wishName,String recipient) {
		
		setWishName(wishName);
		setRecipient(recipient);
	}
	

	public String getWishName() {
		return wishName;
	}

	public void setWishName(String wishName) {
		this.wishName = wishName;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	@Override
	
	public int compareTo(Wish otherWish) {
	    return this.wishName.compareTo(otherWish.wishName);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name:" + getWishName() + "\n"
		       + "Recipient: " + getRecipient();
	}
	

}
