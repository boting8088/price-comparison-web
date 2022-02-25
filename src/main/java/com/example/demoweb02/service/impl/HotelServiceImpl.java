package com.example.demoweb02.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDto;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demoweb02.mapper.BookingMapper;
import com.example.demoweb02.mapper.HotelMapper;
import com.example.demoweb02.mapper.LyBookingMapper;
import com.example.demoweb02.mapper.QunarBookingMapper;
import com.example.demoweb02.model.Booking;
import com.example.demoweb02.model.Hotel;
import com.example.demoweb02.model.LyBooking;
import com.example.demoweb02.model.QunarBooking;
import com.example.demoweb02.service.HotelService;
import com.example.demoweb02.vo.HotelDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HotelServiceImpl extends ServiceImpl<HotelMapper, Hotel> implements HotelService {

    @Autowired
    private HotelMapper hotelMapper;

    @Autowired
    private BookingMapper bookingMapper;

    @Autowired
    private QunarBookingMapper qunarBookingMapper;

    @Autowired
    private LyBookingMapper lyBookingMapper;

    public IPage<HotelDetails> getPage(int page, String checkIn, String checkOut){
        Page<Hotel> userPage = new Page<>(page , 10);
        IPage<Hotel> hotelIPage = hotelMapper.selectPage(userPage , null);
        List<Hotel> hotels = hotelIPage.getRecords();

        List<HotelDetails> hotelDetails = hotels.stream().map(hotel -> {
            HotelDetails hotelDetail = new HotelDetails();
            hotelDetail.setHotel(hotel);
            Integer hotelId = hotel.getHotelId();
            QueryWrapper<Booking> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("hotel_id", hotelId)
                    .eq("check_in", checkIn)
                    .eq("check_out", checkOut);
            Booking booking = bookingMapper.selectOne(queryWrapper);
            int bookingId = booking.getBookingId();
            LyBooking lyBooking = lyBookingMapper.selectById(bookingId);
            QunarBooking qunarBooking = qunarBookingMapper.selectById(bookingId);
            hotelDetail.setBookingId(bookingId);
            hotelDetail.setCheckIn(checkIn);
            hotelDetail.setCheckOut(checkOut);
            hotelDetail.setLyComments(lyBooking.getLyComments());
            hotelDetail.setLyGrade(lyBooking.getLyGrade());
            hotelDetail.setLyPrice(lyBooking.getLyPrice());
            hotelDetail.setLyUrl(lyBooking.getLyUrl());
            hotelDetail.setQunarComments(qunarBooking.getQunarComments());
            hotelDetail.setQunarGrade(qunarBooking.getQunarGrade());
            hotelDetail.setQunarPrice(qunarBooking.getQunarPrice());
            hotelDetail.setQunarUrl(qunarBooking.getQunarUrl());
            return hotelDetail;
        }).collect(Collectors.toList());

        IPage<HotelDetails> hotelDetailsIPage = new PageDto<>();
        hotelDetailsIPage.setCurrent(hotelIPage.getCurrent());
        hotelDetailsIPage.setTotal(userPage.getTotal());
        hotelDetailsIPage.setSize(userPage.getSize());
        hotelDetailsIPage.setRecords(hotelDetails);
        return hotelDetailsIPage;
    }

}
