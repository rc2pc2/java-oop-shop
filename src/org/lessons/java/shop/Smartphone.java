package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    private String codiceImei;
	private int memoriaInGb;

	public Smartphone(String nome, String marca, BigDecimal prezzo, String codiceImei, int memoriaInGb) {
		super(nome, marca, prezzo);
		this.codiceImei = codiceImei;
		this.memoriaInGb = memoriaInGb;
	}

	public String getCodiceImei() {
		return codiceImei;
	}

	public void setCodiceImei(String codImei) {
		this.codiceImei = codImei;
	}

	public int getMemoriaInGb() {
		return memoriaInGb;
	}

	public void setMemoriaInGb(int memoriaInGb) {
		this.memoriaInGb = memoriaInGb;
	}

    @Override
    public String toString(){
        return super.toString() + "\nCodice imei: " + this.codiceImei + "\nMemoria " + memoriaInGb + "GB" ;
    }
}
