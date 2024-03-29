/***********************************************************************
 * Module:  Velo.java
 * Author:  Simon
 * Purpose: Defines the Class Velo
 ***********************************************************************/

package Modele;

import java.util.*;

/** Objet définissant les vélos */
public class Velo {
   /** Identifiant du vélo */
   private int idVelo;
   /** Booléen le vélo est fonctionnel */
   private boolean estFonctionnel;
   /** Date d'achat du vélo */
   private Date dateAchat;
   
   /** Instancie un nouveau vélo
    * 
    * @param idVelo Identifiant du vélo
    * @param estFonctionnel Indicateur de fonctionnalité du vélo
    * @param dateAchat Date d'achat du vélo */
   public Velo(int idVelo, Boolean estFonctionnel, Date dateAchat) {
      // TODO: implement
   }
   
   /** Renvoie l'identifiant du vélo
    * 
    * L'identifiant */
   public int getIdVelo() {
      return idVelo;
   }
   
   /** Indique si le vélo est fonctionnel
    * 
    * Booléen le vélo est fonctionnel */
   public boolean getEstFonctionnel() {
      return estFonctionnel;
   }
   
   /** Assigne l'état fonctionnel du vélo
    * 
    * @param newEstFonctionnel */
   public void setEstFonctionnel(boolean newEstFonctionnel) {
      estFonctionnel = newEstFonctionnel;
   }
   
   /** Renvoie la date d'achat du vélo
    * 
    * La date d'achat */
   public Date getDateAchat() {
      return dateAchat;
   }
   
   /** Assigne la date d'achat du vélo
    * 
    * @param newDateAchat */
   public void setDateAchat(Date newDateAchat) {
      dateAchat = newDateAchat;
   }
   
   /** Renvoie la liste de sationnements
    * 
    * La liste de stationnements */
   public List<Stationnement> getStationnements() {
      // TODO: implement
      return null;
   }
   
   /** Renvoie la liste de réparations
    * 
    * La liste de réparations */
   public List<Reparation> getReparations() {
      // TODO: implement
      return null;
   }
   
   /** Renvoie la liste de locations
    * 
    * La liste de locations */
   public List<Location> getLocations() {
      // TODO: implement
      return null;
   }

}