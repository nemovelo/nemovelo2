package Modele;

/***********************************************************************
 * Module:  Velo.java
 * Author:  Simon
 * Purpose: Defines the Class Velo
 ***********************************************************************/

import java.util.*;

public class Velo {
	private int idVelo;
	private boolean estFonctionnel;
	private Date dateAchat;

	public Velo() {
		idVelo = 0;
		estFonctionnel = true;
		dateAchat = new Date();
	}
	
	public Velo(int idVelo, boolean estFonctionnel, Date dateAchat){
		this.idVelo = idVelo;
		this.estFonctionnel = estFonctionnel;
		this.dateAchat = dateAchat;
	}

	public int getIdVelo() {
		return idVelo;
	}

	public boolean getEstFonctionnel() {
		return estFonctionnel;
	}

	/** @param newEstFonctionnel */
	public void setEstFonctionnel(boolean newEstFonctionnel) {
		estFonctionnel = newEstFonctionnel;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	/** @param newDateAchat */
	public void setDateAchat(Date newDateAchat) {
		dateAchat = newDateAchat;
	}

	/** Renvoie la station actuelle du vélo */
	public Station getStation() {
		// TODO: implement
		return null;
	}

}