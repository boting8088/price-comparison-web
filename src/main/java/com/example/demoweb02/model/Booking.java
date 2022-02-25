package com.example.demoweb02.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description TODO
 * @Author Boting
 * @Data 2021/5/26  18:19
 */
@Data
@TableName("booking")
public class Booking {

    @TableId(value = "booking_id",type = IdType.AUTO)//指定自增策略
    private int bookingId;
    private String checkIn;
    private String checkOut;
    private String hotelCity;
    private int hotelId;
    private String hotelName;
}
