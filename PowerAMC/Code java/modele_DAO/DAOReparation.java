/***********************************************************************
 * Module:  DAOReparation.java
 * Author:  Simon
 * Purpose: Defines the Class DAOReparation
 ***********************************************************************/

package Modele_DAO;

import java.util.*;

/** Data Access Object d'accès aux réparations */
public class DAOReparation {
   /** Renvoie la liste de toutes les réparations
    * 
    * La liste de réparations */
   public static ArrayList<Reparation> getAllReparation() {
      // TODO: implement
      return null;
   }
   
   /** Renvoie une réparation en fonction de son identifiant
    * 
    * @param idAgentMaintenance Identifiant de l'agent demandé
    * La réparation demandée */
   public static Reparation getReparationById(int idAgentMaintenance) {
      // TODO: implement
      return null;
   }
   
   /** Met à jour une réparation dans la base
    * 
    * @param agentMaintenance L'agent de maintenance à mettre à jour */
   public static void updateReparation(AgentMaintenance agentMaintenance) {
      // TODO: implement
   }
   
   /** Supprime une réparation de la base
    * 
    * @param agentMaintenance L'agent de maintenance à supprimer */
   public static void deleteReparation(AgentMaintenance agentMaintenance) {
      // TODO: implement
   }
   
   /** Insère un nouvelle réparation dans la base
    * 
    * @param agentMaintenance L'agent de maintenance à insérer */
   public static void insertReparation(AgentMaintenance agentMaintenance) {
      // TODO: implement
   }

}