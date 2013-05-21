/***********************************************************************
 * Module:  AgentMaintenance.java
 * Author:  Simon
 * Purpose: Defines the Class AgentMaintenance
 ***********************************************************************/

package modele;

import java.util.*;

/** Objet définissant les agents de maintenance */
public class AgentMaintenance {
   /** Identifiant de l'agent de maintenance */
   private int idAgent;
   /** Nom de l'agent de maintenance */
   private String nom;
   /** Prenom de l'agent de maintenance */
   private String prenom;
   /** Date de naissance de l'agent de maintenance */
   private Date dateDeNaissance;
   /** Lieu de naissance de l'agent de maintenance */
   private String lieuDeNaissance;
   
   /** Instancie un agent de maintenance
    * 
    * @param idAgentMaintenance Identifiant de l'agent de maintenance
    * @param nom Nom de l'agent de maintenance
    * @param prenom Prénom de l'agent de maintenance
    * @param dateDeNaissance Date de naissance de l'agent de maintenance
    * @param lieuDeNaissance Lieu de naissance de l'agent de maintenance */
   public AgentMaintenance(int idAgentMaintenance, String nom, String prenom, Date dateDeNaissance, String lieuDeNaissance) {
      // TODO: implement
   }
   
   /** Renvoie l'identifiant de l'agent de maintenance
    * 
    * L'identifiant */
   public int getIdAgent() {
      return idAgent;
   }
   
   /** Renvoie le nom de l'agent de maintenance
    * 
    * Le nom */
   public String getNom() {
      return nom;
   }
   
   /** Assigne le nom de l'agent de maintenance
    * 
    * @param newNom Le nouveau nom */
   public void setNom(String newNom) {
      nom = newNom;
   }
   
   /** Renvoie le prénom de l'agent de maintenance
    * 
    * Le prénom */
   public String getPrenom() {
      return prenom;
   }
   
   /** Assigne le prénom de l'agent de maintenance
    * 
    * @param newPrenom Le nouveau prénom */
   public void setPrenom(String newPrenom) {
      prenom = newPrenom;
   }
   
   /** Renvoie la date de naissance de l'agent de maintenance
    * 
    * La date de naissance */
   public Date getDateDeNaissance() {
      return dateDeNaissance;
   }
   
   /** Assigne la date de naissance de l'agent de maintenance
    * 
    * @param newDateDeNaissance La nouvelle date de naissance */
   public void setDateDeNaissance(Date newDateDeNaissance) {
      dateDeNaissance = newDateDeNaissance;
   }
   
   /** Renvoie le lieu de naissance de l'agent de maintenance
    * 
    * Le lieu de naissance */
   public String getLieuDeNaissance() {
      return lieuDeNaissance;
   }
   
   /** Assigne le lieu de naissance de l'agent de maintenance
    * 
    * @param newLieuDeNaissance Le nouveau lieu de naissance */
   public void setLieuDeNaissance(String newLieuDeNaissance) {
      lieuDeNaissance = newLieuDeNaissance;
   }
   
   /** Renvoie une liste des velos que l'agent a réparé
    * 
    * La liste de vélos */
   public ArrayList<Velo> getVelosRepares() {
      // TODO: implement
      return null;
   }

}