package algorithm;

import java.awt.geom.Point2D;
import java.util.HashMap;
import java.util.Map;

import model.GeneralEntity;

public class EntityCoordinates {
	
	private final Map<GeneralEntity , Point2D.Double> map = new HashMap<>();
	
	public void put(GeneralEntity entity , Point2D.Double point) {
		map.put(entity, point);
	}
	
	public Point2D.Double get(GeneralEntity entity) {
		return map.get(entity);
	}
	
	
}
