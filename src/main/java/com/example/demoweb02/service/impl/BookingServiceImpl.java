package com.example.demoweb02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demoweb02.mapper.BookingMapper;
import com.example.demoweb02.model.Booking;
import com.example.demoweb02.service.BookingService;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author Boting
 * @Data 2021/5/26  18:37
 */
@Service
public class BookingServiceImpl extends ServiceImpl<BookingMapper, Booking> implements BookingService{
}
