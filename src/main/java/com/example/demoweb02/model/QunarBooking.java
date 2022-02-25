package com.example.demoweb02.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description TODO
 * @Author Boting
 * @Data 2021/5/26  18:26
 */
@Data
@TableName("qunar_booking")
public class QunarBooking {

    @TableId(value = "booking_id",type = IdType.AUTO)//指定自增策略
    private int bookingId;
    private int hotelId;
    private String hotelName;
    private int qunarPrice;
    private double qunarGrade;
    private int qunarComments;
    private String qunarUrl;
}
