package com.wittybrains.busbookingsystem.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.wittybrains.busbookingsystem.model.Bus;
import com.wittybrains.busbookingsystem.model.TravelSchedule;



@JsonInclude(value = Include.NON_NULL)
public class TravelScheduleDTO {

	private StationDTO source;
	private StationDTO destination;
	
	private String estimatedArrivalTime;
	private String estimatedDepartureTime;
	
	private Long id;
    private Bus bus;
    private double seatCost;
    private int totalSeat;
    
    private int  availableSeat;
	public TravelScheduleDTO() {
		super();
	}

	public TravelScheduleDTO(TravelSchedule travelSchedule) {
		super();
		if (travelSchedule != null) {

			this.source = new StationDTO(travelSchedule.getSource());
			this.destination = new StationDTO(travelSchedule.getDestination());
            this.totalSeat=travelSchedule.getTotalSeat();
			this.estimatedArrivalTime = travelSchedule.getEstimatedArrivalTime().toString();
			this.estimatedDepartureTime = travelSchedule.getEstimatedDepartureTime().toString();
			this.availableSeat=travelSchedule.getAvailableSeat();
			this.seatCost=travelSchedule.getSeatCost();
			this.setBus(travelSchedule.getBus());
		}

	}

	public TravelScheduleDTO(String string) {
		// TODO Auto-generated constructor stub
	}

	
	public StationDTO getSource() {
		return source;
	}

	public void setSource(StationDTO source) {
		this.source = source;
	}

	public StationDTO getDestination() {
		return destination;
	}

	public void setDestination(StationDTO destination) {
		this.destination = destination;
	}



	public String getEstimatedArrivalTime() {
		return estimatedArrivalTime;
	}

	public void setEstimatedArrivalTime(String estimatedArrivalTime) {
		this.estimatedArrivalTime = estimatedArrivalTime;
	}

	public String getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(String estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public int getAvailableSeat() {
		return availableSeat;
	}

	public void setAvailableSeat(int availableSeat) {
		this.availableSeat = availableSeat;
	}

	public int getTotalSeat() {
		return totalSeat;
	}

	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}

	public double getSeatCost() {
		return seatCost;
	}

	public void setSeatCost(double seatCost) {
		this.seatCost = seatCost;
	}

	

	

	

}