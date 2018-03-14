package model;

/*
 * Model class for chip
 */
public class Chip extends GeneralEntity {

	public Chip(long entityId) {
		super(entityId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isPartnerIdealMatch(GeneralEntity generalEntity) {
		return false;
	}
	
}
