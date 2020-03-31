package com.foodTruckProjet.foodTruck.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.foodTruckProjet.foodTruck.model.Produit;
import com.foodTruckProjet.foodTruck.model.Utilisateur;
import com.foodTruckProjet.foodTruck.repo.ProduitRepository;
import com.foodTruckProjet.foodTruck.repo.UtilisateurRepository;

@RestController
public class ControllerFoodTruck {

	@Autowired
	private ProduitRepository prepo;
	@Autowired
	private UtilisateurRepository urepo;
	
	@GetMapping("/accueil")
	public ModelAndView accueil(Model model) {
		ModelAndView modelAndView = new ModelAndView("accueil", "top3", prepo.findtop3());
		return modelAndView;
	}

	@GetMapping(path="/", produces = "application/json")
    public List<Produit> getEmployees() 
    {
        return prepo.findAll();
    }
	
	@RequestMapping("/catalogue")
	public ModelAndView catalogue(Model model) {
		ModelAndView modelAndView = new ModelAndView("catalogue", "catalogue", prepo.findAll());
		return modelAndView;
	}

	@GetMapping("/connexion")
	public ModelAndView connectionGet(Model model, HttpServletRequest ht) {
		ModelAndView modelAndView = new ModelAndView("connexion", "email", "");
		modelAndView.addObject("pwd", "");
		return modelAndView;
	}

	@PostMapping("/connexion")
	public ModelAndView connectionPost(@RequestParam(name = "email") String email,
			@RequestParam(name = "pwd") String mdp, Model model, HttpServletRequest ht) {
		ModelAndView reussite = new ModelAndView("accueil");
		ModelAndView echec = new ModelAndView("/connexion");
		Utilisateur a = urepo.findByEmailAndMotDePasse(email, mdp);

		if (a != null) {
			ht.getSession().setAttribute("utilisateur", a);
			ht.getSession().setAttribute("erreur", 0);
			return reussite;
		} else {
			ht.getSession().setAttribute("erreur", 1);
			return echec;
		}
	}

	@RequestMapping("/contacts")
	public ModelAndView contacts(Model model) {
		ModelAndView modelAndView = new ModelAndView("contacts");
		return modelAndView;
	}

	@RequestMapping("/inscription")
	public ModelAndView inscription(Model model) {
		ModelAndView modelAndView = new ModelAndView("inscription");
		return modelAndView;
	}

	@RequestMapping("/panier")
	public ModelAndView panier(Model model) {
		ModelAndView modelAndView = new ModelAndView("panier");
		return modelAndView;
	}

	@RequestMapping("/valider")
	public ModelAndView valider(Model model) {
		ModelAndView modelAndView = new ModelAndView("valider");
		return modelAndView;
	}

	@RequestMapping("/profil")
	public ModelAndView profil(Model model) {
		ModelAndView modelAndView = new ModelAndView("profil/resume");
		return modelAndView;
	}

	@RequestMapping("profil/resume")
	public ModelAndView profilResume(Model model) {
		ModelAndView modelAndView = new ModelAndView("profil/resume");
		return modelAndView;
	}

	@RequestMapping("profil/historique")
	public ModelAndView profilHistorique(Model model) {
		ModelAndView modelAndView = new ModelAndView("profil/historique");
		return modelAndView;
	}

	@RequestMapping("profil/modifier")
	public ModelAndView profilModifier(Model model) {
		ModelAndView modelAndView = new ModelAndView("profil/modifier");
		return modelAndView;
	}

	@RequestMapping("admin")
	public ModelAndView admin(Model model) {
		ModelAndView modelAndView = new ModelAndView("admin/authadmin");
		return modelAndView;
	}

	@RequestMapping("admin/listUtilisateur")
	public ModelAndView adminAfficherUtilisateur(Model model) {
		ModelAndView modelAndView = new ModelAndView("admin/listUtilisateur");
		return modelAndView;
	}

	@RequestMapping("admin/modifierUtilisateur")
	public ModelAndView adminModifierUtilisateur(Model model) {
		ModelAndView modelAndView = new ModelAndView("admin/modifierUtilisateur");
		return modelAndView;
	}

	@RequestMapping("admin/ajouterUtilisateur")
	public ModelAndView adminAjouterUtilisateur(Model model) {
		ModelAndView modelAndView = new ModelAndView("admin/ajouterUtilisateur");
		return modelAndView;
	}

	@RequestMapping("admin/listCatalogue")
	public ModelAndView adminAfficherCatalogue(Model model) {
		ModelAndView modelAndView = new ModelAndView("admin/listCatalogue");
		return modelAndView;
	}

	@RequestMapping("admin/modifierCatalogue")
	public ModelAndView adminModifierCatalogue(Model model) {
		ModelAndView modelAndView = new ModelAndView("admin/modifierCatalogue");
		return modelAndView;
	}

	@RequestMapping("admin/ajouterCatalogue")
	public ModelAndView adminAjouterCatalogue(Model model) {
		ModelAndView modelAndView = new ModelAndView("admin/ajouterCatalogue");
		return modelAndView;
	}

	@RequestMapping("admin/modifierHoraire")
	public ModelAndView adminModifierHoraire(Model model) {
		ModelAndView modelAndView = new ModelAndView("admin/modifierHoraire");
		return modelAndView;
	}
}
