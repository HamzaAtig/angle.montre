package com.hat.data;

public class Heure {

	private String heure;
	private String minute;

	public Heure() {
		super();

	}

	public Heure(String heure, String minute) {
		super();
		this.heure = heure;
		this.minute = minute;
	}

	public Integer getIntegerHeure() {
		return Integer.valueOf(heure);
	}

	public Integer getIntegerMinute() {
		return Integer.valueOf(minute);
	}

	@Override
	public String toString() {
		return "heure [heure=" + heure + ", minute=" + minute + "]";
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public String getMinute() {
		return minute;
	}

	public void setMinute(String minute) {
		this.minute = minute;
	}

}
