package com.enumexercise.controller;

import com.enumexercise.model.Fatique;
import com.enumexercise.model.GiantModel;
import com.enumexercise.model.Health;
import com.enumexercise.model.Nourishment;
import com.enumexercise.view.GiantView;

public class GiantController {
	
	Health health;
	Fatique fatique;
	Nourishment nourishment;
	
	GiantModel giantModel = new GiantModel(health, fatique, nourishment);
	GiantView giantView = new GiantView();
	public GiantController(GiantModel giantModel, GiantView giantView) {
		this.giantModel = giantModel;
		this.giantView = giantView;
	}
	public Health getHealth() {
		return giantModel.getHealth();
	}
	public void setHealth(Health health) {
		giantModel.setHealth(health);
	}
	public Fatique getFatique() {
		return giantModel.getFatique();
	}
	public void setFatique(Fatique fatique) {
		giantModel.setFatique(fatique);
	}
	public Nourishment getNourishment() {
		return giantModel.getNourishment();
	}
	public void setNourishment(Nourishment nourishment) {
		giantModel.setNourishment(nourishment);
	}
	
	public void updateView() {
		giantView.displayGiant(giantModel);
	}
	
	

}
