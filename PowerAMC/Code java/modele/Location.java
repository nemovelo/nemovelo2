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
    * @param idStationDebut Identifiant de la station de départ
    * @param idStationFin Identifiant de la station d'arrivée
    * @param idClient Identifiant du client
    * @param idVelo Identifiant du vélo
    * @param dateDeDebut 
    * @param dateDeFin */
   public Location(int idStationDebut, int idStationFin, int idClient, int idVelo, Date dateDeDebut, Date dateDeFin) {
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