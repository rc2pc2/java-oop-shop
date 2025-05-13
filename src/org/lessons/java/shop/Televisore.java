package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto  {
    private int pollici;
	private boolean isSmartTv;

	public Televisore(String nome, String marca, BigDecimal prezzo, int pollici, boolean isSmartTv) {
		super(nome, marca, prezzo);
		this.pollici = pollici;
		this.isSmartTv = isSmartTv;
	}

	public int getPollici() {
		return pollici;
	}

	public void setPollici(int pollici) {
		this.pollici = pollici;
	}

	public boolean isSmartTv() {
		return isSmartTv;
	}

	public void setSmartTv(boolean isSmartTv) {
		this.isSmartTv = isSmartTv;
	}

	@Override
	public String toString() {
		return super.toString() + "\nDimensioni TV : " + getPollici() + "\nSmart : " + isSmartTv();
	}
}
