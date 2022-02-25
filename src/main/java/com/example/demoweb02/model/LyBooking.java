package com.example.demoweb02.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description TODO
 * @Author Boting
 * @Data 2021/5/26  18:23
 */
@Data
@TableName("ly_booking")
public class LyBooking {

    @TableId(value = "booking_id",type = IdType.AUTO)//指定自增策略
    private int bookingId;
    private int hotelId;
    private String hotelName;
    private int lyPrice;
    private double lyGrade;
    private int lyComments;
    private String lyUrl;

}
