package com.example.demoweb02.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description TODO
 * @Author Boting
 * @Data 2021/5/30  23:53
 */
@Data
@TableName("ctrip_booking")
public class CtripBooking {

    @TableId(value = "booking_id",type = IdType.AUTO)//指定自增策略
    private int bookingId;
    private int hotelId;
    private String hotelName;
    private int CtripPrice;
    private double CtripGrade;
    private int CtripComments;
    private String CtripUrl;

}