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
      this.idVelo = idVelo;
      this.estFonctionnel = estFonctionnel;
      this.dateAchat = dateAchat;
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
   
   /** Renvoie la station actuelle du vélo
    * 
    * La station */
   public Station getStation() {
      // TODO: implement
      return null;
   }

}