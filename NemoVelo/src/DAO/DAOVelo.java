/***********************************************************************
 * Module:  DAOVelo.java
 * Author:  Simon
 * Purpose: Defines the Class DAOVelo
 ***********************************************************************/

package DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modele.Velo;

/** Data Access Object d'accès aux vélos */
public class DAOVelo {
   /** Renvoie la liste de tous les vélos
    * 
    * La liste de vélos */
   public static ArrayList<Velo> getAllVelo() {
      Statement stat;

		ArrayList<Velo> velos = new ArrayList<Velo>();

		try {

			stat = DAO.getConnection().createStatement();
			stat.executeUpdate("use nemovelo");
			ResultSet res = stat.executeQuery("select * from Velo");

			Velo velo;
			int idVelo;
			boolean estFonctionnel;
			Date dateAchat;
			while (res.next()) {

				idVelo = res.getInt("idVelo");
				estFonctionnel = res.getBoolean("estFonctionnel");
				dateAchat = res.getDate("dateAchat");

				velo = new Velo(idVelo, estFonctionnel, dateAchat);
				velos.add(velo);
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

		return velos;
   }
   
   /** Renvoie un vélo en fonction de son identifiant
    * 
    * @param idVelo Identifiant du vélo demandé
    * Le vélo demandé */
   public static Velo getVeloById(int idVelo) {
      Statement stat;
		Velo velo = null;

		try {

			stat = DAO.getConnection().createStatement();
			stat.executeUpdate("use nemovelo");
			ResultSet res = stat
					.executeQuery("select * from Velo where idVelo=" + idVelo);

			boolean estFonctionnel;
			Date dateAchat;

			if (res.next()) {
				idVelo = res.getInt("idVelo");
				estFonctionnel = res.getBoolean("estFonctionnel");
				dateAchat = res.getDate("dateAchat");

				velo = new Velo(idVelo, estFonctionnel, dateAchat);
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

		return velo;
   }
   
   /** Met à jour un vélo dans la base
    * 
    * @param velo Le vélo à mettre à jour */
   public static void updateVelo(Velo velo) {
      PreparedStatement stat;
		try {
			stat = DAO.getConnection().prepareStatement(
					"select * from Velo where idVelo=?",
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			stat.setInt(1, velo.getIdVelo());
			ResultSet res = stat.executeQuery();

			if (res.next()) {

				res.updateBoolean("estFonctionnel", velo.getEstFonctionnel());
				res.updateDate("dateAchat", (Date) velo.getDateAchat());
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
   
   /** Supprime un vélo de la base
    * 
    * @param velo Le vélo à supprimer */
   public static void deleteVelo(Velo velo) {
      Statement stat;
		try {
			
			stat = DAO.getConnection().createStatement();

			stat.executeUpdate("delete from Velo where idVelo="
					+ velo.getIdVelo());

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
   
   /** Insère un nouveau vélo dans la base
    * 
    * @param velo Le vélo à insérer */
   public static void insertVelo(Velo velo) {
      PreparedStatement stat;
		try {
			stat = DAO.getConnection().prepareStatement(
					"insert into Velo (estFonctionnel,dateAchat) values (?,?)");

			stat.setBoolean(1, velo.getEstFonctionnel());
			stat.setDate(2, (Date) velo.getDateAchat());
			
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