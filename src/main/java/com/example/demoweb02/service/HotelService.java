package com.example.demoweb02.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demoweb02.model.Hotel;
import com.example.demoweb02.vo.HotelDetails;

public interface HotelService extends IService<Hotel> {
    public IPage<HotelDetails> getPage(int page, String checkIn, String checkOut);
}
