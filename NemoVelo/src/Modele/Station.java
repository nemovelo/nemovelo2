package Modele;
/***********************************************************************
 * Module:  Station.java
 * Author:  Simon
 * Purpose: Defines the Class Station
 ***********************************************************************/

import java.util.*;

public class Station {
   private int idStation;
   private String intitule;
   private int nbMaxVelo;
   private int coordX;
   private int coordY;
   
   public Station() {
      // TODO: implement
   }
   
   public Station(int idStation, String intitule, int nbMaxVelo, int coordX, int coordY){
	   this.idStation = idStation;
	   this.intitule = intitule;
	   this.nbMaxVelo = nbMaxVelo;
	   this.coordX = coordX;
	   this.coordY = coordY;
   }
   
   public int getIdStation() {
      return idStation;
   }
   
   public String getIntitule() {
      return intitule;
   }
   
   /** @param newIntitule */
   public void setIntitule(String newIntitule) {
      intitule = newIntitule;
   }
   
   public int getNbMaxVelo() {
      return nbMaxVelo;
   }
   
   /** @param newNbMaxVelo */
   public void setNbMaxVelo(int newNbMaxVelo) {
      nbMaxVelo = newNbMaxVelo;
   }
   
   public int getCoordX() {
      return coordX;
   }
   
   /** @param newCoordX */
   public void setCoordX(int newCoordX) {
      coordX = newCoordX;
   }
   
   public int getCoordY() {
      return coordY;
   }
   
   /** @param newCoordY */
   public void setCoordY(int newCoordY) {
      coordY = newCoordY;
   }
   
   /** Renvoie les vélos actuellement abrités dans la station */
   public ArrayList<Velo> getVelos() {
      // TODO: implement
      return null;
   }
   
   /** Renvoie le nombre de vélos actuellement abrités dans la station */
   public int getCountVelos() {
      // TODO: implement
      return 0;
   }
   
   /** Renvoie les vélos que la station abritait entre les dates passées en paramètre
    * 
    * @param dateDebut Date de début à rechercher
    * @param dateFin Date de fin à rechercher */
   public ArrayList<Velo> getVelosByDate(Date dateDebut, Date dateFin) {
      // TODO: implement
      return null;
   }

}