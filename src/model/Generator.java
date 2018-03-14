package model;

/*
 * Generator Model
 */
public class Generator extends GeneralEntity {	

	public Generator(long entityId) {
		super(entityId);
	}

	@Override
	public boolean isPartnerIdealMatch(GeneralEntity generalEntity) {
		return false;
	}

}
