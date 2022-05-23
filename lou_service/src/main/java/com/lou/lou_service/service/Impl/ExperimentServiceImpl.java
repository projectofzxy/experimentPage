package com.lou.lou_service.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lou.lou_service.mapper.ExperimentMapper;
import com.lou.lou_service.pojo.Experiment;
import com.lou.lou_service.service.ExperimentService;
import org.springframework.stereotype.Service;

@Service
public class ExperimentServiceImpl extends ServiceImpl<ExperimentMapper, Experiment>implements ExperimentService{
}
