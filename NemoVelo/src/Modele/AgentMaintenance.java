package Modele;

/***********************************************************************
 * Module:  AgentMaintenance.java
 * Author:  Simon
 * Purpose: Defines the Class AgentMaintenance
 ***********************************************************************/

import java.util.*;

public class AgentMaintenance {
	private int idAgent;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private String lieuDeNaissance;

	/**
	 * @param nom
	 * @param prenom
	 * @param dateDeNaissance
	 * @param lieuDeNaissance
	 */
	public AgentMaintenance(String nom, String prenom, Date dateDeNaissance,
			String lieuDeNaissance) {
		// TODO: implement
	}

	public AgentMaintenance(int idAgent, String nom, String prenom,
			Date dateDeNaissance, String lieuDeNaissance) {

		this.idAgent = idAgent;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.lieuDeNaissance = lieuDeNaissance;
	}

	public int getIdAgent() {
		return idAgent;
	}

	public String getNom() {
		return nom;
	}

	/** @param newNom */
	public void setNom(String newNom) {
		nom = newNom;
	}

	public String getPrenom() {
		return prenom;
	}

	/** @param newPrenom */
	public void setPrenom(String newPrenom) {
		prenom = newPrenom;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	/** @param newDateDeNaissance */
	public void setDateDeNaissance(Date newDateDeNaissance) {
		dateDeNaissance = newDateDeNaissance;
	}

	public String getLieuDeNaissance() {
		return lieuDeNaissance;
	}

	/** @param newLieuDeNaissance */
	public void setLieuDeNaissance(String newLieuDeNaissance) {
		lieuDeNaissance = newLieuDeNaissance;
	}

	/** Renvoie une liste des velos que l'agent a réparé */
	public ArrayList<Velo> getVelosRepares() {
		// TODO: implement
		return null;
	}

}