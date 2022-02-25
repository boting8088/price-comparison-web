package com.example.demoweb02.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demoweb02.model.Booking;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface BookingMapper extends BaseMapper<Booking> {
}
