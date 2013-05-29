/***********************************************************************
 * Module:  Stationnement.java
 * Author:  Simon
 * Purpose: Defines the Class Stationnement
 ***********************************************************************/

package Modele;

import java.util.*;

/** Objet définissant les stationnements */
public class Stationnement {
   /** Date de début du stationnement */
   private Date dateDeDebut;
   /** Date de fin du stationnement */
   private Date dateDeFin;
   
   /** Instancie un stationnement
    * 
    * @param idStation Identifiant de la station
    * @param idVelo Identifiant du vélo
    * @param dateDeDebut Date de début du stationnement
    * @param dateDeFin Date de fin du stationnement */
   public Stationnement(int idStation, int idVelo, Date dateDeDebut, Date dateDeFin) {
      // TODO: implement
   }
   
   /** Renvoie le vélo concerné par le sationnement
    * 
    * Le vélo */
   public Velo getVelo() {
      // TODO: implement
      return null;
   }
   
   /** Renvoie la station concernée par le stationnement
    * 
    * La station */
   public Station getStation() {
      // TODO: implement
      return null;
   }
   
   public Date getDateDeFin() {
      return dateDeFin;
   }
   
   /** @param newDateDeFin */
   public void setDateDeFin(Date newDateDeFin) {
      dateDeFin = newDateDeFin;
   }

}