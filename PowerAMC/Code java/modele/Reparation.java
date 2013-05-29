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
    * @param idVelo Identifiant du vélo
    * @param dateDeReparation */
   public Reparation(int idAgentMaintenance, int idVelo, Date dateDeReparation) {
      // TODO: implement
   }
   
   /** Renvoie l'agent de maintenance concerné par la réparation
    * 
    * L'agent de maintenance */
   public AgentMaintenance getAgentMaintenance() {
      // TODO: implement
      return null;
   }
   
   /** Renvoie le vélo concerné par la réparation
    * 
    * Le vélo */
   public Velo getVelo() {
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