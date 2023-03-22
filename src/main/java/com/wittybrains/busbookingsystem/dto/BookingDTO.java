package com.wittybrains.busbookingsystem.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.wittybrains.busbookingsystem.model.Booking;


@JsonInclude(value = Include.NON_NULL)

public class BookingDTO {
    private Long bookingId;

    private TravelScheduleDTO schedule;
    
    private int numberOfSeats;
   // private double seatCost;
    private Double totalAmount;
    private BusDTO bus;
    private UserDTO user;
    private String seatStatus;
    //private int availableSeat;
    
   
	

	//private int totalSeats;
    public BookingDTO() {
        super();
    }

    public UserDTO getUser() {
        return user;
    }

    public BookingDTO(Booking booking) {
        this.bookingId = booking.getBookingId();
        this.schedule = new TravelScheduleDTO(booking.getSchedule());
       
        
        this.numberOfSeats=booking.getNumberOfSeats();
        this.user = new UserDTO(booking.getUser());
        this.totalAmount=booking.getTotalAmount();
    }
       // TravelScheduleDTO travelScheduleDTO=new TravelScheduleDTO();
        //this.seatCost =travelScheduleDTO.getSeatCost();
        //this.availableSeat=booking.getAvailableSeat();
        //this.totalSeats = this.bus != null ? this.bus.getTotalSeats() : 0;
       // this.setTotalAmount(this.numberOfSeats, this.seatCost);
        
       // this.setTotalAmount=;
//        if (booking.getBus() != null) {
//        this.bus = new BusDTO(booking.getBus());
//        }
         
    //}

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public TravelScheduleDTO getSchedule() {
        return schedule;
    }

    public void setSchedule(TravelScheduleDTO schedule) {
        this.schedule = schedule;
    }

    public BusDTO getBus() {
        return bus;
    }

    public void setBus(BusDTO bus) {
        this.bus = bus;
    }

    public void setUser(UserDTO userDTO) {
        this.user = userDTO;
    }

    

    public String getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(String bookingStatus) {
        this.seatStatus = bookingStatus;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

//    public double getSeatCost() {
//        return seatCost;
//    }
//
//    public void setSeatCost(double seatCost) {
//        this.seatCost = seatCost;
//    }

    public Double getTotalAmount() {
        return totalAmount;
    }

//    public void setTotalAmount() {
//    	TravelScheduleDTO travelScheduleDTO=new TravelScheduleDTO();
//        double subtotal =  numberOfSeats* travelScheduleDTO.getSeatCost();
//        double gst = subtotal * 0.12;
//        this.totalAmount = subtotal + gst;
//    }
    
    
    public void setTotalAmount(double totalAmount) {
 	   
		this.totalAmount=totalAmount;
	}
//	public int getAvailableSeat() {
//		return availableSeat;
//	}
//
//	public void setAvailableSeat(int availableSeat) {
//		this.availableSeat = availableSeat;
//	}

//    public int getAvailableSeat() {
//		
//		int availableSeat = totalSeats - numberOfSeats;
//		
//		return availableSeat;
//		
//	}
    
//    public int getTotalSeats() {
//		return totalSeats;
//	}
//
//	public void setTotalSeats(int totalSeats) {
//		this.totalSeats = totalSeats;
//	}

//	public void setAvailableSeat(int availableSeat) {
//		this.availableSeat = availableSeat;
//	}
}
