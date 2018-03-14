package model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

enum EntityType {
	PROMETHIUM , COBALT ,CURIUM , RUTHENIUM , PLUTONIUM  
}

/*
 * General Entity which can be made specific as Chip or Generator
 */
public abstract class  GeneralEntity {
	
	private long entityId;
	private EntityType entityType;
	boolean isEntityPartnered = false;
	
	private Set<GeneralEntity> children = new HashSet<>();
	
	abstract boolean isPartnerIdealMatch(GeneralEntity generalEntity);
	
	public GeneralEntity(long entityId) {
		this.entityId = entityId;
	}
	
	public Set<GeneralEntity> getChildren() {
		return Collections.unmodifiableSet(children);
	}
	
	public void addGeneralEntity(GeneralEntity entity) {
		children.add(entity);
	} 
	
	public long getEntityId() {
		return entityId;
	}

	public void setEntityId(long entityId) {
		this.entityId = entityId;
	}

	public EntityType getEntityType() {
		return entityType;
	}

	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}

	public boolean isEntityPartnered() {
		return isEntityPartnered;
	}

	public void setEntityPartnered(boolean isEntityPartnered) {
		this.isEntityPartnered = isEntityPartnered;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null || !getClass().equals(o.getClass())) {
			return false;
		}
		
		return entityId == ((GeneralEntity) o).entityId;
	}
	
	@Override
	public int hashCode() {
		return (int) this.entityId;
	}

	@Override
	public String toString() {
		return "GeneralEntity [entityId=" + entityId + ", entityType=" + entityType + ", isEntityPartnered="
				+ isEntityPartnered + ", children=" + children + "]";
	}
	
	
}

