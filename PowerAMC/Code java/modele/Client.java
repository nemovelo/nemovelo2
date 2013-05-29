/***********************************************************************
 * Module:  Client.java
 * Author:  Simon
 * Purpose: Defines the Class Client
 ***********************************************************************/

package Modele;

import java.util.*;

/** Objet définissant les cliens */
public class Client {
   /** Identifiant du client */
   private int idClient;
   /** Nom du client */
   private String nom;
   /** Prénom du client */
   private String prenom;
   /** Date de naissance du client */
   private Date dateDeNaissance;
   /** Lieu de naissance du client */
   private String lieuDeNaissance;
   
   /** Instancite un nouveau client
    * 
    * @param idClient Identifiant du client
    * @param nom Nom du client
    * @param prenom Prénom du client
    * @param dateDeNaissance Date de naissance du client
    * @param lieuDeNaissance Lieu de naissance du client */
   public Client(int idClient, String nom, String prenom, Date dateDeNaissance, String lieuDeNaissance) {
      // TODO: implement
   }
   
   /** Renvoie l'identifiant du client
    * 
    * L'identifiant */
   public int getIdClient() {
      return idClient;
   }
   
   /** Renvoie le nom du client
    * 
    * Le nom */
   public String getNom() {
      return nom;
   }
   
   /** Assigne le nom du client
    * 
    * @param newNom Le nouveau nom */
   public void setNom(String newNom) {
      nom = newNom;
   }
   
   /** Renvoie le prénom du client
    * 
    * Le prénom */
   public String getPrenom() {
      return prenom;
   }
   
   /** Assigne le prénom du client
    * 
    * @param newPrenom Le nouveau prénom */
   public void setPrenom(String newPrenom) {
      prenom = newPrenom;
   }
   
   /** Renvoie la date de naissance du client
    * 
    * La date de naissance */
   public Date getDateDeNaissance() {
      return dateDeNaissance;
   }
   
   /** Assigne la date de naissance du client
    * 
    * @param newDateDeNaissance La nouvelle date de naissance */
   public void setDateDeNaissance(Date newDateDeNaissance) {
      dateDeNaissance = newDateDeNaissance;
   }
   
   /** Renvoie le lieu de naissance du client
    * 
    * Le lieu de naissance */
   public String getLieuDeNaissance() {
      return lieuDeNaissance;
   }
   
   /** Assigne le lieu de naissance du client
    * 
    * @param newLieuDeNaissance Le nouveau lieu de naissance */
   public void setLieuDeNaissance(String newLieuDeNaissance) {
      lieuDeNaissance = newLieuDeNaissance;
   }
   
   /** Renvoie la liste des vélos que le client a loué
    * 
    * La liste de vélos */
   public ArrayList<Velo> getVelosLoues() {
      // TODO: implement
      return null;
   }

}