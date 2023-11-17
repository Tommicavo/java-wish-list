package org.lessons.java.christmas;

public class ChristmasGift {
	
	private String gift;
	private String receiver;
	
	public ChristmasGift(String gift, String receiver) {
		setGift(gift);
		setReceiver(receiver);
	}

	public String getGift() {
		return gift;
	}

	public void setGift(String gift) {
		this.gift = gift;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public String toString() {
		return "Gift: " + getGift() + ", for: " + getReceiver();
	}
}
