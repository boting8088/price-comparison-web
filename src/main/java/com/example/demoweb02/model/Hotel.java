package com.example.demoweb02.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("hotel")
public class Hotel {

    @TableId(value = "hotel_id",type = IdType.AUTO)//指定自增策略
    private int hotelId;
    private String hotelName;
    private double hotelLevel;
    private String hotelCity;
    private String hotelArea;
    private String hotelLocation;
    private String hotelPicture;
}
