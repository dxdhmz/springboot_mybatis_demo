package com.example.demo.mapper;

import com.example.demo.model.tTest;
import com.example.demo.util.MyMapper;

public interface tTestMapper extends MyMapper<tTest> {
    tTest SelByName(String name);
    tTest SelById(Long id);
}