package Controleur;

import java.util.List;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;

import org.openstreetmap.gui.jmapviewer.interfaces.MapMarker;

import Vue.Map;

public class Map_event  implements MouseListener{

	private Map map;
	public Map_event(Map m){
		
		this.map = m;
	}
	@Override
	public void mouseClicked(MouseEvent e) {

	    if(e.getClickCount() == 1 && e.getButton() == MouseEvent.BUTTON1){

	         Point p = e.getPoint();
	            int X = p.x+3;
	            int Y = p.y+3;
	            List<MapMarker> ar = map.getMapMarkerList();
	            Iterator<MapMarker> i = ar.iterator();
	            while (i.hasNext()) {

	                MapMarker mapMarker = (MapMarker) i.next();

	                Point MarkerPosition = map.getMapPosition(mapMarker.getLat(), mapMarker.getLon());
	                if( MarkerPosition != null){

	                    int centerX =  MarkerPosition.x;
	                    int centerY = MarkerPosition.y;

	                    // calculate the radius from the touch to the center of the dot
	                    double radCircle  = Math.sqrt( (((centerX-X)*(centerX-X)) + (centerY-Y)*(centerY-Y)));

	                    // if the radius is smaller then 23 (radius of a ball is 5), then it must be on the dot
	                    if (radCircle < 8){
	                        System.out.println(mapMarker.toString() + " is clicked");                       }

	                }
	            }
	    }

//	    else if (doubleClickZoomEnabled && e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1) {
//	        map.zoomIn(e.getPoint());
//	    }
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
