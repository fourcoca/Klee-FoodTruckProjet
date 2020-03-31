package com.foodTruckProjet.foodTruck.model;


import java.util.ArrayList;
import java.util.List;

public class Panier {

	private ArrayList<Ligne> lignes = new ArrayList<Ligne>();

	public Panier()
	{
		
	}
	
	public ArrayList<Ligne> getLignes() {
		return lignes;
	}

	public void setLignes(ArrayList<Ligne> lignes) {
		this.lignes = lignes;
	}

	public void ajouterLigne(Ligne l)
	{
		boolean trouv = false;
		for (Ligne ligne : lignes) {
			if(ligne.getProduit().getNom().equals(l.getProduit().getNom()))
			{
				ligne.setQuantite(ligne.getQuantite()+l.getQuantite());
				trouv = true;
			}
		}
		if(!trouv)
		{
			this.lignes.add(l);
		}
	}
	
	public double getPrix() {
		double total = 0;
		for (Ligne ligne : lignes) {
			total += ligne.getPrix();
		}
		return total;
	}
}
