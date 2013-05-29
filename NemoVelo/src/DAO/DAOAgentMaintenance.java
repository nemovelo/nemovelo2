/***********************************************************************
 * Module:  DAOAgentMaintenance.java
 * Author:  Simon
 * Purpose: Defines the Class DAOAgentMaintenance
 ***********************************************************************/

package DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modele.AgentMaintenance;

/** Data Access Object d'accès aux agents de maintenance */
public class DAOAgentMaintenance {
   /** Renvoie la liste de tous les agents de maintenance
    * 
    * La liste d'agents */
   public static ArrayList<AgentMaintenance> getAllAgentMaintenance() {
      Statement stat;
		ArrayList<AgentMaintenance> agents = new ArrayList<AgentMaintenance>();

		try {

			stat = DAO.getConnection().createStatement();
			stat.executeUpdate("use nemovelo");
			ResultSet res = stat.executeQuery("select * from AgentMaintenance");

			AgentMaintenance agent;
			int idAgent;
			String nom, prenom, lieuDeNaissance;
			Date dateDeNaissance;

			while (res.next()) {

				idAgent = res.getInt("idAgent");
				nom = res.getString("nom");
				prenom = res.getString("prenom");
				dateDeNaissance = res.getDate("dateDeNaissance");
				lieuDeNaissance = res.getString("lieuDeNaissance");

				agent = new AgentMaintenance(idAgent, nom, prenom,
						dateDeNaissance, lieuDeNaissance);
				agents.add(agent);
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

		return agents;
   }
   
   /** Renvoie un agent de maintenance en fonction de son identifiant
    * 
    * @param idAgentMaintenance Identifiant de l'agent demandé
    * L'agent demandé */
   public static AgentMaintenance getAgentMaintenanceById(int idAgentMaintenance) {
     AgentMaintenance agent = null;
		Statement stat;

		try {

			stat = DAO.getConnection().createStatement();
			stat.executeUpdate("use nemovelo");
			ResultSet res = stat
					.executeQuery("select * from AgentMaintenance where idAgent="
							+ idAgentMaintenance);

			String nom, prenom, lieuDeNaissance;
			Date dateDeNaissance;

			if (res.next()) {
				idAgentMaintenance = res.getInt("idAgent");
				nom = res.getString("nom");
				prenom = res.getString("prenom");
				dateDeNaissance = res.getDate("dateDeNaissance");
				lieuDeNaissance = res.getString("lieuDeNaissance");

				agent = new AgentMaintenance(idAgentMaintenance, nom, prenom,
						dateDeNaissance, lieuDeNaissance);
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

		return agent;
   }
   
   /** Met à jour un agent de maintenance dans la base
    * 
    * @param agentMaintenance L'agent de maintenance à mettre à jour */
   public static void updateAgentMaintenance(AgentMaintenance agentMaintenance) {
      PreparedStatement stat;
		try {
			stat = DAO.getConnection().prepareStatement(
					"select * from AgentMaintenance where idAgent=?",
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			stat.setInt(1, agentMaintenance.getIdAgent());
			ResultSet res = stat.executeQuery();

			if (res.next()) {

				res.updateString("nom", agentMaintenance.getNom());
				res.updateString("prenom", agentMaintenance.getPrenom());
				res.updateDate("dateDeNaissance", (Date) agentMaintenance.getDateDeNaissance());
				res.updateString("lieuDeNaissance", agentMaintenance.getLieuDeNaissance());
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
   
   /** Supprime un agent de maintenance de la base
    * 
    * @param agentMaintenance L'agent de maintenance à supprimer */
   public static void deleteAgentMaintenance(AgentMaintenance agentMaintenance) {
      Statement stat;
		try {
			
			stat = DAO.getConnection().createStatement();

			stat.executeUpdate("delete from AgentMaintenance where idAgent="
					+ agentMaintenance.getIdAgent());

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
   
   /** Insère un nouvel agent de maintenance dans la base
    * 
    * @param agentMaintenance L'agent de maintenance à insérer */
   public static void insertAgentMaintenance(AgentMaintenance agentMaintenance) {
      PreparedStatement stat;
		try {
			stat = DAO.getConnection().prepareStatement(
					"insert into AgentMaintenance (nom,prenom,dateDeNaissance,)lieuDeNaissance values (?,?,?,?)");

			
			stat.setString(1, agentMaintenance.getNom());
			stat.setString(2, agentMaintenance.getPrenom());
			stat.setDate(3, (Date) agentMaintenance.getDateDeNaissance());
			stat.setString(4, agentMaintenance.getLieuDeNaissance());
			
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