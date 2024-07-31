package com.example.springboot3.service.impl;

import com.example.springboot3.domain.po.Demo;
import com.example.springboot3.mapper.DemoMapper;
import com.example.springboot3.service.IDemoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  ServiceImpl
 * </p>
 *
 * @author 
 * @since 2024-07-31
 */
@Service
public class DemoServiceImpl extends ServiceImpl<DemoMapper, Demo> implements IDemoService {

}
