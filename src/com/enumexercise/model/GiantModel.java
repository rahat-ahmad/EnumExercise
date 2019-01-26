package com.enumexercise.model;

public class GiantModel {
	
	Health health;
	Fatique fatique;
	Nourishment nourishment;
	public GiantModel(Health health, Fatique fatique, Nourishment nourishment) {
		this.health = health;
		this.fatique = fatique;
		this.nourishment = nourishment;
	}
	public Health getHealth() {
		return health;
	}
	public void setHealth(Health health) {
		this.health = health;
	}
	public Fatique getFatique() {
		return fatique;
	}
	public void setFatique(Fatique fatique) {
		this.fatique = fatique;
	}
	public Nourishment getNourishment() {
		return nourishment;
	}
	public void setNourishment(Nourishment nourishment) {
		this.nourishment = nourishment;
	}
	
	

}
