/***********************************************************************
 * Module:  DAOAgentMaintenance.java
 * Author:  Simon
 * Purpose: Defines the Class DAOAgentMaintenance
 ***********************************************************************/

package modele_DAO;

import java.util.*;

/** Data Access Object d'accès aux agents de maintenance */
public class DAOAgentMaintenance {
   /** Renvoie la liste de tous les agents de maintenance
    * 
    * La liste d'agents */
   public static ArrayList<AgentMaintenance> getAllAgentMaintenance() {
      // TODO: implement
      return null;
   }
   
   /** Renvoie un agent de maintenance en fonction de son identifiant
    * 
    * @param idAgentMaintenance Identifiant de l'agent demandé
    * L'agent demandé */
   public static AgentMaintenance getAgentMaintenanceById(int idAgentMaintenance) {
      // TODO: implement
      return null;
   }
   
   /** Met à jour un agent de maintenance dans la base
    * 
    * @param agentMaintenance L'agent de maintenance à mettre à jour */
   public static void updateAgentMaintenance(Velo agentMaintenance) {
      // TODO: implement
   }
   
   /** Supprime un agent de maintenance de la base
    * 
    * @param agentMaintenance L'agent de maintenance à supprimer */
   public static void deleteAgentMaintenance(Velo agentMaintenance) {
      // TODO: implement
   }
   
   /** Insère un nouvel agent de maintenance dans la base
    * 
    * @param agentMaintenance L'agent de maintenance à insérer */
   public static void insertAgentMaintenance(Velo agentMaintenance) {
      // TODO: implement
   }

}