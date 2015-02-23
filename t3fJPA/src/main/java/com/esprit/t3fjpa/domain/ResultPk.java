package com.esprit.t3fjpa.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable

public class ResultPk implements Serializable {
	private Integer team_id;
	private Integer match_id;

	public Integer getMatch_id() {
		return match_id;
	}
	public void setMatch_id(Integer match_id) {
		this.match_id = match_id;
	}
	public Integer getTeam_id() {
		return team_id;
	}
	public void setTeam_id(Integer team_id) {
		this.team_id = team_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((match_id == null) ? 0 : match_id.hashCode());
		result = prime * result + ((team_id == null) ? 0 : team_id.hashCode());
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
		ResultPk other = (ResultPk) obj;
		if (match_id == null) {
			if (other.match_id != null)
				return false;
		} else if (!match_id.equals(other.match_id))
			return false;
		if (team_id == null) {
			if (other.team_id != null)
				return false;
		} else if (!team_id.equals(other.team_id))
			return false;
		return true;
	}
	

}
