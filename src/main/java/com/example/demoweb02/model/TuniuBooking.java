package com.example.demoweb02.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description TODO
 * @Author Boting
 * @Data 2021/5/30  23:54
 */
@Data
@TableName("tuniu_booking")
public class TuniuBooking {

    @TableId(value = "booking_id",type = IdType.AUTO)//指定自增策略
    private int bookingId;
    private int hotelId;
    private String hotelName;
    private int TuniuPrice;
    private double TuniuGrade;
    private int TuniuComments;
    private String TuniuUrl;

}
