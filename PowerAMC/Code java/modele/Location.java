/***********************************************************************
 * Module:  Location.java
 * Author:  Simon
 * Purpose: Defines the Class Location
 ***********************************************************************/

package Modele;

import java.util.*;

/** Objet définissant les locations */
public class Location {
   /** Date de début du stationnement */
   private Date dateDeDebut;
   /** Date de fin du stationnement */
   private Date dateDeFin;
   
   /** Instancie une location
    * 
    * @param idAgentMaintenance Identifiant de l'agent de maintenance
    * @param nom Nom de l'agent de maintenance
    * @param prenom Prénom de l'agent de maintenance
    * @param dateDeNaissance Date de naissance de l'agent de maintenance
    * @param lieuDeNaissance Lieu de naissance de l'agent de maintenance */
   public Location(int idAgentMaintenance, String nom, String prenom, Date dateDeNaissance, String lieuDeNaissance) {
      // TODO: implement
   }
   
   /** Renvoie le vélo concerné par la location
    * 
    * Le vélo */
   public Velo getVelo() {
      // TODO: implement
      return null;
   }
   
   /** Renvoie le client concernée par la location
    * 
    * La station */
   public Station getClient() {
      // TODO: implement
      return null;
   }
   
   /** Renvoie la station de fin concernée par le stationnement
    * 
    * La station */
   public Station getStationFin() {
      // TODO: implement
      return null;
   }
   
   /** Renvoie la station de début concernée par le stationnement
    * 
    * La station */
   public Station getStationDebut() {
      // TODO: implement
      return null;
   }
   
   /** Renvoie la date de fin de la location
    * 
    * La date de fin */
   public Date getDateDeFin() {
      return dateDeFin;
   }
   
   /** Assigne la date de fin de la location
    * 
    * @param newDateDeFin */
   public void setDateDeFin(Date newDateDeFin) {
      dateDeFin = newDateDeFin;
   }
   
   /** Renvoie la date de début de la location
    * 
    * La date de début */
   public Date getDateDeDebut() {
      return dateDeDebut;
   }
   
   /** Assigne la date de fin de la location
    * 
    * @param newDateDeDebut */
   public void setDateDeDebut(Date newDateDeDebut) {
      dateDeDebut = newDateDeDebut;
   }

}