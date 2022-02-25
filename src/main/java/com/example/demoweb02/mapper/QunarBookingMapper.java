package com.example.demoweb02.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demoweb02.model.QunarBooking;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface QunarBookingMapper extends BaseMapper<QunarBooking> {
}
