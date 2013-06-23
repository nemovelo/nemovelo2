package Vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;

import Controleur.Map_event;

public class Map extends JMapViewer  {
	
	 
	public Map(){
		MapMarkerDot station1 = new MapMarkerDot(43.837235,4.357642);
		this.addMapMarker(station1);
		this.setDisplayToFitMapMarkers();

		addMouseListener(new Map_event(this));
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
	
	}
	
	
	

}
