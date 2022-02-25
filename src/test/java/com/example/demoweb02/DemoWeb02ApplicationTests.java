package com.example.demoweb02;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demoweb02.model.Hotel;
import com.example.demoweb02.service.HotelService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoWeb02ApplicationTests {

    @Autowired
    HotelService hotelService;

    @Test
    void contextLoads() {

    }

}
