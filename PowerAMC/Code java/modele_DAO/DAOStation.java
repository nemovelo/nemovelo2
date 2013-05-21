﻿/***********************************************************************
 * Module:  DAOStation.java
 * Author:  Simon
 * Purpose: Defines the Class DAOStation
 ***********************************************************************/

package modele_DAO;

import java.util.*;

/** Data Access Object d'accès aux stations */
public class DAOStation {
   /** Renvoie la liste de toutes les stations
    * 
    * La liste de stations */
   public static ArrayList<Station> getAllStation() {
      // TODO: implement
      return null;
   }
   
   /** Renvoie une station en fonction de son identifiant
    * 
    * @param idStation L'identifiant de la station demandée
    * La station demandée */
   public static Station getStationById(int idStation) {
      // TODO: implement
      return null;
   }
   
   /** Met à jour une station dans la base
    * 
    * @param station La station à mettre à jour */
   public static void updateStation(Station station) {
      // TODO: implement
   }
   
   /** Supprime une station de la base
    * 
    * @param station La station à supprimer */
   public static void deleteStation(Station station) {
      // TODO: implement
   }
   
   /** Insère une nouvelle station dans la base
    * 
    * @param station La station à insérer */
   public static void insertStation(Station station) {
      // TODO: implement
   }

}