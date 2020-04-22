package de.mhaeusser.sms;

import java.util.Date;

public class EnergyConsumption {

	private final long id;
	private final Date from;
	private final Date until;

	public EnergyConsumption(long id, Date from, Date until) {
		this.id = id;
		this.from = from;
		this.until = until;
	}

	public long getId() {
		return id;
	}

	public Date getFrom() {
		return from;
	}

	public Date getUntil() {
		return until;
	}
}