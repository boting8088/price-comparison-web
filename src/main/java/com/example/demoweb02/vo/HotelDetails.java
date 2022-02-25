package com.example.demoweb02.vo;

import com.example.demoweb02.model.Hotel;
import lombok.Data;

/**
 * @Description TODO
 * @Author Boting
 * @Data 2021/5/26  18:06
 */
@Data
public class HotelDetails {
    private Hotel hotel;
    private int bookingId;
    private String checkIn;
    private String checkOut;
    private int lyPrice;
    private double lyGrade;
    private int lyComments;
    private String lyUrl;
    private int qunarPrice;
    private double qunarGrade;
    private int qunarComments;
    private String qunarUrl;
}
