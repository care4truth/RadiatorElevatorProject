package algorithm;

import model.GeneralEntity;

public class EuclideanHeuristicFunc implements HeuristicFunc{

	private final EntityCoordinates entityCoordinates;
	
	public EuclideanHeuristicFunc(EntityCoordinates entityCoordinates) {
		this.entityCoordinates = entityCoordinates;
	}
	
	@Override
	public double getEstimate(GeneralEntity entity1, GeneralEntity entity2) {
	
		return this.entityCoordinates.get(entity1).distance(entityCoordinates.get(entity2));
	} 
}
