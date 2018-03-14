package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import model.GeneralEntity;

/*
 * Class to search for shortestPath
 */
public class AStarPathfinder {
	
	private static final class HeapEntry implements Comparable<HeapEntry> {
		private final GeneralEntity entity;
		private final double distance;
		
		HeapEntry(GeneralEntity entity , double distance) {
			this.entity = entity;
			this.distance = distance;
		}
		
		GeneralEntity getEntity() {
			return entity;
		}

		@Override
		public int compareTo(HeapEntry o) {
			return Double.compare(distance, o.distance);
		}

		public GeneralEntity getNode() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	
	public List<GeneralEntity> search(GeneralEntity start , GeneralEntity end , WeightFunc weightGFunc ,HeuristicFunc func) {
		
		PriorityQueue<HeapEntry> OPEN = new PriorityQueue<>();
		Set<GeneralEntity> CLOSED = new HashSet<>();
		Map<GeneralEntity , Double > DISTANCE= new HashMap<>();
		Map<GeneralEntity , GeneralEntity> PARENTS = new HashMap<>();
		
		HeuristicFunc heuristicFunction = null;
		OPEN.add(new HeapEntry(start , 0.0));
		DISTANCE.put(start , 0.0);
		PARENTS.put(start, null);
		
		while(!OPEN.isEmpty()) {
			GeneralEntity entity = OPEN.remove().getNode();
			
			if(entity.equals(end)) {
				return tracebackPath(entity , PARENTS);
			}
			
			if(CLOSED.contains(entity)) { continue; }
			
			for(GeneralEntity childEntity : entity.getChildren()) {
				if(CLOSED.contains(childEntity)) { continue; }
				
				double tentativeDistance = DISTANCE.get(entity) + weightGFunc.get(entity, childEntity);
				
				if(!DISTANCE.containsKey(childEntity) || DISTANCE.get(childEntity) > tentativeDistance ) {
					DISTANCE.put(childEntity, tentativeDistance);
					PARENTS.put(childEntity, entity);
					
					OPEN.add(
							new HeapEntry(childEntity , tentativeDistance + heuristicFunction.getEstimate(childEntity,end)));
					
					
				}
			}
				
		}
		
		return new ArrayList<>();
	}
	
	private static List<GeneralEntity> tracebackPath(GeneralEntity entity , 
						Map<GeneralEntity,GeneralEntity> PARENTS) {
		List<GeneralEntity> path = new ArrayList<>();
		
		return path;
	}
}
