﻿/***********************************************************************
 * Module:  DAOStation.java
 * Author:  Simon
 * Purpose: Defines the Class DAOStation
 ***********************************************************************/

package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modele.Station;

/** Data Access Object d'accès aux stations */
public class DAOStation {
   /** Renvoie la liste de toutes les stations
    * 
    * La liste de stations */
   public static ArrayList<Station> getAllStation() {
      Statement stat;
		ArrayList<Station> stations = new ArrayList<Station>();
		try {

			stat = DAO.getConnection().createStatement();
			stat.executeUpdate("use nemovelo");
			ResultSet res = stat.executeQuery("select * from Station");

			Station station;
			String intitule;
			int idStation, nbMaxVelo, coordX, coordY;
			while (res.next()) {

				idStation = res.getInt("idStation");
				intitule = res.getString("intitule");
				nbMaxVelo = res.getInt("nbMaxVelo");
				coordX = res.getInt("coordX");
				coordY = res.getInt("coordY");

				station = new Station(idStation, intitule, nbMaxVelo, coordX,
						coordY);
				stations.add(station);
			}

		} catch (SQLException e) {
			System.out.println("sql exception");
			while (e != null) {
				System.out.println(e.getErrorCode());
				System.out.println(e.getMessage());
				System.out.println(e.getSQLState());
				e.printStackTrace();
				e = e.getNextException();
			}
		}

		return stations;
   }
   
   /** Renvoie une station en fonction de son identifiant
    * 
    * @param idStation L'identifiant de la station demandée
    * La station demandée */
   public static Station getStationById(int idStation) {
      Statement stat;
		Station station = null;
		try {
			stat = DAO.getConnection().createStatement();
			ResultSet res = stat
					.executeQuery("select * from Station where idStation="
							+ idStation);

			String intitule;
			int nbMaxVelo, coordX, coordY;

			if (res.next()) {
				idStation = res.getInt("idStation");
				intitule = res.getString("intitule");
				nbMaxVelo = res.getInt("nbMaxVelo");
				coordX = res.getInt("coordX");
				coordY = res.getInt("coordY");

				station = new Station(idStation, intitule, nbMaxVelo, coordX,
						coordY);
			}

		} catch (SQLException e) {
			System.out.println("sql exception");
			while (e != null) {
				System.out.println(e.getErrorCode());
				System.out.println(e.getMessage());
				System.out.println(e.getSQLState());
				e.printStackTrace();
				e = e.getNextException();
			}
		}

		return station;
   }
   
   /** Met à jour une station dans la base
    * 
    * @param station La station à mettre à jour */
   public static void updateStation(Station station) {
      PreparedStatement stat;
		try {
			stat = DAO.getConnection().prepareStatement(
					"select * from Station where idStation=?",
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			stat.setInt(1, station.getIdStation());
			ResultSet res = stat.executeQuery();

			if (res.next()) {
				
				res.updateString("intitule", station.getIntitule());
				res.updateInt("nbMaxVelo", station.getNbMaxVelo());
				res.updateInt("coordX", station.getCoordX());
				res.updateInt("coordY", station.getCoordY());
				res.updateRow();
				
			}

		} catch (SQLException e) {
			System.out.println("sql exception");
			while (e != null) {
				System.out.println(e.getErrorCode());
				System.out.println(e.getMessage());
				System.out.println(e.getSQLState());
				e.printStackTrace();
				e = e.getNextException();
			}
		}
   }
   
   /** Supprime une station de la base
    * 
    * @param station La station à supprimer */
   public static void deleteStation(Station station) {
      Statement stat;
		try {
			
			stat = DAO.getConnection().createStatement();

			stat.executeUpdate("delete from Station where idStation="
					+ station.getIdStation());

		} catch (SQLException e) {

			System.out.println("sql exception");
			while (e != null) {
				System.out.println(e.getErrorCode());
				System.out.println(e.getMessage());
				System.out.println(e.getSQLState());
				e.printStackTrace();
				e = e.getNextException();
			}
		}
   }
   
   /** Insère une nouvelle station dans la base
    * 
    * @param station La station à insérer */
   public static void insertStation(Station station) {
      PreparedStatement stat;
		try {
			stat = DAO.getConnection().prepareStatement(
					"insert into Station (intitule,nbMaxVelo,coordX,coordY) values (?,?,?,?)");

			stat.setString(1, station.getIntitule());
			stat.setInt(2, station.getNbMaxVelo());
			stat.setInt(3, station.getCoordX());
			stat.setInt(4, station.getCoordY());
			
			stat.executeUpdate();


		} catch (SQLException e) {
			System.out.println("sql exception");
			while (e != null) {
				System.out.println(e.getErrorCode());
				System.out.println(e.getMessage());
				System.out.println(e.getSQLState());
				e.printStackTrace();
				e = e.getNextException();
			}
		}

   }

}