package com.forest.provider.impl;

import com.forest.provider.entity.HospitalInfo;
import com.forest.provider.mapper.HospitalInfoMapper;
import com.forest.provider.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Forest
 * @date 2022/6/15 14:40
 */
@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final HospitalInfoMapper hospitalInfoMapper;

    @Override
    public List<HospitalInfo> selectAll() {
        return hospitalInfoMapper.selectAll();
    }
}
