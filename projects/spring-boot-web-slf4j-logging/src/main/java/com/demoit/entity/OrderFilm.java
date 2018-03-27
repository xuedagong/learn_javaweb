package com.demoit.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderFilm implements Serializable {
    private Integer id;

    private Long orderId;

    private String cinemaName;

    private String cinemaAddress;

    private String movieName;

    private Date moviePlayTime;

    private Integer movieTime;

    private String hallType;

    private String hallName;

    private String getTicketNum;

    private String seatName;

    private Date payEndTime;

    private Date ticketTime;

    private Date addTime;

    private Date updateTime;

    private Integer delFlag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getCinemaAddress() {
        return cinemaAddress;
    }

    public void setCinemaAddress(String cinemaAddress) {
        this.cinemaAddress = cinemaAddress;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getMoviePlayTime() {
        return moviePlayTime;
    }

    public void setMoviePlayTime(Date moviePlayTime) {
        this.moviePlayTime = moviePlayTime;
    }

    public Integer getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(Integer movieTime) {
        this.movieTime = movieTime;
    }

    public String getHallType() {
        return hallType;
    }

    public void setHallType(String hallType) {
        this.hallType = hallType;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public String getGetTicketNum() {
        return getTicketNum;
    }

    public void setGetTicketNum(String getTicketNum) {
        this.getTicketNum = getTicketNum;
    }

    public String getSeatName() {
        return seatName;
    }

    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }

    public Date getPayEndTime() {
        return payEndTime;
    }

    public void setPayEndTime(Date payEndTime) {
        this.payEndTime = payEndTime;
    }

    public Date getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(Date ticketTime) {
        this.ticketTime = ticketTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", cinemaName=").append(cinemaName);
        sb.append(", cinemaAddress=").append(cinemaAddress);
        sb.append(", movieName=").append(movieName);
        sb.append(", moviePlayTime=").append(moviePlayTime);
        sb.append(", movieTime=").append(movieTime);
        sb.append(", hallType=").append(hallType);
        sb.append(", hallName=").append(hallName);
        sb.append(", getTicketNum=").append(getTicketNum);
        sb.append(", seatName=").append(seatName);
        sb.append(", payEndTime=").append(payEndTime);
        sb.append(", ticketTime=").append(ticketTime);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}