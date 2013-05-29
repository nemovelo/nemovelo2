/***********************************************************************
 * Module:  Station.java
 * Author:  Simon
 * Purpose: Defines the Class Station
 ***********************************************************************/

package Modele;

import java.util.*;

/** Objet définissant les stations */
public class Station {
   /** Identifiant de la station */
   private int idStation;
   /** Intitulé de la station */
   private String intitule;
   /** Nombre max de vélos que peut accueillir la station */
   private int nbMaxVelo;
   /** Coordonnées X de la station */
   private int coordX;
   /** Coordonnées Y de la station */
   private int coordY;
   
   /** Instancie une nouvelle station
    * 
    * @param idStation Identifiant de la station
    * @param intitule Intitulé de la station
    * @param nbMaxVelo Nombre maximal de vélos que peut accueillir la station
    * @param coordX Coordonnées X de la station
    * @param coordY Coordonnées Y de la station */
   public Station(int idStation, String intitule, int nbMaxVelo, int coordX, int coordY) {
      // TODO: implement
   }
   
   /** Renvoie l'identifiant de la station
    * 
    * L'identifiant */
   public int getIdStation() {
      return idStation;
   }
   
   /** Renvoie l'intitulé de la station
    * 
    * L'intitulé */
   public String getIntitule() {
      return intitule;
   }
   
   /** Assigne l'intitulé de la station
    * 
    * @param newIntitule Le nouvel intitulé */
   public void setIntitule(String newIntitule) {
      intitule = newIntitule;
   }
   
   /** Renvoie le nombre maximal de vélos que peut accueillir la station
    * 
    * Le nombre maximal de vélos */
   public int getNbMaxVelo() {
      return nbMaxVelo;
   }
   
   /** Assigne le nombre maximal de vélos que peut accueillir la station
    * 
    * @param newNbMaxVelo Le nouveau nombre maximal de vélos */
   public void setNbMaxVelo(int newNbMaxVelo) {
      nbMaxVelo = newNbMaxVelo;
   }
   
   public int getCoordX() {
      return coordX;
   }
   
   /** @param newCoordX La nouvelle coordonnée X */
   public void setCoordX(int newCoordX) {
      coordX = newCoordX;
   }
   
   public int getCoordY() {
      return coordY;
   }
   
   /** @param newCoordY La nouvelle coordonnée Y */
   public void setCoordY(int newCoordY) {
      coordY = newCoordY;
   }
   
   /** Renvoie la liste des stationnements
    * 
    * La liste des stationnements */
   public ArrayList<Stationnement> getStationnements() {
      // TODO: implement
      return null;
   }
   
   /** Renvoie la liste des stationnements actuels
    * 
    * La liste des stationnements actuels */
   public ArrayList<Stationnement> getStationnementsActuels() {
      // TODO: implement
      return null;
   }
   
   /** Renvoie la liste des stationnements entre les dates passées en paramètre
    * 
    * @param dateDebut Date de début à rechercher
    * @param dateFin Date de fin à rechercher
    * La liste des stationnements */
   public ArrayList<Velo> getStationnementsByDate(Date dateDebut, Date dateFin) {
      // TODO: implement
      return null;
   }

}