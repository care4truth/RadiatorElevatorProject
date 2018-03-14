package algorithm;

import java.util.HashMap;
import java.util.Map;

import model.GeneralEntity;

public class WeightFunc {

	private final Map<GeneralEntity, Map<GeneralEntity, Double>> map =
			new HashMap();
	
	public void set(GeneralEntity last , GeneralEntity first , double cost) {
		map.putIfAbsent(last, new HashMap<>());
		map.get(last).put(first, cost);
	}
	
	public double get(GeneralEntity last , GeneralEntity first) {
		return map.get(last).get(first);
	}
}
