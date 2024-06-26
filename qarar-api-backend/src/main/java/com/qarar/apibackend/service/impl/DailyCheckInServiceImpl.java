package com.qarar.apibackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qarar.apibackend.mapper.DailyCheckInMapper;
import com.qarar.apibackend.model.entity.DailyCheckIn;
import com.qarar.apibackend.service.DailyCheckInService;
import org.springframework.stereotype.Service;


@Service
public class DailyCheckInServiceImpl extends ServiceImpl<DailyCheckInMapper, DailyCheckIn>
        implements DailyCheckInService {

}




