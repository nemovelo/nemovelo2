/***********************************************************************
 * Module:  Reparation.java
 * Author:  Simon
 * Purpose: Defines the Class Reparation
 ***********************************************************************/

package Modele;

import java.util.*;

/** Objet définissant les réparations */
public class Reparation {
   /** Date de début du stationnement */
   private Date dateDeReparation;
   
   /** Instancie une réparation
    * 
    * @param idAgentMaintenance Identifiant de l'agent de maintenance
    * @param nom Nom de l'agent de maintenance
    * @param prenom Prénom de l'agent de maintenance
    * @param dateDeNaissance Date de naissance de l'agent de maintenance
    * @param lieuDeNaissance Lieu de naissance de l'agent de maintenance */
   public Reparation(int idAgentMaintenance, String nom, String prenom, Date dateDeNaissance, String lieuDeNaissance) {
      // TODO: implement
   }
   
   /** Renvoie l'agent de maintenance concerné par la réparation
    * 
    * L'agent de maintenance */
   public AgentMaintenance getAgentMaintenance() {
      // TODO: implement
      return null;
   }
   
   /** Renvoie la date de réparation
    * 
    * La date */
   public Date getDateDeReparation() {
      return dateDeReparation;
   }
   
   /** Assigne la date de réparation
    * 
    * @param newDateDeReparation */
   public void setDateDeReparation(Date newDateDeReparation) {
      dateDeReparation = newDateDeReparation;
   }

}