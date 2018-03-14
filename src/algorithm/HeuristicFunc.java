package algorithm;

import model.GeneralEntity;

public interface HeuristicFunc {
	public double getEstimate(GeneralEntity entity1 , GeneralEntity entity2);
}
