package com.enumexercise.view;

import com.enumexercise.controller.GiantController;
import com.enumexercise.model.Fatique;
import com.enumexercise.model.GiantModel;
import com.enumexercise.model.Health;
import com.enumexercise.model.Nourishment;

public class GiantView {
	
	public void displayGiant(GiantModel giantModel) {
		System.out.println(giantModel.getHealth());
		System.out.println(giantModel.getFatique());
		System.out.println(giantModel.getNourishment());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Health health=Health.DEAD;
		Fatique fatiqe=Fatique.SLEEPING;
		Nourishment nourishment=Nourishment.HUNGRY;
		
		
		GiantModel giantModel =new GiantModel(health,fatiqe,nourishment);
		
		GiantView giantView=new GiantView();
		
		GiantController giantController=new GiantController(giantModel, giantView);

		giantController.updateView();

	}

}
