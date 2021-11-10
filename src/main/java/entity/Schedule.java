package entity;

import java.util.Date;

public class Schedule {

	private int cdSchedule;
	private int cdRestaurant;
	private Date opening;
	private Date closing;

	public Schedule(int cdSchedule, int cdRestaurant, Date opening, Date closing) {
		super();
		this.cdSchedule = cdSchedule;
		this.cdRestaurant = cdRestaurant;
		this.opening = opening;
		this.closing = closing;
	}

	public Schedule() {
		super();
	}

	public int getCdSchedule() {
		return cdSchedule;
	}

	public void setCdSchedule(int cdSchedule) {
		this.cdSchedule = cdSchedule;
	}

	public int getCdRestaurant() {
		return cdRestaurant;
	}

	public void setCdRestaurant(int cdRestaurant) {
		this.cdRestaurant = cdRestaurant;
	}

	public Date getOpening() {
		return opening;
	}

	public void setOpening(Date opening) {
		this.opening = opening;
	}

	public Date getClosing() {
		return closing;
	}

	public void setClosing(Date closing) {
		this.closing = closing;
	}

}
