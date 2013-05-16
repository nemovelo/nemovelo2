import Modele.AgentMaintenance;
import Modele.Station;
import Modele.Velo;
import Modele.DAO.DAOAgentMaintenance;
import Modele.DAO.DAOStation;
import Modele.DAO.DAOVelo;

public class ProgrammePrincipal {
	public static void main(String[] args) {
		try {
			
			System.out.println("Toutes les stations :");
			for(Station s : DAOStation.getAllStation()){
				System.out.println(s.getIdStation()+ " "+s.getIntitule());
			}
			System.out.println("Station N°2: "+DAOStation.getStationById(2).getIntitule());
			System.out.println("Ajout d'une nouvelle station en copie de la N°2.");
			DAOStation.insertStation(DAOStation.getStationById(2));
			Station newStat = DAOStation.getAllStation().get((DAOStation.getAllStation().size()-1));
			newStat.setIntitule(newStat.getIntitule()+" (Copie)");
			DAOStation.updateStation(newStat);
			System.out.println("\nToutes les stations :");
			for(Station s : DAOStation.getAllStation()){
				System.out.println(s.getIdStation()+ " "+s.getIntitule());
			}
			System.out.println("Suppression de la nouvelle station.");
			DAOStation.deleteStation(DAOStation.getAllStation().get((DAOStation.getAllStation().size()-1)));
			System.out.println("\nToutes les stations :");
			for(Station s : DAOStation.getAllStation()){
				System.out.println(s.getIdStation()+ " "+s.getIntitule());
			}
			
			System.out.println("\nTous les vélos :");			
			for(Velo v : DAOVelo.getAllVelo()){
				System.out.println(v.getIdVelo() + "  " + v.getDateAchat());
			}
			System.out.println("Velo N°2: " +DAOVelo.getVeloById(2).getIdVelo() + " " + DAOVelo.getVeloById(2).getDateAchat());
			
			System.out.println("\nTous les agents de maintenance :");
			for(AgentMaintenance a : DAOAgentMaintenance.getAllAgentMaintenance()){
				System.out.println(a.getIdAgent() + "  " + a.getNom() +" "+a.getPrenom()+ " "+a.getDateDeNaissance() + " "+a.getLieuDeNaissance());
			}
			System.out.println("Agent N°2: " +DAOAgentMaintenance.getAgentMaintenanceById(2).getNom() + " " + DAOAgentMaintenance.getAgentMaintenanceById(2).getPrenom());
			
			
			System.out.println("\nFin du programme ...");

		} catch (Exception ex) {
			System.out.println("Exception: "+ex.getMessage());
		}
	}
}
