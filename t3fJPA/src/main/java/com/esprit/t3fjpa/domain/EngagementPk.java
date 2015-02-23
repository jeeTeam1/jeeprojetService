package com.esprit.t3fjpa.domain;

import java.io.Serializable;
import java.lang.Integer;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: EngagementPk
 *
 */
@Embeddable

public class EngagementPk implements Serializable {

	
	private Integer association_id;
	private Integer player_id;
	private static final long serialVersionUID = 1L;

	public EngagementPk() {
		super();
	}   
	public Integer getAssociation_id() {
		return this.association_id;
	}

	public void setAssociation_id(Integer association_id) {
		this.association_id = association_id;
	}   
	public Integer getPlayer_id() {
		return this.player_id;
	}

	public void setPlayer_id(Integer player_id) {
		this.player_id = player_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((association_id == null) ? 0 : association_id.hashCode());
		result = prime * result
				+ ((player_id == null) ? 0 : player_id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EngagementPk other = (EngagementPk) obj;
		if (association_id == null) {
			if (other.association_id != null)
				return false;
		} else if (!association_id.equals(other.association_id))
			return false;
		if (player_id == null) {
			if (other.player_id != null)
				return false;
		} else if (!player_id.equals(other.player_id))
			return false;
		return true;
	}
	
   
}
