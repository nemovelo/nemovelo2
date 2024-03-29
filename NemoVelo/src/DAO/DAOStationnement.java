﻿/***********************************************************************
 * Module:  DAOStationnement.java
 * Author:  Simon
 * Purpose: Defines the Class DAOStationnement
 ***********************************************************************/

package DAO;

import java.util.*;

import Modele.Stationnement;

/** Data Access Object d'accès aux stationnements */
public class DAOStationnement {
   /** Renvoie la liste de tous les stationnements
    * 
    * La liste de stationnements */
   public static ArrayList<Stationnement> getAllStationnement() {
      // TODO: implement
      return null;
   }
   
   /** Renvoie un stationnement en fonction de son identifiant
    * 
    * @param idAgentMaintenance Identifiant de l'agent demandé
    * Le stationnement demandé */
   public static Stationnement getStationnementById(int idAgentMaintenance) {
      // TODO: implement
      return null;
   }
   
   /** Met à jour un stationnement dans la base
    * 
    * @param stationnement L'agent de maintenance à mettre à jour */
   public static void updateStationnement(Stationnement stationnement) {
      // TODO: implement
   }
   
   /** Supprime un stationnement de la base
    * 
    * @param stationnement L'agent de maintenance à supprimer */
   public static void deleteStationnement(Stationnement stationnement) {
      // TODO: implement
   }
   
   /** Insère un nouveau stationnement dans la base
    * 
    * @param stationnement L'agent de maintenance à insérer */
   public static void insertStationnement(Stationnement stationnement) {
      // TODO: implement
   }

}