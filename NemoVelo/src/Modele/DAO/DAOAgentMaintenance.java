package Modele.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modele.AgentMaintenance;

public class DAOAgentMaintenance {

	public static ArrayList<AgentMaintenance> getAllAgentMaintenance() {

		Statement stat;
		ArrayList<AgentMaintenance> agents = new ArrayList<AgentMaintenance>();

		try {

			stat = DAO.getConnection().createStatement();
			stat.executeUpdate("use nemoagent");
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

	public static AgentMaintenance getAgentMaintenanceById(int idAgent) {

		AgentMaintenance agent = null;
		Statement stat;

		try {

			stat = DAO.getConnection().createStatement();
			stat.executeUpdate("use nemoagent");
			ResultSet res = stat
					.executeQuery("select * from AgentMaintenance where idAgent="
							+ idAgent);

			String nom, prenom, lieuDeNaissance;
			Date dateDeNaissance;

			if (res.next()) {
				idAgent = res.getInt("idAgent");
				nom = res.getString("nom");
				prenom = res.getString("prenom");
				dateDeNaissance = res.getDate("dateDeNaissance");
				lieuDeNaissance = res.getString("lieuDeNaissance");

				agent = new AgentMaintenance(idAgent, nom, prenom,
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
	

	public static void updateAgentMaintenance(AgentMaintenance agent) {

		PreparedStatement stat;
		try {
			stat = DAO.getConnection().prepareStatement(
					"select * from AgentMaintenance where idAgent=?",
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			stat.setInt(1, agent.getIdAgent());
			ResultSet res = stat.executeQuery();

			if (res.next()) {

				res.updateString("nom", agent.getNom());
				res.updateString("prenom", agent.getPrenom());
				res.updateDate("dateDeNaissance", (Date) agent.getDateDeNaissance());
				res.updateString("lieuDeNaissance", agent.getLieuDeNaissance());
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

	public static void deleteAgentMaintenance(AgentMaintenance agent) {

		Statement stat;
		try {
			
			stat = DAO.getConnection().createStatement();

			stat.executeUpdate("delete from AgentMaintenance where idAgent="
					+ agent.getIdAgent());

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

	public static void insertAgentMaintenance(AgentMaintenance agent) {

		PreparedStatement stat;
		try {
			stat = DAO.getConnection().prepareStatement(
					"insert into AgentMaintenance (nom,prenom,dateDeNaissance,)lieuDeNaissance values (?,?,?,?)");

			
			stat.setString(1, agent.getNom());
			stat.setString(2, agent.getPrenom());
			stat.setDate(3, (Date) agent.getDateDeNaissance());
			stat.setString(4, agent.getLieuDeNaissance());
			
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
