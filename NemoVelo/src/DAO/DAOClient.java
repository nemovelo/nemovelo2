/***********************************************************************
 * Module:  DAOClient.java
 * Author:  Simon
 * Purpose: Defines the Class DAOClient
 ***********************************************************************/

package DAO;

import java.util.*;

import Modele.Client;

/** Data Access Object d'accès clients */
public class DAOClient {
   /** Renvoie la liste de tous les clients
    * 
    * La liste de clients */
   public static ArrayList<Client> getAllClient() {
      // TODO: implement
      return null;
   }
   
   /** Renvoie un client en fonction de son identifiant
    * 
    * @param idVelo Identifiant du vélo demandé
    * Le client demandé */
   public static Client getClientById(int idVelo) {
      // TODO: implement
      return null;
   }
   
   /** Met à jour un client dans la base
    * 
    * @param client Le client à mettre à jour */
   public static void updateClient(Client client) {
      // TODO: implement
   }
   
   /** Supprime un client de la base
    * 
    * @param client Le client à supprimer */
   public static void deleteClient(Client client) {
      // TODO: implement
   }
   
   /** Insère un nouveau client dans la base
    * 
    * @param client Le clien à insérer */
   public static void insertClient(Client client) {
      // TODO: implement
   }

}