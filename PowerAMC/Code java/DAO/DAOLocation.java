/***********************************************************************
 * Module:  DAOLocation.java
 * Author:  Simon
 * Purpose: Defines the Class DAOLocation
 ***********************************************************************/

package DAO;

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
    * @param location L'agent de maintenance à mettre à jour */
   public static void updateLocation(Location location) {
      // TODO: implement
   }
   
   /** Supprime un stationnement de la base
    * 
    * @param location L'agent de maintenance à supprimer */
   public static void deleteLocation(Location location) {
      // TODO: implement
   }
   
   /** Insère un nouveau stationnement dans la base
    * 
    * @param location L'agent de maintenance à insérer */
   public static void insertLocation(Location location) {
      // TODO: implement
   }

}