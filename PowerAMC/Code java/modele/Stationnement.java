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
    * @param idAgentMaintenance Identifiant de l'agent de maintenance
    * @param nom Nom de l'agent de maintenance
    * @param prenom Prénom de l'agent de maintenance
    * @param dateDeNaissance Date de naissance de l'agent de maintenance
    * @param lieuDeNaissance Lieu de naissance de l'agent de maintenance */
   public Stationnement(int idAgentMaintenance, String nom, String prenom, Date dateDeNaissance, String lieuDeNaissance) {
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