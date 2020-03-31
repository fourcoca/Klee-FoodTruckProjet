package com.foodTruckProjet.foodTruck.model;

import java.time.LocalDateTime;

public class Ligne {
	private int quantite;
	private String statut;
	private LocalDateTime date;
	private String adresse;
	private Produit produit;
	public Ligne()
	{
		
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Ligne(int quantite, String statut, LocalDateTime date, String adresse, Produit produit) {
		super();
		this.quantite = quantite;
		this.statut = statut;
		this.date = date;
		this.adresse = adresse;
		this.produit = produit;
	}

	
	
	@Override
	public String toString() {
		return "Ligne [getProduit()=" + getProduit() + ", getQuantite()=" + getQuantite() + ", getStatut()="
				+ getStatut() + ", getDate()=" + getDate() + ", getAdresse()=" + getAdresse() + ", getPrix()="
				+ getPrix() + "]";
	}

	public double getPrix()
	{
		if(!this.getStatut().equals("Sur Place"))
		{
			return this.getProduit().getPrix()*this.getQuantite()*1.1;
		}
		else
		{
			return this.getProduit().getPrix()*this.getQuantite();
		}
	}

	public double getFrais()
	{
		if(!this.getStatut().equals("Sur Place"))
		{
			return this.getProduit().getPrix()*this.getQuantite()*0.1;
		}
		else
		{
			return 0;
		}
	}
	
	public String getEtat()
	{
		LocalDateTime now = LocalDateTime.now();
		if(now.isBefore(this.getDate()))
		{
			return "En cours";
		}
		else
		{
			return "Livré";
		}
		
	}
}
