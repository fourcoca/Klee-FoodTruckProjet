package com.foodTruckProjet.foodTruck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerFoodTruck {

	@RequestMapping("/accueil")
	public String accueil()
	{
		return "accueil";
	}
	
	@RequestMapping("/catalogue")
	public String catalogue()
	{
		return "catalogue";
	}
	
	@RequestMapping("/connexion")
	public String connexion()
	{
		return "connexion";
	}
	
	@RequestMapping("/contacts")
	public String contacts()
	{
		return "contacts";
	}
	
	@RequestMapping("/inscription")
	public String inscription()
	{
		return "inscription";
	}
	
	@RequestMapping("/panier")
	public String panier()
	{
		return "panier";
	}

	@RequestMapping("/valider")
	public String valider()
	{
		return "valider";
	}

	@RequestMapping("/profil")
	public String profil()
	{
		return "profil/resume";
	}
	@RequestMapping("profil/resume")
	public String profilResume()
	{
		return "profil/resume";
	}
	@RequestMapping("profil/historique")
	public String profilHisto()
	{
		return "profil/historique";
	}
	@RequestMapping("profil/modifier")
	public String profilModifier()
	{
		return "profil/modifier";
	}
	
	@RequestMapping("admin")
	public String admin()
	{
		return "admin/authadmin";
	}
	
	@RequestMapping("admin/listUtilisateur")
	public String adminAfficherUtilisateur()
	{
		return "admin/listUtilisateur";
	}
	
	@RequestMapping("admin/modifierUtilisateur")
	public String adminModifierUtilisateur()
	{
		return "admin/modifierUtilisateur";
	}
	
	@RequestMapping("admin/ajouterUtilisateur")
	public String adminAjouterUtilisateur()
	{
		return "admin/ajouterUtilisateur";
	}
	
	@RequestMapping("admin/listCatalogue")
	public String adminAfficherCatalogue()
	{
		return "admin/listCatalogue";
	}
	
	@RequestMapping("admin/modifierCatalogue")
	public String adminModifierCatalogue()
	{
		return "admin/modifierCatalogue";
	}
	
	@RequestMapping("admin/ajouterCatalogue")
	public String adminAjouterCatalogue()
	{
		return "admin/ajouterCatalogue";
	}

	
	@RequestMapping("admin/modifierHoraire")
	public String adminModifierHoraire()
	{
		return "admin/modifierHoraire";
	}
}
