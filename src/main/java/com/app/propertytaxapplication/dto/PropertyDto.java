package com.app.propertytaxapplication.dto;

import java.util.List;

import com.app.propertytaxapplication.entity.Zone;
import com.app.propertytaxapplication.utils.STATUS;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PropertyDto {

	private List<Zone> zones;
	private STATUS status;
	private float amount;

	public PropertyDto(List<Zone> zones, STATUS status, float amount) {
		super();
		this.zones = zones;
		this.status = status;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "PropertyDto [zones=" + zones + ", status=" + status + ", amount=" + amount + "]";
	}
}
