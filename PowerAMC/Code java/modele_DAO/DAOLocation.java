/***********************************************************************
 * Module:  DAOLocation.java
 * Author:  Simon
 * Purpose: Defines the Class DAOLocation
 ***********************************************************************/

package Modele_DAO;

import java.util.*;

/** Data Access Object d'accès aux locations */
public class DAOLocation {
   /** Renvoie la liste de tous les stationnements
    * 
    * La liste de stationnements */
   public static ArrayList<Location> getAllLocation() {
      // TODO: implement
      return null;
   }
   
   /** Renvoie un stationnement en fonction de son identifiant
    * 
    * @param idAgentMaintenance Identifiant de l'agent demandé
    * Le stationnement demandé */
   public static Location getLocationById(int idAgentMaintenance) {
      // TODO: implement
      return null;
   }
   
   /** Met à jour un stationnement dans la base
    * 
    * @param agentMaintenance L'agent de maintenance à mettre à jour */
   public static void updateLocation(AgentMaintenance agentMaintenance) {
      // TODO: implement
   }
   
   /** Supprime un stationnement de la base
    * 
    * @param agentMaintenance L'agent de maintenance à supprimer */
   public static void deleteLocation(AgentMaintenance agentMaintenance) {
      // TODO: implement
   }
   
   /** Insère un nouveau stationnement dans la base
    * 
    * @param agentMaintenance L'agent de maintenance à insérer */
   public static void insertLocation(AgentMaintenance agentMaintenance) {
      // TODO: implement
   }

}