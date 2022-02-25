package com.example.demoweb02.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demoweb02.model.Hotel;
import com.example.demoweb02.service.HotelService;
import com.example.demoweb02.vo.HotelDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * @Description TODO
 * @Author Boting
 * @Data 2021/5/26  10:13
 */
@Controller
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping("/hotel")
    public ModelAndView getForm(@RequestParam(value = "arrival-date", defaultValue = "2021-5-25") String checkIn,
                                @RequestParam(value = "departure-date", defaultValue = "2021-5-26") String checkOut,
                                @RequestParam(value = "city", defaultValue = "西安") String hotelCity,
                                @RequestParam(value = "page", defaultValue = "1") int page) {
        ModelAndView modelAndView = new ModelAndView("hotel");
        modelAndView.addObject("checkIn", checkIn);
        modelAndView.addObject("checkOut", checkOut);
        modelAndView.addObject("hotelCity", hotelCity);
        IPage<HotelDetails> hotelDetailsIPage = hotelService.getPage(page, checkIn, checkOut);
        modelAndView.addObject("hotelDetail", hotelDetailsIPage);
        return modelAndView;
    }

}
